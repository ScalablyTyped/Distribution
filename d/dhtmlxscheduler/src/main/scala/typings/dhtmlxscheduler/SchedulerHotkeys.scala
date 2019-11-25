package typings.dhtmlxscheduler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerHotkeys extends js.Object {
  var edit_cancel: Double
  var edit_save: Double
}

object SchedulerHotkeys {
  @scala.inline
  def apply(edit_cancel: Double, edit_save: Double): SchedulerHotkeys = {
    val __obj = js.Dynamic.literal(edit_cancel = edit_cancel.asInstanceOf[js.Any], edit_save = edit_save.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SchedulerHotkeys]
  }
}

