package typings.easyDashXapiDashSupertest.streamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WritableOptions extends js.Object {
  var decodeStrings: js.UndefOr[Boolean] = js.undefined
  var highWaterMark: js.UndefOr[Double] = js.undefined
}

object WritableOptions {
  @scala.inline
  def apply(decodeStrings: js.UndefOr[Boolean] = js.undefined, highWaterMark: Int | Double = null): WritableOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(decodeStrings)) __obj.updateDynamic("decodeStrings")(decodeStrings)
    if (highWaterMark != null) __obj.updateDynamic("highWaterMark")(highWaterMark.asInstanceOf[js.Any])
    __obj.asInstanceOf[WritableOptions]
  }
}

