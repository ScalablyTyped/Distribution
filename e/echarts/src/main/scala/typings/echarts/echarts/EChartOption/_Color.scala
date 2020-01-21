package typings.echarts.echarts.EChartOption

import typings.echarts.AnonColorOffset
import typings.echarts.echartsStrings.`no-repeat`
import typings.echarts.echartsStrings.`repeat-x`
import typings.echarts.echartsStrings.`repeat-y`
import typings.echarts.echartsStrings.linear
import typings.echarts.echartsStrings.radial
import typings.echarts.echartsStrings.repeat
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Color extends js.Object

object _Color {
  @scala.inline
  def AnonColorStopsGlobalLinear(
    colorStops: js.Array[AnonColorOffset],
    `type`: linear,
    x: Double,
    x2: Double,
    y: Double,
    y2: Double,
    global: js.UndefOr[Boolean] = js.undefined
  ): _Color = {
    val __obj = js.Dynamic.literal(colorStops = colorStops.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(global)) __obj.updateDynamic("global")(global.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Color]
  }
  @scala.inline
  def AnonColorStopsGlobalR(
    colorStops: js.Array[AnonColorOffset],
    r: Double,
    `type`: radial,
    x: Double,
    y: Double,
    global: js.UndefOr[Boolean] = js.undefined
  ): _Color = {
    val __obj = js.Dynamic.literal(colorStops = colorStops.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(global)) __obj.updateDynamic("global")(global.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Color]
  }
  @scala.inline
  def AnonImage(
    image: HTMLImageElement | HTMLCanvasElement,
    repeat: repeat | `repeat-x` | `repeat-y` | `no-repeat` = null
  ): _Color = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    if (repeat != null) __obj.updateDynamic("repeat")(repeat.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Color]
  }
}

