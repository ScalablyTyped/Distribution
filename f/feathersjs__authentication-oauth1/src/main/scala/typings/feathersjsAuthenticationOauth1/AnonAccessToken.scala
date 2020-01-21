package typings.feathersjsAuthenticationOauth1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAccessToken extends js.Object {
  var accessToken: String
  var profile: js.Any
  var refreshToken: String
}

object AnonAccessToken {
  @scala.inline
  def apply(accessToken: String, profile: js.Any, refreshToken: String): AnonAccessToken = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any], refreshToken = refreshToken.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAccessToken]
  }
}

