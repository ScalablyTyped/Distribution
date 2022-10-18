package typings.echarts.anon

import typings.echarts.echartsStrings.dashed
import typings.echarts.echartsStrings.dotted
import typings.echarts.echartsStrings.solid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderTypeBorderWidth extends StObject {
  
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
object BorderTypeBorderWidth {
  
  inline def apply(): BorderTypeBorderWidth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderTypeBorderWidth]
  }
  
  extension [Self <: BorderTypeBorderWidth](x: Self) {
    
    inline def setBorderColor(value: typings.echarts.echarts.EChartOption.Color): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setBorderType(value: solid | dashed | dotted): Self = StObject.set(x, "borderType", value.asInstanceOf[js.Any])
    
    inline def setBorderTypeUndefined: Self = StObject.set(x, "borderType", js.undefined)
    
    inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    inline def setColor(value: typings.echarts.echarts.EChartOption.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setShadowBlur(value: Double): Self = StObject.set(x, "shadowBlur", value.asInstanceOf[js.Any])
    
    inline def setShadowBlurUndefined: Self = StObject.set(x, "shadowBlur", js.undefined)
    
    inline def setShadowColor(value: typings.echarts.echarts.EChartOption.Color): Self = StObject.set(x, "shadowColor", value.asInstanceOf[js.Any])
    
    inline def setShadowColorUndefined: Self = StObject.set(x, "shadowColor", js.undefined)
    
    inline def setShadowOffsetX(value: Double): Self = StObject.set(x, "shadowOffsetX", value.asInstanceOf[js.Any])
    
    inline def setShadowOffsetXUndefined: Self = StObject.set(x, "shadowOffsetX", js.undefined)
    
    inline def setShadowOffsetY(value: Double): Self = StObject.set(x, "shadowOffsetY", value.asInstanceOf[js.Any])
    
    inline def setShadowOffsetYUndefined: Self = StObject.set(x, "shadowOffsetY", js.undefined)
  }
}
