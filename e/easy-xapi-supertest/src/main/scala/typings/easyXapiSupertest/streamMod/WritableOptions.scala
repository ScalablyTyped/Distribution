package typings.easyXapiSupertest.streamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WritableOptions extends js.Object {
  var decodeStrings: js.UndefOr[Boolean] = js.undefined
  var highWaterMark: js.UndefOr[Double] = js.undefined
}

object WritableOptions {
  @scala.inline
  def apply(
    decodeStrings: js.UndefOr[Boolean] = js.undefined,
    highWaterMark: js.UndefOr[Double] = js.undefined
  ): WritableOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(decodeStrings)) __obj.updateDynamic("decodeStrings")(decodeStrings.get.asInstanceOf[js.Any])
    if (!js.isUndefined(highWaterMark)) __obj.updateDynamic("highWaterMark")(highWaterMark.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WritableOptions]
  }
}

