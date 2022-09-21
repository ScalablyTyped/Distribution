package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudChannelV1ListChannelPartnerRepricingConfigsResponse extends StObject {
  
  /**
    * The repricing configs for this channel partner.
    */
  var channelPartnerRepricingConfigs: js.UndefOr[js.Array[SchemaGoogleCloudChannelV1ChannelPartnerRepricingConfig]] = js.undefined
  
  /**
    * A token to retrieve the next page of results. Pass to ListChannelPartnerRepricingConfigsRequest.page_token to obtain that page.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudChannelV1ListChannelPartnerRepricingConfigsResponse {
  
  inline def apply(): SchemaGoogleCloudChannelV1ListChannelPartnerRepricingConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudChannelV1ListChannelPartnerRepricingConfigsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudChannelV1ListChannelPartnerRepricingConfigsResponse](x: Self) {
    
    inline def setChannelPartnerRepricingConfigs(value: js.Array[SchemaGoogleCloudChannelV1ChannelPartnerRepricingConfig]): Self = StObject.set(x, "channelPartnerRepricingConfigs", value.asInstanceOf[js.Any])
    
    inline def setChannelPartnerRepricingConfigsUndefined: Self = StObject.set(x, "channelPartnerRepricingConfigs", js.undefined)
    
    inline def setChannelPartnerRepricingConfigsVarargs(value: SchemaGoogleCloudChannelV1ChannelPartnerRepricingConfig*): Self = StObject.set(x, "channelPartnerRepricingConfigs", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
