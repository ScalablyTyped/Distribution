package typings.expoLinearGradient.anon

import typings.expoLinearGradient.nativeLinearGradientWebMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnLayout extends js.Object {
  var colors: js.Array[Double]
  var endPoint: js.UndefOr[Point | Null] = js.undefined
  var locations: js.UndefOr[js.Array[Double] | Null] = js.undefined
  var onLayout: js.UndefOr[js.Function] = js.undefined
  var startPoint: js.UndefOr[Point | Null] = js.undefined
}

object OnLayout {
  @scala.inline
  def apply(
    colors: js.Array[Double],
    endPoint: js.UndefOr[Null | Point] = js.undefined,
    locations: js.UndefOr[Null | js.Array[Double]] = js.undefined,
    onLayout: js.Function = null,
    startPoint: js.UndefOr[Null | Point] = js.undefined
  ): OnLayout = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any])
    if (!js.isUndefined(endPoint)) __obj.updateDynamic("endPoint")(endPoint.asInstanceOf[js.Any])
    if (!js.isUndefined(locations)) __obj.updateDynamic("locations")(locations.asInstanceOf[js.Any])
    if (onLayout != null) __obj.updateDynamic("onLayout")(onLayout.asInstanceOf[js.Any])
    if (!js.isUndefined(startPoint)) __obj.updateDynamic("startPoint")(startPoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnLayout]
  }
}

