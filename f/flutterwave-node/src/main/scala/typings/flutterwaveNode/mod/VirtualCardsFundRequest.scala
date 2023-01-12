package typings.flutterwaveNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualCardsFundRequest extends StObject {
  
  var amount: String
  
  var debit_currency: js.UndefOr[String] = js.undefined
  
  var id: String
}
object VirtualCardsFundRequest {
  
  inline def apply(amount: String, id: String): VirtualCardsFundRequest = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualCardsFundRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VirtualCardsFundRequest] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setDebit_currency(value: String): Self = StObject.set(x, "debit_currency", value.asInstanceOf[js.Any])
    
    inline def setDebit_currencyUndefined: Self = StObject.set(x, "debit_currency", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
