package typings.feathersjsAuthentication.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessToken extends js.Object {
  var accessToken: String
}

object AccessToken {
  @scala.inline
  def apply(accessToken: String): AccessToken = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessToken]
  }
}

