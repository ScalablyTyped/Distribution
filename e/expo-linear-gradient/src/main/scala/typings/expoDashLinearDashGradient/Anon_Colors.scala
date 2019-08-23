package typings.expoDashLinearDashGradient

import typings.expoDashLinearDashGradient.buildLinearGradientMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Colors extends js.Object {
  var colors: js.Array[String]
  var end: js.UndefOr[Point | Null] = js.undefined
  var locations: js.UndefOr[js.Array[Double] | Null] = js.undefined
  var start: js.UndefOr[Point | Null] = js.undefined
}

object Anon_Colors {
  @scala.inline
  def apply(
    colors: js.Array[String],
    end: Point = null,
    locations: js.Array[Double] = null,
    start: Point = null
  ): Anon_Colors = {
    val __obj = js.Dynamic.literal(colors = colors)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (locations != null) __obj.updateDynamic("locations")(locations)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Colors]
  }
}

