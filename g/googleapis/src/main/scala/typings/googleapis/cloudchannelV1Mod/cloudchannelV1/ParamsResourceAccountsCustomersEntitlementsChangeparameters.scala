package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsCustomersEntitlementsChangeparameters
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the entitlement to update. Name uses the format: accounts/{account_id\}/customers/{customer_id\}/entitlements/{entitlement_id\}
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudChannelV1ChangeParametersRequest] = js.undefined
}
object ParamsResourceAccountsCustomersEntitlementsChangeparameters {
  
  inline def apply(): ParamsResourceAccountsCustomersEntitlementsChangeparameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsCustomersEntitlementsChangeparameters]
  }
  
  extension [Self <: ParamsResourceAccountsCustomersEntitlementsChangeparameters](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudChannelV1ChangeParametersRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
