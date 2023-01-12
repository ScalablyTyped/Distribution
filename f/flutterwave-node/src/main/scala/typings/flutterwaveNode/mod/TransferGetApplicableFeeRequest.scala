package typings.flutterwaveNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransferGetApplicableFeeRequest extends StObject {
  
  var amount: String
  
  var currency: String
}
object TransferGetApplicableFeeRequest {
  
  inline def apply(amount: String, currency: String): TransferGetApplicableFeeRequest = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferGetApplicableFeeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransferGetApplicableFeeRequest] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
  }
}
