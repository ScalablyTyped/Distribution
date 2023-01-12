package typings.flutterwaveNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountValidateRequest extends StObject {
  
  var otp: String | Double
  
  var transactionreference: String
}
object AccountValidateRequest {
  
  inline def apply(otp: String | Double, transactionreference: String): AccountValidateRequest = {
    val __obj = js.Dynamic.literal(otp = otp.asInstanceOf[js.Any], transactionreference = transactionreference.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountValidateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountValidateRequest] (val x: Self) extends AnyVal {
    
    inline def setOtp(value: String | Double): Self = StObject.set(x, "otp", value.asInstanceOf[js.Any])
    
    inline def setTransactionreference(value: String): Self = StObject.set(x, "transactionreference", value.asInstanceOf[js.Any])
  }
}
