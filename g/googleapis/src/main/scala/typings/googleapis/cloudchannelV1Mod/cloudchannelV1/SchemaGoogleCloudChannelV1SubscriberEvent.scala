package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudChannelV1SubscriberEvent extends StObject {
  
  /**
    * Customer event sent as part of Pub/Sub event to partners.
    */
  var customerEvent: js.UndefOr[SchemaGoogleCloudChannelV1CustomerEvent] = js.undefined
  
  /**
    * Entitlement event sent as part of Pub/Sub event to partners.
    */
  var entitlementEvent: js.UndefOr[SchemaGoogleCloudChannelV1EntitlementEvent] = js.undefined
}
object SchemaGoogleCloudChannelV1SubscriberEvent {
  
  inline def apply(): SchemaGoogleCloudChannelV1SubscriberEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudChannelV1SubscriberEvent]
  }
  
  extension [Self <: SchemaGoogleCloudChannelV1SubscriberEvent](x: Self) {
    
    inline def setCustomerEvent(value: SchemaGoogleCloudChannelV1CustomerEvent): Self = StObject.set(x, "customerEvent", value.asInstanceOf[js.Any])
    
    inline def setCustomerEventUndefined: Self = StObject.set(x, "customerEvent", js.undefined)
    
    inline def setEntitlementEvent(value: SchemaGoogleCloudChannelV1EntitlementEvent): Self = StObject.set(x, "entitlementEvent", value.asInstanceOf[js.Any])
    
    inline def setEntitlementEventUndefined: Self = StObject.set(x, "entitlementEvent", js.undefined)
  }
}
