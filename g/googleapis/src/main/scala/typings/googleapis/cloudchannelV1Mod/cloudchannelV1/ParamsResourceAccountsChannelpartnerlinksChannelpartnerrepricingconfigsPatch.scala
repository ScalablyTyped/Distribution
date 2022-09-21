package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsChannelpartnerlinksChannelpartnerrepricingconfigsPatch
  extends StObject
     with StandardParameters {
  
  /**
    * Output only. Resource name of the ChannelPartnerRepricingConfig. Format: accounts/{account_id\}/channelPartnerLinks/{channel_partner_id\}/channelPartnerRepricingConfigs/{id\}.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudChannelV1ChannelPartnerRepricingConfig] = js.undefined
}
object ParamsResourceAccountsChannelpartnerlinksChannelpartnerrepricingconfigsPatch {
  
  inline def apply(): ParamsResourceAccountsChannelpartnerlinksChannelpartnerrepricingconfigsPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsChannelpartnerlinksChannelpartnerrepricingconfigsPatch]
  }
  
  extension [Self <: ParamsResourceAccountsChannelpartnerlinksChannelpartnerrepricingconfigsPatch](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudChannelV1ChannelPartnerRepricingConfig): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
