package typings.framerMotion.distDomEntryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Step extends StObject {
  
  def cancel(process: Process): Unit
  
  def process(frame: FrameData_): Unit
  
  var schedule: Schedule
}
object Step {
  
  inline def apply(
    cancel: Process => Unit,
    process: FrameData_ => Unit,
    schedule: (/* process */ Process, /* keepAlive */ js.UndefOr[Boolean], /* immediate */ js.UndefOr[Boolean]) => Process
  ): Step = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), process = js.Any.fromFunction1(process), schedule = js.Any.fromFunction3(schedule))
    __obj.asInstanceOf[Step]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Step] (val x: Self) extends AnyVal {
    
    inline def setCancel(value: Process => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction1(value))
    
    inline def setProcess(value: FrameData_ => Unit): Self = StObject.set(x, "process", js.Any.fromFunction1(value))
    
    inline def setSchedule(
      value: (/* process */ Process, /* keepAlive */ js.UndefOr[Boolean], /* immediate */ js.UndefOr[Boolean]) => Process
    ): Self = StObject.set(x, "schedule", js.Any.fromFunction3(value))
  }
}
