package typings.firebaseAuth.distRnSrcModelPublicTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhoneMultiFactorEnrollInfoOptions
  extends StObject
     with PhoneInfoOptions {
  
  /** Phone number to send a verification code to. */
  var phoneNumber: String
  
  /** The {@link MultiFactorSession} obtained via {@link MultiFactorUser.getSession}. */
  var session: MultiFactorSession
}
object PhoneMultiFactorEnrollInfoOptions {
  
  inline def apply(phoneNumber: String, session: MultiFactorSession): PhoneMultiFactorEnrollInfoOptions = {
    val __obj = js.Dynamic.literal(phoneNumber = phoneNumber.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneMultiFactorEnrollInfoOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PhoneMultiFactorEnrollInfoOptions] (val x: Self) extends AnyVal {
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    inline def setSession(value: MultiFactorSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
  }
}
