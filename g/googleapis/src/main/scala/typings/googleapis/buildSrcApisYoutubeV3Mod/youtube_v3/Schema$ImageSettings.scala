package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Branding properties for images associated with the channel.
  */
@js.native
trait Schema$ImageSettings extends js.Object {
  /**
    * The URL for the background image shown on the video watch page. The image
    * should be 1200px by 615px, with a maximum file size of 128k.
    */
  var backgroundImageUrl: js.UndefOr[Schema$LocalizedProperty] = js.native
  /**
    * This is used only in update requests; if it&#39;s set, we use this URL to
    * generate all of the above banner URLs.
    */
  var bannerExternalUrl: js.UndefOr[String] = js.native
  /**
    * Banner image. Desktop size (1060x175).
    */
  var bannerImageUrl: js.UndefOr[String] = js.native
  /**
    * Banner image. Mobile size high resolution (1440x395).
    */
  var bannerMobileExtraHdImageUrl: js.UndefOr[String] = js.native
  /**
    * Banner image. Mobile size high resolution (1280x360).
    */
  var bannerMobileHdImageUrl: js.UndefOr[String] = js.native
  /**
    * Banner image. Mobile size (640x175).
    */
  var bannerMobileImageUrl: js.UndefOr[String] = js.native
  /**
    * Banner image. Mobile size low resolution (320x88).
    */
  var bannerMobileLowImageUrl: js.UndefOr[String] = js.native
  /**
    * Banner image. Mobile size medium/high resolution (960x263).
    */
  var bannerMobileMediumHdImageUrl: js.UndefOr[String] = js.native
  /**
    * Banner image. Tablet size extra high resolution (2560x424).
    */
  var bannerTabletExtraHdImageUrl: js.UndefOr[String] = js.native
  /**
    * Banner image. Tablet size high resolution (2276x377).
    */
  var bannerTabletHdImageUrl: js.UndefOr[String] = js.native
  /**
    * Banner image. Tablet size (1707x283).
    */
  var bannerTabletImageUrl: js.UndefOr[String] = js.native
  /**
    * Banner image. Tablet size low resolution (1138x188).
    */
  var bannerTabletLowImageUrl: js.UndefOr[String] = js.native
  /**
    * Banner image. TV size high resolution (1920x1080).
    */
  var bannerTvHighImageUrl: js.UndefOr[String] = js.native
  /**
    * Banner image. TV size extra high resolution (2120x1192).
    */
  var bannerTvImageUrl: js.UndefOr[String] = js.native
  /**
    * Banner image. TV size low resolution (854x480).
    */
  var bannerTvLowImageUrl: js.UndefOr[String] = js.native
  /**
    * Banner image. TV size medium resolution (1280x720).
    */
  var bannerTvMediumImageUrl: js.UndefOr[String] = js.native
  /**
    * The image map script for the large banner image.
    */
  var largeBrandedBannerImageImapScript: js.UndefOr[Schema$LocalizedProperty] = js.native
  /**
    * The URL for the 854px by 70px image that appears below the video player
    * in the expanded video view of the video watch page.
    */
  var largeBrandedBannerImageUrl: js.UndefOr[Schema$LocalizedProperty] = js.native
  /**
    * The image map script for the small banner image.
    */
  var smallBrandedBannerImageImapScript: js.UndefOr[Schema$LocalizedProperty] = js.native
  /**
    * The URL for the 640px by 70px banner image that appears below the video
    * player in the default view of the video watch page.
    */
  var smallBrandedBannerImageUrl: js.UndefOr[Schema$LocalizedProperty] = js.native
  /**
    * The URL for a 1px by 1px tracking pixel that can be used to collect
    * statistics for views of the channel or video pages.
    */
  var trackingImageUrl: js.UndefOr[String] = js.native
  /**
    * The URL for the image that appears above the top-left corner of the video
    * player. This is a 25-pixel-high image with a flexible width that cannot
    * exceed 170 pixels.
    */
  var watchIconImageUrl: js.UndefOr[String] = js.native
}

