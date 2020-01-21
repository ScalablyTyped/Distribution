package typings.documentdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Trigger extends UserScriptable {
  /** The trigger operation. Should be one of 'all', 'create', 'update', 'delete', or 'replace'. */
  var triggerOperation: TriggerOperation
  /** The type of the trigger. Should be either 'pre' or 'post'. */
  var triggerType: js.UndefOr[TriggerType] = js.undefined
}

object Trigger {
  @scala.inline
  def apply(
    id: String,
    triggerOperation: TriggerOperation,
    body: UserFunction = null,
    serverScript: UserFunction = null,
    triggerType: TriggerType = null
  ): Trigger = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], triggerOperation = triggerOperation.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (serverScript != null) __obj.updateDynamic("serverScript")(serverScript.asInstanceOf[js.Any])
    if (triggerType != null) __obj.updateDynamic("triggerType")(triggerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Trigger]
  }
}

