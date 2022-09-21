package typings.flutterwaveNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefundRefundRequest extends StObject {
  
  var amount: js.UndefOr[String] = js.undefined
  
  var ref: String
}
object RefundRefundRequest {
  
  inline def apply(ref: String): RefundRefundRequest = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefundRefundRequest]
  }
  
  extension [Self <: RefundRefundRequest](x: Self) {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
  }
}
