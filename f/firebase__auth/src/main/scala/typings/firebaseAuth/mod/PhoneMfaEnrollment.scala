package typings.firebaseAuth.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An MFA provided by SMS verification
  */
trait PhoneMfaEnrollment
  extends StObject
     with BaseMfaEnrollment {
  
  var phoneInfo: String
}
object PhoneMfaEnrollment {
  
  inline def apply(enrolledAt: Double, mfaEnrollmentId: String, phoneInfo: String): PhoneMfaEnrollment = {
    val __obj = js.Dynamic.literal(enrolledAt = enrolledAt.asInstanceOf[js.Any], mfaEnrollmentId = mfaEnrollmentId.asInstanceOf[js.Any], phoneInfo = phoneInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneMfaEnrollment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PhoneMfaEnrollment] (val x: Self) extends AnyVal {
    
    inline def setPhoneInfo(value: String): Self = StObject.set(x, "phoneInfo", value.asInstanceOf[js.Any])
  }
}
