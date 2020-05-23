package typings.firebaseAuthTypes.anon

import typings.firebaseAuthTypes.mod.Operation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EMAILSIGNIN extends js.Object {
  var EMAIL_SIGNIN: Operation
  var PASSWORD_RESET: Operation
  var RECOVER_EMAIL: Operation
  var REVERT_SECOND_FACTOR_ADDITION: Operation
  var VERIFY_AND_CHANGE_EMAIL: Operation
  var VERIFY_EMAIL: Operation
}

object EMAILSIGNIN {
  @scala.inline
  def apply(
    EMAIL_SIGNIN: Operation,
    PASSWORD_RESET: Operation,
    RECOVER_EMAIL: Operation,
    REVERT_SECOND_FACTOR_ADDITION: Operation,
    VERIFY_AND_CHANGE_EMAIL: Operation,
    VERIFY_EMAIL: Operation
  ): EMAILSIGNIN = {
    val __obj = js.Dynamic.literal(EMAIL_SIGNIN = EMAIL_SIGNIN.asInstanceOf[js.Any], PASSWORD_RESET = PASSWORD_RESET.asInstanceOf[js.Any], RECOVER_EMAIL = RECOVER_EMAIL.asInstanceOf[js.Any], REVERT_SECOND_FACTOR_ADDITION = REVERT_SECOND_FACTOR_ADDITION.asInstanceOf[js.Any], VERIFY_AND_CHANGE_EMAIL = VERIFY_AND_CHANGE_EMAIL.asInstanceOf[js.Any], VERIFY_EMAIL = VERIFY_EMAIL.asInstanceOf[js.Any])
    __obj.asInstanceOf[EMAILSIGNIN]
  }
}

