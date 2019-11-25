package typings.gapiDotClientDotAdexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Advertiser extends js.Object {
  var advertiser: js.UndefOr[String] = js.undefined
  /** The app icon, for app download ads. */
  var appIcon: js.UndefOr[Anon_Height] = js.undefined
  /** A long description of the ad. */
  var body: js.UndefOr[String] = js.undefined
  /** A label for the button that the user is supposed to click. */
  var callToAction: js.UndefOr[String] = js.undefined
  /** The URL that the browser/SDK will load when the user clicks the ad. */
  var clickLinkUrl: js.UndefOr[String] = js.undefined
  /** The URL to use for click tracking. */
  var clickTrackingUrl: js.UndefOr[String] = js.undefined
  /** A short title for the ad. */
  var headline: js.UndefOr[String] = js.undefined
  /** A large image. */
  var image: js.UndefOr[Anon_Height] = js.undefined
  /** The URLs are called when the impression is rendered. */
  var impressionTrackingUrl: js.UndefOr[js.Array[String]] = js.undefined
  /** A smaller image, for the advertiser logo. */
  var logo: js.UndefOr[Anon_Height] = js.undefined
  /** The price of the promoted app including the currency info. */
  var price: js.UndefOr[String] = js.undefined
  /** The app rating in the app store. Must be in the range [0-5]. */
  var starRating: js.UndefOr[Double] = js.undefined
  /** The URL to the app store to purchase/download the promoted app. */
  var store: js.UndefOr[String] = js.undefined
  /** The URL of the XML VAST for a native ad. Note this is a separate field from resource.video_url. */
  var videoURL: js.UndefOr[String] = js.undefined
}

object Anon_Advertiser {
  @scala.inline
  def apply(
    advertiser: String = null,
    appIcon: Anon_Height = null,
    body: String = null,
    callToAction: String = null,
    clickLinkUrl: String = null,
    clickTrackingUrl: String = null,
    headline: String = null,
    image: Anon_Height = null,
    impressionTrackingUrl: js.Array[String] = null,
    logo: Anon_Height = null,
    price: String = null,
    starRating: Int | Double = null,
    store: String = null,
    videoURL: String = null
  ): Anon_Advertiser = {
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
    if (starRating != null) __obj.updateDynamic("starRating")(starRating.asInstanceOf[js.Any])
    if (store != null) __obj.updateDynamic("store")(store.asInstanceOf[js.Any])
    if (videoURL != null) __obj.updateDynamic("videoURL")(videoURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Advertiser]
  }
}

