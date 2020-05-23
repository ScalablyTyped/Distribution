package typings.firebaseAdmin.authMod.admin.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used for looking up an account by phone number.
  *
  * See auth.getUsers()
  */
trait PhoneIdentifier extends UserIdentifier {
  var phoneNumber: String
}

object PhoneIdentifier {
  @scala.inline
  def apply(phoneNumber: String): PhoneIdentifier = {
    val __obj = js.Dynamic.literal(phoneNumber = phoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneIdentifier]
  }
}

