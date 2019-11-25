package typings.firebaseDashAdmin.admin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleOAuthAccessToken extends js.Object {
  var access_token: String
  var expires_in: Double
}

object GoogleOAuthAccessToken {
  @scala.inline
  def apply(access_token: String, expires_in: Double): GoogleOAuthAccessToken = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], expires_in = expires_in.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GoogleOAuthAccessToken]
  }
}

