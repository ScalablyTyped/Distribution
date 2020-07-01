package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppIcon extends js.Object {
  var advertiser: js.UndefOr[String] = js.native
  var appIcon: js.UndefOr[Height] = js.native
  var body: js.UndefOr[String] = js.native
  var callToAction: js.UndefOr[String] = js.native
  var clickLinkUrl: js.UndefOr[String] = js.native
  var clickTrackingUrl: js.UndefOr[String] = js.native
  var headline: js.UndefOr[String] = js.native
  var image: js.UndefOr[Height] = js.native
  var impressionTrackingUrl: js.UndefOr[js.Array[String]] = js.native
  var logo: js.UndefOr[Height] = js.native
  var price: js.UndefOr[String] = js.native
  var starRating: js.UndefOr[Double] = js.native
  var store: js.UndefOr[String] = js.native
  var videoURL: js.UndefOr[String] = js.native
}

object AppIcon {
  @scala.inline
  def apply(
    advertiser: String = null,
    appIcon: Height = null,
    body: String = null,
    callToAction: String = null,
    clickLinkUrl: String = null,
    clickTrackingUrl: String = null,
    headline: String = null,
    image: Height = null,
    impressionTrackingUrl: js.Array[String] = null,
    logo: Height = null,
    price: String = null,
    starRating: js.UndefOr[Double] = js.undefined,
    store: String = null,
    videoURL: String = null
  ): AppIcon = {
    val __obj = js.Dynamic.literal()
    if (advertiser != null) __obj.updateDynamic("advertiser")(advertiser.asInstanceOf[js.Any])
    if (appIcon != null) __obj.updateDynamic("appIcon")(appIcon.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (callToAction != null) __obj.updateDynamic("callToAction")(callToAction.asInstanceOf[js.Any])
    if (clickLinkUrl != null) __obj.updateDynamic("clickLinkUrl")(clickLinkUrl.asInstanceOf[js.Any])
    if (clickTrackingUrl != null) __obj.updateDynamic("clickTrackingUrl")(clickTrackingUrl.asInstanceOf[js.Any])
    if (headline != null) __obj.updateDynamic("headline")(headline.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (impressionTrackingUrl != null) __obj.updateDynamic("impressionTrackingUrl")(impressionTrackingUrl.asInstanceOf[js.Any])
    if (logo != null) __obj.updateDynamic("logo")(logo.asInstanceOf[js.Any])
    if (price != null) __obj.updateDynamic("price")(price.asInstanceOf[js.Any])
    if (!js.isUndefined(starRating)) __obj.updateDynamic("starRating")(starRating.get.asInstanceOf[js.Any])
    if (store != null) __obj.updateDynamic("store")(store.asInstanceOf[js.Any])
    if (videoURL != null) __obj.updateDynamic("videoURL")(videoURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppIcon]
  }
}

