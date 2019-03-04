package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinearGradientProps extends js.Object {
  var colors: js.Array[java.lang.String]
  var end: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.undefined
  var locations: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var start: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.undefined
  var style: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
}

object LinearGradientProps {
  @scala.inline
  def apply(
    colors: js.Array[java.lang.String],
    end: js.Tuple2[scala.Double, scala.Double] = null,
    locations: js.Array[scala.Double] = null,
    start: js.Tuple2[scala.Double, scala.Double] = null,
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null
  ): LinearGradientProps = {
    val __obj = js.Dynamic.literal(colors = colors)
    if (end != null) __obj.updateDynamic("end")(end)
    if (locations != null) __obj.updateDynamic("locations")(locations)
    if (start != null) __obj.updateDynamic("start")(start)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinearGradientProps]
  }
}

