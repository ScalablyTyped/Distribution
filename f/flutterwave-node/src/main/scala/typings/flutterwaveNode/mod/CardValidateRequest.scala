package typings.flutterwaveNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardValidateRequest extends StObject {
  
  var otp: js.UndefOr[String] = js.undefined
  
  var transaction_reference: String
}
object CardValidateRequest {
  
  inline def apply(transaction_reference: String): CardValidateRequest = {
    val __obj = js.Dynamic.literal(transaction_reference = transaction_reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardValidateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CardValidateRequest] (val x: Self) extends AnyVal {
    
    inline def setOtp(value: String): Self = StObject.set(x, "otp", value.asInstanceOf[js.Any])
    
    inline def setOtpUndefined: Self = StObject.set(x, "otp", js.undefined)
    
    inline def setTransaction_reference(value: String): Self = StObject.set(x, "transaction_reference", value.asInstanceOf[js.Any])
  }
}
