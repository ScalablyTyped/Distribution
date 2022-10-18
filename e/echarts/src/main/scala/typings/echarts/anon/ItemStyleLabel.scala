package typings.echarts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemStyleLabel extends StObject {
  
  /**
    * @see https://echarts.apache.org/en/option.html#series-effectScatter.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[ShadowOffsetY] = js.undefined
  
  /**
    * @see https://echarts.apache.org/en/option.html#series-effectScatter.emphasis.label
    */
  var label: js.UndefOr[BorderColor] = js.undefined
}
object ItemStyleLabel {
  
  inline def apply(): ItemStyleLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemStyleLabel]
  }
  
  extension [Self <: ItemStyleLabel](x: Self) {
    
    inline def setItemStyle(value: ShadowOffsetY): Self = StObject.set(x, "itemStyle", value.asInstanceOf[js.Any])
    
    inline def setItemStyleUndefined: Self = StObject.set(x, "itemStyle", js.undefined)
    
    inline def setLabel(value: BorderColor): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
