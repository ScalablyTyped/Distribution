package typings.firebaseAdmin.authMod.admin.auth

import typings.firebaseAdmin.anon.Algorithm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing the user import options needed for
  * {@link https://firebase.google.com/docs/reference/admin/node/admin.auth.Auth#importUsers `importUsers()`} method. This is used to
  * provide the password hashing algorithm information.
  */
trait UserImportOptions extends js.Object {
  /**
    * The password hashing information.
    */
  var hash: Algorithm
}

object UserImportOptions {
  @scala.inline
  def apply(hash: Algorithm): UserImportOptions = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserImportOptions]
  }
}

