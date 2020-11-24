package typings.echarts.echarts.VisualMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RangeObject extends js.Object {
  
  var color: js.UndefOr[String | js.Array[String]] = js.native
  
  var colorAlpha: js.UndefOr[Double | js.Array[Double]] = js.native
  
  var colorHue: js.UndefOr[Double | js.Array[Double]] = js.native
  
  var colorLightness: js.UndefOr[Double | js.Array[Double]] = js.native
  
  var colorSaturation: js.UndefOr[Double | js.Array[Double]] = js.native
  
  var opacity: js.UndefOr[Double | js.Array[Double]] = js.native
  
  var symbol: js.UndefOr[String | js.Array[String]] = js.native
  
  var symbolSize: js.UndefOr[Double | js.Array[Double]] = js.native
}
object RangeObject {
  
  @scala.inline
  def apply(): RangeObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeObject]
  }
  
  @scala.inline
  implicit class RangeObjectOps[Self <: RangeObject] (val x: Self) extends AnyVal {
    
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
    def setColorVarargs(value: String*): Self = this.set("color", js.Array(value :_*))
    
    @scala.inline
    def setColor(value: String | js.Array[String]): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setColorAlphaVarargs(value: Double*): Self = this.set("colorAlpha", js.Array(value :_*))
    
    @scala.inline
    def setColorAlpha(value: Double | js.Array[Double]): Self = this.set("colorAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorAlpha: Self = this.set("colorAlpha", js.undefined)
    
    @scala.inline
    def setColorHueVarargs(value: Double*): Self = this.set("colorHue", js.Array(value :_*))
    
    @scala.inline
    def setColorHue(value: Double | js.Array[Double]): Self = this.set("colorHue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorHue: Self = this.set("colorHue", js.undefined)
    
    @scala.inline
    def setColorLightnessVarargs(value: Double*): Self = this.set("colorLightness", js.Array(value :_*))
    
    @scala.inline
    def setColorLightness(value: Double | js.Array[Double]): Self = this.set("colorLightness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorLightness: Self = this.set("colorLightness", js.undefined)
    
    @scala.inline
    def setColorSaturationVarargs(value: Double*): Self = this.set("colorSaturation", js.Array(value :_*))
    
    @scala.inline
    def setColorSaturation(value: Double | js.Array[Double]): Self = this.set("colorSaturation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorSaturation: Self = this.set("colorSaturation", js.undefined)
    
    @scala.inline
    def setOpacityVarargs(value: Double*): Self = this.set("opacity", js.Array(value :_*))
    
    @scala.inline
    def setOpacity(value: Double | js.Array[Double]): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setSymbolVarargs(value: String*): Self = this.set("symbol", js.Array(value :_*))
    
    @scala.inline
    def setSymbol(value: String | js.Array[String]): Self = this.set("symbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbol: Self = this.set("symbol", js.undefined)
    
    @scala.inline
    def setSymbolSizeVarargs(value: Double*): Self = this.set("symbolSize", js.Array(value :_*))
    
    @scala.inline
    def setSymbolSize(value: Double | js.Array[Double]): Self = this.set("symbolSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbolSize: Self = this.set("symbolSize", js.undefined)
  }
}
