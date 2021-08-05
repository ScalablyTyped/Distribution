package typings.dhtmlxscheduler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchedulerEnterprise extends StObject {
  
  /**
    * Creates a new instance of Scheduler
    */
  def getSchedulerInstance(): SchedulerStatic
}
object SchedulerEnterprise {
  
  inline def apply(getSchedulerInstance: () => SchedulerStatic): SchedulerEnterprise = {
    val __obj = js.Dynamic.literal(getSchedulerInstance = js.Any.fromFunction0(getSchedulerInstance))
    __obj.asInstanceOf[SchedulerEnterprise]
  }
  
  extension [Self <: SchedulerEnterprise](x: Self) {
    
    inline def setGetSchedulerInstance(value: () => SchedulerStatic): Self = StObject.set(x, "getSchedulerInstance", js.Any.fromFunction0(value))
  }
}
