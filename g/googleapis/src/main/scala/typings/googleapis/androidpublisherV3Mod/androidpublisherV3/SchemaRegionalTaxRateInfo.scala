package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRegionalTaxRateInfo extends StObject {
  
  /**
    * You must tell us if your app contains streaming products to correctly charge US state and local sales tax. Field only supported in United States.
    */
  var eligibleForStreamingServiceTaxRate: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Tax tier to specify reduced tax rate. Developers who sell digital news, magazines, newspapers, books, or audiobooks in various regions may be eligible for reduced tax rates. [Learn more](https://support.google.com/googleplay/android-developer/answer/10463498).
    */
  var taxTier: js.UndefOr[String | Null] = js.undefined
}
object SchemaRegionalTaxRateInfo {
  
  inline def apply(): SchemaRegionalTaxRateInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegionalTaxRateInfo]
  }
  
  extension [Self <: SchemaRegionalTaxRateInfo](x: Self) {
    
    inline def setEligibleForStreamingServiceTaxRate(value: Boolean): Self = StObject.set(x, "eligibleForStreamingServiceTaxRate", value.asInstanceOf[js.Any])
    
    inline def setEligibleForStreamingServiceTaxRateNull: Self = StObject.set(x, "eligibleForStreamingServiceTaxRate", null)
    
    inline def setEligibleForStreamingServiceTaxRateUndefined: Self = StObject.set(x, "eligibleForStreamingServiceTaxRate", js.undefined)
    
    inline def setTaxTier(value: String): Self = StObject.set(x, "taxTier", value.asInstanceOf[js.Any])
    
    inline def setTaxTierNull: Self = StObject.set(x, "taxTier", null)
    
    inline def setTaxTierUndefined: Self = StObject.set(x, "taxTier", js.undefined)
  }
}
