package typings
package forgeDashApisLib.forgeDashApisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthToken extends js.Object {
  var access_token: java.lang.String
  var expires_in: scala.Double
  var refresh_token: js.UndefOr[java.lang.String] = js.undefined
  var token_type: java.lang.String
}

object AuthToken {
  @scala.inline
  def apply(
    access_token: java.lang.String,
    expires_in: scala.Double,
    token_type: java.lang.String,
    refresh_token: java.lang.String = null
  ): AuthToken = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("access_token")(access_token)
    __obj.updateDynamic("expires_in")(expires_in)
    __obj.updateDynamic("token_type")(token_type)
    if (refresh_token != null) __obj.updateDynamic("refresh_token")(refresh_token)
    __obj.asInstanceOf[AuthToken]
  }
}

