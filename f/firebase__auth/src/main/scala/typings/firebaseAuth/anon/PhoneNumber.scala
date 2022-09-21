package typings.firebaseAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhoneNumber extends StObject {
  
  var phoneNumber: String
  
  var recaptchaToken: String
}
object PhoneNumber {
  
  inline def apply(phoneNumber: String, recaptchaToken: String): PhoneNumber = {
    val __obj = js.Dynamic.literal(phoneNumber = phoneNumber.asInstanceOf[js.Any], recaptchaToken = recaptchaToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneNumber]
  }
  
  extension [Self <: PhoneNumber](x: Self) {
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    inline def setRecaptchaToken(value: String): Self = StObject.set(x, "recaptchaToken", value.asInstanceOf[js.Any])
  }
}
