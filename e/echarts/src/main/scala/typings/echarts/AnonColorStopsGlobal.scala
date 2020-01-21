package typings.echarts

import typings.echarts.echartsStrings.radial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColorStopsGlobal extends js.Object {
  var colorStops: js.Array[AnonColorOffset]
  var global: Boolean
  var r: Double
  var `type`: radial
  var x: Double
  var y: Double
}

object AnonColorStopsGlobal {
  @scala.inline
  def apply(
    colorStops: js.Array[AnonColorOffset],
    global: Boolean,
    r: Double,
    `type`: radial,
    x: Double,
    y: Double
  ): AnonColorStopsGlobal = {
    val __obj = js.Dynamic.literal(colorStops = colorStops.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColorStopsGlobal]
  }
}

