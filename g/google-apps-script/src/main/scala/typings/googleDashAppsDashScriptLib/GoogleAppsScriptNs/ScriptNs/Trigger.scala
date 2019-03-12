package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Trigger extends js.Object {
  def getEventType(): EventType
  def getHandlerFunction(): java.lang.String
  def getTriggerSource(): TriggerSource
  def getTriggerSourceId(): java.lang.String
  def getUniqueId(): java.lang.String
}

object Trigger {
  @scala.inline
  def apply(
    getEventType: () => EventType,
    getHandlerFunction: () => java.lang.String,
    getTriggerSource: () => TriggerSource,
    getTriggerSourceId: () => java.lang.String,
    getUniqueId: () => java.lang.String
  ): Trigger = {
    val __obj = js.Dynamic.literal(getEventType = js.Any.fromFunction0(getEventType), getHandlerFunction = js.Any.fromFunction0(getHandlerFunction), getTriggerSource = js.Any.fromFunction0(getTriggerSource), getTriggerSourceId = js.Any.fromFunction0(getTriggerSourceId), getUniqueId = js.Any.fromFunction0(getUniqueId))
  
    __obj.asInstanceOf[Trigger]
  }
}

