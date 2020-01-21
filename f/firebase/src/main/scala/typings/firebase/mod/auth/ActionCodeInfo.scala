package typings.firebase.mod.auth

import typings.firebase.AnonEmail
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
    * For the `PASSWORD_RESET`, `VERIFY_EMAIL`, and `RECOVER_EMAIL` actions, this object
    * contains an `email` field with the address the email was sent to.
    *
    * For the `RECOVER_EMAIL` action, which allows a user to undo an email address
    * change, this object also contains a `fromEmail` field with the user account's
    * new email address. After the action completes, the user's email address will
    * revert to the value in the `email` field from the value in `fromEmail` field.
    */
  var data: AnonEmail
  /**
    * The type of operation that generated the action code. This could be:
    * <ul>
    * <li><code>PASSWORD_RESET</code>: password reset code generated via
    *     {@link firebase.auth.Auth.sendPasswordResetEmail}.</li>
    * <li><code>VERIFY_EMAIL</code>: email verification code generated via
    *     {@link firebase.User.sendEmailVerification}.</li>
    * <li><code>RECOVER_EMAIL</code>: email change revocation code generated via
    *     {@link firebase.User.updateEmail}.</li>
    * <li><code>EMAIL_SIGNIN</code>: email sign in code generated via
    *     {@link firebase.auth.Auth.sendSignInLinkToEmail}.</li>
    * </ul>
    */
  var operation: String
}

@JSImport("firebase", "auth.ActionCodeInfo")
@js.native
object ActionCodeInfo extends js.Object {
  /**
    * An enumeration of the possible email action types.
    */
  @js.native
  object Operation extends js.Object {
    /**
      * The email link sign-in action.
      */
    var EMAIL_SIGNIN: Operation = js.native
    /**
      * The password reset action.
      */
    var PASSWORD_RESET: Operation = js.native
    /**
      * The email revocation action.
      */
    var RECOVER_EMAIL: Operation = js.native
    /**
      * The email verification action.
      */
    var VERIFY_EMAIL: Operation = js.native
  }
  
  type Operation = String
}

