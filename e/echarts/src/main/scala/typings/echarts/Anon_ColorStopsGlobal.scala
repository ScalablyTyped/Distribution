package typings.echarts

import typings.echarts.echartsStrings.radial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorStopsGlobal extends js.Object {
  var colorStops: js.Array[Anon_ColorOffset]
  var global: Boolean
  var r: Double
  var `type`: radial
  var x: Double
  var y: Double
}

object Anon_ColorStopsGlobal {
  @scala.inline
  def apply(
    colorStops: js.Array[Anon_ColorOffset],
    global: Boolean,
    r: Double,
    `type`: radial,
    x: Double,
    y: Double
  ): Anon_ColorStopsGlobal = {
    val __obj = js.Dynamic.literal(colorStops = colorStops.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ColorStopsGlobal]
  }
}

