package typings
package firebaseDashAdminLib.adminNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleOAuthAccessToken extends js.Object {
  var access_token: java.lang.String
  var expires_in: scala.Double
}

object GoogleOAuthAccessToken {
  @scala.inline
  def apply(access_token: java.lang.String, expires_in: scala.Double): GoogleOAuthAccessToken = {
    val __obj = js.Dynamic.literal(access_token = access_token, expires_in = expires_in)
  
    __obj.asInstanceOf[GoogleOAuthAccessToken]
  }
}

