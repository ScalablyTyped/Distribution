package typings
package gapiDotClientDotAdexchangebuyer2Lib.gapiNs.clientNs.adexchangebuyer2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NativeContent extends js.Object {
  /** The name of the advertiser or sponsor, to be displayed in the ad creative. */
  var advertiserName: js.UndefOr[java.lang.String] = js.undefined
  /** The app icon, for app download ads. */
  var appIcon: js.UndefOr[Image] = js.undefined
  /** A long description of the ad. */
  var body: js.UndefOr[java.lang.String] = js.undefined
  /** A label for the button that the user is supposed to click. */
  var callToAction: js.UndefOr[java.lang.String] = js.undefined
  /** The URL that the browser/SDK will load when the user clicks the ad. */
  var clickLinkUrl: js.UndefOr[java.lang.String] = js.undefined
  /** The URL to use for click tracking. */
  var clickTrackingUrl: js.UndefOr[java.lang.String] = js.undefined
  /** A short title for the ad. */
  var headline: js.UndefOr[java.lang.String] = js.undefined
  /** A large image. */
  var image: js.UndefOr[Image] = js.undefined
  /** A smaller image, for the advertiser's logo. */
  var logo: js.UndefOr[Image] = js.undefined
  /** The price of the promoted app including currency info. */
  var priceDisplayText: js.UndefOr[java.lang.String] = js.undefined
  /** The app rating in the app store. Must be in the range [0-5]. */
  var starRating: js.UndefOr[scala.Double] = js.undefined
  /** The URL to the app store to purchase/download the promoted app. */
  var storeUrl: js.UndefOr[java.lang.String] = js.undefined
  /** The URL to fetch a native video ad. */
  var videoUrl: js.UndefOr[java.lang.String] = js.undefined
}

object NativeContent {
  @scala.inline
  def apply(
    advertiserName: java.lang.String = null,
    appIcon: Image = null,
    body: java.lang.String = null,
    callToAction: java.lang.String = null,
    clickLinkUrl: java.lang.String = null,
    clickTrackingUrl: java.lang.String = null,
    headline: java.lang.String = null,
    image: Image = null,
    logo: Image = null,
    priceDisplayText: java.lang.String = null,
    starRating: scala.Int | scala.Double = null,
    storeUrl: java.lang.String = null,
    videoUrl: java.lang.String = null
  ): NativeContent = {
    val __obj = js.Dynamic.literal()
    if (advertiserName != null) __obj.updateDynamic("advertiserName")(advertiserName)
    if (appIcon != null) __obj.updateDynamic("appIcon")(appIcon)
    if (body != null) __obj.updateDynamic("body")(body)
    if (callToAction != null) __obj.updateDynamic("callToAction")(callToAction)
    if (clickLinkUrl != null) __obj.updateDynamic("clickLinkUrl")(clickLinkUrl)
    if (clickTrackingUrl != null) __obj.updateDynamic("clickTrackingUrl")(clickTrackingUrl)
    if (headline != null) __obj.updateDynamic("headline")(headline)
    if (image != null) __obj.updateDynamic("image")(image)
    if (logo != null) __obj.updateDynamic("logo")(logo)
    if (priceDisplayText != null) __obj.updateDynamic("priceDisplayText")(priceDisplayText)
    if (starRating != null) __obj.updateDynamic("starRating")(starRating.asInstanceOf[js.Any])
    if (storeUrl != null) __obj.updateDynamic("storeUrl")(storeUrl)
    if (videoUrl != null) __obj.updateDynamic("videoUrl")(videoUrl)
    __obj.asInstanceOf[NativeContent]
  }
}

