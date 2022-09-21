package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudChannelV1TransferEligibility extends StObject {
  
  /**
    * Localized description if reseller is not eligible to transfer the SKU.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specified the reason for ineligibility.
    */
  var ineligibilityReason: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether reseller is eligible to transfer the SKU.
    */
  var isEligible: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleCloudChannelV1TransferEligibility {
  
  inline def apply(): SchemaGoogleCloudChannelV1TransferEligibility = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudChannelV1TransferEligibility]
  }
  
  extension [Self <: SchemaGoogleCloudChannelV1TransferEligibility](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setIneligibilityReason(value: String): Self = StObject.set(x, "ineligibilityReason", value.asInstanceOf[js.Any])
    
    inline def setIneligibilityReasonNull: Self = StObject.set(x, "ineligibilityReason", null)
    
    inline def setIneligibilityReasonUndefined: Self = StObject.set(x, "ineligibilityReason", js.undefined)
    
    inline def setIsEligible(value: Boolean): Self = StObject.set(x, "isEligible", value.asInstanceOf[js.Any])
    
    inline def setIsEligibleNull: Self = StObject.set(x, "isEligible", null)
    
    inline def setIsEligibleUndefined: Self = StObject.set(x, "isEligible", js.undefined)
  }
}
