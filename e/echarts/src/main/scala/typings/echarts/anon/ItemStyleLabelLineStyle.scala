package typings.echarts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemStyleLabelLineStyle extends StObject {
  
  /**
    * @see https://echarts.apache.org/en/option.html#series-sankey.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[BorderType] = js.undefined
  
  /**
    * @see https://echarts.apache.org/en/option.html#series-sankey.emphasis.label
    */
  var label: js.UndefOr[BorderRadius] = js.undefined
  
  /**
    * @see https://echarts.apache.org/en/option.html#series-sankey.emphasis.lineStyle
    */
  var lineStyle: js.UndefOr[ColorCurveness] = js.undefined
}
object ItemStyleLabelLineStyle {
  
  @scala.inline
  def apply(): ItemStyleLabelLineStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemStyleLabelLineStyle]
  }
  
  @scala.inline
  implicit class ItemStyleLabelLineStyleMutableBuilder[Self <: ItemStyleLabelLineStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItemStyle(value: BorderType): Self = StObject.set(x, "itemStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemStyleUndefined: Self = StObject.set(x, "itemStyle", js.undefined)
    
    @scala.inline
    def setLabel(value: BorderRadius): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setLineStyle(value: ColorCurveness): Self = StObject.set(x, "lineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineStyleUndefined: Self = StObject.set(x, "lineStyle", js.undefined)
  }
}
