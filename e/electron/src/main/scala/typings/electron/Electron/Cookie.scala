package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cookie extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/cookie
  /**
    * The domain of the cookie; this will be normalized with a preceding dot so that
    * it's also valid for subdomains.
    */
  var domain: js.UndefOr[String] = js.undefined
  /**
    * The expiration date of the cookie as the number of seconds since the UNIX epoch.
    * Not provided for session cookies.
    */
  var expirationDate: js.UndefOr[Double] = js.undefined
  /**
    * Whether the cookie is a host-only cookie; this will only be true if no domain
    * was passed.
    */
  var hostOnly: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the cookie is marked as HTTP only.
    */
  var httpOnly: js.UndefOr[Boolean] = js.undefined
  /**
    * The name of the cookie.
    */
  var name: String
  /**
    * The path of the cookie.
    */
  var path: js.UndefOr[String] = js.undefined
  /**
    * Whether the cookie is marked as secure.
    */
  var secure: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the cookie is a session cookie or a persistent cookie with an expiration
    * date.
    */
  var session: js.UndefOr[Boolean] = js.undefined
  /**
    * The value of the cookie.
    */
  var value: String
}

object Cookie {
  @scala.inline
  def apply(
    name: String,
    value: String,
    domain: String = null,
    expirationDate: Int | Double = null,
    hostOnly: js.UndefOr[Boolean] = js.undefined,
    httpOnly: js.UndefOr[Boolean] = js.undefined,
    path: String = null,
    secure: js.UndefOr[Boolean] = js.undefined,
    session: js.UndefOr[Boolean] = js.undefined
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

