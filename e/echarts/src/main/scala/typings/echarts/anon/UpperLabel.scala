package typings.echarts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpperLabel extends StObject {
  
  /**
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[`26`] = js.undefined
  
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
  
  inline def apply(): UpperLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpperLabel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpperLabel] (val x: Self) extends AnyVal {
    
    inline def setItemStyle(value: `26`): Self = StObject.set(x, "itemStyle", value.asInstanceOf[js.Any])
    
    inline def setItemStyleUndefined: Self = StObject.set(x, "itemStyle", js.undefined)
    
    inline def setLabel(value: Ellipsis): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setUpperLabel(value: Ellipsis): Self = StObject.set(x, "upperLabel", value.asInstanceOf[js.Any])
    
    inline def setUpperLabelUndefined: Self = StObject.set(x, "upperLabel", js.undefined)
  }
}
