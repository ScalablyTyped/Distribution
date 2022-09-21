package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsChannelpartnerlinksCustomersImport
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the reseller's account. Parent takes the format: accounts/{account_id\} or accounts/{account_id\}/channelPartnerLinks/{channel_partner_id\}
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudChannelV1ImportCustomerRequest] = js.undefined
}
object ParamsResourceAccountsChannelpartnerlinksCustomersImport {
  
  inline def apply(): ParamsResourceAccountsChannelpartnerlinksCustomersImport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsChannelpartnerlinksCustomersImport]
  }
  
  extension [Self <: ParamsResourceAccountsChannelpartnerlinksCustomersImport](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudChannelV1ImportCustomerRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
