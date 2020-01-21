package typings.echarts

import typings.echarts.echartsStrings.linear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColorStops extends js.Object {
  var colorStops: js.Array[AnonColorOffset]
  var global: Boolean
  var `type`: linear
  var x: Double
  var x2: Double
  var y: Double
  var y2: Double
}

object AnonColorStops {
  @scala.inline
  def apply(
    colorStops: js.Array[AnonColorOffset],
    global: Boolean,
    `type`: linear,
    x: Double,
    x2: Double,
    y: Double,
    y2: Double
  ): AnonColorStops = {
    val __obj = js.Dynamic.literal(colorStops = colorStops.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColorStops]
  }
}

