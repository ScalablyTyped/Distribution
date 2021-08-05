package typings.googleAppsScript.GoogleAppsScript.Script

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Builder for calendar triggers.
  */
trait CalendarTriggerBuilder extends StObject {
  
  def create(): Trigger
  
  def onEventUpdated(): CalendarTriggerBuilder
}
object CalendarTriggerBuilder {
  
  inline def apply(create: () => Trigger, onEventUpdated: () => CalendarTriggerBuilder): CalendarTriggerBuilder = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction0(create), onEventUpdated = js.Any.fromFunction0(onEventUpdated))
    __obj.asInstanceOf[CalendarTriggerBuilder]
  }
  
  extension [Self <: CalendarTriggerBuilder](x: Self) {
    
    inline def setCreate(value: () => Trigger): Self = StObject.set(x, "create", js.Any.fromFunction0(value))
    
    inline def setOnEventUpdated(value: () => CalendarTriggerBuilder): Self = StObject.set(x, "onEventUpdated", js.Any.fromFunction0(value))
  }
}
