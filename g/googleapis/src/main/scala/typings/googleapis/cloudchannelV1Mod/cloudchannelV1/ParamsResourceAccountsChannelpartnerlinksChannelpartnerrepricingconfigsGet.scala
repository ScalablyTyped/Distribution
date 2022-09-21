package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsChannelpartnerlinksChannelpartnerrepricingconfigsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the ChannelPartnerRepricingConfig Format: accounts/{account_id\}/channelPartnerLinks/{channel_partner_id\}/channelPartnerRepricingConfigs/{id\}.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceAccountsChannelpartnerlinksChannelpartnerrepricingconfigsGet {
  
  inline def apply(): ParamsResourceAccountsChannelpartnerlinksChannelpartnerrepricingconfigsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsChannelpartnerlinksChannelpartnerrepricingconfigsGet]
  }
  
  extension [Self <: ParamsResourceAccountsChannelpartnerlinksChannelpartnerrepricingconfigsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
