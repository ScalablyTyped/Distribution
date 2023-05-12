package typings.firebaseAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerificationCode extends StObject {
  
  var verificationCode: String
}
object VerificationCode {
  
  inline def apply(verificationCode: String): VerificationCode = {
    val __obj = js.Dynamic.literal(verificationCode = verificationCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerificationCode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VerificationCode] (val x: Self) extends AnyVal {
    
    inline def setVerificationCode(value: String): Self = StObject.set(x, "verificationCode", value.asInstanceOf[js.Any])
  }
}
