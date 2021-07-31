package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GanttChartOptions extends StObject {
  
  var backgroundColor: js.UndefOr[ChartFill] = js.undefined
  
  var gantt: js.UndefOr[GanttOptions] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object GanttChartOptions {
  
  @scala.inline
  def apply(): GanttChartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GanttChartOptions]
  }
  
  @scala.inline
  implicit class GanttChartOptionsMutableBuilder[Self <: GanttChartOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: ChartFill): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setGantt(value: GanttOptions): Self = StObject.set(x, "gantt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGanttUndefined: Self = StObject.set(x, "gantt", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
