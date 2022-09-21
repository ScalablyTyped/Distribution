package typings.googleVisualization.google.visualization

import typings.googleVisualization.anon.BackgroundColor
import typings.googleVisualization.anon.CellColor
import typings.googleVisualization.anon.Colors
import typings.googleVisualization.anon.IsHtmlBoolean
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalendarOptions extends StObject {
  
  var calendar: js.UndefOr[CellColor] = js.undefined
  
  var colorAxis: js.UndefOr[Colors] = js.undefined
  
  var forceIFrame: js.UndefOr[Boolean] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var noDataPattern: js.UndefOr[BackgroundColor] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var tooltip: js.UndefOr[IsHtmlBoolean] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object CalendarOptions {
  
  inline def apply(): CalendarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalendarOptions]
  }
  
  extension [Self <: CalendarOptions](x: Self) {
    
    inline def setCalendar(value: CellColor): Self = StObject.set(x, "calendar", value.asInstanceOf[js.Any])
    
    inline def setCalendarUndefined: Self = StObject.set(x, "calendar", js.undefined)
    
    inline def setColorAxis(value: Colors): Self = StObject.set(x, "colorAxis", value.asInstanceOf[js.Any])
    
    inline def setColorAxisUndefined: Self = StObject.set(x, "colorAxis", js.undefined)
    
    inline def setForceIFrame(value: Boolean): Self = StObject.set(x, "forceIFrame", value.asInstanceOf[js.Any])
    
    inline def setForceIFrameUndefined: Self = StObject.set(x, "forceIFrame", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setNoDataPattern(value: BackgroundColor): Self = StObject.set(x, "noDataPattern", value.asInstanceOf[js.Any])
    
    inline def setNoDataPatternUndefined: Self = StObject.set(x, "noDataPattern", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTooltip(value: IsHtmlBoolean): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
