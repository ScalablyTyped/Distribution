package typings.echarts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `15` extends StObject {
  
  /**
    * @see https://echarts.apache.org/en/option.html#series-map.data.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[AreaColor] = js.undefined
  
  /**
    * @see https://echarts.apache.org/en/option.html#series-map.data.emphasis.label
    */
  var label: js.UndefOr[Rotate] = js.undefined
}
object `15` {
  
  @scala.inline
  def apply(): `15` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`15`]
  }
  
  @scala.inline
  implicit class `15MutableBuilder`[Self <: `15`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItemStyle(value: AreaColor): Self = StObject.set(x, "itemStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemStyleUndefined: Self = StObject.set(x, "itemStyle", js.undefined)
    
    @scala.inline
    def setLabel(value: Rotate): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
