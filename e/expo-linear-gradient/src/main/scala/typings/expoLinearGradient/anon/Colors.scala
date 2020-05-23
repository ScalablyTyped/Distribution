package typings.expoLinearGradient.anon

import typings.expoLinearGradient.linearGradientMod.LinearGradienPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Colors extends js.Object {
  var colors: js.Array[String]
  var end: js.UndefOr[LinearGradienPoint | Null] = js.undefined
  var locations: js.UndefOr[js.Array[Double] | Null] = js.undefined
  var start: js.UndefOr[LinearGradienPoint | Null] = js.undefined
}

object Colors {
  @scala.inline
  def apply(
    colors: js.Array[String],
    end: js.UndefOr[Null | LinearGradienPoint] = js.undefined,
    locations: js.UndefOr[Null | js.Array[Double]] = js.undefined,
    start: js.UndefOr[Null | LinearGradienPoint] = js.undefined
  ): Colors = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any])
    if (!js.isUndefined(end)) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (!js.isUndefined(locations)) __obj.updateDynamic("locations")(locations.asInstanceOf[js.Any])
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Colors]
  }
}

