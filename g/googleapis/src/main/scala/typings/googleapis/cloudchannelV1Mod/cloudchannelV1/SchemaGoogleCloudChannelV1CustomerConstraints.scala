package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudChannelV1CustomerConstraints extends StObject {
  
  /**
    * Allowed Customer Type.
    */
  var allowedCustomerTypes: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Allowed geographical regions of the customer.
    */
  var allowedRegions: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Allowed Promotional Order Type. Present for Promotional offers.
    */
  var promotionalOrderTypes: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGoogleCloudChannelV1CustomerConstraints {
  
  inline def apply(): SchemaGoogleCloudChannelV1CustomerConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudChannelV1CustomerConstraints]
  }
  
  extension [Self <: SchemaGoogleCloudChannelV1CustomerConstraints](x: Self) {
    
    inline def setAllowedCustomerTypes(value: js.Array[String]): Self = StObject.set(x, "allowedCustomerTypes", value.asInstanceOf[js.Any])
    
    inline def setAllowedCustomerTypesNull: Self = StObject.set(x, "allowedCustomerTypes", null)
    
    inline def setAllowedCustomerTypesUndefined: Self = StObject.set(x, "allowedCustomerTypes", js.undefined)
    
    inline def setAllowedCustomerTypesVarargs(value: String*): Self = StObject.set(x, "allowedCustomerTypes", js.Array(value*))
    
    inline def setAllowedRegions(value: js.Array[String]): Self = StObject.set(x, "allowedRegions", value.asInstanceOf[js.Any])
    
    inline def setAllowedRegionsNull: Self = StObject.set(x, "allowedRegions", null)
    
    inline def setAllowedRegionsUndefined: Self = StObject.set(x, "allowedRegions", js.undefined)
    
    inline def setAllowedRegionsVarargs(value: String*): Self = StObject.set(x, "allowedRegions", js.Array(value*))
    
    inline def setPromotionalOrderTypes(value: js.Array[String]): Self = StObject.set(x, "promotionalOrderTypes", value.asInstanceOf[js.Any])
    
    inline def setPromotionalOrderTypesNull: Self = StObject.set(x, "promotionalOrderTypes", null)
    
    inline def setPromotionalOrderTypesUndefined: Self = StObject.set(x, "promotionalOrderTypes", js.undefined)
    
    inline def setPromotionalOrderTypesVarargs(value: String*): Self = StObject.set(x, "promotionalOrderTypes", js.Array(value*))
  }
}
