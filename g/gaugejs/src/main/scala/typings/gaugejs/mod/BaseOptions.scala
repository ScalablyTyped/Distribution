package typings.gaugejs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseOptions extends js.Object {
  
  var angle: Double = js.native
  
  var colorStart: String = js.native
  
  var colorStop: String = js.native
  
  var generateGradient: Boolean = js.native
  
  var highDpiSupport: Boolean = js.native
  
  var limitMax: Boolean = js.native
  
  var limitMin: Boolean = js.native
  
  var lineWidth: Double = js.native
  
  var pointer: PointerOptions = js.native
  
  var radiusScale: Double = js.native
  
  var strokeColor: String = js.native
}
object BaseOptions {
  
  @scala.inline
  def apply(
    angle: Double,
    colorStart: String,
    colorStop: String,
    generateGradient: Boolean,
    highDpiSupport: Boolean,
    limitMax: Boolean,
    limitMin: Boolean,
    lineWidth: Double,
    pointer: PointerOptions,
    radiusScale: Double,
    strokeColor: String
  ): BaseOptions = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], colorStart = colorStart.asInstanceOf[js.Any], colorStop = colorStop.asInstanceOf[js.Any], generateGradient = generateGradient.asInstanceOf[js.Any], highDpiSupport = highDpiSupport.asInstanceOf[js.Any], limitMax = limitMax.asInstanceOf[js.Any], limitMin = limitMin.asInstanceOf[js.Any], lineWidth = lineWidth.asInstanceOf[js.Any], pointer = pointer.asInstanceOf[js.Any], radiusScale = radiusScale.asInstanceOf[js.Any], strokeColor = strokeColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseOptions]
  }
  
  @scala.inline
  implicit class BaseOptionsOps[Self <: BaseOptions] (val x: Self) extends AnyVal {
    
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
    def setAngle(value: Double): Self = this.set("angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorStart(value: String): Self = this.set("colorStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorStop(value: String): Self = this.set("colorStop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerateGradient(value: Boolean): Self = this.set("generateGradient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighDpiSupport(value: Boolean): Self = this.set("highDpiSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitMax(value: Boolean): Self = this.set("limitMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitMin(value: Boolean): Self = this.set("limitMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineWidth(value: Double): Self = this.set("lineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointer(value: PointerOptions): Self = this.set("pointer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusScale(value: Double): Self = this.set("radiusScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeColor(value: String): Self = this.set("strokeColor", value.asInstanceOf[js.Any])
  }
}
