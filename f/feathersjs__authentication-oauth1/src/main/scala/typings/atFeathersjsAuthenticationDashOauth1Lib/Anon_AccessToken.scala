package typings
package atFeathersjsAuthenticationDashOauth1Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccessToken extends js.Object {
  var accessToken: java.lang.String
  var profile: js.Any
  var refreshToken: java.lang.String
}

object Anon_AccessToken {
  @scala.inline
  def apply(accessToken: java.lang.String, profile: js.Any, refreshToken: java.lang.String): Anon_AccessToken = {
    val __obj = js.Dynamic.literal(accessToken = accessToken, profile = profile, refreshToken = refreshToken)
  
    __obj.asInstanceOf[Anon_AccessToken]
  }
}

