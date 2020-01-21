package typings.firebaseAuthTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfirmationResult extends js.Object {
  var verificationId: String
  def confirm(verificationCode: String): js.Promise[UserCredential]
}

object ConfirmationResult {
  @scala.inline
  def apply(confirm: String => js.Promise[UserCredential], verificationId: String): ConfirmationResult = {
    val __obj = js.Dynamic.literal(confirm = js.Any.fromFunction1(confirm), verificationId = verificationId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConfirmationResult]
  }
}

