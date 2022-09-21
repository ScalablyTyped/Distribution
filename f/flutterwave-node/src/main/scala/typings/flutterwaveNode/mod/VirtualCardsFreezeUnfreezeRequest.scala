package typings.flutterwaveNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualCardsFreezeUnfreezeRequest extends StObject {
  
  var card_id: String
  
  var status_action: String
}
object VirtualCardsFreezeUnfreezeRequest {
  
  inline def apply(card_id: String, status_action: String): VirtualCardsFreezeUnfreezeRequest = {
    val __obj = js.Dynamic.literal(card_id = card_id.asInstanceOf[js.Any], status_action = status_action.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualCardsFreezeUnfreezeRequest]
  }
  
  extension [Self <: VirtualCardsFreezeUnfreezeRequest](x: Self) {
    
    inline def setCard_id(value: String): Self = StObject.set(x, "card_id", value.asInstanceOf[js.Any])
    
    inline def setStatus_action(value: String): Self = StObject.set(x, "status_action", value.asInstanceOf[js.Any])
  }
}
