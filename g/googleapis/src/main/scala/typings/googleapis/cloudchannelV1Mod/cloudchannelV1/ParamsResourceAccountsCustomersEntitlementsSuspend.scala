package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsCustomersEntitlementsSuspend
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the entitlement to suspend. Name uses the format: accounts/{account_id\}/customers/{customer_id\}/entitlements/{entitlement_id\}
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudChannelV1SuspendEntitlementRequest] = js.undefined
}
object ParamsResourceAccountsCustomersEntitlementsSuspend {
  
  inline def apply(): ParamsResourceAccountsCustomersEntitlementsSuspend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsCustomersEntitlementsSuspend]
  }
  
  extension [Self <: ParamsResourceAccountsCustomersEntitlementsSuspend](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudChannelV1SuspendEntitlementRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
