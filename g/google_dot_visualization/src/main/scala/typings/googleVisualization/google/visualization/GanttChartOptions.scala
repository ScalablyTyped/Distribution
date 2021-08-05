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
  
  inline def apply(): GanttChartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GanttChartOptions]
  }
  
  extension [Self <: GanttChartOptions](x: Self) {
    
    inline def setBackgroundColor(value: ChartFill): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setGantt(value: GanttOptions): Self = StObject.set(x, "gantt", value.asInstanceOf[js.Any])
    
    inline def setGanttUndefined: Self = StObject.set(x, "gantt", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
