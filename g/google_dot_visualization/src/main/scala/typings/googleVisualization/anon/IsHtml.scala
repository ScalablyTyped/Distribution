package typings.googleVisualization.anon

import typings.googleVisualization.google.visualization.ChartTextStyle
import typings.googleVisualization.googleVisualizationStrings.focus
import typings.googleVisualization.googleVisualizationStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsHtml extends StObject {
  
  var isHtml: js.UndefOr[Boolean] = js.undefined
  
  var textStyle: js.UndefOr[ChartTextStyle] = js.undefined
  
  var trigger: js.UndefOr[focus | none] = js.undefined
}
object IsHtml {
  
  inline def apply(): IsHtml = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsHtml]
  }
  
  extension [Self <: IsHtml](x: Self) {
    
    inline def setIsHtml(value: Boolean): Self = StObject.set(x, "isHtml", value.asInstanceOf[js.Any])
    
    inline def setIsHtmlUndefined: Self = StObject.set(x, "isHtml", js.undefined)
    
    inline def setTextStyle(value: ChartTextStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
    
    inline def setTrigger(value: focus | none): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    
    inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
  }
}
