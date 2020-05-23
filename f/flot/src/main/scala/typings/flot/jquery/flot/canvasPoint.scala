package typings.flot.jquery.flot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait canvasPoint extends js.Object {
  var bottom: js.UndefOr[Double] = js.undefined
  var left: Double
  var right: js.UndefOr[Double] = js.undefined
  var top: Double
}

object canvasPoint {
  @scala.inline
  def apply(
    left: Double,
    top: Double,
    bottom: js.UndefOr[Double] = js.undefined,
    right: js.UndefOr[Double] = js.undefined
  ): canvasPoint = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    if (!js.isUndefined(bottom)) __obj.updateDynamic("bottom")(bottom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(right)) __obj.updateDynamic("right")(right.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[canvasPoint]
  }
}

