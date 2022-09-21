package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsCustomersProvisioncloudidentity
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Resource name of the customer. Format: accounts/{account_id\}/customers/{customer_id\}
    */
  var customer: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudChannelV1ProvisionCloudIdentityRequest] = js.undefined
}
object ParamsResourceAccountsCustomersProvisioncloudidentity {
  
  inline def apply(): ParamsResourceAccountsCustomersProvisioncloudidentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsCustomersProvisioncloudidentity]
  }
  
  extension [Self <: ParamsResourceAccountsCustomersProvisioncloudidentity](x: Self) {
    
    inline def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    inline def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudChannelV1ProvisionCloudIdentityRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
