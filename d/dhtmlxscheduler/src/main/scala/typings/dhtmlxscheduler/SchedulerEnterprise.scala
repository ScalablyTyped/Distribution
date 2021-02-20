package typings.dhtmlxscheduler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchedulerEnterprise extends StObject {
  
  /**
    * Creates a new instance of Scheduler
    */
  def getSchedulerInstance(): SchedulerStatic = js.native
}
object SchedulerEnterprise {
  
  @scala.inline
  def apply(getSchedulerInstance: () => SchedulerStatic): SchedulerEnterprise = {
    val __obj = js.Dynamic.literal(getSchedulerInstance = js.Any.fromFunction0(getSchedulerInstance))
    __obj.asInstanceOf[SchedulerEnterprise]
  }
  
  @scala.inline
  implicit class SchedulerEnterpriseMutableBuilder[Self <: SchedulerEnterprise] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetSchedulerInstance(value: () => SchedulerStatic): Self = StObject.set(x, "getSchedulerInstance", js.Any.fromFunction0(value))
  }
}
