package typings.firebase.mod.firebase.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The phone info options for multi-factor enrollment. Phone number and
  * multi-factor session are required.
  */
trait PhoneMultiFactorEnrollInfoOptions
  extends StObject
     with PhoneInfoOptions {
  
  var phoneNumber: String
  
  var session: MultiFactorSession
}
object PhoneMultiFactorEnrollInfoOptions {
  
  inline def apply(phoneNumber: String, session: MultiFactorSession): PhoneMultiFactorEnrollInfoOptions = {
    val __obj = js.Dynamic.literal(phoneNumber = phoneNumber.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneMultiFactorEnrollInfoOptions]
  }
  
  extension [Self <: PhoneMultiFactorEnrollInfoOptions](x: Self) {
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    inline def setSession(value: MultiFactorSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
  }
}
