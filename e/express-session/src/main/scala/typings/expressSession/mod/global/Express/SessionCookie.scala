package typings.expressSession.mod.global.Express

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionCookie extends SessionCookieData {
  def serialize(name: String, value: String): String
}

object SessionCookie {
  @scala.inline
  def apply(
    expires: Date | Boolean,
    httpOnly: Boolean,
    originalMaxAge: Double,
    path: String,
    serialize: (String, String) => String,
    domain: String = null,
    maxAge: Double = null.asInstanceOf[Double],
    sameSite: Boolean | String = null,
    secure: js.UndefOr[Boolean] = js.undefined
  ): SessionCookie = {
    val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any], httpOnly = httpOnly.asInstanceOf[js.Any], originalMaxAge = originalMaxAge.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], serialize = js.Any.fromFunction2(serialize), maxAge = maxAge.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (sameSite != null) __obj.updateDynamic("sameSite")(sameSite.asInstanceOf[js.Any])
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionCookie]
  }
}

