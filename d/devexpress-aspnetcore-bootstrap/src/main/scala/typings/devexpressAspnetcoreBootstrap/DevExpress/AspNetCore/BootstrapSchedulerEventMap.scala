package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BootstrapSchedulerEventMap extends ControlEventMap {
  
  var activeViewChanged: EventArgs = js.native
  
  var activeViewChanging: ActiveViewChangingEventArgs = js.native
  
  var appointmentClick: AppointmentClickEventArgs = js.native
  
  var appointmentDeleting: AppointmentDeletingEventArgs = js.native
  
  var appointmentDoubleClick: AppointmentClickEventArgs = js.native
  
  var appointmentDrag: AppointmentDragEventArgs = js.native
  
  var appointmentDrop: AppointmentDropEventArgs = js.native
  
  var appointmentResize: AppointmentResizeEventArgs = js.native
  
  var appointmentResizing: AppointmentResizingEventArgs = js.native
  
  var appointmentToolTipShowing: AppointmentToolTipShowingEventArgs = js.native
  
  var appointmentsSelectionChanged: AppointmentsSelectionEventArgs = js.native
  
  var beginCallback: BeginCallbackEventArgs = js.native
  
  var callbackError: CallbackErrorEventArgs = js.native
  
  var cellClick: CellClickEventArgs = js.native
  
  var cellDoubleClick: CellClickEventArgs = js.native
  
  var endCallback: EndCallbackEventArgs = js.native
  
  var menuItemClicked: MenuItemClickedEventArgs = js.native
  
  var moreButtonClicked: MoreButtonClickedEventArgs = js.native
  
  var selectionChanged: EventArgs = js.native
  
  var selectionChanging: EventArgs = js.native
  
  var shortcut: ShortcutEventArgs = js.native
  
  var visibleIntervalChanged: EventArgs = js.native
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
    val __obj = js.Dynamic.literal(activeViewChanged = activeViewChanged.asInstanceOf[js.Any], activeViewChanging = activeViewChanging.asInstanceOf[js.Any], appointmentClick = appointmentClick.asInstanceOf[js.Any], appointmentDeleting = appointmentDeleting.asInstanceOf[js.Any], appointmentDoubleClick = appointmentDoubleClick.asInstanceOf[js.Any], appointmentDrag = appointmentDrag.asInstanceOf[js.Any], appointmentDrop = appointmentDrop.asInstanceOf[js.Any], appointmentResize = appointmentResize.asInstanceOf[js.Any], appointmentResizing = appointmentResizing.asInstanceOf[js.Any], appointmentToolTipShowing = appointmentToolTipShowing.asInstanceOf[js.Any], appointmentsSelectionChanged = appointmentsSelectionChanged.asInstanceOf[js.Any], beginCallback = beginCallback.asInstanceOf[js.Any], callbackError = callbackError.asInstanceOf[js.Any], cellClick = cellClick.asInstanceOf[js.Any], cellDoubleClick = cellDoubleClick.asInstanceOf[js.Any], endCallback = endCallback.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], menuItemClicked = menuItemClicked.asInstanceOf[js.Any], moreButtonClicked = moreButtonClicked.asInstanceOf[js.Any], selectionChanged = selectionChanged.asInstanceOf[js.Any], selectionChanging = selectionChanging.asInstanceOf[js.Any], shortcut = shortcut.asInstanceOf[js.Any], visibleIntervalChanged = visibleIntervalChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapSchedulerEventMap]
  }
  
  @scala.inline
  implicit class BootstrapSchedulerEventMapOps[Self <: BootstrapSchedulerEventMap] (val x: Self) extends AnyVal {
    
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
    def setActiveViewChanged(value: EventArgs): Self = this.set("activeViewChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveViewChanging(value: ActiveViewChangingEventArgs): Self = this.set("activeViewChanging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppointmentClick(value: AppointmentClickEventArgs): Self = this.set("appointmentClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppointmentDeleting(value: AppointmentDeletingEventArgs): Self = this.set("appointmentDeleting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppointmentDoubleClick(value: AppointmentClickEventArgs): Self = this.set("appointmentDoubleClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppointmentDrag(value: AppointmentDragEventArgs): Self = this.set("appointmentDrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppointmentDrop(value: AppointmentDropEventArgs): Self = this.set("appointmentDrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppointmentResize(value: AppointmentResizeEventArgs): Self = this.set("appointmentResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppointmentResizing(value: AppointmentResizingEventArgs): Self = this.set("appointmentResizing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppointmentToolTipShowing(value: AppointmentToolTipShowingEventArgs): Self = this.set("appointmentToolTipShowing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppointmentsSelectionChanged(value: AppointmentsSelectionEventArgs): Self = this.set("appointmentsSelectionChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeginCallback(value: BeginCallbackEventArgs): Self = this.set("beginCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallbackError(value: CallbackErrorEventArgs): Self = this.set("callbackError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellClick(value: CellClickEventArgs): Self = this.set("cellClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellDoubleClick(value: CellClickEventArgs): Self = this.set("cellDoubleClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndCallback(value: EndCallbackEventArgs): Self = this.set("endCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuItemClicked(value: MenuItemClickedEventArgs): Self = this.set("menuItemClicked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoreButtonClicked(value: MoreButtonClickedEventArgs): Self = this.set("moreButtonClicked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionChanged(value: EventArgs): Self = this.set("selectionChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionChanging(value: EventArgs): Self = this.set("selectionChanging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortcut(value: ShortcutEventArgs): Self = this.set("shortcut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleIntervalChanged(value: EventArgs): Self = this.set("visibleIntervalChanged", value.asInstanceOf[js.Any])
  }
}
