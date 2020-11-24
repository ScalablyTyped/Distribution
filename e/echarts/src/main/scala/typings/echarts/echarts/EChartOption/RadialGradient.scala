package typings.echarts.echarts.EChartOption

import typings.echarts.anon.Offset
import typings.echarts.echartsStrings.radial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Radial gradient.
  *
  * First three parameters are x and y positions of center, and radius, similar to linear gradient.
  */
@js.native
trait RadialGradient extends _Color {
  
  var colorStops: ColorStops = js.native
  
  var global: Boolean = js.native
  
  var r: Double = js.native
  
  var `type`: radial = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object RadialGradient {
  
  @scala.inline
  def apply(colorStops: ColorStops, global: Boolean, r: Double, `type`: radial, x: Double, y: Double): RadialGradient = {
    val __obj = js.Dynamic.literal(colorStops = colorStops.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadialGradient]
  }
  
  @scala.inline
  implicit class RadialGradientOps[Self <: RadialGradient] (val x: Self) extends AnyVal {
    
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
    def setR(value: Double): Self = this.set("r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: radial): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
}
