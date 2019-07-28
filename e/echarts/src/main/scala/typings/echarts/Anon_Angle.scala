package typings.echarts

import typings.echarts.echartsStrings.angle
import typings.echarts.echartsStrings.cross
import typings.echarts.echartsStrings.line
import typings.echarts.echartsStrings.none
import typings.echarts.echartsStrings.radius
import typings.echarts.echartsStrings.shadow
import typings.echarts.echartsStrings.x
import typings.echarts.echartsStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Angle extends js.Object {
  /**
    * By default, each coordinate system will automatically
    * chose the axes whose will display its axisPointer
    * (category axis or time axis is used by default).
    */
  var axis: js.UndefOr[x | y | radius | angle] = js.undefined
  /**
    * Whether snap to point automatically.
    * The default value is auto determined.
    * This feature usually makes sense in value axis
    * and time axis, where tiny points
    * can be seeked automatically.
    */
  var snap: js.UndefOr[Boolean] = js.undefined
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
  var `type`: js.UndefOr[line | shadow | none | cross] = js.undefined
  /**
    * `z` value, which controls order of drawing
    * graphical components.
    * Components with smaller `z` values may be overwritten
    * by those with larger `z` values.
    */
  var z: js.UndefOr[Double] = js.undefined
}

object Anon_Angle {
  @scala.inline
  def apply(
    axis: x | y | radius | angle = null,
    snap: js.UndefOr[Boolean] = js.undefined,
    `type`: line | shadow | none | cross = null,
    z: Int | Double = null
  ): Anon_Angle = {
    val __obj = js.Dynamic.literal()
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (!js.isUndefined(snap)) __obj.updateDynamic("snap")(snap)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (z != null) __obj.updateDynamic("z")(z.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Angle]
  }
}

