package typings.googleapis.buildSrcApisTagmanagerV2Mod.tagmanager_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of reverting a trigger in a workspace.
  */
@js.native
trait Schema$RevertTriggerResponse extends js.Object {
  /**
    * Trigger as it appears in the latest container version since the last
    * workspace synchronization operation. If no trigger is present, that means
    * the trigger was deleted in the latest container version.
    */
  var trigger: js.UndefOr[Schema$Trigger] = js.native
}

object Schema$RevertTriggerResponse {
  @scala.inline
  def apply(trigger: Schema$Trigger = null): Schema$RevertTriggerResponse = {
    val __obj = js.Dynamic.literal()
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RevertTriggerResponse]
  }
}

