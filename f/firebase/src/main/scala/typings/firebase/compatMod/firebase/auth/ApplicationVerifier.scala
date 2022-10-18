package typings.firebase.compatMod.firebase.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A verifier for domain verification and abuse prevention. Currently, the
  * only implementation is {@link firebase.auth.RecaptchaVerifier}.
  */
trait ApplicationVerifier extends StObject {
  
  /**
    * Identifies the type of application verifier (e.g. "recaptcha").
    */
  var `type`: String
  
  /**
    * Executes the verification process.
    * @return A Promise for a token that can be used to
    *     assert the validity of a request.
    */
  def verify(): js.Promise[String]
}
object ApplicationVerifier {
  
  inline def apply(`type`: String, verify: () => js.Promise[String]): ApplicationVerifier = {
    val __obj = js.Dynamic.literal(verify = js.Any.fromFunction0(verify))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationVerifier]
  }
  
  extension [Self <: ApplicationVerifier](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVerify(value: () => js.Promise[String]): Self = StObject.set(x, "verify", js.Any.fromFunction0(value))
  }
}
