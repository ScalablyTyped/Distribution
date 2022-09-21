package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.ui.dxGantt.GanttScaleType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Max extends StObject {
  
  /**
    * Specifies the maximum zoom level of tasks in the Gantt chart.
    */
  var max: js.UndefOr[GanttScaleType] = js.undefined
  
  /**
    * Specifies the minimum zoom level of tasks in the Gantt chart.
    */
  var min: js.UndefOr[GanttScaleType] = js.undefined
}
object Max {
  
  inline def apply(): Max = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Max]
  }
  
  extension [Self <: Max](x: Self) {
    
    inline def setMax(value: GanttScaleType): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: GanttScaleType): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
  }
}
