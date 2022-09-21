package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudChannelV1ListChannelPartnerLinksResponse extends StObject {
  
  /**
    * The Channel partner links for a reseller.
    */
  var channelPartnerLinks: js.UndefOr[js.Array[SchemaGoogleCloudChannelV1ChannelPartnerLink]] = js.undefined
  
  /**
    * A token to retrieve the next page of results. Pass to ListChannelPartnerLinksRequest.page_token to obtain that page.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudChannelV1ListChannelPartnerLinksResponse {
  
  inline def apply(): SchemaGoogleCloudChannelV1ListChannelPartnerLinksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudChannelV1ListChannelPartnerLinksResponse]
  }
  
  extension [Self <: SchemaGoogleCloudChannelV1ListChannelPartnerLinksResponse](x: Self) {
    
    inline def setChannelPartnerLinks(value: js.Array[SchemaGoogleCloudChannelV1ChannelPartnerLink]): Self = StObject.set(x, "channelPartnerLinks", value.asInstanceOf[js.Any])
    
    inline def setChannelPartnerLinksUndefined: Self = StObject.set(x, "channelPartnerLinks", js.undefined)
    
    inline def setChannelPartnerLinksVarargs(value: SchemaGoogleCloudChannelV1ChannelPartnerLink*): Self = StObject.set(x, "channelPartnerLinks", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
