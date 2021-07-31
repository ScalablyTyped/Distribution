package typings.echarts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `11` extends StObject {
  
  /**
    * @see https://echarts.apache.org/en/option.html#series-lines.data.emphasis.label
    */
  var label: js.UndefOr[FontSize] = js.undefined
  
  /**
    * @see https://echarts.apache.org/en/option.html#series-lines.data.emphasis.lineStyle
    */
  var lineStyle: js.UndefOr[ShadowColor] = js.undefined
}
object `11` {
  
  @scala.inline
  def apply(): `11` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`11`]
  }
  
  @scala.inline
  implicit class `11MutableBuilder`[Self <: `11`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: FontSize): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setLineStyle(value: ShadowColor): Self = StObject.set(x, "lineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineStyleUndefined: Self = StObject.set(x, "lineStyle", js.undefined)
  }
}
