package typings.dropboxjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRememberUser extends js.Object {
  var rememberUser: Boolean
  var scope: String
}

object AnonRememberUser {
  @scala.inline
  def apply(rememberUser: Boolean, scope: String): AnonRememberUser = {
    val __obj = js.Dynamic.literal(rememberUser = rememberUser.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRememberUser]
  }
}

