package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsCustomersCustomerrepricingconfigsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the CustomerRepricingConfig. Format: accounts/{account_id\}/customers/{customer_id\}/customerRepricingConfigs/{id\}.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceAccountsCustomersCustomerrepricingconfigsGet {
  
  inline def apply(): ParamsResourceAccountsCustomersCustomerrepricingconfigsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsCustomersCustomerrepricingconfigsGet]
  }
  
  extension [Self <: ParamsResourceAccountsCustomersCustomerrepricingconfigsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
