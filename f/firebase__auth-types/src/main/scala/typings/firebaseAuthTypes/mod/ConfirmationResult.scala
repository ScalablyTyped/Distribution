package typings.firebaseAuthTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfirmationResult extends js.Object {
  var verificationId: String = js.native
  def confirm(verificationCode: String): js.Promise[UserCredential] = js.native
}

object ConfirmationResult {
  @scala.inline
  def apply(confirm: String => js.Promise[UserCredential], verificationId: String): ConfirmationResult = {
    val __obj = js.Dynamic.literal(confirm = js.Any.fromFunction1(confirm), verificationId = verificationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmationResult]
  }
  @scala.inline
  implicit class ConfirmationResultOps[Self <: ConfirmationResult] (val x: Self) extends AnyVal {
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
    def setConfirm(value: String => js.Promise[UserCredential]): Self = this.set("confirm", js.Any.fromFunction1(value))
    @scala.inline
    def setVerificationId(value: String): Self = this.set("verificationId", value.asInstanceOf[js.Any])
  }
  
}

