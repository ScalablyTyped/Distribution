package typings.easyDashSession.easyDashSessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionOptions extends js.Object {
  var freshTimeout: js.UndefOr[Double] = js.undefined
  var ipCheck: js.UndefOr[Boolean] = js.undefined
  var maxFreshTimeout: js.UndefOr[Double] = js.undefined
  var uaCheck: js.UndefOr[Boolean] = js.undefined
}

object SessionOptions {
  @scala.inline
  def apply(
    freshTimeout: Int | Double = null,
    ipCheck: js.UndefOr[Boolean] = js.undefined,
    maxFreshTimeout: Int | Double = null,
    uaCheck: js.UndefOr[Boolean] = js.undefined
  ): SessionOptions = {
    val __obj = js.Dynamic.literal()
    if (freshTimeout != null) __obj.updateDynamic("freshTimeout")(freshTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(ipCheck)) __obj.updateDynamic("ipCheck")(ipCheck.asInstanceOf[js.Any])
    if (maxFreshTimeout != null) __obj.updateDynamic("maxFreshTimeout")(maxFreshTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(uaCheck)) __obj.updateDynamic("uaCheck")(uaCheck.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionOptions]
  }
}

