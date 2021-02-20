package typings.googleAppsScript.GoogleAppsScript.Script

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Builder for calendar triggers.
  */
@js.native
trait CalendarTriggerBuilder extends StObject {
  
  def create(): Trigger = js.native
  
  def onEventUpdated(): CalendarTriggerBuilder = js.native
}
object CalendarTriggerBuilder {
  
  @scala.inline
  def apply(create: () => Trigger, onEventUpdated: () => CalendarTriggerBuilder): CalendarTriggerBuilder = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction0(create), onEventUpdated = js.Any.fromFunction0(onEventUpdated))
    __obj.asInstanceOf[CalendarTriggerBuilder]
  }
  
  @scala.inline
  implicit class CalendarTriggerBuilderMutableBuilder[Self <: CalendarTriggerBuilder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate(value: () => Trigger): Self = StObject.set(x, "create", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnEventUpdated(value: () => CalendarTriggerBuilder): Self = StObject.set(x, "onEventUpdated", js.Any.fromFunction0(value))
  }
}
