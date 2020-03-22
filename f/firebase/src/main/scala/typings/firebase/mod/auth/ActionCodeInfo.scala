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
    * For the RECOVER_EMAIL action, which allows a user to undo an email address
    * change, this object also contains a `previousEmail` field with the user account's
    * current email address. After the action completes, the user's email address will
    * revert to the value in the `email` field from the value in `previousEmail` field.
    *
    * For the VERIFY_AND_CHANGE_EMAIL action, which allows a user to verify the email
    * before updating it, this object contains a `previousEmail` field with the user
    * account's email address before updating. After the action completes, the user's
    * email address will be updated to the value in the `email` field from the value
    * in `previousEmail` field.
    *
    * For the REVERT_SECOND_FACTOR_ADDITION action, which allows a user to unenroll
    * a newly added second factor, this object contains a `multiFactorInfo` field with
    * the information about the second factor. For phone second factor, the
    * `multiFactorInfo` is a {@link firebase.auth.Auth.PhoneMultiFactorInfo} object,
    * which contains the phone number.
    */
  var data: AnonEmail
  /**
    * The type of operation that generated the action code. This could be:
    * <ul>
    * <li>`EMAIL_SIGNIN`: email sign in code generated via
    *     {@link firebase.auth.Auth.sendSignInLinkToEmail}.</li>
    * <li>`PASSWORD_RESET`: password reset code generated via
    *     {@link firebase.auth.Auth.sendPasswordResetEmail}.</li>
    * <li>`RECOVER_EMAIL`: email change revocation code generated via
    *     {@link firebase.User.updateEmail}.</li>
    * <li>`REVERT_SECOND_FACTOR_ADDITION`: revert second factor addition
    *     code generated via
    *     {@link firebase.User.MultiFactorUser.enroll}.</li>
    * <li>`VERIFY_AND_CHANGE_EMAIL`: verify and change email code generated
    *     via {@link firebase.User.verifyBeforeUpdateEmail}.</li>
    * <li>`VERIFY_EMAIL`: email verification code generated via
    *     {@link firebase.User.sendEmailVerification}.</li>
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
      * The revert second factor addition email action.
      */
    var REVERT_SECOND_FACTOR_ADDITION: Operation = js.native
    /**
      * The verify and update email action.
      */
    var VERIFY_AND_CHANGE_EMAIL: Operation = js.native
    /**
      * The email verification action.
      */
    var VERIFY_EMAIL: Operation = js.native
  }
  
  type Operation = String
}

