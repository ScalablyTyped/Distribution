package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudChannelV1alpha1EntitlementEvent extends StObject {
  
  /**
    * Resource name of an entitlement of the form: accounts/{account_id\}/customers/{customer_id\}/entitlements/{entitlement_id\}
    */
  var entitlement: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Type of event which happened on the entitlement.
    */
  var eventType: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudChannelV1alpha1EntitlementEvent {
  
  inline def apply(): SchemaGoogleCloudChannelV1alpha1EntitlementEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudChannelV1alpha1EntitlementEvent]
  }
  
  extension [Self <: SchemaGoogleCloudChannelV1alpha1EntitlementEvent](x: Self) {
    
    inline def setEntitlement(value: String): Self = StObject.set(x, "entitlement", value.asInstanceOf[js.Any])
    
    inline def setEntitlementNull: Self = StObject.set(x, "entitlement", null)
    
    inline def setEntitlementUndefined: Self = StObject.set(x, "entitlement", js.undefined)
    
    inline def setEventType(value: String): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    inline def setEventTypeNull: Self = StObject.set(x, "eventType", null)
    
    inline def setEventTypeUndefined: Self = StObject.set(x, "eventType", js.undefined)
  }
}
