package typings.firebase.mod.firebase.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The subclass of the MultiFactorInfo interface for phone number second factors.
  * The factorId of this second factor is
  * {@link firebase.auth.PhoneMultiFactorGenerator.FACTOR_ID}.
  */
trait PhoneMultiFactorInfo
  extends StObject
     with MultiFactorInfo {
  
  /**
    * The phone number associated with the current second factor.
    */
  var phoneNumber: String
}
object PhoneMultiFactorInfo {
  
  inline def apply(enrollmentTime: String, factorId: String, phoneNumber: String, uid: String): PhoneMultiFactorInfo = {
    val __obj = js.Dynamic.literal(enrollmentTime = enrollmentTime.asInstanceOf[js.Any], factorId = factorId.asInstanceOf[js.Any], phoneNumber = phoneNumber.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneMultiFactorInfo]
  }
  
  extension [Self <: PhoneMultiFactorInfo](x: Self) {
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
  }
}
