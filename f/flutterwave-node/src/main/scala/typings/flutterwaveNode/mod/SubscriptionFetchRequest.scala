package typings.flutterwaveNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscriptionFetchRequest extends StObject {
  
  var transaction_id: String
}
object SubscriptionFetchRequest {
  
  inline def apply(transaction_id: String): SubscriptionFetchRequest = {
    val __obj = js.Dynamic.literal(transaction_id = transaction_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionFetchRequest]
  }
  
  extension [Self <: SubscriptionFetchRequest](x: Self) {
    
    inline def setTransaction_id(value: String): Self = StObject.set(x, "transaction_id", value.asInstanceOf[js.Any])
  }
}
