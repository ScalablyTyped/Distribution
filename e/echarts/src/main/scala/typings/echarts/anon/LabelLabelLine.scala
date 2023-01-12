package typings.echarts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelLabelLine extends StObject {
  
  /**
    * @see https://echarts.apache.org/en/option.html#series-funnel.data.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[BorderType] = js.undefined
  
  /**
    * @see https://echarts.apache.org/en/option.html#series-funnel.data.emphasis.label
    */
  var label: js.UndefOr[FontWeight] = js.undefined
  
  /**
    * @see https://echarts.apache.org/en/option.html#series-funnel.data.emphasis.labelLine
    */
  var labelLine: js.UndefOr[Length] = js.undefined
}
object LabelLabelLine {
  
  inline def apply(): LabelLabelLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelLabelLine]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LabelLabelLine] (val x: Self) extends AnyVal {
    
    inline def setItemStyle(value: BorderType): Self = StObject.set(x, "itemStyle", value.asInstanceOf[js.Any])
    
    inline def setItemStyleUndefined: Self = StObject.set(x, "itemStyle", js.undefined)
    
    inline def setLabel(value: FontWeight): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelLine(value: Length): Self = StObject.set(x, "labelLine", value.asInstanceOf[js.Any])
    
    inline def setLabelLineUndefined: Self = StObject.set(x, "labelLine", js.undefined)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
