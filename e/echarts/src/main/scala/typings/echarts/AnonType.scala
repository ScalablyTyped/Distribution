package typings.echarts

import typings.echarts.echarts.EChartOption._Color
import typings.echarts.echartsStrings.linear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType extends _Color {
  var colorStops: js.Array[AnonOffset]
  var global: js.UndefOr[Boolean] = js.undefined
  var `type`: linear
  var x: Double
  var x2: Double
  var y: Double
  var y2: Double
}

object AnonType {
  @scala.inline
  def apply(
    colorStops: js.Array[AnonOffset],
    `type`: linear,
    x: Double,
    x2: Double,
    y: Double,
    y2: Double,
    global: js.UndefOr[Boolean] = js.undefined
  ): AnonType = {
    val __obj = js.Dynamic.literal(colorStops = colorStops.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(global)) __obj.updateDynamic("global")(global.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType]
  }
}

