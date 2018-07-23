package com.forever.beebannerautoview.custom;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import com.forever.beebannerautoview.R;

public class BeeBannerAutoView extends LinearLayout{

    private Context mContext;
    private ViewPager vp_banner;
    public BeeBannerAutoView(Context context) {
        super(context);
        this.mContext = context;
    }

    public BeeBannerAutoView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public BeeBannerAutoView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        initView();
        setListeners();
    }

    private void initView() {
        this.removeAllViews();
        View bannerView = LayoutInflater.from(mContext).inflate(R.layout.view_banner_auto,null);
        this.addView(bannerView);

        vp_banner = bannerView.findViewById(R.id.vp_banner_auto);




    }

    private void setListeners() {

    }
}
