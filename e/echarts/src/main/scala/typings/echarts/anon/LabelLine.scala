package typings.echarts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelLine extends StObject {
  
  /**
    * @see https://echarts.apache.org/en/option.html#series-funnel.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[BorderType] = js.undefined
  
  /**
    * @see https://echarts.apache.org/en/option.html#series-funnel.emphasis.label
    */
  var label: js.UndefOr[FontSize] = js.undefined
  
  /**
    * @see https://echarts.apache.org/en/option.html#series-funnel.emphasis.labelLine
    */
  var labelLine: js.UndefOr[Length] = js.undefined
}
object LabelLine {
  
  inline def apply(): LabelLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelLine]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LabelLine] (val x: Self) extends AnyVal {
    
    inline def setItemStyle(value: BorderType): Self = StObject.set(x, "itemStyle", value.asInstanceOf[js.Any])
    
    inline def setItemStyleUndefined: Self = StObject.set(x, "itemStyle", js.undefined)
    
    inline def setLabel(value: FontSize): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelLine(value: Length): Self = StObject.set(x, "labelLine", value.asInstanceOf[js.Any])
    
    inline def setLabelLineUndefined: Self = StObject.set(x, "labelLine", js.undefined)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
