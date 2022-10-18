package typings.echarts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `12` extends StObject {
  
  /**
    * @see https://echarts.apache.org/en/option.html#series-lines.data.emphasis.label
    */
  var label: js.UndefOr[FontFamily] = js.undefined
  
  /**
    * @see https://echarts.apache.org/en/option.html#series-lines.data.emphasis.lineStyle
    */
  var lineStyle: js.UndefOr[ShadowColor] = js.undefined
}
object `12` {
  
  inline def apply(): `12` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`12`]
  }
  
  extension [Self <: `12`](x: Self) {
    
    inline def setLabel(value: FontFamily): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLineStyle(value: ShadowColor): Self = StObject.set(x, "lineStyle", value.asInstanceOf[js.Any])
    
    inline def setLineStyleUndefined: Self = StObject.set(x, "lineStyle", js.undefined)
  }
}
