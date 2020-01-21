package typings.firebase.mod.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A result from a phone number sign-in, link, or reauthenticate call.
  */
trait ConfirmationResult extends js.Object {
  /**
    * The phone number authentication operation's verification ID. This can be used
    * along with the verification code to initialize a phone auth credential.
    */
  var verificationId: String
  /**
    * Finishes a phone number sign-in, link, or reauthentication, given the code
    * that was sent to the user's mobile device.
    *
    * <h4>Error Codes</h4>
    * <dl>
    * <dt>auth/invalid-verification-code</dt>
    * <dd>Thrown if the verification code is not valid.</dd>
    * <dt>auth/missing-verification-code</dt>
    * <dd>Thrown if the verification code is missing.</dd>
    * </dl>
    */
  def confirm(verificationCode: String): js.Promise[UserCredential]
}

object ConfirmationResult {
  @scala.inline
  def apply(confirm: String => js.Promise[UserCredential], verificationId: String): ConfirmationResult = {
    val __obj = js.Dynamic.literal(confirm = js.Any.fromFunction1(confirm), verificationId = verificationId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConfirmationResult]
  }
}

