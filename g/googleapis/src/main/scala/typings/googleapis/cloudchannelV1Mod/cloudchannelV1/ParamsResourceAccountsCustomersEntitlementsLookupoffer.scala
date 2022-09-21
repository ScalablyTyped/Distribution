package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsCustomersEntitlementsLookupoffer
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the entitlement to retrieve the Offer. Entitlement uses the format: accounts/{account_id\}/customers/{customer_id\}/entitlements/{entitlement_id\}
    */
  var entitlement: js.UndefOr[String] = js.undefined
}
object ParamsResourceAccountsCustomersEntitlementsLookupoffer {
  
  inline def apply(): ParamsResourceAccountsCustomersEntitlementsLookupoffer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsCustomersEntitlementsLookupoffer]
  }
  
  extension [Self <: ParamsResourceAccountsCustomersEntitlementsLookupoffer](x: Self) {
    
    inline def setEntitlement(value: String): Self = StObject.set(x, "entitlement", value.asInstanceOf[js.Any])
    
    inline def setEntitlementUndefined: Self = StObject.set(x, "entitlement", js.undefined)
  }
}
