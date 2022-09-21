package typings.flutterwaveNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscriptionActivateRequest extends StObject {
  
  var fetch_by_tx: String
  
  var id: String
}
object SubscriptionActivateRequest {
  
  inline def apply(fetch_by_tx: String, id: String): SubscriptionActivateRequest = {
    val __obj = js.Dynamic.literal(fetch_by_tx = fetch_by_tx.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionActivateRequest]
  }
  
  extension [Self <: SubscriptionActivateRequest](x: Self) {
    
    inline def setFetch_by_tx(value: String): Self = StObject.set(x, "fetch_by_tx", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
