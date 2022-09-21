package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudChannelV1UpdateChannelPartnerLinkRequest extends StObject {
  
  /**
    * Required. The channel partner link to update. Only channel_partner_link.link_state is allowed for updates.
    */
  var channelPartnerLink: js.UndefOr[SchemaGoogleCloudChannelV1ChannelPartnerLink] = js.undefined
  
  /**
    * Required. The update mask that applies to the resource. The only allowable value for an update mask is channel_partner_link.link_state.
    */
  var updateMask: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudChannelV1UpdateChannelPartnerLinkRequest {
  
  inline def apply(): SchemaGoogleCloudChannelV1UpdateChannelPartnerLinkRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudChannelV1UpdateChannelPartnerLinkRequest]
  }
  
  extension [Self <: SchemaGoogleCloudChannelV1UpdateChannelPartnerLinkRequest](x: Self) {
    
    inline def setChannelPartnerLink(value: SchemaGoogleCloudChannelV1ChannelPartnerLink): Self = StObject.set(x, "channelPartnerLink", value.asInstanceOf[js.Any])
    
    inline def setChannelPartnerLinkUndefined: Self = StObject.set(x, "channelPartnerLink", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskNull: Self = StObject.set(x, "updateMask", null)
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
