package typings.easySession.mod

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
    freshTimeout: js.UndefOr[Double] = js.undefined,
    ipCheck: js.UndefOr[Boolean] = js.undefined,
    maxFreshTimeout: js.UndefOr[Double] = js.undefined,
    uaCheck: js.UndefOr[Boolean] = js.undefined
  ): SessionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(freshTimeout)) __obj.updateDynamic("freshTimeout")(freshTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ipCheck)) __obj.updateDynamic("ipCheck")(ipCheck.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxFreshTimeout)) __obj.updateDynamic("maxFreshTimeout")(maxFreshTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(uaCheck)) __obj.updateDynamic("uaCheck")(uaCheck.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionOptions]
  }
}

