package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait hasSchedules extends StObject {
  
  def getSchedules(): ExtensionSchedule
  
  def setSchedules(schedules: ExtensionScheduleInput): Unit
}
object hasSchedules {
  
  @scala.inline
  def apply(getSchedules: () => ExtensionSchedule, setSchedules: ExtensionScheduleInput => Unit): hasSchedules = {
    val __obj = js.Dynamic.literal(getSchedules = js.Any.fromFunction0(getSchedules), setSchedules = js.Any.fromFunction1(setSchedules))
    __obj.asInstanceOf[hasSchedules]
  }
  
  @scala.inline
  implicit class hasSchedulesMutableBuilder[Self <: hasSchedules] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetSchedules(value: () => ExtensionSchedule): Self = StObject.set(x, "getSchedules", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetSchedules(value: ExtensionScheduleInput => Unit): Self = StObject.set(x, "setSchedules", js.Any.fromFunction1(value))
  }
}
