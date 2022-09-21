package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInAppProduct extends StObject {
  
  /**
    * Default language of the localized data, as defined by BCP-47. e.g. "en-US".
    */
  var defaultLanguage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Default price. Cannot be zero, as in-app products are never free. Always in the developer's Checkout merchant currency.
    */
  var defaultPrice: js.UndefOr[SchemaPrice] = js.undefined
  
  /**
    * Grace period of the subscription, specified in ISO 8601 format. Allows developers to give their subscribers a grace period when the payment for the new recurrence period is declined. Acceptable values are P0D (zero days), P3D (three days), P7D (seven days), P14D (14 days), and P30D (30 days).
    */
  var gracePeriod: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of localized title and description data. Map key is the language of the localized data, as defined by BCP-47, e.g. "en-US".
    */
  var listings: js.UndefOr[StringDictionary[SchemaInAppProductListing] | Null] = js.undefined
  
  /**
    * Details about taxes and legal compliance. Only applicable to managed products.
    */
  var managedProductTaxesAndComplianceSettings: js.UndefOr[SchemaManagedProductTaxAndComplianceSettings] = js.undefined
  
  /**
    * Package name of the parent app.
    */
  var packageName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Prices per buyer region. None of these can be zero, as in-app products are never free. Map key is region code, as defined by ISO 3166-2.
    */
  var prices: js.UndefOr[StringDictionary[SchemaPrice] | Null] = js.undefined
  
  /**
    * The type of the product, e.g. a recurring subscription.
    */
  var purchaseType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Stock-keeping-unit (SKU) of the product, unique within an app.
    */
  var sku: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The status of the product, e.g. whether it's active.
    */
  var status: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Subscription period, specified in ISO 8601 format. Acceptable values are P1W (one week), P1M (one month), P3M (three months), P6M (six months), and P1Y (one year).
    */
  var subscriptionPeriod: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Details about taxes and legal compliance. Only applicable to subscription products.
    */
  var subscriptionTaxesAndComplianceSettings: js.UndefOr[SchemaSubscriptionTaxAndComplianceSettings] = js.undefined
  
  /**
    * Trial period, specified in ISO 8601 format. Acceptable values are anything between P7D (seven days) and P999D (999 days).
    */
  var trialPeriod: js.UndefOr[String | Null] = js.undefined
}
object SchemaInAppProduct {
  
  inline def apply(): SchemaInAppProduct = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInAppProduct]
  }
  
  extension [Self <: SchemaInAppProduct](x: Self) {
    
    inline def setDefaultLanguage(value: String): Self = StObject.set(x, "defaultLanguage", value.asInstanceOf[js.Any])
    
    inline def setDefaultLanguageNull: Self = StObject.set(x, "defaultLanguage", null)
    
    inline def setDefaultLanguageUndefined: Self = StObject.set(x, "defaultLanguage", js.undefined)
    
    inline def setDefaultPrice(value: SchemaPrice): Self = StObject.set(x, "defaultPrice", value.asInstanceOf[js.Any])
    
    inline def setDefaultPriceUndefined: Self = StObject.set(x, "defaultPrice", js.undefined)
    
    inline def setGracePeriod(value: String): Self = StObject.set(x, "gracePeriod", value.asInstanceOf[js.Any])
    
    inline def setGracePeriodNull: Self = StObject.set(x, "gracePeriod", null)
    
    inline def setGracePeriodUndefined: Self = StObject.set(x, "gracePeriod", js.undefined)
    
    inline def setListings(value: StringDictionary[SchemaInAppProductListing]): Self = StObject.set(x, "listings", value.asInstanceOf[js.Any])
    
    inline def setListingsNull: Self = StObject.set(x, "listings", null)
    
    inline def setListingsUndefined: Self = StObject.set(x, "listings", js.undefined)
    
    inline def setManagedProductTaxesAndComplianceSettings(value: SchemaManagedProductTaxAndComplianceSettings): Self = StObject.set(x, "managedProductTaxesAndComplianceSettings", value.asInstanceOf[js.Any])
    
    inline def setManagedProductTaxesAndComplianceSettingsUndefined: Self = StObject.set(x, "managedProductTaxesAndComplianceSettings", js.undefined)
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameNull: Self = StObject.set(x, "packageName", null)
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    inline def setPrices(value: StringDictionary[SchemaPrice]): Self = StObject.set(x, "prices", value.asInstanceOf[js.Any])
    
    inline def setPricesNull: Self = StObject.set(x, "prices", null)
    
    inline def setPricesUndefined: Self = StObject.set(x, "prices", js.undefined)
    
    inline def setPurchaseType(value: String): Self = StObject.set(x, "purchaseType", value.asInstanceOf[js.Any])
    
    inline def setPurchaseTypeNull: Self = StObject.set(x, "purchaseType", null)
    
    inline def setPurchaseTypeUndefined: Self = StObject.set(x, "purchaseType", js.undefined)
    
    inline def setSku(value: String): Self = StObject.set(x, "sku", value.asInstanceOf[js.Any])
    
    inline def setSkuNull: Self = StObject.set(x, "sku", null)
    
    inline def setSkuUndefined: Self = StObject.set(x, "sku", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSubscriptionPeriod(value: String): Self = StObject.set(x, "subscriptionPeriod", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionPeriodNull: Self = StObject.set(x, "subscriptionPeriod", null)
    
    inline def setSubscriptionPeriodUndefined: Self = StObject.set(x, "subscriptionPeriod", js.undefined)
    
    inline def setSubscriptionTaxesAndComplianceSettings(value: SchemaSubscriptionTaxAndComplianceSettings): Self = StObject.set(x, "subscriptionTaxesAndComplianceSettings", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionTaxesAndComplianceSettingsUndefined: Self = StObject.set(x, "subscriptionTaxesAndComplianceSettings", js.undefined)
    
    inline def setTrialPeriod(value: String): Self = StObject.set(x, "trialPeriod", value.asInstanceOf[js.Any])
    
    inline def setTrialPeriodNull: Self = StObject.set(x, "trialPeriod", null)
    
    inline def setTrialPeriodUndefined: Self = StObject.set(x, "trialPeriod", js.undefined)
  }
}
