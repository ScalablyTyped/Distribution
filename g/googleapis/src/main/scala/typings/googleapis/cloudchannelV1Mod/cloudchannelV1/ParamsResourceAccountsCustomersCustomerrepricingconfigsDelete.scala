package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsCustomersCustomerrepricingconfigsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the customer repricing config rule to delete. Format: accounts/{account_id\}/customers/{customer_id\}/customerRepricingConfigs/{id\}.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceAccountsCustomersCustomerrepricingconfigsDelete {
  
  inline def apply(): ParamsResourceAccountsCustomersCustomerrepricingconfigsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsCustomersCustomerrepricingconfigsDelete]
  }
  
  extension [Self <: ParamsResourceAccountsCustomersCustomerrepricingconfigsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
