package typings.googleapis.authorizedbuyersmarketplaceV1Mod.authorizedbuyersmarketplaceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUnsubscribeClientsRequest extends StObject {
  
  /**
    * Optional. A list of client buyers to unsubscribe from the auction package, with client buyer in the format `buyers/{accountId\}/clients/{clientAccountId\}`.
    */
  var clients: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaUnsubscribeClientsRequest {
  
  inline def apply(): SchemaUnsubscribeClientsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUnsubscribeClientsRequest]
  }
  
  extension [Self <: SchemaUnsubscribeClientsRequest](x: Self) {
    
    inline def setClients(value: js.Array[String]): Self = StObject.set(x, "clients", value.asInstanceOf[js.Any])
    
    inline def setClientsNull: Self = StObject.set(x, "clients", null)
    
    inline def setClientsUndefined: Self = StObject.set(x, "clients", js.undefined)
    
    inline def setClientsVarargs(value: String*): Self = StObject.set(x, "clients", js.Array(value*))
  }
}
