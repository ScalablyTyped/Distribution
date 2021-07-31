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
  
  @scala.inline
  def apply(): ItemStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemStyle]
  }
  
  @scala.inline
  implicit class ItemStyleMutableBuilder[Self <: ItemStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItemStyle(value: BarBorderWidth): Self = StObject.set(x, "itemStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemStyleUndefined: Self = StObject.set(x, "itemStyle", js.undefined)
    
    @scala.inline
    def setLabel(value: BorderRadius): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
