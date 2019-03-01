package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapSchedulerEventMap extends ControlEventMap {
  var activeViewChanged: EventArgs
  var activeViewChanging: ActiveViewChangingEventArgs
  var appointmentClick: AppointmentClickEventArgs
  var appointmentDeleting: AppointmentDeletingEventArgs
  var appointmentDoubleClick: AppointmentClickEventArgs
  var appointmentDrag: AppointmentDragEventArgs
  var appointmentDrop: AppointmentDropEventArgs
  var appointmentResize: AppointmentResizeEventArgs
  var appointmentResizing: AppointmentResizingEventArgs
  var appointmentToolTipShowing: AppointmentToolTipShowingEventArgs
  var appointmentsSelectionChanged: AppointmentsSelectionEventArgs
  var beginCallback: BeginCallbackEventArgs
  var callbackError: CallbackErrorEventArgs
  var cellClick: CellClickEventArgs
  var cellDoubleClick: CellClickEventArgs
  var endCallback: EndCallbackEventArgs
  var menuItemClicked: MenuItemClickedEventArgs
  var moreButtonClicked: MoreButtonClickedEventArgs
  var selectionChanged: EventArgs
  var selectionChanging: EventArgs
  var shortcut: ShortcutEventArgs
  var visibleIntervalChanged: EventArgs
}

object BootstrapSchedulerEventMap {
  @scala.inline
  def apply(
    activeViewChanged: EventArgs,
    activeViewChanging: ActiveViewChangingEventArgs,
    appointmentClick: AppointmentClickEventArgs,
    appointmentDeleting: AppointmentDeletingEventArgs,
    appointmentDoubleClick: AppointmentClickEventArgs,
    appointmentDrag: AppointmentDragEventArgs,
    appointmentDrop: AppointmentDropEventArgs,
    appointmentResize: AppointmentResizeEventArgs,
    appointmentResizing: AppointmentResizingEventArgs,
    appointmentToolTipShowing: AppointmentToolTipShowingEventArgs,
    appointmentsSelectionChanged: AppointmentsSelectionEventArgs,
    beginCallback: BeginCallbackEventArgs,
    callbackError: CallbackErrorEventArgs,
    cellClick: CellClickEventArgs,
    cellDoubleClick: CellClickEventArgs,
    endCallback: EndCallbackEventArgs,
    init: EventArgs,
    menuItemClicked: MenuItemClickedEventArgs,
    moreButtonClicked: MoreButtonClickedEventArgs,
    selectionChanged: EventArgs,
    selectionChanging: EventArgs,
    shortcut: ShortcutEventArgs,
    visibleIntervalChanged: EventArgs
  ): BootstrapSchedulerEventMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("activeViewChanged")(activeViewChanged)
    __obj.updateDynamic("activeViewChanging")(activeViewChanging)
    __obj.updateDynamic("appointmentClick")(appointmentClick)
    __obj.updateDynamic("appointmentDeleting")(appointmentDeleting)
    __obj.updateDynamic("appointmentDoubleClick")(appointmentDoubleClick)
    __obj.updateDynamic("appointmentDrag")(appointmentDrag)
    __obj.updateDynamic("appointmentDrop")(appointmentDrop)
    __obj.updateDynamic("appointmentResize")(appointmentResize)
    __obj.updateDynamic("appointmentResizing")(appointmentResizing)
    __obj.updateDynamic("appointmentToolTipShowing")(appointmentToolTipShowing)
    __obj.updateDynamic("appointmentsSelectionChanged")(appointmentsSelectionChanged)
    __obj.updateDynamic("beginCallback")(beginCallback)
    __obj.updateDynamic("callbackError")(callbackError)
    __obj.updateDynamic("cellClick")(cellClick)
    __obj.updateDynamic("cellDoubleClick")(cellDoubleClick)
    __obj.updateDynamic("endCallback")(endCallback)
    __obj.updateDynamic("init")(init)
    __obj.updateDynamic("menuItemClicked")(menuItemClicked)
    __obj.updateDynamic("moreButtonClicked")(moreButtonClicked)
    __obj.updateDynamic("selectionChanged")(selectionChanged)
    __obj.updateDynamic("selectionChanging")(selectionChanging)
    __obj.updateDynamic("shortcut")(shortcut)
    __obj.updateDynamic("visibleIntervalChanged")(visibleIntervalChanged)
    __obj.asInstanceOf[BootstrapSchedulerEventMap]
  }
}

