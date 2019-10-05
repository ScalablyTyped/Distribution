package typings.gapiDotClientDotTagmanager.gapi.client.tagmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevertTriggerResponse extends js.Object {
  /**
    * Trigger as it appears in the latest container version since the last workspace synchronization operation. If no trigger is present, that means the
    * trigger was deleted in the latest container version.
    */
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

