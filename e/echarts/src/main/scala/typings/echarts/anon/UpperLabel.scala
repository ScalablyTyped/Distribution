package typings.echarts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpperLabel extends StObject {
  
  /**
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[`25`] = js.undefined
  
  /**
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.emphasis.label
    */
  var label: js.UndefOr[Ellipsis] = js.undefined
  
  /**
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.emphasis.upperLabel
    */
  var upperLabel: js.UndefOr[Ellipsis] = js.undefined
}
object UpperLabel {
  
  @scala.inline
  def apply(): UpperLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpperLabel]
  }
  
  @scala.inline
  implicit class UpperLabelMutableBuilder[Self <: UpperLabel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItemStyle(value: `25`): Self = StObject.set(x, "itemStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemStyleUndefined: Self = StObject.set(x, "itemStyle", js.undefined)
    
    @scala.inline
    def setLabel(value: Ellipsis): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setUpperLabel(value: Ellipsis): Self = StObject.set(x, "upperLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpperLabelUndefined: Self = StObject.set(x, "upperLabel", js.undefined)
  }
}
