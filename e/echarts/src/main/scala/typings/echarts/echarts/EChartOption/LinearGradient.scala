package typings.echarts.echarts.EChartOption

import typings.echarts.anon.Offset
import typings.echarts.echartsStrings.linear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Linear gradient.
  *
  * First four parameters are x0, y0, x2, and y2, each ranged from 0 to 1, standing for percentage in the bounding box.
  *
  * If global is `true`, then the first four parameters are in absolute pixel positions.
  */
@js.native
trait LinearGradient extends _Color {
  
  var colorStops: ColorStops = js.native
  
  var global: Boolean = js.native
  
  var `type`: linear = js.native
  
  var x: Double = js.native
  
  var x2: Double = js.native
  
  var y: Double = js.native
  
  var y2: Double = js.native
}
object LinearGradient {
  
  @scala.inline
  def apply(
    colorStops: ColorStops,
    global: Boolean,
    `type`: linear,
    x: Double,
    x2: Double,
    y: Double,
    y2: Double
  ): LinearGradient = {
    val __obj = js.Dynamic.literal(colorStops = colorStops.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinearGradient]
  }
  
  @scala.inline
  implicit class LinearGradientOps[Self <: LinearGradient] (val x: Self) extends AnyVal {
    
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
    def setColorStops(value: ColorStops): Self = this.set("colorStops", value.asInstanceOf[js.Any])
    
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
