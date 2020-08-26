package typings.dhtmlxscheduler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchedulerHotkeys extends js.Object {
  var edit_cancel: Double = js.native
  var edit_save: Double = js.native
}

object SchedulerHotkeys {
  @scala.inline
  def apply(edit_cancel: Double, edit_save: Double): SchedulerHotkeys = {
    val __obj = js.Dynamic.literal(edit_cancel = edit_cancel.asInstanceOf[js.Any], edit_save = edit_save.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchedulerHotkeys]
  }
  @scala.inline
  implicit class SchedulerHotkeysOps[Self <: SchedulerHotkeys] (val x: Self) extends AnyVal {
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
    def setEdit_cancel(value: Double): Self = this.set("edit_cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def setEdit_save(value: Double): Self = this.set("edit_save", value.asInstanceOf[js.Any])
  }
  
}

