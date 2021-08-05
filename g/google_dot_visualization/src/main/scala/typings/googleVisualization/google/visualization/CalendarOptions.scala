package typings.googleVisualization.google.visualization

import typings.googleVisualization.anon.CellColor
import typings.googleVisualization.anon.Colors
import typings.googleVisualization.anon.IsHtml
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalendarOptions extends StObject {
  
  var calendar: CellColor
  
  var colorAxis: js.UndefOr[Colors] = js.undefined
  
  var forceIFrame: js.UndefOr[Boolean] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var noDataPattern: js.UndefOr[js.Object] = js.undefined
  
  var tooltip: IsHtml
  
  var width: js.UndefOr[Double] = js.undefined
}
object CalendarOptions {
  
  inline def apply(calendar: CellColor, tooltip: IsHtml): CalendarOptions = {
    val __obj = js.Dynamic.literal(calendar = calendar.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarOptions]
  }
  
  extension [Self <: CalendarOptions](x: Self) {
    
    inline def setCalendar(value: CellColor): Self = StObject.set(x, "calendar", value.asInstanceOf[js.Any])
    
    inline def setColorAxis(value: Colors): Self = StObject.set(x, "colorAxis", value.asInstanceOf[js.Any])
    
    inline def setColorAxisUndefined: Self = StObject.set(x, "colorAxis", js.undefined)
    
    inline def setForceIFrame(value: Boolean): Self = StObject.set(x, "forceIFrame", value.asInstanceOf[js.Any])
    
    inline def setForceIFrameUndefined: Self = StObject.set(x, "forceIFrame", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setNoDataPattern(value: js.Object): Self = StObject.set(x, "noDataPattern", value.asInstanceOf[js.Any])
    
    inline def setNoDataPatternUndefined: Self = StObject.set(x, "noDataPattern", js.undefined)
    
    inline def setTooltip(value: IsHtml): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
