package typings.expoLinearGradient.nativeLinearGradientWebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  colors  :std.Array<number>,   locations ? :std.Array<number> | null,   startPoint ? :expo-linear-gradient.expo-linear-gradient/build/NativeLinearGradient.web.Point | null,   endPoint ? :expo-linear-gradient.expo-linear-gradient/build/NativeLinearGradient.web.Point | null,   onLayout ? :std.Function} & react.react.ComponentProps<{  forceTouchAvailable  :boolean, new (): react-native.react-native.View}> */
trait Props extends js.Object {
  var colors: js.Array[Double]
  var endPoint: js.UndefOr[Point | Null] = js.undefined
  var locations: js.UndefOr[js.Array[Double] | Null] = js.undefined
  var onLayout: js.UndefOr[js.Function] = js.undefined
  var startPoint: js.UndefOr[Point | Null] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    colors: js.Array[Double],
    endPoint: Point = null,
    locations: js.Array[Double] = null,
    onLayout: js.Function = null,
    startPoint: Point = null
  ): Props = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any])
    if (endPoint != null) __obj.updateDynamic("endPoint")(endPoint.asInstanceOf[js.Any])
    if (locations != null) __obj.updateDynamic("locations")(locations.asInstanceOf[js.Any])
    if (onLayout != null) __obj.updateDynamic("onLayout")(onLayout.asInstanceOf[js.Any])
    if (startPoint != null) __obj.updateDynamic("startPoint")(startPoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

