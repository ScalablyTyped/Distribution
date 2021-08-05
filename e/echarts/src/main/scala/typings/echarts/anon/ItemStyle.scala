package typings.echarts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemStyle extends StObject {
  
  /**
    * @see https://echarts.apache.org/en/option.html#series-bar.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[BarBorderWidth] = js.undefined
  
  /**
    * @see https://echarts.apache.org/en/option.html#series-bar.emphasis.label
    */
  var label: js.UndefOr[BorderRadius] = js.undefined
}
object ItemStyle {
  
  inline def apply(): ItemStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemStyle]
  }
  
  extension [Self <: ItemStyle](x: Self) {
    
    inline def setItemStyle(value: BarBorderWidth): Self = StObject.set(x, "itemStyle", value.asInstanceOf[js.Any])
    
    inline def setItemStyleUndefined: Self = StObject.set(x, "itemStyle", js.undefined)
    
    inline def setLabel(value: BorderRadius): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
