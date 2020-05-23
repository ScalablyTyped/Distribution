package typings.expressSession.mod.global.Express

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionCookieData extends js.Object {
  var domain: js.UndefOr[String] = js.undefined
  var expires: Date | Boolean
  var httpOnly: Boolean
  var maxAge: Double | Null
  var originalMaxAge: Double
  var path: String
  var sameSite: js.UndefOr[Boolean | String] = js.undefined
  var secure: js.UndefOr[Boolean] = js.undefined
}

object SessionCookieData {
  @scala.inline
  def apply(
    expires: Date | Boolean,
    httpOnly: Boolean,
    originalMaxAge: Double,
    path: String,
    domain: String = null,
    maxAge: Double = null.asInstanceOf[Double],
    sameSite: Boolean | String = null,
    secure: js.UndefOr[Boolean] = js.undefined
  ): SessionCookieData = {
    val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any], httpOnly = httpOnly.asInstanceOf[js.Any], originalMaxAge = originalMaxAge.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], maxAge = maxAge.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (sameSite != null) __obj.updateDynamic("sameSite")(sameSite.asInstanceOf[js.Any])
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionCookieData]
  }
}

