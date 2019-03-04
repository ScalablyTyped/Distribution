package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cookie extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/cookie
  /**
    * The domain of the cookie.
    */
  var domain: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The expiration date of the cookie as the number of seconds since the UNIX epoch.
    * Not provided for session cookies.
    */
  var expirationDate: js.UndefOr[scala.Double] = js.undefined
  /**
    * Whether the cookie is a host-only cookie.
    */
  var hostOnly: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether the cookie is marked as HTTP only.
    */
  var httpOnly: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The name of the cookie.
    */
  var name: java.lang.String
  /**
    * The path of the cookie.
    */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether the cookie is marked as secure.
    */
  var secure: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether the cookie is a session cookie or a persistent cookie with an expiration
    * date.
    */
  var session: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The value of the cookie.
    */
  var value: java.lang.String
}

object Cookie {
  @scala.inline
  def apply(
    name: java.lang.String,
    value: java.lang.String,
    domain: java.lang.String = null,
    expirationDate: scala.Int | scala.Double = null,
    hostOnly: js.UndefOr[scala.Boolean] = js.undefined,
    httpOnly: js.UndefOr[scala.Boolean] = js.undefined,
    path: java.lang.String = null,
    secure: js.UndefOr[scala.Boolean] = js.undefined,
    session: js.UndefOr[scala.Boolean] = js.undefined
  ): Cookie = {
    val __obj = js.Dynamic.literal(name = name, value = value)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (expirationDate != null) __obj.updateDynamic("expirationDate")(expirationDate.asInstanceOf[js.Any])
    if (!js.isUndefined(hostOnly)) __obj.updateDynamic("hostOnly")(hostOnly)
    if (!js.isUndefined(httpOnly)) __obj.updateDynamic("httpOnly")(httpOnly)
    if (path != null) __obj.updateDynamic("path")(path)
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure)
    if (!js.isUndefined(session)) __obj.updateDynamic("session")(session)
    __obj.asInstanceOf[Cookie]
  }
}

