package typings.ejWebAll.ej.Schedule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextMenuSettingsMenuItems extends js.Object {
  /** All the appointment related context menu items are grouped under this appointment menu collection.
    */
  var appointment: js.UndefOr[js.Array[_]] = js.native
  /** All the Scheduler cell related context menu items are grouped under this cells menu item collection.
    */
  var cells: js.UndefOr[js.Array[_]] = js.native
}

object ContextMenuSettingsMenuItems {
  @scala.inline
  def apply(): ContextMenuSettingsMenuItems = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContextMenuSettingsMenuItems]
  }
  @scala.inline
  implicit class ContextMenuSettingsMenuItemsOps[Self <: ContextMenuSettingsMenuItems] (val x: Self) extends AnyVal {
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
    def setAppointmentVarargs(value: js.Any*): Self = this.set("appointment", js.Array(value :_*))
    @scala.inline
    def setAppointment(value: js.Array[_]): Self = this.set("appointment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppointment: Self = this.set("appointment", js.undefined)
    @scala.inline
    def setCellsVarargs(value: js.Any*): Self = this.set("cells", js.Array(value :_*))
    @scala.inline
    def setCells(value: js.Array[_]): Self = this.set("cells", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCells: Self = this.set("cells", js.undefined)
  }
  
}

