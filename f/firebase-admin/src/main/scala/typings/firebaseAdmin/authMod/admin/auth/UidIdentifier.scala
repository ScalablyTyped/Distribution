package typings.firebaseAdmin.authMod.admin.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used for looking up an account by uid.
  *
  * See auth.getUsers()
  */
trait UidIdentifier extends UserIdentifier {
  var uid: String
}

object UidIdentifier {
  @scala.inline
  def apply(uid: String): UidIdentifier = {
    val __obj = js.Dynamic.literal(uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[UidIdentifier]
  }
}

