package typings.echarts.anon

import typings.echarts.echartsStrings.dashed
import typings.echarts.echartsStrings.dotted
import typings.echarts.echartsStrings.solid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderColor extends StObject {
  
  var borderColor: js.UndefOr[typings.echarts.echarts.EChartOption.Color] = js.undefined
  
  var borderType: js.UndefOr[solid | dashed | dotted] = js.undefined
  
  var borderWidth: js.UndefOr[Double] = js.undefined
  
  var color: js.UndefOr[typings.echarts.echarts.EChartOption.Color] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var shadowBlur: js.UndefOr[Double] = js.undefined
  
  var shadowColor: js.UndefOr[typings.echarts.echarts.EChartOption.Color] = js.undefined
  
  var shadowOffsetX: js.UndefOr[Double] = js.undefined
  
  var shadowOffsetY: js.UndefOr[Double] = js.undefined
}
object BorderColor {
  
  @scala.inline
  def apply(): BorderColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderColor]
  }
  
  @scala.inline
  implicit class BorderColorMutableBuilder[Self <: BorderColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorderColor(value: typings.echarts.echarts.EChartOption.Color): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    @scala.inline
    def setBorderType(value: solid | dashed | dotted): Self = StObject.set(x, "borderType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderTypeUndefined: Self = StObject.set(x, "borderType", js.undefined)
    
    @scala.inline
    def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    @scala.inline
    def setColor(value: typings.echarts.echarts.EChartOption.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setShadowBlur(value: Double): Self = StObject.set(x, "shadowBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowBlurUndefined: Self = StObject.set(x, "shadowBlur", js.undefined)
    
    @scala.inline
    def setShadowColor(value: typings.echarts.echarts.EChartOption.Color): Self = StObject.set(x, "shadowColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowColorUndefined: Self = StObject.set(x, "shadowColor", js.undefined)
    
    @scala.inline
    def setShadowOffsetX(value: Double): Self = StObject.set(x, "shadowOffsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowOffsetXUndefined: Self = StObject.set(x, "shadowOffsetX", js.undefined)
    
    @scala.inline
    def setShadowOffsetY(value: Double): Self = StObject.set(x, "shadowOffsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowOffsetYUndefined: Self = StObject.set(x, "shadowOffsetY", js.undefined)
  }
}
