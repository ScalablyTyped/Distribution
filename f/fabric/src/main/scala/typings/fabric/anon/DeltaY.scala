package typings.fabric.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeltaY extends js.Object {
  var deltaY: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var kernedWidth: js.UndefOr[Double] = js.undefined
  var left: Double
  var width: Double
}

object DeltaY {
  @scala.inline
  def apply(
    left: Double,
    width: Double,
    deltaY: js.UndefOr[Double] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    kernedWidth: js.UndefOr[Double] = js.undefined
  ): DeltaY = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (!js.isUndefined(deltaY)) __obj.updateDynamic("deltaY")(deltaY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(kernedWidth)) __obj.updateDynamic("kernedWidth")(kernedWidth.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeltaY]
  }
}

