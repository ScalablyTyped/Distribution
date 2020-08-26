package typings.echarts.anon

import typings.echarts.echartsStrings.linear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorStops extends js.Object {
  var colorStops: js.Array[Offset] = js.native
  var global: Boolean = js.native
  var `type`: linear = js.native
  var x: Double = js.native
  var x2: Double = js.native
  var y: Double = js.native
  var y2: Double = js.native
}

object ColorStops {
  @scala.inline
  def apply(
    colorStops: js.Array[Offset],
    global: Boolean,
    `type`: linear,
    x: Double,
    x2: Double,
    y: Double,
    y2: Double
  ): ColorStops = {
    val __obj = js.Dynamic.literal(colorStops = colorStops.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorStops]
  }
  @scala.inline
  implicit class ColorStopsOps[Self <: ColorStops] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setColorStopsVarargs(value: Offset*): Self = this.set("colorStops", js.Array(value :_*))
    @scala.inline
    def setColorStops(value: js.Array[Offset]): Self = this.set("colorStops", value.asInstanceOf[js.Any])
    @scala.inline
    def setGlobal(value: Boolean): Self = this.set("global", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: linear): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setX2(value: Double): Self = this.set("x2", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def setY2(value: Double): Self = this.set("y2", value.asInstanceOf[js.Any])
  }
  
}

