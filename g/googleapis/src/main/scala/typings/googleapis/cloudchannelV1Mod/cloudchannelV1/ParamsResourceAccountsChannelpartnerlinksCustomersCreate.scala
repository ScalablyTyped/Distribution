package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsChannelpartnerlinksCustomersCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of reseller account in which to create the customer. Parent uses the format: accounts/{account_id\}
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudChannelV1Customer] = js.undefined
}
object ParamsResourceAccountsChannelpartnerlinksCustomersCreate {
  
  inline def apply(): ParamsResourceAccountsChannelpartnerlinksCustomersCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsChannelpartnerlinksCustomersCreate]
  }
  
  extension [Self <: ParamsResourceAccountsChannelpartnerlinksCustomersCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudChannelV1Customer): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
