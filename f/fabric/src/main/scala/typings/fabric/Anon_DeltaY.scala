package typings.fabric

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeltaY extends js.Object {
  var deltaY: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var kernedWidth: js.UndefOr[Double] = js.undefined
  var left: Double
  var width: Double
}

object Anon_DeltaY {
  @scala.inline
  def apply(
    left: Double,
    width: Double,
    deltaY: Int | Double = null,
    height: Int | Double = null,
    kernedWidth: Int | Double = null
  ): Anon_DeltaY = {
    val __obj = js.Dynamic.literal(left = left, width = width)
    if (deltaY != null) __obj.updateDynamic("deltaY")(deltaY.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (kernedWidth != null) __obj.updateDynamic("kernedWidth")(kernedWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DeltaY]
  }
}

