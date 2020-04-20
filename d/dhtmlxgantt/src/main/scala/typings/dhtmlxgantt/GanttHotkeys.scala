package typings.dhtmlxgantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GanttHotkeys extends js.Object {
  var edit_cancel: Double
  var edit_save: Double
}

object GanttHotkeys {
  @scala.inline
  def apply(edit_cancel: Double, edit_save: Double): GanttHotkeys = {
    val __obj = js.Dynamic.literal(edit_cancel = edit_cancel.asInstanceOf[js.Any], edit_save = edit_save.asInstanceOf[js.Any])
    __obj.asInstanceOf[GanttHotkeys]
  }
}

