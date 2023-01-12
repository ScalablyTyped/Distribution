package typings.flutterwaveNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualCardsWithrawRequest extends StObject {
  
  var amount: String
  
  var card_id: String
}
object VirtualCardsWithrawRequest {
  
  inline def apply(amount: String, card_id: String): VirtualCardsWithrawRequest = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], card_id = card_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualCardsWithrawRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VirtualCardsWithrawRequest] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setCard_id(value: String): Self = StObject.set(x, "card_id", value.asInstanceOf[js.Any])
  }
}
