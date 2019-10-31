package typings.echarts

import typings.echarts.echarts.EChartOption._Color
import typings.echarts.echartsStrings.linear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorStopsGlobalLinear extends _Color {
  var colorStops: js.Array[Anon_ColorOffset]
  var global: js.UndefOr[Boolean] = js.undefined
  var `type`: linear
  var x: Double
  var x2: Double
  var y: Double
  var y2: Double
}

object Anon_ColorStopsGlobalLinear {
  @scala.inline
  def apply(
    colorStops: js.Array[Anon_ColorOffset],
    `type`: linear,
    x: Double,
    x2: Double,
    y: Double,
    y2: Double,
    global: js.UndefOr[Boolean] = js.undefined
  ): Anon_ColorStopsGlobalLinear = {
    val __obj = js.Dynamic.literal(colorStops = colorStops, x = x, x2 = x2, y = y, y2 = y2)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(global)) __obj.updateDynamic("global")(global)
    __obj.asInstanceOf[Anon_ColorStopsGlobalLinear]
  }
}

