package typings.echarts

import typings.echarts.echarts.EChartOption._Color
import typings.echarts.echartsStrings.radial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorStopsGlobalR extends _Color {
  var colorStops: js.Array[Anon_ColorOffset]
  var global: js.UndefOr[Boolean] = js.undefined
  var r: Double
  var `type`: radial
  var x: Double
  var y: Double
}

object Anon_ColorStopsGlobalR {
  @scala.inline
  def apply(
    colorStops: js.Array[Anon_ColorOffset],
    r: Double,
    `type`: radial,
    x: Double,
    y: Double,
    global: js.UndefOr[Boolean] = js.undefined
  ): Anon_ColorStopsGlobalR = {
    val __obj = js.Dynamic.literal(colorStops = colorStops, r = r, x = x, y = y)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(global)) __obj.updateDynamic("global")(global)
    __obj.asInstanceOf[Anon_ColorStopsGlobalR]
  }
}

