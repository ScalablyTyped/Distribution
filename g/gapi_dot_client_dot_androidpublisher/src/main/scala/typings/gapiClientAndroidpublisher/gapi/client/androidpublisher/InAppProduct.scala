package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InAppProduct extends js.Object {
  /** The default language of the localized data, as defined by BCP 47. e.g. "en-US", "en-GB". */
  var defaultLanguage: js.UndefOr[String] = js.native
  /** Default price cannot be zero. In-app products can never be free. Default price is always in the developer's Checkout merchant currency. */
  var defaultPrice: js.UndefOr[Price] = js.native
  /** List of localized title and description data. */
  var listings: js.UndefOr[Record[String, InAppProductListing]] = js.native
  /** The package name of the parent app. */
  var packageName: js.UndefOr[String] = js.native
  /** Prices per buyer region. None of these prices should be zero. In-app products can never be free. */
  var prices: js.UndefOr[Record[String, Price]] = js.native
  /** Purchase type enum value. Unmodifiable after creation. */
  var purchaseType: js.UndefOr[String] = js.native
  /** Definition of a season for a seasonal subscription. Can be defined only for yearly subscriptions. */
  var season: js.UndefOr[Season] = js.native
  /** The stock-keeping-unit (SKU) of the product, unique within an app. */
  var sku: js.UndefOr[String] = js.native
  var status: js.UndefOr[String] = js.native
  /**
    * Subscription period, specified in ISO 8601 format. Acceptable values are "P1W" (one week), "P1M" (one month), "P3M" (three months), "P6M" (six months),
    * and "P1Y" (one year).
    */
  var subscriptionPeriod: js.UndefOr[String] = js.native
  /**
    * Trial period, specified in ISO 8601 format. Acceptable values are anything between "P7D" (seven days) and "P999D" (999 days). Seasonal subscriptions
    * cannot have a trial period.
    */
  var trialPeriod: js.UndefOr[String] = js.native
}

object InAppProduct {
  @scala.inline
  def apply(): InAppProduct = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InAppProduct]
  }
  @scala.inline
  implicit class InAppProductOps[Self <: InAppProduct] (val x: Self) extends AnyVal {
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
    def setDefaultLanguage(value: String): Self = this.set("defaultLanguage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultLanguage: Self = this.set("defaultLanguage", js.undefined)
    @scala.inline
    def setDefaultPrice(value: Price): Self = this.set("defaultPrice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultPrice: Self = this.set("defaultPrice", js.undefined)
    @scala.inline
    def setListings(value: Record[String, InAppProductListing]): Self = this.set("listings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListings: Self = this.set("listings", js.undefined)
    @scala.inline
    def setPackageName(value: String): Self = this.set("packageName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePackageName: Self = this.set("packageName", js.undefined)
    @scala.inline
    def setPrices(value: Record[String, Price]): Self = this.set("prices", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrices: Self = this.set("prices", js.undefined)
    @scala.inline
    def setPurchaseType(value: String): Self = this.set("purchaseType", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePurchaseType: Self = this.set("purchaseType", js.undefined)
    @scala.inline
    def setSeason(value: Season): Self = this.set("season", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeason: Self = this.set("season", js.undefined)
    @scala.inline
    def setSku(value: String): Self = this.set("sku", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSku: Self = this.set("sku", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setSubscriptionPeriod(value: String): Self = this.set("subscriptionPeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubscriptionPeriod: Self = this.set("subscriptionPeriod", js.undefined)
    @scala.inline
    def setTrialPeriod(value: String): Self = this.set("trialPeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrialPeriod: Self = this.set("trialPeriod", js.undefined)
  }
  
}

