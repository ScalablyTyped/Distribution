package typings
package easyDashSessionLib.easyDashSessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionOptions extends js.Object {
  var freshTimeout: js.UndefOr[scala.Double] = js.undefined
  var ipCheck: js.UndefOr[scala.Boolean] = js.undefined
  var maxFreshTimeout: js.UndefOr[scala.Double] = js.undefined
  var uaCheck: js.UndefOr[scala.Boolean] = js.undefined
}

object SessionOptions {
  @scala.inline
  def apply(
    freshTimeout: scala.Int | scala.Double = null,
    ipCheck: js.UndefOr[scala.Boolean] = js.undefined,
    maxFreshTimeout: scala.Int | scala.Double = null,
    uaCheck: js.UndefOr[scala.Boolean] = js.undefined
  ): SessionOptions = {
    val __obj = js.Dynamic.literal()
    if (freshTimeout != null) __obj.updateDynamic("freshTimeout")(freshTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(ipCheck)) __obj.updateDynamic("ipCheck")(ipCheck)
    if (maxFreshTimeout != null) __obj.updateDynamic("maxFreshTimeout")(maxFreshTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(uaCheck)) __obj.updateDynamic("uaCheck")(uaCheck)
    __obj.asInstanceOf[SessionOptions]
  }
}

