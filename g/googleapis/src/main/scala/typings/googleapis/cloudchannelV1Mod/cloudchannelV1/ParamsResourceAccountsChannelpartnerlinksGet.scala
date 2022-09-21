package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsChannelpartnerlinksGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the channel partner link to retrieve. Name uses the format: accounts/{account_id\}/channelPartnerLinks/{id\} where {id\} is the Cloud Identity ID of the partner.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The level of granularity the ChannelPartnerLink will display.
    */
  var view: js.UndefOr[String] = js.undefined
}
object ParamsResourceAccountsChannelpartnerlinksGet {
  
  inline def apply(): ParamsResourceAccountsChannelpartnerlinksGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsChannelpartnerlinksGet]
  }
  
  extension [Self <: ParamsResourceAccountsChannelpartnerlinksGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
