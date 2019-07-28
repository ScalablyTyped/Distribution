package typings.expo.expoMod

import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinearGradientProps extends js.Object {
  var colors: js.Array[String]
  var end: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  var locations: js.UndefOr[js.Array[Double]] = js.undefined
  var start: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object LinearGradientProps {
  @scala.inline
  def apply(
    colors: js.Array[String],
    end: js.Tuple2[Double, Double] = null,
    locations: js.Array[Double] = null,
    start: js.Tuple2[Double, Double] = null,
    style: StyleProp[ViewStyle] = null
  ): LinearGradientProps = {
    val __obj = js.Dynamic.literal(colors = colors)
    if (end != null) __obj.updateDynamic("end")(end)
    if (locations != null) __obj.updateDynamic("locations")(locations)
    if (start != null) __obj.updateDynamic("start")(start)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinearGradientProps]
  }
}

