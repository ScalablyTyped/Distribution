package typings.atFeathersjsAuthenticationDashOauth1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccessToken extends js.Object {
  var accessToken: String
  var profile: js.Any
  var refreshToken: String
}

object Anon_AccessToken {
  @scala.inline
  def apply(accessToken: String, profile: js.Any, refreshToken: String): Anon_AccessToken = {
    val __obj = js.Dynamic.literal(accessToken = accessToken, profile = profile, refreshToken = refreshToken)
  
    __obj.asInstanceOf[Anon_AccessToken]
  }
}

