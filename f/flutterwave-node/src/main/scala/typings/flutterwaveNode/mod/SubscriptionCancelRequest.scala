package typings.flutterwaveNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscriptionCancelRequest extends StObject {
  
  var fetch_by_tx: String
  
  var id: String
}
object SubscriptionCancelRequest {
  
  inline def apply(fetch_by_tx: String, id: String): SubscriptionCancelRequest = {
    val __obj = js.Dynamic.literal(fetch_by_tx = fetch_by_tx.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionCancelRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubscriptionCancelRequest] (val x: Self) extends AnyVal {
    
    inline def setFetch_by_tx(value: String): Self = StObject.set(x, "fetch_by_tx", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
