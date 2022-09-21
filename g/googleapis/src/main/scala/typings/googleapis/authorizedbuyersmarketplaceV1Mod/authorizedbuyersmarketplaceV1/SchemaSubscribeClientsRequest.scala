package typings.googleapis.authorizedbuyersmarketplaceV1Mod.authorizedbuyersmarketplaceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSubscribeClientsRequest extends StObject {
  
  /**
    * Optional. A list of client buyers to subscribe to the auction package, with client buyer in the format `buyers/{accountId\}/clients/{clientAccountId\}`. The current buyer will be subscribed to the auction package regardless of the list contents if not already.
    */
  var clients: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaSubscribeClientsRequest {
  
  inline def apply(): SchemaSubscribeClientsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubscribeClientsRequest]
  }
  
  extension [Self <: SchemaSubscribeClientsRequest](x: Self) {
    
    inline def setClients(value: js.Array[String]): Self = StObject.set(x, "clients", value.asInstanceOf[js.Any])
    
    inline def setClientsNull: Self = StObject.set(x, "clients", null)
    
    inline def setClientsUndefined: Self = StObject.set(x, "clients", js.undefined)
    
    inline def setClientsVarargs(value: String*): Self = StObject.set(x, "clients", js.Array(value*))
  }
}
