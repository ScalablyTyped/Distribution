package typings.firebaseDashTokenDashGenerator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenOptions extends js.Object {
  var admin: js.UndefOr[Boolean] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var expires: js.UndefOr[Double] = js.undefined
  var iat: js.UndefOr[Double] = js.undefined
  var notBefore: js.UndefOr[Double] = js.undefined
  var simulate: js.UndefOr[Boolean] = js.undefined
}

object TokenOptions {
  @scala.inline
  def apply(
    admin: js.UndefOr[Boolean] = js.undefined,
    debug: js.UndefOr[Boolean] = js.undefined,
    expires: Int | Double = null,
    iat: Int | Double = null,
    notBefore: Int | Double = null,
    simulate: js.UndefOr[Boolean] = js.undefined
  ): TokenOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(admin)) __obj.updateDynamic("admin")(admin)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (iat != null) __obj.updateDynamic("iat")(iat.asInstanceOf[js.Any])
    if (notBefore != null) __obj.updateDynamic("notBefore")(notBefore.asInstanceOf[js.Any])
    if (!js.isUndefined(simulate)) __obj.updateDynamic("simulate")(simulate)
    __obj.asInstanceOf[TokenOptions]
  }
}

