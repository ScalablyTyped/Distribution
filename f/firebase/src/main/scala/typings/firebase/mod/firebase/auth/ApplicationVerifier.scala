package typings.firebase.mod.firebase.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A verifier for domain verification and abuse prevention. Currently, the
  * only implementation is {@link firebase.auth.RecaptchaVerifier}.
  */
@js.native
trait ApplicationVerifier extends StObject {
  
  /**
    * Identifies the type of application verifier (e.g. "recaptcha").
    */
  var `type`: String = js.native
  
  /**
    * Executes the verification process.
    * @return A Promise for a token that can be used to
    *     assert the validity of a request.
    */
  def verify(): js.Promise[String] = js.native
}
object ApplicationVerifier {
  
  @scala.inline
  def apply(`type`: String, verify: () => js.Promise[String]): ApplicationVerifier = {
    val __obj = js.Dynamic.literal(verify = js.Any.fromFunction0(verify))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationVerifier]
  }
  
  @scala.inline
  implicit class ApplicationVerifierMutableBuilder[Self <: ApplicationVerifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerify(value: () => js.Promise[String]): Self = StObject.set(x, "verify", js.Any.fromFunction0(value))
  }
}
