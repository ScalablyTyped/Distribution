package typings.flutterwaveNode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChargeResponseMessage extends StObject {
  
  var chargeResponseMessage: String
  
  var flwRef: String
  
  var order: String
  
  var txRef: String
}
object ChargeResponseMessage {
  
  inline def apply(chargeResponseMessage: String, flwRef: String, order: String, txRef: String): ChargeResponseMessage = {
    val __obj = js.Dynamic.literal(chargeResponseMessage = chargeResponseMessage.asInstanceOf[js.Any], flwRef = flwRef.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], txRef = txRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChargeResponseMessage]
  }
  
  extension [Self <: ChargeResponseMessage](x: Self) {
    
    inline def setChargeResponseMessage(value: String): Self = StObject.set(x, "chargeResponseMessage", value.asInstanceOf[js.Any])
    
    inline def setFlwRef(value: String): Self = StObject.set(x, "flwRef", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: String): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setTxRef(value: String): Self = StObject.set(x, "txRef", value.asInstanceOf[js.Any])
  }
}
