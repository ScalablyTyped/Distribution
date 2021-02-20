package typings.googleVisualization.google.visualization

import typings.googleVisualization.anon.CellColor
import typings.googleVisualization.anon.Colors
import typings.googleVisualization.anon.IsHtml
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalendarOptions extends StObject {
  
  var calendar: CellColor = js.native
  
  var colorAxis: js.UndefOr[Colors] = js.native
  
  var forceIFrame: js.UndefOr[Boolean] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var noDataPattern: js.UndefOr[js.Object] = js.native
  
  var tooltip: IsHtml = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object CalendarOptions {
  
  @scala.inline
  def apply(calendar: CellColor, tooltip: IsHtml): CalendarOptions = {
    val __obj = js.Dynamic.literal(calendar = calendar.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarOptions]
  }
  
  @scala.inline
  implicit class CalendarOptionsMutableBuilder[Self <: CalendarOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCalendar(value: CellColor): Self = StObject.set(x, "calendar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorAxis(value: Colors): Self = StObject.set(x, "colorAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorAxisUndefined: Self = StObject.set(x, "colorAxis", js.undefined)
    
    @scala.inline
    def setForceIFrame(value: Boolean): Self = StObject.set(x, "forceIFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceIFrameUndefined: Self = StObject.set(x, "forceIFrame", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setNoDataPattern(value: js.Object): Self = StObject.set(x, "noDataPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoDataPatternUndefined: Self = StObject.set(x, "noDataPattern", js.undefined)
    
    @scala.inline
    def setTooltip(value: IsHtml): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
