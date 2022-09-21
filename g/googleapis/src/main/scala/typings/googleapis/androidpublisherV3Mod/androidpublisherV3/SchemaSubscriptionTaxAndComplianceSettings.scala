package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSubscriptionTaxAndComplianceSettings extends StObject {
  
  /**
    * Digital content or service classification for products distributed to users in the European Economic Area (EEA). The withdrawal regime under EEA consumer laws depends on this classification. Refer to the [Help Center article](https://support.google.com/googleplay/android-developer/answer/10463498) for more information.
    */
  var eeaWithdrawalRightType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A mapping from region code to tax rate details. The keys are region codes as defined by Unicode's "CLDR".
    */
  var taxRateInfoByRegionCode: js.UndefOr[StringDictionary[SchemaRegionalTaxRateInfo] | Null] = js.undefined
}
object SchemaSubscriptionTaxAndComplianceSettings {
  
  inline def apply(): SchemaSubscriptionTaxAndComplianceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubscriptionTaxAndComplianceSettings]
  }
  
  extension [Self <: SchemaSubscriptionTaxAndComplianceSettings](x: Self) {
    
    inline def setEeaWithdrawalRightType(value: String): Self = StObject.set(x, "eeaWithdrawalRightType", value.asInstanceOf[js.Any])
    
    inline def setEeaWithdrawalRightTypeNull: Self = StObject.set(x, "eeaWithdrawalRightType", null)
    
    inline def setEeaWithdrawalRightTypeUndefined: Self = StObject.set(x, "eeaWithdrawalRightType", js.undefined)
    
    inline def setTaxRateInfoByRegionCode(value: StringDictionary[SchemaRegionalTaxRateInfo]): Self = StObject.set(x, "taxRateInfoByRegionCode", value.asInstanceOf[js.Any])
    
    inline def setTaxRateInfoByRegionCodeNull: Self = StObject.set(x, "taxRateInfoByRegionCode", null)
    
    inline def setTaxRateInfoByRegionCodeUndefined: Self = StObject.set(x, "taxRateInfoByRegionCode", js.undefined)
  }
}
