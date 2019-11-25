package typings.atFirebaseAuthDashTypes

import typings.atFirebaseAuthDashTypes.atFirebaseAuthDashTypesMod.Operation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EMAILSIGNIN extends js.Object {
  var EMAIL_SIGNIN: Operation
  var PASSWORD_RESET: Operation
  var RECOVER_EMAIL: Operation
  var VERIFY_EMAIL: Operation
}

object Anon_EMAILSIGNIN {
  @scala.inline
  def apply(
    EMAIL_SIGNIN: Operation,
    PASSWORD_RESET: Operation,
    RECOVER_EMAIL: Operation,
    VERIFY_EMAIL: Operation
  ): Anon_EMAILSIGNIN = {
    val __obj = js.Dynamic.literal(EMAIL_SIGNIN = EMAIL_SIGNIN.asInstanceOf[js.Any], PASSWORD_RESET = PASSWORD_RESET.asInstanceOf[js.Any], RECOVER_EMAIL = RECOVER_EMAIL.asInstanceOf[js.Any], VERIFY_EMAIL = VERIFY_EMAIL.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_EMAILSIGNIN]
  }
}

