package typings.expoLinearGradient

import typings.expoLinearGradient.nativeLinearGradientWebMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColorsEndPointLocationsOnLayout extends js.Object {
  var colors: js.Array[Double]
  var endPoint: js.UndefOr[Point | Null] = js.undefined
  var locations: js.UndefOr[js.Array[Double] | Null] = js.undefined
  var onLayout: js.UndefOr[js.Function] = js.undefined
  var startPoint: js.UndefOr[Point | Null] = js.undefined
}

object AnonColorsEndPointLocationsOnLayout {
  @scala.inline
  def apply(
    colors: js.Array[Double],
    endPoint: Point = null,
    locations: js.Array[Double] = null,
    onLayout: js.Function = null,
    startPoint: Point = null
  ): AnonColorsEndPointLocationsOnLayout = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any])
    if (endPoint != null) __obj.updateDynamic("endPoint")(endPoint.asInstanceOf[js.Any])
    if (locations != null) __obj.updateDynamic("locations")(locations.asInstanceOf[js.Any])
    if (onLayout != null) __obj.updateDynamic("onLayout")(onLayout.asInstanceOf[js.Any])
    if (startPoint != null) __obj.updateDynamic("startPoint")(startPoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColorsEndPointLocationsOnLayout]
  }
}

