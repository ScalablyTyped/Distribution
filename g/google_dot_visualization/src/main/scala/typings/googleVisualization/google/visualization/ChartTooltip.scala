package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartTooltip extends StObject {
  
  var ignoreBounds: js.UndefOr[Boolean] = js.undefined
  
  var isHtml: js.UndefOr[Boolean] = js.undefined
  
  var showColorCode: js.UndefOr[Boolean] = js.undefined
  
  var textStyle: js.UndefOr[ChartTextStyle] = js.undefined
  
  var trigger: js.UndefOr[String] = js.undefined
}
object ChartTooltip {
  
  inline def apply(): ChartTooltip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartTooltip]
  }
  
  extension [Self <: ChartTooltip](x: Self) {
    
    inline def setIgnoreBounds(value: Boolean): Self = StObject.set(x, "ignoreBounds", value.asInstanceOf[js.Any])
    
    inline def setIgnoreBoundsUndefined: Self = StObject.set(x, "ignoreBounds", js.undefined)
    
    inline def setIsHtml(value: Boolean): Self = StObject.set(x, "isHtml", value.asInstanceOf[js.Any])
    
    inline def setIsHtmlUndefined: Self = StObject.set(x, "isHtml", js.undefined)
    
    inline def setShowColorCode(value: Boolean): Self = StObject.set(x, "showColorCode", value.asInstanceOf[js.Any])
    
    inline def setShowColorCodeUndefined: Self = StObject.set(x, "showColorCode", js.undefined)
    
    inline def setTextStyle(value: ChartTextStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
    
    inline def setTrigger(value: String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    
    inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
  }
}
