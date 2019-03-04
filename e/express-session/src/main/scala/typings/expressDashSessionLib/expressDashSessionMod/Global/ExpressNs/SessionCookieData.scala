package typings
package expressDashSessionLib.expressDashSessionMod.Global.ExpressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionCookieData extends js.Object {
  var domain: js.UndefOr[java.lang.String] = js.undefined
  var expires: stdLib.Date | scala.Boolean
  var httpOnly: scala.Boolean
  var maxAge: scala.Double | scala.Null
  var originalMaxAge: scala.Double
  var path: java.lang.String
  var sameSite: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var secure: js.UndefOr[scala.Boolean] = js.undefined
}

object SessionCookieData {
  @scala.inline
  def apply(
    expires: stdLib.Date | scala.Boolean,
    httpOnly: scala.Boolean,
    originalMaxAge: scala.Double,
    path: java.lang.String,
    domain: java.lang.String = null,
    maxAge: scala.Int | scala.Double = null,
    sameSite: scala.Boolean | java.lang.String = null,
    secure: js.UndefOr[scala.Boolean] = js.undefined
  ): SessionCookieData = {
    val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any], httpOnly = httpOnly, originalMaxAge = originalMaxAge, path = path)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (sameSite != null) __obj.updateDynamic("sameSite")(sameSite.asInstanceOf[js.Any])
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure)
    __obj.asInstanceOf[SessionCookieData]
  }
}

