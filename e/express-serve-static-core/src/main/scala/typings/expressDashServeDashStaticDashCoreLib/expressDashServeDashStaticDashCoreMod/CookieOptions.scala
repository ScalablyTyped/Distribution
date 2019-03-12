package typings
package expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CookieOptions extends js.Object {
  var domain: js.UndefOr[java.lang.String] = js.undefined
  var encode: js.UndefOr[js.Function1[/* val */ java.lang.String, scala.Unit]] = js.undefined
  var expires: js.UndefOr[stdLib.Date | scala.Boolean] = js.undefined
  var httpOnly: js.UndefOr[scala.Boolean] = js.undefined
  var maxAge: js.UndefOr[scala.Double] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var sameSite: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var secure: js.UndefOr[
    scala.Boolean | expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreLibStrings.auto
  ] = js.undefined
  var signed: js.UndefOr[scala.Boolean] = js.undefined
}

object CookieOptions {
  @scala.inline
  def apply(
    domain: java.lang.String = null,
    encode: /* val */ java.lang.String => scala.Unit = null,
    expires: stdLib.Date | scala.Boolean = null,
    httpOnly: js.UndefOr[scala.Boolean] = js.undefined,
    maxAge: scala.Int | scala.Double = null,
    path: java.lang.String = null,
    sameSite: scala.Boolean | java.lang.String = null,
    secure: scala.Boolean | expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreLibStrings.auto = null,
    signed: js.UndefOr[scala.Boolean] = js.undefined
  ): CookieOptions = {
    val __obj = js.Dynamic.literal()
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (encode != null) __obj.updateDynamic("encode")(js.Any.fromFunction1(encode))
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (!js.isUndefined(httpOnly)) __obj.updateDynamic("httpOnly")(httpOnly)
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path)
    if (sameSite != null) __obj.updateDynamic("sameSite")(sameSite.asInstanceOf[js.Any])
    if (secure != null) __obj.updateDynamic("secure")(secure.asInstanceOf[js.Any])
    if (!js.isUndefined(signed)) __obj.updateDynamic("signed")(signed)
    __obj.asInstanceOf[CookieOptions]
  }
}

