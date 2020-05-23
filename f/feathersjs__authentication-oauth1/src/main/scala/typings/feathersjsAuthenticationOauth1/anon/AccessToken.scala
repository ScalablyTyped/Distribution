package typings.feathersjsAuthenticationOauth1.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessToken extends js.Object {
  var accessToken: String
  var profile: js.Any
  var refreshToken: String
}

object AccessToken {
  @scala.inline
  def apply(accessToken: String, profile: js.Any, refreshToken: String): AccessToken = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any], refreshToken = refreshToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessToken]
  }
}

