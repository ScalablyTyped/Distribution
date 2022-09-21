package typings.flutterwaveNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentplanCreateRequest extends StObject {
  
  var amount: String
  
  var duration: js.UndefOr[String] = js.undefined
  
  var interval: String
  
  var name: String
}
object PaymentplanCreateRequest {
  
  inline def apply(amount: String, interval: String, name: String): PaymentplanCreateRequest = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentplanCreateRequest]
  }
  
  extension [Self <: PaymentplanCreateRequest](x: Self) {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setInterval(value: String): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
