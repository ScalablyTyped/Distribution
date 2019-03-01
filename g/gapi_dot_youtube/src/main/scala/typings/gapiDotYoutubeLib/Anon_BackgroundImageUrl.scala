package typings
package gapiDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackgroundImageUrl extends js.Object {
  /**
    * The backgroundImageUrl object encapsulates settings for the background image shown on the video watch page. The image is 1200px by 615px, with a maximum file size of 128k.
    */
  var backgroundImageUrl: Anon_Default
  /**
    * This property specifies the location of the banner image that YouTube will use to generate the various banner image sizes for a channel. To obtain the URL banner images external URL, you must first upload the channel banner image that you want to use by calling the channelBanners.insert method.
    */
  var bannerExternalUrl: java.lang.String
  /**
    * The URL for the banner image shown on the channel page on the YouTube website. The image is 1060px by 175px.
    */
  var bannerImageUrl: java.lang.String
  /**
    * The URL for a very high-resolution banner image that displays on the channel page in mobile applications. The image is 1440px by 395px.
    */
  var bannerMobileExtraHdImageUrl: java.lang.String
  /**
    * The URL for a high-resolution banner image that displays on the channel page in mobile applications. The image is 1280px by 360px.
    */
  var bannerMobileHdImageUrl: java.lang.String
  /**
    * The URL for the banner image shown on the channel page in mobile applications. The image is 640px by 175px.
    */
  var bannerMobileImageUrl: java.lang.String
  /**
    * The URL for a low-resolution banner image that displays on the channel page in mobile applications. The image is 320px by 88px.
    */
  var bannerMobileLowImageUrl: java.lang.String
  /**
    * The URL for a medium-resolution banner image that displays on the channel page in mobile applications. The image is 960px by 263px.
    */
  var bannerMobileMediumImageUrl: java.lang.String
  /**
    * The URL for an insanely high-resolution banner image that displays on the channel page in tablet applications. The image is 2560px by 424px.
    */
  var bannerTabletExtraHdImageUrl: java.lang.String
  /**
    * The URL for a high-resolution banner image that displays on the channel page in tablet applications. The image is 2276px by 377px.
    */
  var bannerTabletHdImageUrl: java.lang.String
  /**
    * The URL for a banner image that displays on the channel page in tablet applications. The image is 1707px by 283px.
    */
  var bannerTabletImageUrl: java.lang.String
  /**
    * The URL for a low-resolution banner image that displays on the channel page in tablet applications. The image is 1138px by 188px.
    */
  var bannerTabletLowImageUrl: java.lang.String
  /**
    * The URL for a banner image that displays on the channel page in television applications. The image is 2120px by 1192px.
    */
  var bannerTvImageUrl: java.lang.String
  /**
    * The largeBrandedBannerImageImapScript object encapsulates information about the image map script for the banner image shown on the channel page.
    */
  var largeBrandedBannerImageImapScript: Anon_Default
  /**
    * The URL for the 854px by 70px image that appears below the video player in the expanded video view of the video watch page.
    */
  var largeBrandedBannerImageUrl: Anon_Default
  /**
    * The image map script for the small banner image. The largeBrandedBannerImageImapScript object encapsulates information about the image map script for the banner image shown on the channel page in mobile applications.
    */
  var smallBrandedBannerImageImapScript: Anon_Default
  /**
    * The URL for the 640px by 70px banner image that appears below the video player in the default view of the video watch page.
    */
  var smallBrandedBannerImageUrl: Anon_Default
  /**
    * The URL for a 1px by 1px tracking pixel that can be used to collect statistics for views of the channel or video pages.
    */
  var trackingImageUrl: java.lang.String
  /**
    * The URL for the image that appears above the video player. This is a 25-pixel-high image with a flexible width that cannot exceed 170 pixels. If you do not provide this image, your channel name will appear instead of an image.
    */
  var watchIconImageUrl: java.lang.String
}

object Anon_BackgroundImageUrl {
  @scala.inline
  def apply(
    backgroundImageUrl: Anon_Default,
    bannerExternalUrl: java.lang.String,
    bannerImageUrl: java.lang.String,
    bannerMobileExtraHdImageUrl: java.lang.String,
    bannerMobileHdImageUrl: java.lang.String,
    bannerMobileImageUrl: java.lang.String,
    bannerMobileLowImageUrl: java.lang.String,
    bannerMobileMediumImageUrl: java.lang.String,
    bannerTabletExtraHdImageUrl: java.lang.String,
    bannerTabletHdImageUrl: java.lang.String,
    bannerTabletImageUrl: java.lang.String,
    bannerTabletLowImageUrl: java.lang.String,
    bannerTvImageUrl: java.lang.String,
    largeBrandedBannerImageImapScript: Anon_Default,
    largeBrandedBannerImageUrl: Anon_Default,
    smallBrandedBannerImageImapScript: Anon_Default,
    smallBrandedBannerImageUrl: Anon_Default,
    trackingImageUrl: java.lang.String,
    watchIconImageUrl: java.lang.String
  ): Anon_BackgroundImageUrl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("backgroundImageUrl")(backgroundImageUrl)
    __obj.updateDynamic("bannerExternalUrl")(bannerExternalUrl)
    __obj.updateDynamic("bannerImageUrl")(bannerImageUrl)
    __obj.updateDynamic("bannerMobileExtraHdImageUrl")(bannerMobileExtraHdImageUrl)
    __obj.updateDynamic("bannerMobileHdImageUrl")(bannerMobileHdImageUrl)
    __obj.updateDynamic("bannerMobileImageUrl")(bannerMobileImageUrl)
    __obj.updateDynamic("bannerMobileLowImageUrl")(bannerMobileLowImageUrl)
    __obj.updateDynamic("bannerMobileMediumImageUrl")(bannerMobileMediumImageUrl)
    __obj.updateDynamic("bannerTabletExtraHdImageUrl")(bannerTabletExtraHdImageUrl)
    __obj.updateDynamic("bannerTabletHdImageUrl")(bannerTabletHdImageUrl)
    __obj.updateDynamic("bannerTabletImageUrl")(bannerTabletImageUrl)
    __obj.updateDynamic("bannerTabletLowImageUrl")(bannerTabletLowImageUrl)
    __obj.updateDynamic("bannerTvImageUrl")(bannerTvImageUrl)
    __obj.updateDynamic("largeBrandedBannerImageImapScript")(largeBrandedBannerImageImapScript)
    __obj.updateDynamic("largeBrandedBannerImageUrl")(largeBrandedBannerImageUrl)
    __obj.updateDynamic("smallBrandedBannerImageImapScript")(smallBrandedBannerImageImapScript)
    __obj.updateDynamic("smallBrandedBannerImageUrl")(smallBrandedBannerImageUrl)
    __obj.updateDynamic("trackingImageUrl")(trackingImageUrl)
    __obj.updateDynamic("watchIconImageUrl")(watchIconImageUrl)
    __obj.asInstanceOf[Anon_BackgroundImageUrl]
  }
}

