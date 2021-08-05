package typings.gapiYoutube.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundImageUrl extends StObject {
  
  /**
    * The backgroundImageUrl object encapsulates settings for the background image shown on the video watch page. The image is 1200px by 615px, with a maximum file size of 128k.
    */
  var backgroundImageUrl: Default
  
  /**
    * This property specifies the location of the banner image that YouTube will use to generate the various banner image sizes for a channel. To obtain the URL banner images external URL, you must first upload the channel banner image that you want to use by calling the channelBanners.insert method.
    */
  var bannerExternalUrl: String
  
  /**
    * The URL for the banner image shown on the channel page on the YouTube website. The image is 1060px by 175px.
    */
  var bannerImageUrl: String
  
  /**
    * The URL for a very high-resolution banner image that displays on the channel page in mobile applications. The image is 1440px by 395px.
    */
  var bannerMobileExtraHdImageUrl: String
  
  /**
    * The URL for a high-resolution banner image that displays on the channel page in mobile applications. The image is 1280px by 360px.
    */
  var bannerMobileHdImageUrl: String
  
  /**
    * The URL for the banner image shown on the channel page in mobile applications. The image is 640px by 175px.
    */
  var bannerMobileImageUrl: String
  
  /**
    * The URL for a low-resolution banner image that displays on the channel page in mobile applications. The image is 320px by 88px.
    */
  var bannerMobileLowImageUrl: String
  
  /**
    * The URL for a medium-resolution banner image that displays on the channel page in mobile applications. The image is 960px by 263px.
    */
  var bannerMobileMediumImageUrl: String
  
  /**
    * The URL for an insanely high-resolution banner image that displays on the channel page in tablet applications. The image is 2560px by 424px.
    */
  var bannerTabletExtraHdImageUrl: String
  
  /**
    * The URL for a high-resolution banner image that displays on the channel page in tablet applications. The image is 2276px by 377px.
    */
  var bannerTabletHdImageUrl: String
  
  /**
    * The URL for a banner image that displays on the channel page in tablet applications. The image is 1707px by 283px.
    */
  var bannerTabletImageUrl: String
  
  /**
    * The URL for a low-resolution banner image that displays on the channel page in tablet applications. The image is 1138px by 188px.
    */
  var bannerTabletLowImageUrl: String
  
  /**
    * The URL for a banner image that displays on the channel page in television applications. The image is 2120px by 1192px.
    */
  var bannerTvImageUrl: String
  
  /**
    * The largeBrandedBannerImageImapScript object encapsulates information about the image map script for the banner image shown on the channel page.
    */
  var largeBrandedBannerImageImapScript: Default
  
  /**
    * The URL for the 854px by 70px image that appears below the video player in the expanded video view of the video watch page.
    */
  var largeBrandedBannerImageUrl: Default
  
  /**
    * The image map script for the small banner image. The largeBrandedBannerImageImapScript object encapsulates information about the image map script for the banner image shown on the channel page in mobile applications.
    */
  var smallBrandedBannerImageImapScript: Default
  
  /**
    * The URL for the 640px by 70px banner image that appears below the video player in the default view of the video watch page.
    */
  var smallBrandedBannerImageUrl: Default
  
  /**
    * The URL for a 1px by 1px tracking pixel that can be used to collect statistics for views of the channel or video pages.
    */
  var trackingImageUrl: String
  
  /**
    * The URL for the image that appears above the video player. This is a 25-pixel-high image with a flexible width that cannot exceed 170 pixels. If you do not provide this image, your channel name will appear instead of an image.
    */
  var watchIconImageUrl: String
}
object BackgroundImageUrl {
  
