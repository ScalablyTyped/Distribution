package typings.echarts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `18` extends StObject {
  
  /**
    * @see https://echarts.apache.org/en/option.html#series-pictorialBar.data.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[BorderColorBorderType] = js.undefined
  
  /**
    * @see https://echarts.apache.org/en/option.html#series-pictorialBar.data.emphasis.label
    */
  var label: js.UndefOr[Distance] = js.undefined
}
object `18` {
  
  @scala.inline
  def apply(): `18` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`18`]
  }
  
  @scala.inline
  implicit class `18MutableBuilder`[Self <: `18`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItemStyle(value: BorderColorBorderType): Self = StObject.set(x, "itemStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemStyleUndefined: Self = StObject.set(x, "itemStyle", js.undefined)
    
    @scala.inline
    def setLabel(value: Distance): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
