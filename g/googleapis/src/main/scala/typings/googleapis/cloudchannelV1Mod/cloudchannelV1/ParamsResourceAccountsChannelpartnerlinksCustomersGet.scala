package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsChannelpartnerlinksCustomersGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the customer to retrieve. Name uses the format: accounts/{account_id\}/customers/{customer_id\}
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceAccountsChannelpartnerlinksCustomersGet {
  
  inline def apply(): ParamsResourceAccountsChannelpartnerlinksCustomersGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsChannelpartnerlinksCustomersGet]
  }
  
  extension [Self <: ParamsResourceAccountsChannelpartnerlinksCustomersGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
