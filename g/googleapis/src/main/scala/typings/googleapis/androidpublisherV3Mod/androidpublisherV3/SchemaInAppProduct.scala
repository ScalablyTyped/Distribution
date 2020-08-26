package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaInAppProduct extends js.Object {
  /**
    * The default language of the localized data, as defined by BCP 47. e.g.
    * &quot;en-US&quot;, &quot;en-GB&quot;.
    */
  var defaultLanguage: js.UndefOr[String] = js.native
  /**
    * Default price cannot be zero. In-app products can never be free. Default
    * price is always in the developer&#39;s Checkout merchant currency.
    */
  var defaultPrice: js.UndefOr[SchemaPrice] = js.native
  /**
    * Grace period of the subscription, specified in ISO 8601 format. It will
    * allow developers to give their subscribers a grace period when the
    * payment for the new recurrence period is declined. Acceptable values =
    * &quot;P3D&quot; (three days) and &quot;P7D&quot; (seven days)
    */
  var gracePeriod: js.UndefOr[String] = js.native
  /**
    * List of localized title and description data.
    */
  var listings: js.UndefOr[StringDictionary[SchemaInAppProductListing]] = js.native
  /**
    * The package name of the parent app.
    */
  var packageName: js.UndefOr[String] = js.native
  /**
    * Prices per buyer region. None of these prices should be zero. In-app
    * products can never be free.
    */
  var prices: js.UndefOr[StringDictionary[SchemaPrice]] = js.native
  /**
    * Purchase type enum value. Unmodifiable after creation.
    */
  var purchaseType: js.UndefOr[String] = js.native
  /**
    * Definition of a season for a seasonal subscription. Can be defined only
    * for yearly subscriptions.
    */
  var season: js.UndefOr[SchemaSeason] = js.native
  /**
    * The stock-keeping-unit (SKU) of the product, unique within an app.
    */
  var sku: js.UndefOr[String] = js.native
  var status: js.UndefOr[String] = js.native
  /**
    * Subscription period, specified in ISO 8601 format. Acceptable values are
    * &quot;P1W&quot; (one week), &quot;P1M&quot; (one month), &quot;P3M&quot;
    * (three months), &quot;P6M&quot; (six months), and &quot;P1Y&quot; (one
    * year).
    */
  var subscriptionPeriod: js.UndefOr[String] = js.native
  /**
    * Trial period, specified in ISO 8601 format. Acceptable values are
    * anything between &quot;P7D&quot; (seven days) and &quot;P999D&quot; (999
    * days). Seasonal subscriptions cannot have a trial period.
    */
  var trialPeriod: js.UndefOr[String] = js.native
}

object SchemaInAppProduct {
  @scala.inline
  def apply(): SchemaInAppProduct = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInAppProduct]
  }
  @scala.inline
  implicit class SchemaInAppProductOps[Self <: SchemaInAppProduct] (val x: Self) extends AnyVal {
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
    def setDefaultPrice(value: SchemaPrice): Self = this.set("defaultPrice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultPrice: Self = this.set("defaultPrice", js.undefined)
    @scala.inline
    def setGracePeriod(value: String): Self = this.set("gracePeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGracePeriod: Self = this.set("gracePeriod", js.undefined)
    @scala.inline
    def setListings(value: StringDictionary[SchemaInAppProductListing]): Self = this.set("listings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListings: Self = this.set("listings", js.undefined)
    @scala.inline
    def setPackageName(value: String): Self = this.set("packageName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePackageName: Self = this.set("packageName", js.undefined)
    @scala.inline
    def setPrices(value: StringDictionary[SchemaPrice]): Self = this.set("prices", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrices: Self = this.set("prices", js.undefined)
    @scala.inline
    def setPurchaseType(value: String): Self = this.set("purchaseType", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePurchaseType: Self = this.set("purchaseType", js.undefined)
    @scala.inline
    def setSeason(value: SchemaSeason): Self = this.set("season", value.asInstanceOf[js.Any])
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

