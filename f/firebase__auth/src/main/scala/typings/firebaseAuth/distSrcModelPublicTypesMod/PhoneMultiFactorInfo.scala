package typings.firebaseAuth.distSrcModelPublicTypesMod

import typings.firebaseAuth.firebaseAuthStrings.phone
import typings.firebaseAuth.firebaseAuthStrings.totp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhoneMultiFactorInfo
  extends StObject
     with MultiFactorInfo {
  
  /** The phone number associated with the current second factor. */
  val phoneNumber: String
}
object PhoneMultiFactorInfo {
  
  inline def apply(enrollmentTime: String, factorId: phone | totp, phoneNumber: String, uid: String): PhoneMultiFactorInfo = {
    val __obj = js.Dynamic.literal(enrollmentTime = enrollmentTime.asInstanceOf[js.Any], factorId = factorId.asInstanceOf[js.Any], phoneNumber = phoneNumber.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneMultiFactorInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PhoneMultiFactorInfo] (val x: Self) extends AnyVal {
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
  }
}
