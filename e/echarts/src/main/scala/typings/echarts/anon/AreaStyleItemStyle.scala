package typings.echarts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AreaStyleItemStyle extends StObject {
  
  /**
    * @see https://echarts.apache.org/en/option.html#series-radar.data.emphasis.areaStyle
    */
  var areaStyle: js.UndefOr[Opacity] = js.undefined
  
  /**
    * @see https://echarts.apache.org/en/option.html#series-radar.data.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[BarBorderWidth] = js.undefined
  
  /**
    * @see https://echarts.apache.org/en/option.html#series-radar.data.emphasis.label
    */
  var label: js.UndefOr[Distance] = js.undefined
  
  /**
    * @see https://echarts.apache.org/en/option.html#series-radar.data.emphasis.lineStyle
    */
  var lineStyle: js.UndefOr[ShadowBlur] = js.undefined
}
object AreaStyleItemStyle {
  
  inline def apply(): AreaStyleItemStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AreaStyleItemStyle]
  }
  
  extension [Self <: AreaStyleItemStyle](x: Self) {
    
    inline def setAreaStyle(value: Opacity): Self = StObject.set(x, "areaStyle", value.asInstanceOf[js.Any])
    
    inline def setAreaStyleUndefined: Self = StObject.set(x, "areaStyle", js.undefined)
    
    inline def setItemStyle(value: BarBorderWidth): Self = StObject.set(x, "itemStyle", value.asInstanceOf[js.Any])
    
    inline def setItemStyleUndefined: Self = StObject.set(x, "itemStyle", js.undefined)
    
    inline def setLabel(value: Distance): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLineStyle(value: ShadowBlur): Self = StObject.set(x, "lineStyle", value.asInstanceOf[js.Any])
    
    inline def setLineStyleUndefined: Self = StObject.set(x, "lineStyle", js.undefined)
  }
}
