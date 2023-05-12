package typings.firebaseAuth.distAuthMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TotpVerificationInfo extends StObject {
  
  var sessionInfo: String
  
  var verificationCode: String
}
object TotpVerificationInfo {
  
  inline def apply(sessionInfo: String, verificationCode: String): TotpVerificationInfo = {
    val __obj = js.Dynamic.literal(sessionInfo = sessionInfo.asInstanceOf[js.Any], verificationCode = verificationCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[TotpVerificationInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TotpVerificationInfo] (val x: Self) extends AnyVal {
    
    inline def setSessionInfo(value: String): Self = StObject.set(x, "sessionInfo", value.asInstanceOf[js.Any])
    
    inline def setVerificationCode(value: String): Self = StObject.set(x, "verificationCode", value.asInstanceOf[js.Any])
  }
}
