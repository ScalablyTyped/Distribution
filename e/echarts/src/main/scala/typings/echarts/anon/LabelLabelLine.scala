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
  var label: js.UndefOr[LineHeight] = js.undefined
  
  /**
    * @see https://echarts.apache.org/en/option.html#series-funnel.data.emphasis.labelLine
    */
  var labelLine: js.UndefOr[Length] = js.undefined
}
object LabelLabelLine {
  
  @scala.inline
  def apply(): LabelLabelLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelLabelLine]
  }
  
  @scala.inline
  implicit class LabelLabelLineMutableBuilder[Self <: LabelLabelLine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItemStyle(value: BorderType): Self = StObject.set(x, "itemStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemStyleUndefined: Self = StObject.set(x, "itemStyle", js.undefined)
    
    @scala.inline
    def setLabel(value: LineHeight): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelLine(value: Length): Self = StObject.set(x, "labelLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelLineUndefined: Self = StObject.set(x, "labelLine", js.undefined)
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
