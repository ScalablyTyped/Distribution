package typings.firebaseAdmin.authMod.admin.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used for looking up an account by email.
  *
  * See auth.getUsers()
  */
trait EmailIdentifier extends UserIdentifier {
  var email: String
}

object EmailIdentifier {
  @scala.inline
  def apply(email: String): EmailIdentifier = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailIdentifier]
  }
}

