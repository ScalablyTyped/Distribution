package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsCustomersEntitlementsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the entitlement to retrieve. Name uses the format: accounts/{account_id\}/customers/{customer_id\}/entitlements/{entitlement_id\}
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceAccountsCustomersEntitlementsGet {
  
  inline def apply(): ParamsResourceAccountsCustomersEntitlementsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsCustomersEntitlementsGet]
  }
  
  extension [Self <: ParamsResourceAccountsCustomersEntitlementsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
