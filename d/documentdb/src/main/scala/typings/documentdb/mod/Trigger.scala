package typings.documentdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Trigger extends UserScriptable {
  /** The trigger operation. Should be one of 'all', 'create', 'update', 'delete', or 'replace'. */
  var triggerOperation: TriggerOperation = js.native
  /** The type of the trigger. Should be either 'pre' or 'post'. */
  var triggerType: js.UndefOr[TriggerType] = js.native
}

object Trigger {
  @scala.inline
  def apply(id: String, triggerOperation: TriggerOperation): Trigger = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], triggerOperation = triggerOperation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Trigger]
  }
  @scala.inline
  implicit class TriggerOps[Self <: Trigger] (val x: Self) extends AnyVal {
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
    def setTriggerOperation(value: TriggerOperation): Self = this.set("triggerOperation", value.asInstanceOf[js.Any])
    @scala.inline
    def setTriggerType(value: TriggerType): Self = this.set("triggerType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTriggerType: Self = this.set("triggerType", js.undefined)
  }
  
}

