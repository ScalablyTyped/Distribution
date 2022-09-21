package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudChannelV1ChannelPartnerLink extends StObject {
  
  /**
    * Output only. Cloud Identity info of the channel partner (IR).
    */
  var channelPartnerCloudIdentityInfo: js.UndefOr[SchemaGoogleCloudChannelV1CloudIdentityInfo] = js.undefined
  
  /**
    * Output only. Timestamp of when the channel partner link is created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. URI of the web page where partner accepts the link invitation.
    */
  var inviteLinkUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. State of the channel partner link.
    */
  var linkState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Resource name for the channel partner link, in the format accounts/{account_id\}/channelPartnerLinks/{id\}.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Public identifier that a customer must use to generate a transfer token to move to this distributor-reseller combination.
    */
  var publicId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Cloud Identity ID of the linked reseller.
    */
  var resellerCloudIdentityId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Timestamp of when the channel partner link is updated.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudChannelV1ChannelPartnerLink {
  
  inline def apply(): SchemaGoogleCloudChannelV1ChannelPartnerLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudChannelV1ChannelPartnerLink]
  }
  
  extension [Self <: SchemaGoogleCloudChannelV1ChannelPartnerLink](x: Self) {
    
    inline def setChannelPartnerCloudIdentityInfo(value: SchemaGoogleCloudChannelV1CloudIdentityInfo): Self = StObject.set(x, "channelPartnerCloudIdentityInfo", value.asInstanceOf[js.Any])
    
    inline def setChannelPartnerCloudIdentityInfoUndefined: Self = StObject.set(x, "channelPartnerCloudIdentityInfo", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setInviteLinkUri(value: String): Self = StObject.set(x, "inviteLinkUri", value.asInstanceOf[js.Any])
    
    inline def setInviteLinkUriNull: Self = StObject.set(x, "inviteLinkUri", null)
    
    inline def setInviteLinkUriUndefined: Self = StObject.set(x, "inviteLinkUri", js.undefined)
    
    inline def setLinkState(value: String): Self = StObject.set(x, "linkState", value.asInstanceOf[js.Any])
    
    inline def setLinkStateNull: Self = StObject.set(x, "linkState", null)
    
    inline def setLinkStateUndefined: Self = StObject.set(x, "linkState", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPublicId(value: String): Self = StObject.set(x, "publicId", value.asInstanceOf[js.Any])
    
    inline def setPublicIdNull: Self = StObject.set(x, "publicId", null)
    
    inline def setPublicIdUndefined: Self = StObject.set(x, "publicId", js.undefined)
    
    inline def setResellerCloudIdentityId(value: String): Self = StObject.set(x, "resellerCloudIdentityId", value.asInstanceOf[js.Any])
    
    inline def setResellerCloudIdentityIdNull: Self = StObject.set(x, "resellerCloudIdentityId", null)
    
    inline def setResellerCloudIdentityIdUndefined: Self = StObject.set(x, "resellerCloudIdentityId", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
