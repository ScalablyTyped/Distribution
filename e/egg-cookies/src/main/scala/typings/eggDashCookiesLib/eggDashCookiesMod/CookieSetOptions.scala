package typings
package eggDashCookiesLib.eggDashCookiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CookieSetOptions extends js.Object {
  /**
    * The domain for the cookie
    */
  var domain: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Encrypt the cookie's value or not
    */
  var encrypt: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Expire time
    */
  var expires: js.UndefOr[stdLib.Date] = js.undefined
  /**
    * Is for http only
    */
  var httpOnly: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Max age for browsers
    */
  var maxAge: js.UndefOr[scala.Double] = js.undefined
  /**
    * Is overridable
    */
  var overwrite: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The path for the cookie to be set in
    */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Is the same site
    */
  var sameSite: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Encrypt the cookie's value or not
    */
  var secure: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Is it signed or not.
    */
  var signed: js.UndefOr[scala.Boolean] = js.undefined
}

object CookieSetOptions {
  @scala.inline
  def apply(
    domain: java.lang.String = null,
    encrypt: js.UndefOr[scala.Boolean] = js.undefined,
    expires: stdLib.Date = null,
    httpOnly: js.UndefOr[scala.Boolean] = js.undefined,
    maxAge: scala.Int | scala.Double = null,
    overwrite: js.UndefOr[scala.Boolean] = js.undefined,
    path: java.lang.String = null,
    sameSite: js.UndefOr[scala.Boolean] = js.undefined,
    secure: js.UndefOr[scala.Boolean] = js.undefined,
    signed: js.UndefOr[scala.Boolean] = js.undefined
  ): CookieSetOptions = {
    val __obj = js.Dynamic.literal()
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (!js.isUndefined(encrypt)) __obj.updateDynamic("encrypt")(encrypt)
    if (expires != null) __obj.updateDynamic("expires")(expires)
    if (!js.isUndefined(httpOnly)) __obj.updateDynamic("httpOnly")(httpOnly)
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (!js.isUndefined(overwrite)) __obj.updateDynamic("overwrite")(overwrite)
    if (path != null) __obj.updateDynamic("path")(path)
    if (!js.isUndefined(sameSite)) __obj.updateDynamic("sameSite")(sameSite)
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure)
    if (!js.isUndefined(signed)) __obj.updateDynamic("signed")(signed)
    __obj.asInstanceOf[CookieSetOptions]
  }
}