object Schema$ImageSettings {
  @scala.inline
  def apply(
    backgroundImageUrl: Schema$LocalizedProperty = null,
    bannerExternalUrl: String = null,
    bannerImageUrl: String = null,
    bannerMobileExtraHdImageUrl: String = null,
    bannerMobileHdImageUrl: String = null,
    bannerMobileImageUrl: String = null,
    bannerMobileLowImageUrl: String = null,
    bannerMobileMediumHdImageUrl: String = null,
    bannerTabletExtraHdImageUrl: String = null,
    bannerTabletHdImageUrl: String = null,
    bannerTabletImageUrl: String = null,
    bannerTabletLowImageUrl: String = null,
    bannerTvHighImageUrl: String = null,
    bannerTvImageUrl: String = null,
    bannerTvLowImageUrl: String = null,
    bannerTvMediumImageUrl: String = null,
    largeBrandedBannerImageImapScript: Schema$LocalizedProperty = null,
    largeBrandedBannerImageUrl: Schema$LocalizedProperty = null,
    smallBrandedBannerImageImapScript: Schema$LocalizedProperty = null,
    smallBrandedBannerImageUrl: Schema$LocalizedProperty = null,
    trackingImageUrl: String = null,
    watchIconImageUrl: String = null
  ): Schema$ImageSettings = {
    val __obj = js.Dynamic.literal()
    if (backgroundImageUrl != null) __obj.updateDynamic("backgroundImageUrl")(backgroundImageUrl.asInstanceOf[js.Any])
    if (bannerExternalUrl != null) __obj.updateDynamic("bannerExternalUrl")(bannerExternalUrl.asInstanceOf[js.Any])
    if (bannerImageUrl != null) __obj.updateDynamic("bannerImageUrl")(bannerImageUrl.asInstanceOf[js.Any])
    if (bannerMobileExtraHdImageUrl != null) __obj.updateDynamic("bannerMobileExtraHdImageUrl")(bannerMobileExtraHdImageUrl.asInstanceOf[js.Any])
    if (bannerMobileHdImageUrl != null) __obj.updateDynamic("bannerMobileHdImageUrl")(bannerMobileHdImageUrl.asInstanceOf[js.Any])
    if (bannerMobileImageUrl != null) __obj.updateDynamic("bannerMobileImageUrl")(bannerMobileImageUrl.asInstanceOf[js.Any])
    if (bannerMobileLowImageUrl != null) __obj.updateDynamic("bannerMobileLowImageUrl")(bannerMobileLowImageUrl.asInstanceOf[js.Any])
    if (bannerMobileMediumHdImageUrl != null) __obj.updateDynamic("bannerMobileMediumHdImageUrl")(bannerMobileMediumHdImageUrl.asInstanceOf[js.Any])
    if (bannerTabletExtraHdImageUrl != null) __obj.updateDynamic("bannerTabletExtraHdImageUrl")(bannerTabletExtraHdImageUrl.asInstanceOf[js.Any])
    if (bannerTabletHdImageUrl != null) __obj.updateDynamic("bannerTabletHdImageUrl")(bannerTabletHdImageUrl.asInstanceOf[js.Any])
    if (bannerTabletImageUrl != null) __obj.updateDynamic("bannerTabletImageUrl")(bannerTabletImageUrl.asInstanceOf[js.Any])
    if (bannerTabletLowImageUrl != null) __obj.updateDynamic("bannerTabletLowImageUrl")(bannerTabletLowImageUrl.asInstanceOf[js.Any])
    if (bannerTvHighImageUrl != null) __obj.updateDynamic("bannerTvHighImageUrl")(bannerTvHighImageUrl.asInstanceOf[js.Any])
    if (bannerTvImageUrl != null) __obj.updateDynamic("bannerTvImageUrl")(bannerTvImageUrl.asInstanceOf[js.Any])
    if (bannerTvLowImageUrl != null) __obj.updateDynamic("bannerTvLowImageUrl")(bannerTvLowImageUrl.asInstanceOf[js.Any])
    if (bannerTvMediumImageUrl != null) __obj.updateDynamic("bannerTvMediumImageUrl")(bannerTvMediumImageUrl.asInstanceOf[js.Any])
    if (largeBrandedBannerImageImapScript != null) __obj.updateDynamic("largeBrandedBannerImageImapScript")(largeBrandedBannerImageImapScript.asInstanceOf[js.Any])
    if (largeBrandedBannerImageUrl != null) __obj.updateDynamic("largeBrandedBannerImageUrl")(largeBrandedBannerImageUrl.asInstanceOf[js.Any])
    if (smallBrandedBannerImageImapScript != null) __obj.updateDynamic("smallBrandedBannerImageImapScript")(smallBrandedBannerImageImapScript.asInstanceOf[js.Any])
    if (smallBrandedBannerImageUrl != null) __obj.updateDynamic("smallBrandedBannerImageUrl")(smallBrandedBannerImageUrl.asInstanceOf[js.Any])
    if (trackingImageUrl != null) __obj.updateDynamic("trackingImageUrl")(trackingImageUrl.asInstanceOf[js.Any])
    if (watchIconImageUrl != null) __obj.updateDynamic("watchIconImageUrl")(watchIconImageUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ImageSettings]
  }
}

