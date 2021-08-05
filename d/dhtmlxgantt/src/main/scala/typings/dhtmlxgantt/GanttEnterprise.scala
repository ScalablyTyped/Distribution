package typings.dhtmlxgantt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GanttEnterprise extends StObject {
  
  def getGanttInstance(): GanttStatic
}
object GanttEnterprise {
  
  inline def apply(getGanttInstance: () => GanttStatic): GanttEnterprise = {
    val __obj = js.Dynamic.literal(getGanttInstance = js.Any.fromFunction0(getGanttInstance))
    __obj.asInstanceOf[GanttEnterprise]
  }
  
  extension [Self <: GanttEnterprise](x: Self) {
    
    inline def setGetGanttInstance(value: () => GanttStatic): Self = StObject.set(x, "getGanttInstance", js.Any.fromFunction0(value))
  }
}
