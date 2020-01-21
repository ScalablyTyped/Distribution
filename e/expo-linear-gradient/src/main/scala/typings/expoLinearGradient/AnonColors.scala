package typings.expoLinearGradient

import typings.expoLinearGradient.linearGradientMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColors extends js.Object {
  var colors: js.Array[String]
  var end: js.UndefOr[Point | Null] = js.undefined
  var locations: js.UndefOr[js.Array[Double] | Null] = js.undefined
  var start: js.UndefOr[Point | Null] = js.undefined
}

object AnonColors {
  @scala.inline
  def apply(
    colors: js.Array[String],
    end: Point = null,
    locations: js.Array[Double] = null,
    start: Point = null
  ): AnonColors = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (locations != null) __obj.updateDynamic("locations")(locations.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColors]
  }
}

