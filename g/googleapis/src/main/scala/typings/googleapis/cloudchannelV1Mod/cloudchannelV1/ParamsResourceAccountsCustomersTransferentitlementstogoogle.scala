package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsCustomersTransferentitlementstogoogle
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the reseller's customer account where the entitlements transfer from. Parent uses the format: accounts/{account_id\}/customers/{customer_id\}
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudChannelV1TransferEntitlementsToGoogleRequest] = js.undefined
}
object ParamsResourceAccountsCustomersTransferentitlementstogoogle {
  
  inline def apply(): ParamsResourceAccountsCustomersTransferentitlementstogoogle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsCustomersTransferentitlementstogoogle]
  }
  
  extension [Self <: ParamsResourceAccountsCustomersTransferentitlementstogoogle](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudChannelV1TransferEntitlementsToGoogleRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