  inline def apply(
    backgroundImageUrl: Default,
    bannerExternalUrl: String,
    bannerImageUrl: String,
    bannerMobileExtraHdImageUrl: String,
    bannerMobileHdImageUrl: String,
    bannerMobileImageUrl: String,
    bannerMobileLowImageUrl: String,
    bannerMobileMediumImageUrl: String,
    bannerTabletExtraHdImageUrl: String,
    bannerTabletHdImageUrl: String,
    bannerTabletImageUrl: String,
    bannerTabletLowImageUrl: String,
    bannerTvImageUrl: String,
    largeBrandedBannerImageImapScript: Default,
    largeBrandedBannerImageUrl: Default,
    smallBrandedBannerImageImapScript: Default,
    smallBrandedBannerImageUrl: Default,
    trackingImageUrl: String,
    watchIconImageUrl: String
  ): BackgroundImageUrl = {
    val __obj = js.Dynamic.literal(backgroundImageUrl = backgroundImageUrl.asInstanceOf[js.Any], bannerExternalUrl = bannerExternalUrl.asInstanceOf[js.Any], bannerImageUrl = bannerImageUrl.asInstanceOf[js.Any], bannerMobileExtraHdImageUrl = bannerMobileExtraHdImageUrl.asInstanceOf[js.Any], bannerMobileHdImageUrl = bannerMobileHdImageUrl.asInstanceOf[js.Any], bannerMobileImageUrl = bannerMobileImageUrl.asInstanceOf[js.Any], bannerMobileLowImageUrl = bannerMobileLowImageUrl.asInstanceOf[js.Any], bannerMobileMediumImageUrl = bannerMobileMediumImageUrl.asInstanceOf[js.Any], bannerTabletExtraHdImageUrl = bannerTabletExtraHdImageUrl.asInstanceOf[js.Any], bannerTabletHdImageUrl = bannerTabletHdImageUrl.asInstanceOf[js.Any], bannerTabletImageUrl = bannerTabletImageUrl.asInstanceOf[js.Any], bannerTabletLowImageUrl = bannerTabletLowImageUrl.asInstanceOf[js.Any], bannerTvImageUrl = bannerTvImageUrl.asInstanceOf[js.Any], largeBrandedBannerImageImapScript = largeBrandedBannerImageImapScript.asInstanceOf[js.Any], largeBrandedBannerImageUrl = largeBrandedBannerImageUrl.asInstanceOf[js.Any], smallBrandedBannerImageImapScript = smallBrandedBannerImageImapScript.asInstanceOf[js.Any], smallBrandedBannerImageUrl = smallBrandedBannerImageUrl.asInstanceOf[js.Any], trackingImageUrl = trackingImageUrl.asInstanceOf[js.Any], watchIconImageUrl = watchIconImageUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundImageUrl]
  }
  
  extension [Self <: BackgroundImageUrl](x: Self) {
    
    inline def setBackgroundImageUrl(value: Default): Self = StObject.set(x, "backgroundImageUrl", value.asInstanceOf[js.Any])
    
    inline def setBannerExternalUrl(value: String): Self = StObject.set(x, "bannerExternalUrl", value.asInstanceOf[js.Any])
    
    inline def setBannerImageUrl(value: String): Self = StObject.set(x, "bannerImageUrl", value.asInstanceOf[js.Any])
    
    inline def setBannerMobileExtraHdImageUrl(value: String): Self = StObject.set(x, "bannerMobileExtraHdImageUrl", value.asInstanceOf[js.Any])
    
    inline def setBannerMobileHdImageUrl(value: String): Self = StObject.set(x, "bannerMobileHdImageUrl", value.asInstanceOf[js.Any])
    
    inline def setBannerMobileImageUrl(value: String): Self = StObject.set(x, "bannerMobileImageUrl", value.asInstanceOf[js.Any])
    
    inline def setBannerMobileLowImageUrl(value: String): Self = StObject.set(x, "bannerMobileLowImageUrl", value.asInstanceOf[js.Any])
    
    inline def setBannerMobileMediumImageUrl(value: String): Self = StObject.set(x, "bannerMobileMediumImageUrl", value.asInstanceOf[js.Any])
    
    inline def setBannerTabletExtraHdImageUrl(value: String): Self = StObject.set(x, "bannerTabletExtraHdImageUrl", value.asInstanceOf[js.Any])
    
    inline def setBannerTabletHdImageUrl(value: String): Self = StObject.set(x, "bannerTabletHdImageUrl", value.asInstanceOf[js.Any])
    
    inline def setBannerTabletImageUrl(value: String): Self = StObject.set(x, "bannerTabletImageUrl", value.asInstanceOf[js.Any])
    
    inline def setBannerTabletLowImageUrl(value: String): Self = StObject.set(x, "bannerTabletLowImageUrl", value.asInstanceOf[js.Any])
    
    inline def setBannerTvImageUrl(value: String): Self = StObject.set(x, "bannerTvImageUrl", value.asInstanceOf[js.Any])
    
    inline def setLargeBrandedBannerImageImapScript(value: Default): Self = StObject.set(x, "largeBrandedBannerImageImapScript", value.asInstanceOf[js.Any])
    
    inline def setLargeBrandedBannerImageUrl(value: Default): Self = StObject.set(x, "largeBrandedBannerImageUrl", value.asInstanceOf[js.Any])
    
    inline def setSmallBrandedBannerImageImapScript(value: Default): Self = StObject.set(x, "smallBrandedBannerImageImapScript", value.asInstanceOf[js.Any])
    
    inline def setSmallBrandedBannerImageUrl(value: Default): Self = StObject.set(x, "smallBrandedBannerImageUrl", value.asInstanceOf[js.Any])
    
    inline def setTrackingImageUrl(value: String): Self = StObject.set(x, "trackingImageUrl", value.asInstanceOf[js.Any])
    
    inline def setWatchIconImageUrl(value: String): Self = StObject.set(x, "watchIconImageUrl", value.asInstanceOf[js.Any])
  }
}
