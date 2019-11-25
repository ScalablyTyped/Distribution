package typings.echarts

import typings.echarts.echartsStrings.linear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorStops extends js.Object {
  var colorStops: js.Array[Anon_ColorOffset]
  var global: Boolean
  var `type`: linear
  var x: Double
  var x2: Double
  var y: Double
  var y2: Double
}

object Anon_ColorStops {
  @scala.inline
  def apply(
    colorStops: js.Array[Anon_ColorOffset],
    global: Boolean,
    `type`: linear,
    x: Double,
    x2: Double,
    y: Double,
    y2: Double
  ): Anon_ColorStops = {
    val __obj = js.Dynamic.literal(colorStops = colorStops.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ColorStops]
  }
}

