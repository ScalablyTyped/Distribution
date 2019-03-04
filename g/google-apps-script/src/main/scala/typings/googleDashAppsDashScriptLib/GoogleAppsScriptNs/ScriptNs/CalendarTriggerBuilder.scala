package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarTriggerBuilder extends js.Object {
  def create(): Trigger
  def onEventUpdated(): CalendarTriggerBuilder
}

object CalendarTriggerBuilder {
  @scala.inline
  def apply(create: js.Function0[Trigger], onEventUpdated: js.Function0[CalendarTriggerBuilder]): CalendarTriggerBuilder = {
    val __obj = js.Dynamic.literal(create = create, onEventUpdated = onEventUpdated)
  
    __obj.asInstanceOf[CalendarTriggerBuilder]
  }
}

