package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SvgPathProps extends SvgCommonProps {
  var d: java.lang.String
}

object SvgPathProps {
  @scala.inline
  def apply(
    d: java.lang.String,
    delayLongPress: scala.Int | scala.Double = null,
    delayPressIn: scala.Int | scala.Double = null,
    delayPressOut: scala.Int | scala.Double = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    fill: java.lang.String = null,
    fillOpacity: scala.Double | java.lang.String = null,
    fillRule: expoLib.expoLibStrings.nonzero | expoLib.expoLibStrings.evenodd = null,
    id: java.lang.String = null,
    onLongPress: () => _ = null,
    onPress: () => _ = null,
    onPressIn: () => _ = null,
    onPressOut: () => _ = null,
    opacity: scala.Double | java.lang.String = null,
    origin: scala.Double | java.lang.String = null,
    originX: scala.Double | java.lang.String = null,
    originY: scala.Double | java.lang.String = null,
    rotate: scala.Double | java.lang.String = null,
    rotation: scala.Double | java.lang.String = null,
    scale: scala.Double | java.lang.String = null,
    stroke: java.lang.String = null,
    strokeDasharray: js.Array[_] = null,
    strokeDashoffset: js.Any = null,
    strokeLineJoin: java.lang.String = null,
    strokeLinecap: java.lang.String = null,
    strokeOpacity: scala.Double | java.lang.String = null,
    strokeWidth: scala.Double | java.lang.String = null,
    transform: java.lang.String | js.Object = null,
    x: scala.Double | java.lang.String = null,
    y: scala.Double | java.lang.String = null
  ): SvgPathProps = {
    val __obj = js.Dynamic.literal(d = d)
    if (delayLongPress != null) __obj.updateDynamic("delayLongPress")(delayLongPress.asInstanceOf[js.Any])
    if (delayPressIn != null) __obj.updateDynamic("delayPressIn")(delayPressIn.asInstanceOf[js.Any])
    if (delayPressOut != null) __obj.updateDynamic("delayPressOut")(delayPressOut.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (fillRule != null) __obj.updateDynamic("fillRule")(fillRule.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (onLongPress != null) __obj.updateDynamic("onLongPress")(js.Any.fromFunction0(onLongPress))
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (onPressIn != null) __obj.updateDynamic("onPressIn")(js.Any.fromFunction0(onPressIn))
    if (onPressOut != null) __obj.updateDynamic("onPressOut")(js.Any.fromFunction0(onPressOut))
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (originX != null) __obj.updateDynamic("originX")(originX.asInstanceOf[js.Any])
    if (originY != null) __obj.updateDynamic("originY")(originY.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    if (strokeDasharray != null) __obj.updateDynamic("strokeDasharray")(strokeDasharray)
    if (strokeDashoffset != null) __obj.updateDynamic("strokeDashoffset")(strokeDashoffset)
    if (strokeLineJoin != null) __obj.updateDynamic("strokeLineJoin")(strokeLineJoin)
    if (strokeLinecap != null) __obj.updateDynamic("strokeLinecap")(strokeLinecap)
    if (strokeOpacity != null) __obj.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SvgPathProps]
  }
}

