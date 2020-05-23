package typings.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NativeContent extends js.Object {
  /** The name of the advertiser or sponsor, to be displayed in the ad creative. */
  var advertiserName: js.UndefOr[String] = js.undefined
  /** The app icon, for app download ads. */
  var appIcon: js.UndefOr[Image] = js.undefined
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
  var image: js.UndefOr[Image] = js.undefined
  /** A smaller image, for the advertiser's logo. */
  var logo: js.UndefOr[Image] = js.undefined
  /** The price of the promoted app including currency info. */
  var priceDisplayText: js.UndefOr[String] = js.undefined
  /** The app rating in the app store. Must be in the range [0-5]. */
  var starRating: js.UndefOr[Double] = js.undefined
  /** The URL to the app store to purchase/download the promoted app. */
  var storeUrl: js.UndefOr[String] = js.undefined
  /** The URL to fetch a native video ad. */
  var videoUrl: js.UndefOr[String] = js.undefined
}

object NativeContent {
  @scala.inline
  def apply(
    advertiserName: String = null,
    appIcon: Image = null,
    body: String = null,
    callToAction: String = null,
    clickLinkUrl: String = null,
    clickTrackingUrl: String = null,
    headline: String = null,
    image: Image = null,
    logo: Image = null,
    priceDisplayText: String = null,
    starRating: js.UndefOr[Double] = js.undefined,
    storeUrl: String = null,
    videoUrl: String = null
  ): NativeContent = {
    val __obj = js.Dynamic.literal()
    if (advertiserName != null) __obj.updateDynamic("advertiserName")(advertiserName.asInstanceOf[js.Any])
    if (appIcon != null) __obj.updateDynamic("appIcon")(appIcon.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (callToAction != null) __obj.updateDynamic("callToAction")(callToAction.asInstanceOf[js.Any])
    if (clickLinkUrl != null) __obj.updateDynamic("clickLinkUrl")(clickLinkUrl.asInstanceOf[js.Any])
    if (clickTrackingUrl != null) __obj.updateDynamic("clickTrackingUrl")(clickTrackingUrl.asInstanceOf[js.Any])
    if (headline != null) __obj.updateDynamic("headline")(headline.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (logo != null) __obj.updateDynamic("logo")(logo.asInstanceOf[js.Any])
    if (priceDisplayText != null) __obj.updateDynamic("priceDisplayText")(priceDisplayText.asInstanceOf[js.Any])
    if (!js.isUndefined(starRating)) __obj.updateDynamic("starRating")(starRating.get.asInstanceOf[js.Any])
    if (storeUrl != null) __obj.updateDynamic("storeUrl")(storeUrl.asInstanceOf[js.Any])
    if (videoUrl != null) __obj.updateDynamic("videoUrl")(videoUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeContent]
  }
}

