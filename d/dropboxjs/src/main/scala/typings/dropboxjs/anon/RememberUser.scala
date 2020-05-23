package typings.dropboxjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RememberUser extends js.Object {
  var rememberUser: Boolean
  var scope: String
}

object RememberUser {
  @scala.inline
  def apply(rememberUser: Boolean, scope: String): RememberUser = {
    val __obj = js.Dynamic.literal(rememberUser = rememberUser.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[RememberUser]
  }
}

