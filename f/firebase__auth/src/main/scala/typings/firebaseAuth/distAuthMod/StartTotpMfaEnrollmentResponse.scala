package typings.firebaseAuth.distAuthMod

import typings.firebaseAuth.anon.FinalizeEnrollmentTime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartTotpMfaEnrollmentResponse extends StObject {
  
  var totpSessionInfo: FinalizeEnrollmentTime
}
object StartTotpMfaEnrollmentResponse {
  
  inline def apply(totpSessionInfo: FinalizeEnrollmentTime): StartTotpMfaEnrollmentResponse = {
    val __obj = js.Dynamic.literal(totpSessionInfo = totpSessionInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartTotpMfaEnrollmentResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartTotpMfaEnrollmentResponse] (val x: Self) extends AnyVal {
    
    inline def setTotpSessionInfo(value: FinalizeEnrollmentTime): Self = StObject.set(x, "totpSessionInfo", value.asInstanceOf[js.Any])
  }
}
