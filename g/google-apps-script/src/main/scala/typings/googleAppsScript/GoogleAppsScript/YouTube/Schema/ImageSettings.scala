package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageSettings extends js.Object {
  
  var backgroundImageUrl: js.UndefOr[LocalizedProperty] = js.native
  
  var bannerExternalUrl: js.UndefOr[String] = js.native
  
  var bannerImageUrl: js.UndefOr[String] = js.native
  
  var bannerMobileExtraHdImageUrl: js.UndefOr[String] = js.native
  
  var bannerMobileHdImageUrl: js.UndefOr[String] = js.native
  
  var bannerMobileImageUrl: js.UndefOr[String] = js.native
  
  var bannerMobileLowImageUrl: js.UndefOr[String] = js.native
  
  var bannerMobileMediumHdImageUrl: js.UndefOr[String] = js.native
  
  var bannerTabletExtraHdImageUrl: js.UndefOr[String] = js.native
  
  var bannerTabletHdImageUrl: js.UndefOr[String] = js.native
  
  var bannerTabletImageUrl: js.UndefOr[String] = js.native
  
  var bannerTabletLowImageUrl: js.UndefOr[String] = js.native
  
  var bannerTvHighImageUrl: js.UndefOr[String] = js.native
  
  var bannerTvImageUrl: js.UndefOr[String] = js.native
  
  var bannerTvLowImageUrl: js.UndefOr[String] = js.native
  
  var bannerTvMediumImageUrl: js.UndefOr[String] = js.native
  
  var largeBrandedBannerImageImapScript: js.UndefOr[LocalizedProperty] = js.native
  
  var largeBrandedBannerImageUrl: js.UndefOr[LocalizedProperty] = js.native
  
  var smallBrandedBannerImageImapScript: js.UndefOr[LocalizedProperty] = js.native
  
  var smallBrandedBannerImageUrl: js.UndefOr[LocalizedProperty] = js.native
  
  var trackingImageUrl: js.UndefOr[String] = js.native
  
  var watchIconImageUrl: js.UndefOr[String] = js.native
}
object ImageSettings {
  
  @scala.inline
  def apply(): ImageSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageSettings]
  }
  
  @scala.inline
  implicit class ImageSettingsOps[Self <: ImageSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBackgroundImageUrl(value: LocalizedProperty): Self = this.set("backgroundImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundImageUrl: Self = this.set("backgroundImageUrl", js.undefined)
    
    @scala.inline
    def setBannerExternalUrl(value: String): Self = this.set("bannerExternalUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBannerExternalUrl: Self = this.set("bannerExternalUrl", js.undefined)
    
    @scala.inline
    def setBannerImageUrl(value: String): Self = this.set("bannerImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBannerImageUrl: Self = this.set("bannerImageUrl", js.undefined)
    
    @scala.inline
    def setBannerMobileExtraHdImageUrl(value: String): Self = this.set("bannerMobileExtraHdImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBannerMobileExtraHdImageUrl: Self = this.set("bannerMobileExtraHdImageUrl", js.undefined)
    
    @scala.inline
    def setBannerMobileHdImageUrl(value: String): Self = this.set("bannerMobileHdImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBannerMobileHdImageUrl: Self = this.set("bannerMobileHdImageUrl", js.undefined)
    
    @scala.inline
    def setBannerMobileImageUrl(value: String): Self = this.set("bannerMobileImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBannerMobileImageUrl: Self = this.set("bannerMobileImageUrl", js.undefined)
    
    @scala.inline
    def setBannerMobileLowImageUrl(value: String): Self = this.set("bannerMobileLowImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBannerMobileLowImageUrl: Self = this.set("bannerMobileLowImageUrl", js.undefined)
    
    @scala.inline
    def setBannerMobileMediumHdImageUrl(value: String): Self = this.set("bannerMobileMediumHdImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBannerMobileMediumHdImageUrl: Self = this.set("bannerMobileMediumHdImageUrl", js.undefined)
    
    @scala.inline
    def setBannerTabletExtraHdImageUrl(value: String): Self = this.set("bannerTabletExtraHdImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBannerTabletExtraHdImageUrl: Self = this.set("bannerTabletExtraHdImageUrl", js.undefined)
    
    @scala.inline
    def setBannerTabletHdImageUrl(value: String): Self = this.set("bannerTabletHdImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBannerTabletHdImageUrl: Self = this.set("bannerTabletHdImageUrl", js.undefined)
    
    @scala.inline
    def setBannerTabletImageUrl(value: String): Self = this.set("bannerTabletImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBannerTabletImageUrl: Self = this.set("bannerTabletImageUrl", js.undefined)
    
    @scala.inline
    def setBannerTabletLowImageUrl(value: String): Self = this.set("bannerTabletLowImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBannerTabletLowImageUrl: Self = this.set("bannerTabletLowImageUrl", js.undefined)
    
    @scala.inline
    def setBannerTvHighImageUrl(value: String): Self = this.set("bannerTvHighImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBannerTvHighImageUrl: Self = this.set("bannerTvHighImageUrl", js.undefined)
    
    @scala.inline
    def setBannerTvImageUrl(value: String): Self = this.set("bannerTvImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBannerTvImageUrl: Self = this.set("bannerTvImageUrl", js.undefined)
    
    @scala.inline
    def setBannerTvLowImageUrl(value: String): Self = this.set("bannerTvLowImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBannerTvLowImageUrl: Self = this.set("bannerTvLowImageUrl", js.undefined)
    
    @scala.inline
    def setBannerTvMediumImageUrl(value: String): Self = this.set("bannerTvMediumImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBannerTvMediumImageUrl: Self = this.set("bannerTvMediumImageUrl", js.undefined)
    
    @scala.inline
    def setLargeBrandedBannerImageImapScript(value: LocalizedProperty): Self = this.set("largeBrandedBannerImageImapScript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLargeBrandedBannerImageImapScript: Self = this.set("largeBrandedBannerImageImapScript", js.undefined)
    
    @scala.inline
    def setLargeBrandedBannerImageUrl(value: LocalizedProperty): Self = this.set("largeBrandedBannerImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLargeBrandedBannerImageUrl: Self = this.set("largeBrandedBannerImageUrl", js.undefined)
    
    @scala.inline
    def setSmallBrandedBannerImageImapScript(value: LocalizedProperty): Self = this.set("smallBrandedBannerImageImapScript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmallBrandedBannerImageImapScript: Self = this.set("smallBrandedBannerImageImapScript", js.undefined)
    
    @scala.inline
    def setSmallBrandedBannerImageUrl(value: LocalizedProperty): Self = this.set("smallBrandedBannerImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmallBrandedBannerImageUrl: Self = this.set("smallBrandedBannerImageUrl", js.undefined)
    
    @scala.inline
    def setTrackingImageUrl(value: String): Self = this.set("trackingImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackingImageUrl: Self = this.set("trackingImageUrl", js.undefined)
    
    @scala.inline
    def setWatchIconImageUrl(value: String): Self = this.set("watchIconImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWatchIconImageUrl: Self = this.set("watchIconImageUrl", js.undefined)
  }
}
