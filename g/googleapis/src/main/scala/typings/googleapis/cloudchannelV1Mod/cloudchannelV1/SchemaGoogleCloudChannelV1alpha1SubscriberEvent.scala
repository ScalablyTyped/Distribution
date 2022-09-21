package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudChannelV1alpha1SubscriberEvent extends StObject {
  
  /**
    * Channel Partner event sent as part of Pub/Sub event to partners.
    */
  var channelPartnerEvent: js.UndefOr[SchemaGoogleCloudChannelV1alpha1ChannelPartnerEvent] = js.undefined
  
  /**
    * Customer event sent as part of Pub/Sub event to partners.
    */
  var customerEvent: js.UndefOr[SchemaGoogleCloudChannelV1alpha1CustomerEvent] = js.undefined
  
  /**
    * Entitlement event sent as part of Pub/Sub event to partners.
    */
  var entitlementEvent: js.UndefOr[SchemaGoogleCloudChannelV1alpha1EntitlementEvent] = js.undefined
}
object SchemaGoogleCloudChannelV1alpha1SubscriberEvent {
  
  inline def apply(): SchemaGoogleCloudChannelV1alpha1SubscriberEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudChannelV1alpha1SubscriberEvent]
  }
  
  extension [Self <: SchemaGoogleCloudChannelV1alpha1SubscriberEvent](x: Self) {
    
    inline def setChannelPartnerEvent(value: SchemaGoogleCloudChannelV1alpha1ChannelPartnerEvent): Self = StObject.set(x, "channelPartnerEvent", value.asInstanceOf[js.Any])
    
    inline def setChannelPartnerEventUndefined: Self = StObject.set(x, "channelPartnerEvent", js.undefined)
    
    inline def setCustomerEvent(value: SchemaGoogleCloudChannelV1alpha1CustomerEvent): Self = StObject.set(x, "customerEvent", value.asInstanceOf[js.Any])
    
    inline def setCustomerEventUndefined: Self = StObject.set(x, "customerEvent", js.undefined)
    
    inline def setEntitlementEvent(value: SchemaGoogleCloudChannelV1alpha1EntitlementEvent): Self = StObject.set(x, "entitlementEvent", value.asInstanceOf[js.Any])
    
    inline def setEntitlementEventUndefined: Self = StObject.set(x, "entitlementEvent", js.undefined)
  }
}
