package typings.echarts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelLineStyle extends StObject {
  
  /**
    * @see https://echarts.apache.org/en/option.html#series-graph.links.emphasis.label
    */
  var label: js.UndefOr[FontFamily] = js.undefined
  
  /**
    * @see https://echarts.apache.org/en/option.html#series-graph.links.emphasis.lineStyle
    */
  var lineStyle: js.UndefOr[ShadowBlur] = js.undefined
}
object LabelLineStyle {
  
  inline def apply(): LabelLineStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelLineStyle]
  }
  
  extension [Self <: LabelLineStyle](x: Self) {
    
    inline def setLabel(value: FontFamily): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLineStyle(value: ShadowBlur): Self = StObject.set(x, "lineStyle", value.asInstanceOf[js.Any])
    
    inline def setLineStyleUndefined: Self = StObject.set(x, "lineStyle", js.undefined)
  }
}
