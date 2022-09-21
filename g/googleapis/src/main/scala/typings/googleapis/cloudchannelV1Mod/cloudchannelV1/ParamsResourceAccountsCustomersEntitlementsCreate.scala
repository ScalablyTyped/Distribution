package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsCustomersEntitlementsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the reseller's customer account in which to create the entitlement. Parent uses the format: accounts/{account_id\}/customers/{customer_id\}
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudChannelV1CreateEntitlementRequest] = js.undefined
}
object ParamsResourceAccountsCustomersEntitlementsCreate {
  
  inline def apply(): ParamsResourceAccountsCustomersEntitlementsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsCustomersEntitlementsCreate]
  }
  
  extension [Self <: ParamsResourceAccountsCustomersEntitlementsCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudChannelV1CreateEntitlementRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
