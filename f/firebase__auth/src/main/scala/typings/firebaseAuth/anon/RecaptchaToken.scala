package typings.firebaseAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecaptchaToken extends StObject {
  
  var recaptchaToken: String
}
object RecaptchaToken {
  
  inline def apply(recaptchaToken: String): RecaptchaToken = {
    val __obj = js.Dynamic.literal(recaptchaToken = recaptchaToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecaptchaToken]
  }
  
  extension [Self <: RecaptchaToken](x: Self) {
    
    inline def setRecaptchaToken(value: String): Self = StObject.set(x, "recaptchaToken", value.asInstanceOf[js.Any])
  }
}
