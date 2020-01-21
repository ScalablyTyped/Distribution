package typings.ejWebAll.ej.Schedule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextMenuSettingsMenuItems extends js.Object {
  /** All the appointment related context menu items are grouped under this appointment menu collection.
    */
  var appointment: js.UndefOr[js.Array[_]] = js.undefined
  /** All the Scheduler cell related context menu items are grouped under this cells menu item collection.
    */
  var cells: js.UndefOr[js.Array[_]] = js.undefined
}

object ContextMenuSettingsMenuItems {
  @scala.inline
  def apply(appointment: js.Array[_] = null, cells: js.Array[_] = null): ContextMenuSettingsMenuItems = {
    val __obj = js.Dynamic.literal()
    if (appointment != null) __obj.updateDynamic("appointment")(appointment.asInstanceOf[js.Any])
    if (cells != null) __obj.updateDynamic("cells")(cells.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextMenuSettingsMenuItems]
  }
}

