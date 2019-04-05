package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevertTriggerResponse extends js.Object {
  var trigger: js.UndefOr[Trigger] = js.undefined
}

object RevertTriggerResponse {
  @scala.inline
  def apply(trigger: Trigger = null): RevertTriggerResponse = {
    val __obj = js.Dynamic.literal()
    if (trigger != null) __obj.updateDynamic("trigger")(trigger)
    __obj.asInstanceOf[RevertTriggerResponse]
  }
}

