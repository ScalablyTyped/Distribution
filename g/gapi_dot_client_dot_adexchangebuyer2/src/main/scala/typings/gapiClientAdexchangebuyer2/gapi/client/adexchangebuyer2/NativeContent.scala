package typings.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NativeContent extends js.Object {
  /** The name of the advertiser or sponsor, to be displayed in the ad creative. */
  var advertiserName: js.UndefOr[String] = js.native
  /** The app icon, for app download ads. */
  var appIcon: js.UndefOr[Image] = js.native
  /** A long description of the ad. */
  var body: js.UndefOr[String] = js.native
  /** A label for the button that the user is supposed to click. */
  var callToAction: js.UndefOr[String] = js.native
  /** The URL that the browser/SDK will load when the user clicks the ad. */
  var clickLinkUrl: js.UndefOr[String] = js.native
  /** The URL to use for click tracking. */
  var clickTrackingUrl: js.UndefOr[String] = js.native
  /** A short title for the ad. */
  var headline: js.UndefOr[String] = js.native
  /** A large image. */
  var image: js.UndefOr[Image] = js.native
  /** A smaller image, for the advertiser's logo. */
  var logo: js.UndefOr[Image] = js.native
  /** The price of the promoted app including currency info. */
  var priceDisplayText: js.UndefOr[String] = js.native
  /** The app rating in the app store. Must be in the range [0-5]. */
  var starRating: js.UndefOr[Double] = js.native
  /** The URL to the app store to purchase/download the promoted app. */
  var storeUrl: js.UndefOr[String] = js.native
  /** The URL to fetch a native video ad. */
  var videoUrl: js.UndefOr[String] = js.native
}

object NativeContent {
  @scala.inline
  def apply(): NativeContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NativeContent]
  }
  @scala.inline
  implicit class NativeContentOps[Self <: NativeContent] (val x: Self) extends AnyVal {
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
    def setAdvertiserName(value: String): Self = this.set("advertiserName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdvertiserName: Self = this.set("advertiserName", js.undefined)
    @scala.inline
    def setAppIcon(value: Image): Self = this.set("appIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppIcon: Self = this.set("appIcon", js.undefined)
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setCallToAction(value: String): Self = this.set("callToAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallToAction: Self = this.set("callToAction", js.undefined)
    @scala.inline
    def setClickLinkUrl(value: String): Self = this.set("clickLinkUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClickLinkUrl: Self = this.set("clickLinkUrl", js.undefined)
    @scala.inline
    def setClickTrackingUrl(value: String): Self = this.set("clickTrackingUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClickTrackingUrl: Self = this.set("clickTrackingUrl", js.undefined)
    @scala.inline
    def setHeadline(value: String): Self = this.set("headline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeadline: Self = this.set("headline", js.undefined)
    @scala.inline
    def setImage(value: Image): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    @scala.inline
    def setLogo(value: Image): Self = this.set("logo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogo: Self = this.set("logo", js.undefined)
    @scala.inline
    def setPriceDisplayText(value: String): Self = this.set("priceDisplayText", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriceDisplayText: Self = this.set("priceDisplayText", js.undefined)
    @scala.inline
    def setStarRating(value: Double): Self = this.set("starRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStarRating: Self = this.set("starRating", js.undefined)
    @scala.inline
    def setStoreUrl(value: String): Self = this.set("storeUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStoreUrl: Self = this.set("storeUrl", js.undefined)
    @scala.inline
    def setVideoUrl(value: String): Self = this.set("videoUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideoUrl: Self = this.set("videoUrl", js.undefined)
  }
  
}

