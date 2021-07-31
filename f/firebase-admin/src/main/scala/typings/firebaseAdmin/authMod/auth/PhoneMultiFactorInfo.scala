package typings.firebaseAdmin.authMod.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface representing a phone specific user enrolled second factor.
  */
trait PhoneMultiFactorInfo
  extends StObject
     with MultiFactorInfo {
  
  /**
    * The phone number associated with a phone second factor.
    */
  var phoneNumber: String
}
object PhoneMultiFactorInfo {
  
  @scala.inline
  def apply(factorId: String, phoneNumber: String, toJSON: () => js.Object, uid: String): PhoneMultiFactorInfo = {
    val __obj = js.Dynamic.literal(factorId = factorId.asInstanceOf[js.Any], phoneNumber = phoneNumber.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneMultiFactorInfo]
  }
  
  @scala.inline
  implicit class PhoneMultiFactorInfoMutableBuilder[Self <: PhoneMultiFactorInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
  }
}
