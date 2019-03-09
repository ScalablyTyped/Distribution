package typings
package firebaseLib.firebaseMod.firebaseNs.authNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A verifier for domain verification and abuse prevention. Currently, the
  * only implementation is {@link firebase.auth.RecaptchaVerifier}.
  */
trait ApplicationVerifier extends js.Object {
  /**
    * Identifies the type of application verifier (e.g. "recaptcha").
    */
  var `type`: java.lang.String
  /**
    * Executes the verification process.
    * @return {!firebase.Promise<string>} A Promise for a token that can be used to
    *     assert the validity of a request.
    */
  def verify(): js.Promise[java.lang.String]
}

object ApplicationVerifier {
  @scala.inline
  def apply(`type`: java.lang.String, verify: js.Function0[js.Promise[java.lang.String]]): ApplicationVerifier = {
    val __obj = js.Dynamic.literal(verify = verify)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ApplicationVerifier]
  }
}

