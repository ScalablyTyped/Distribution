package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudChannelV1ListCustomerRepricingConfigsResponse extends StObject {
  
  /**
    * The repricing configs for this channel partner.
    */
  var customerRepricingConfigs: js.UndefOr[js.Array[SchemaGoogleCloudChannelV1CustomerRepricingConfig]] = js.undefined
  
  /**
    * A token to retrieve the next page of results. Pass to ListCustomerRepricingConfigsRequest.page_token to obtain that page.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudChannelV1ListCustomerRepricingConfigsResponse {
  
  inline def apply(): SchemaGoogleCloudChannelV1ListCustomerRepricingConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudChannelV1ListCustomerRepricingConfigsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudChannelV1ListCustomerRepricingConfigsResponse](x: Self) {
    
    inline def setCustomerRepricingConfigs(value: js.Array[SchemaGoogleCloudChannelV1CustomerRepricingConfig]): Self = StObject.set(x, "customerRepricingConfigs", value.asInstanceOf[js.Any])
    
    inline def setCustomerRepricingConfigsUndefined: Self = StObject.set(x, "customerRepricingConfigs", js.undefined)
    
    inline def setCustomerRepricingConfigsVarargs(value: SchemaGoogleCloudChannelV1CustomerRepricingConfig*): Self = StObject.set(x, "customerRepricingConfigs", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
