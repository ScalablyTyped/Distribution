package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsChannelpartnerlinksCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Create a channel partner link for the provided reseller account's resource name. Parent uses the format: accounts/{account_id\}
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudChannelV1ChannelPartnerLink] = js.undefined
}
object ParamsResourceAccountsChannelpartnerlinksCreate {
  
  inline def apply(): ParamsResourceAccountsChannelpartnerlinksCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsChannelpartnerlinksCreate]
  }
  
  extension [Self <: ParamsResourceAccountsChannelpartnerlinksCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudChannelV1ChannelPartnerLink): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
