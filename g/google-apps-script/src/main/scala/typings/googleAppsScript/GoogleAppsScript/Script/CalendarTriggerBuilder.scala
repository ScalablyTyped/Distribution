package typings.googleAppsScript.GoogleAppsScript.Script

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Builder for calendar triggers.
  */
trait CalendarTriggerBuilder extends js.Object {
  def create(): Trigger
  def onEventUpdated(): CalendarTriggerBuilder
}

object CalendarTriggerBuilder {
  @scala.inline
  def apply(create: () => Trigger, onEventUpdated: () => CalendarTriggerBuilder): CalendarTriggerBuilder = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction0(create), onEventUpdated = js.Any.fromFunction0(onEventUpdated))
    __obj.asInstanceOf[CalendarTriggerBuilder]
  }
}

