package typings.gapiDotClientDotAndroidpublisher.gapiNs.clientNs.androidpublisherNs

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InAppProduct extends js.Object {
  /** The default language of the localized data, as defined by BCP 47. e.g. "en-US", "en-GB". */
  var defaultLanguage: js.UndefOr[String] = js.undefined
  /** Default price cannot be zero. In-app products can never be free. Default price is always in the developer's Checkout merchant currency. */
  var defaultPrice: js.UndefOr[Price] = js.undefined
  /** List of localized title and description data. */
  var listings: js.UndefOr[Record[String, InAppProductListing]] = js.undefined
  /** The package name of the parent app. */
  var packageName: js.UndefOr[String] = js.undefined
  /** Prices per buyer region. None of these prices should be zero. In-app products can never be free. */
  var prices: js.UndefOr[Record[String, Price]] = js.undefined
  /** Purchase type enum value. Unmodifiable after creation. */
  var purchaseType: js.UndefOr[String] = js.undefined
  /** Definition of a season for a seasonal subscription. Can be defined only for yearly subscriptions. */
  var season: js.UndefOr[Season] = js.undefined
  /** The stock-keeping-unit (SKU) of the product, unique within an app. */
  var sku: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[String] = js.undefined
  /**
    * Subscription period, specified in ISO 8601 format. Acceptable values are "P1W" (one week), "P1M" (one month), "P3M" (three months), "P6M" (six months),
    * and "P1Y" (one year).
    */
  var subscriptionPeriod: js.UndefOr[String] = js.undefined
  /**
    * Trial period, specified in ISO 8601 format. Acceptable values are anything between "P7D" (seven days) and "P999D" (999 days). Seasonal subscriptions
    * cannot have a trial period.
    */
  var trialPeriod: js.UndefOr[String] = js.undefined
}

object InAppProduct {
  @scala.inline
  def apply(
    defaultLanguage: String = null,
    defaultPrice: Price = null,
    listings: Record[String, InAppProductListing] = null,
    packageName: String = null,
    prices: Record[String, Price] = null,
    purchaseType: String = null,
    season: Season = null,
    sku: String = null,
    status: String = null,
    subscriptionPeriod: String = null,
    trialPeriod: String = null
  ): InAppProduct = {
    val __obj = js.Dynamic.literal()
    if (defaultLanguage != null) __obj.updateDynamic("defaultLanguage")(defaultLanguage)
    if (defaultPrice != null) __obj.updateDynamic("defaultPrice")(defaultPrice)
    if (listings != null) __obj.updateDynamic("listings")(listings)
    if (packageName != null) __obj.updateDynamic("packageName")(packageName)
    if (prices != null) __obj.updateDynamic("prices")(prices)
    if (purchaseType != null) __obj.updateDynamic("purchaseType")(purchaseType)
    if (season != null) __obj.updateDynamic("season")(season)
    if (sku != null) __obj.updateDynamic("sku")(sku)
    if (status != null) __obj.updateDynamic("status")(status)
    if (subscriptionPeriod != null) __obj.updateDynamic("subscriptionPeriod")(subscriptionPeriod)
    if (trialPeriod != null) __obj.updateDynamic("trialPeriod")(trialPeriod)
    __obj.asInstanceOf[InAppProduct]
  }
}

