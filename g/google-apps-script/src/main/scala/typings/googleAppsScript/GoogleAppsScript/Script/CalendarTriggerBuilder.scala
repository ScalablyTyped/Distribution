package typings.googleAppsScript.GoogleAppsScript.Script

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Builder for calendar triggers.
  */
@js.native
trait CalendarTriggerBuilder extends js.Object {
  
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
  implicit class CalendarTriggerBuilderOps[Self <: CalendarTriggerBuilder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreate(value: () => Trigger): Self = this.set("create", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnEventUpdated(value: () => CalendarTriggerBuilder): Self = this.set("onEventUpdated", js.Any.fromFunction0(value))
  }
}
