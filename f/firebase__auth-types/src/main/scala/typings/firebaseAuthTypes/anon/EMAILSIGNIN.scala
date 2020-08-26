package typings.firebaseAuthTypes.anon

import typings.firebaseAuthTypes.mod.Operation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EMAILSIGNIN extends js.Object {
  var EMAIL_SIGNIN: Operation = js.native
  var PASSWORD_RESET: Operation = js.native
  var RECOVER_EMAIL: Operation = js.native
  var REVERT_SECOND_FACTOR_ADDITION: Operation = js.native
  var VERIFY_AND_CHANGE_EMAIL: Operation = js.native
  var VERIFY_EMAIL: Operation = js.native
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
  @scala.inline
  implicit class EMAILSIGNINOps[Self <: EMAILSIGNIN] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEMAIL_SIGNIN(value: Operation): Self = this.set("EMAIL_SIGNIN", value.asInstanceOf[js.Any])
    @scala.inline
    def setPASSWORD_RESET(value: Operation): Self = this.set("PASSWORD_RESET", value.asInstanceOf[js.Any])
    @scala.inline
    def setRECOVER_EMAIL(value: Operation): Self = this.set("RECOVER_EMAIL", value.asInstanceOf[js.Any])
    @scala.inline
    def setREVERT_SECOND_FACTOR_ADDITION(value: Operation): Self = this.set("REVERT_SECOND_FACTOR_ADDITION", value.asInstanceOf[js.Any])
    @scala.inline
    def setVERIFY_AND_CHANGE_EMAIL(value: Operation): Self = this.set("VERIFY_AND_CHANGE_EMAIL", value.asInstanceOf[js.Any])
    @scala.inline
    def setVERIFY_EMAIL(value: Operation): Self = this.set("VERIFY_EMAIL", value.asInstanceOf[js.Any])
  }
  
}

