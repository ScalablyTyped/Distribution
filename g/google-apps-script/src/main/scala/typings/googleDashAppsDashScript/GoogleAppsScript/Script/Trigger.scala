package typings.googleDashAppsDashScript.GoogleAppsScript.Script

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Trigger extends js.Object {
  def getEventType(): EventType
  def getHandlerFunction(): String
  def getTriggerSource(): TriggerSource
  def getTriggerSourceId(): String
  def getUniqueId(): String
}

object Trigger {
  @scala.inline
  def apply(
    getEventType: () => EventType,
    getHandlerFunction: () => String,
    getTriggerSource: () => TriggerSource,
    getTriggerSourceId: () => String,
    getUniqueId: () => String
  ): Trigger = {
    val __obj = js.Dynamic.literal(getEventType = js.Any.fromFunction0(getEventType), getHandlerFunction = js.Any.fromFunction0(getHandlerFunction), getTriggerSource = js.Any.fromFunction0(getTriggerSource), getTriggerSourceId = js.Any.fromFunction0(getTriggerSourceId), getUniqueId = js.Any.fromFunction0(getUniqueId))
  
    __obj.asInstanceOf[Trigger]
  }
}

