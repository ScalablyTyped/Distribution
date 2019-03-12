package typings
package expressDashSessionLib.expressDashSessionMod.Global.ExpressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionCookie extends SessionCookieData {
  def serialize(name: java.lang.String, value: java.lang.String): java.lang.String
}

object SessionCookie {
  @scala.inline
  def apply(
    expires: stdLib.Date | scala.Boolean,
    httpOnly: scala.Boolean,
    originalMaxAge: scala.Double,
    path: java.lang.String,
    serialize: (java.lang.String, java.lang.String) => java.lang.String,
    domain: java.lang.String = null,
    maxAge: scala.Int | scala.Double = null,
    sameSite: scala.Boolean | java.lang.String = null,
    secure: js.UndefOr[scala.Boolean] = js.undefined
  ): SessionCookie = {
    val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any], httpOnly = httpOnly, originalMaxAge = originalMaxAge, path = path, serialize = js.Any.fromFunction2(serialize))
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (sameSite != null) __obj.updateDynamic("sameSite")(sameSite.asInstanceOf[js.Any])
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure)
    __obj.asInstanceOf[SessionCookie]
  }
}

