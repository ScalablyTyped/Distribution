package typings.gapiClientAdexchangebuyer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Advertiser extends js.Object {
  var advertiser: js.UndefOr[String] = js.native
  /** The app icon, for app download ads. */
  var appIcon: js.UndefOr[Height] = js.native
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
  var image: js.UndefOr[Height] = js.native
  /** The URLs are called when the impression is rendered. */
  var impressionTrackingUrl: js.UndefOr[js.Array[String]] = js.native
  /** A smaller image, for the advertiser logo. */
  var logo: js.UndefOr[Height] = js.native
  /** The price of the promoted app including the currency info. */
  var price: js.UndefOr[String] = js.native
  /** The app rating in the app store. Must be in the range [0-5]. */
  var starRating: js.UndefOr[Double] = js.native
  /** The URL to the app store to purchase/download the promoted app. */
  var store: js.UndefOr[String] = js.native
  /** The URL of the XML VAST for a native ad. Note this is a separate field from resource.video_url. */
  var videoURL: js.UndefOr[String] = js.native
}

object Advertiser {
  @scala.inline
  def apply(): Advertiser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Advertiser]
  }
  @scala.inline
  implicit class AdvertiserOps[Self <: Advertiser] (val x: Self) extends AnyVal {
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
    def setAdvertiser(value: String): Self = this.set("advertiser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdvertiser: Self = this.set("advertiser", js.undefined)
    @scala.inline
    def setAppIcon(value: Height): Self = this.set("appIcon", value.asInstanceOf[js.Any])
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
    def setImage(value: Height): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    @scala.inline
    def setImpressionTrackingUrlVarargs(value: String*): Self = this.set("impressionTrackingUrl", js.Array(value :_*))
    @scala.inline
    def setImpressionTrackingUrl(value: js.Array[String]): Self = this.set("impressionTrackingUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImpressionTrackingUrl: Self = this.set("impressionTrackingUrl", js.undefined)
    @scala.inline
    def setLogo(value: Height): Self = this.set("logo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogo: Self = this.set("logo", js.undefined)
    @scala.inline
    def setPrice(value: String): Self = this.set("price", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrice: Self = this.set("price", js.undefined)
    @scala.inline
    def setStarRating(value: Double): Self = this.set("starRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStarRating: Self = this.set("starRating", js.undefined)
    @scala.inline
    def setStore(value: String): Self = this.set("store", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStore: Self = this.set("store", js.undefined)
    @scala.inline
    def setVideoURL(value: String): Self = this.set("videoURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideoURL: Self = this.set("videoURL", js.undefined)
  }
  
}

