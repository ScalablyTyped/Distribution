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
    getEventType: js.Function0[EventType],
    getHandlerFunction: js.Function0[java.lang.String],
    getTriggerSource: js.Function0[TriggerSource],
    getTriggerSourceId: js.Function0[java.lang.String],
    getUniqueId: js.Function0[java.lang.String]
  ): Trigger = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getEventType")(getEventType)
    __obj.updateDynamic("getHandlerFunction")(getHandlerFunction)
    __obj.updateDynamic("getTriggerSource")(getTriggerSource)
    __obj.updateDynamic("getTriggerSourceId")(getTriggerSourceId)
    __obj.updateDynamic("getUniqueId")(getUniqueId)
    __obj.asInstanceOf[Trigger]
  }
}

