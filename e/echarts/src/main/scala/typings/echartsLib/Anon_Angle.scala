package typings
package echartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Angle extends js.Object {
  /**
    * By default, each coordinate system will automatically
    * chose the axes whose will display its axisPointer
    * (category axis or time axis is used by default).
    */
  var axis: js.UndefOr[
    echartsLib.echartsLibStrings.x | echartsLib.echartsLibStrings.y | echartsLib.echartsLibStrings.radius | echartsLib.echartsLibStrings.angle
  ] = js.undefined
  /**
    * Whether snap to point automatically.
    * The default value is auto determined.
    * This feature usually makes sense in value axis
    * and time axis, where tiny points
    * can be seeked automatically.
    */
  var snap: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Indicator type.
    * Options:
    * + 'line' line indicator.
    * + 'shadow' shadow crosshair indicator.
    * + 'none' no indicator displayed.
    * + 'cross' crosshair indicator, which is actually
    *   the shortcut of enable two axisPointers
    *   of two orthometric axes.
    *
    * @default 'line'
    */
  var `type`: js.UndefOr[
    echartsLib.echartsLibStrings.line | echartsLib.echartsLibStrings.shadow | echartsLib.echartsLibStrings.none | echartsLib.echartsLibStrings.cross
  ] = js.undefined
  /**
    * `z` value, which controls order of drawing
    * graphical components.
    * Components with smaller `z` values may be overwritten
    * by those with larger `z` values.
    */
  var z: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Angle {
  @scala.inline
  def apply(
    axis: echartsLib.echartsLibStrings.x | echartsLib.echartsLibStrings.y | echartsLib.echartsLibStrings.radius | echartsLib.echartsLibStrings.angle = null,
    snap: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: echartsLib.echartsLibStrings.line | echartsLib.echartsLibStrings.shadow | echartsLib.echartsLibStrings.none | echartsLib.echartsLibStrings.cross = null,
    z: scala.Int | scala.Double = null
  ): Anon_Angle = {
    val __obj = js.Dynamic.literal()
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (!js.isUndefined(snap)) __obj.updateDynamic("snap")(snap)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (z != null) __obj.updateDynamic("z")(z.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Angle]
  }
}

