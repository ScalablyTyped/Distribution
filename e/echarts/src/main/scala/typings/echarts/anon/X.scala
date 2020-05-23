package typings.echarts.anon

import typings.echarts.echarts.EChartOption._Color
import typings.echarts.echartsStrings.radial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait X extends _Color {
  var colorStops: js.Array[Offset]
  var global: js.UndefOr[Boolean] = js.undefined
  var r: Double
  var `type`: radial
  var x: Double
  var y: Double
}

object X {
  @scala.inline
  def apply(
    colorStops: js.Array[Offset],
    r: Double,
    `type`: radial,
    x: Double,
    y: Double,
    global: js.UndefOr[Boolean] = js.undefined
  ): X = {
    val __obj = js.Dynamic.literal(colorStops = colorStops.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(global)) __obj.updateDynamic("global")(global.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[X]
  }
}

