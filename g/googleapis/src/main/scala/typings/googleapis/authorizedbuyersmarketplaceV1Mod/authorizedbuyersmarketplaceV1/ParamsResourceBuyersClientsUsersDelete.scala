package typings.googleapis.authorizedbuyersmarketplaceV1Mod.authorizedbuyersmarketplaceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceBuyersClientsUsersDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Format: `buyers/{buyerAccountId\}/clients/{clientAccountId\}/clientUsers/{userId\}`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceBuyersClientsUsersDelete {
  
  inline def apply(): ParamsResourceBuyersClientsUsersDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBuyersClientsUsersDelete]
  }
  
  extension [Self <: ParamsResourceBuyersClientsUsersDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
