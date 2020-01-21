package typings.forgeApis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthToken extends js.Object {
  var access_token: String
  var expires_in: Double
  var refresh_token: js.UndefOr[String] = js.undefined
  var token_type: String
}

object AuthToken {
  @scala.inline
  def apply(access_token: String, expires_in: Double, token_type: String, refresh_token: String = null): AuthToken = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], expires_in = expires_in.asInstanceOf[js.Any], token_type = token_type.asInstanceOf[js.Any])
    if (refresh_token != null) __obj.updateDynamic("refresh_token")(refresh_token.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthToken]
  }
}

