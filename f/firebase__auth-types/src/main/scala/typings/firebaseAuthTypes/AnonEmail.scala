package typings.firebaseAuthTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEmail extends js.Object {
  var email: js.UndefOr[String | Null] = js.undefined
  var fromEmail: js.UndefOr[String | Null] = js.undefined
}

object AnonEmail {
  @scala.inline
  def apply(email: String = null, fromEmail: String = null): AnonEmail = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (fromEmail != null) __obj.updateDynamic("fromEmail")(fromEmail.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEmail]
  }
}

