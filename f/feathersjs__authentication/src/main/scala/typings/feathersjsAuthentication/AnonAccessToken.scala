package typings.feathersjsAuthentication

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAccessToken extends js.Object {
  var accessToken: String
}

object AnonAccessToken {
  @scala.inline
  def apply(accessToken: String): AnonAccessToken = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAccessToken]
  }
}

