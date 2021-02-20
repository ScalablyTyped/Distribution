package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaInAppProduct extends StObject {
  
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
  implicit class SchemaInAppProductMutableBuilder[Self <: SchemaInAppProduct] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultLanguage(value: String): Self = StObject.set(x, "defaultLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultLanguageUndefined: Self = StObject.set(x, "defaultLanguage", js.undefined)
    
    @scala.inline
    def setDefaultPrice(value: SchemaPrice): Self = StObject.set(x, "defaultPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPriceUndefined: Self = StObject.set(x, "defaultPrice", js.undefined)
    
    @scala.inline
    def setGracePeriod(value: String): Self = StObject.set(x, "gracePeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGracePeriodUndefined: Self = StObject.set(x, "gracePeriod", js.undefined)
    
    @scala.inline
    def setListings(value: StringDictionary[SchemaInAppProductListing]): Self = StObject.set(x, "listings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListingsUndefined: Self = StObject.set(x, "listings", js.undefined)
    
    @scala.inline
    def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    @scala.inline
    def setPrices(value: StringDictionary[SchemaPrice]): Self = StObject.set(x, "prices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPricesUndefined: Self = StObject.set(x, "prices", js.undefined)
    
    @scala.inline
    def setPurchaseType(value: String): Self = StObject.set(x, "purchaseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPurchaseTypeUndefined: Self = StObject.set(x, "purchaseType", js.undefined)
    
    @scala.inline
    def setSeason(value: SchemaSeason): Self = StObject.set(x, "season", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeasonUndefined: Self = StObject.set(x, "season", js.undefined)
    
    @scala.inline
    def setSku(value: String): Self = StObject.set(x, "sku", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkuUndefined: Self = StObject.set(x, "sku", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setSubscriptionPeriod(value: String): Self = StObject.set(x, "subscriptionPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionPeriodUndefined: Self = StObject.set(x, "subscriptionPeriod", js.undefined)
    
    @scala.inline
    def setTrialPeriod(value: String): Self = StObject.set(x, "trialPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrialPeriodUndefined: Self = StObject.set(x, "trialPeriod", js.undefined)
  }
}
