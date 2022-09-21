package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudChannelV1alpha1ChannelPartnerEvent extends StObject {
  
  /**
    * Resource name for the Channel Partner Link. Channel_partner uses the format: accounts/{account_id\}/channelPartnerLinks/{channel_partner_id\}
    */
  var channelPartner: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Type of event performed on the Channel Partner.
    */
  var eventType: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudChannelV1alpha1ChannelPartnerEvent {
  
  inline def apply(): SchemaGoogleCloudChannelV1alpha1ChannelPartnerEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudChannelV1alpha1ChannelPartnerEvent]
  }
  
  extension [Self <: SchemaGoogleCloudChannelV1alpha1ChannelPartnerEvent](x: Self) {
    
    inline def setChannelPartner(value: String): Self = StObject.set(x, "channelPartner", value.asInstanceOf[js.Any])
    
    inline def setChannelPartnerNull: Self = StObject.set(x, "channelPartner", null)
    
    inline def setChannelPartnerUndefined: Self = StObject.set(x, "channelPartner", js.undefined)
    
    inline def setEventType(value: String): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    inline def setEventTypeNull: Self = StObject.set(x, "eventType", null)
    
    inline def setEventTypeUndefined: Self = StObject.set(x, "eventType", js.undefined)
  }
}
