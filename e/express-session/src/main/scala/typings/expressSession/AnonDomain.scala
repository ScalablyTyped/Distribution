package typings.expressSession

import typings.expressSession.expressSessionStrings.auto
import typings.expressSession.expressSessionStrings.lax
import typings.expressSession.expressSessionStrings.none
import typings.expressSession.expressSessionStrings.strict
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDomain extends js.Object {
  var domain: js.UndefOr[String] = js.undefined
  var encode: js.UndefOr[js.Function1[/* val */ String, String]] = js.undefined
  var expires: js.UndefOr[Date] = js.undefined
  var httpOnly: js.UndefOr[Boolean] = js.undefined
  var maxAge: js.UndefOr[Double] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var sameSite: js.UndefOr[Boolean | lax | strict | none] = js.undefined
  var secure: js.UndefOr[Boolean | auto] = js.undefined
  var signed: js.UndefOr[Boolean] = js.undefined
}

object AnonDomain {
  @scala.inline
  def apply(
    domain: String = null,
    encode: /* val */ String => String = null,
    expires: Date = null,
    httpOnly: js.UndefOr[Boolean] = js.undefined,
    maxAge: Int | Double = null,
    path: String = null,
    sameSite: Boolean | lax | strict | none = null,
    secure: Boolean | auto = null,
    signed: js.UndefOr[Boolean] = js.undefined
  ): AnonDomain = {
    val __obj = js.Dynamic.literal()
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (encode != null) __obj.updateDynamic("encode")(js.Any.fromFunction1(encode))
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (!js.isUndefined(httpOnly)) __obj.updateDynamic("httpOnly")(httpOnly.asInstanceOf[js.Any])
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (sameSite != null) __obj.updateDynamic("sameSite")(sameSite.asInstanceOf[js.Any])
    if (secure != null) __obj.updateDynamic("secure")(secure.asInstanceOf[js.Any])
    if (!js.isUndefined(signed)) __obj.updateDynamic("signed")(signed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDomain]
  }
}

