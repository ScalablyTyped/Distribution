package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudChannelV1RepricingConfigEntitlementGranularity extends StObject {
  
  /**
    * Resource name of the entitlement. Format: accounts/{account_id\}/customers/{customer_id\}/entitlements/{entitlement_id\}
    */
  var entitlement: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudChannelV1RepricingConfigEntitlementGranularity {
  
  inline def apply(): SchemaGoogleCloudChannelV1RepricingConfigEntitlementGranularity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudChannelV1RepricingConfigEntitlementGranularity]
  }
  
  extension [Self <: SchemaGoogleCloudChannelV1RepricingConfigEntitlementGranularity](x: Self) {
    
    inline def setEntitlement(value: String): Self = StObject.set(x, "entitlement", value.asInstanceOf[js.Any])
    
    inline def setEntitlementNull: Self = StObject.set(x, "entitlement", null)
    
    inline def setEntitlementUndefined: Self = StObject.set(x, "entitlement", js.undefined)
  }
}
