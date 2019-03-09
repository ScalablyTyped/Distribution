package typings
package firebaseLib.firebaseMod.firebaseNs.authNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response from {@link firebase.auth.Auth.checkActionCode}.
  */
trait ActionCodeInfo extends js.Object {
  /**
    * The data associated with the action code.
    *
    * For the PASSWORD_RESET, VERIFY_EMAIL, and RECOVER_EMAIL actions, this object
    * contains an `email` field with the address the email was sent to.
    *
    * For the RECOVER_EMAIL action, which allows a user to undo an email address
    * change, this object also contains a `fromEmail` field with the user account's
    * new email address. After the action completes, the user's email address will
    * revert to the value in the `email` field from the value in `fromEmail` field.
    */
  var data: firebaseLib.Anon_Email
  /**
    * The type of operation that generated the action code. This could be:
    * <ul>
    * <li>`PASSWORD_RESET`: password reset code generated via
    *     {@link firebase.auth.Auth.sendPasswordResetEmail}.</li>
    * <li>`VERIFY_EMAIL`: email verification code generated via
    *     {@link firebase.User.sendEmailVerification}.</li>
    * <li>`RECOVER_EMAIL`: email change revocation code generated via
    *     {@link firebase.User.updateEmail}.</li>
    * <li>`EMAIL_SIGNIN`: email sign in code generated via
    *     {@link firebase.auth.Auth.sendSignInLinkToEmail}.</li>
    * </ul>
    */
  var operation: java.lang.String
}

object ActionCodeInfo {
  @scala.inline
  def apply(data: firebaseLib.Anon_Email, operation: java.lang.String): ActionCodeInfo = {
    val __obj = js.Dynamic.literal(data = data, operation = operation)
  
    __obj.asInstanceOf[ActionCodeInfo]
  }
}

