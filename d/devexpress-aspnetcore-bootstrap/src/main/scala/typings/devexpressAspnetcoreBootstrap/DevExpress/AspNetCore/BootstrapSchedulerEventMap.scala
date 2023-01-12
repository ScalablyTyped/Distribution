package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BootstrapSchedulerEventMap
  extends StObject
     with ControlEventMap {
  
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
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: BootstrapSchedulerEventMap] (val x: Self) extends AnyVal {
    
    inline def setActiveViewChanged(value: EventArgs): Self = StObject.set(x, "activeViewChanged", value.asInstanceOf[js.Any])
    
    inline def setActiveViewChanging(value: ActiveViewChangingEventArgs): Self = StObject.set(x, "activeViewChanging", value.asInstanceOf[js.Any])
    
    inline def setAppointmentClick(value: AppointmentClickEventArgs): Self = StObject.set(x, "appointmentClick", value.asInstanceOf[js.Any])
    
    inline def setAppointmentDeleting(value: AppointmentDeletingEventArgs): Self = StObject.set(x, "appointmentDeleting", value.asInstanceOf[js.Any])
    
    inline def setAppointmentDoubleClick(value: AppointmentClickEventArgs): Self = StObject.set(x, "appointmentDoubleClick", value.asInstanceOf[js.Any])
    
    inline def setAppointmentDrag(value: AppointmentDragEventArgs): Self = StObject.set(x, "appointmentDrag", value.asInstanceOf[js.Any])
    
    inline def setAppointmentDrop(value: AppointmentDropEventArgs): Self = StObject.set(x, "appointmentDrop", value.asInstanceOf[js.Any])
    
    inline def setAppointmentResize(value: AppointmentResizeEventArgs): Self = StObject.set(x, "appointmentResize", value.asInstanceOf[js.Any])
    
    inline def setAppointmentResizing(value: AppointmentResizingEventArgs): Self = StObject.set(x, "appointmentResizing", value.asInstanceOf[js.Any])
    
    inline def setAppointmentToolTipShowing(value: AppointmentToolTipShowingEventArgs): Self = StObject.set(x, "appointmentToolTipShowing", value.asInstanceOf[js.Any])
    
    inline def setAppointmentsSelectionChanged(value: AppointmentsSelectionEventArgs): Self = StObject.set(x, "appointmentsSelectionChanged", value.asInstanceOf[js.Any])
    
    inline def setBeginCallback(value: BeginCallbackEventArgs): Self = StObject.set(x, "beginCallback", value.asInstanceOf[js.Any])
    
    inline def setCallbackError(value: CallbackErrorEventArgs): Self = StObject.set(x, "callbackError", value.asInstanceOf[js.Any])
    
    inline def setCellClick(value: CellClickEventArgs): Self = StObject.set(x, "cellClick", value.asInstanceOf[js.Any])
    
    inline def setCellDoubleClick(value: CellClickEventArgs): Self = StObject.set(x, "cellDoubleClick", value.asInstanceOf[js.Any])
    
    inline def setEndCallback(value: EndCallbackEventArgs): Self = StObject.set(x, "endCallback", value.asInstanceOf[js.Any])
    
    inline def setMenuItemClicked(value: MenuItemClickedEventArgs): Self = StObject.set(x, "menuItemClicked", value.asInstanceOf[js.Any])
    
    inline def setMoreButtonClicked(value: MoreButtonClickedEventArgs): Self = StObject.set(x, "moreButtonClicked", value.asInstanceOf[js.Any])
    
    inline def setSelectionChanged(value: EventArgs): Self = StObject.set(x, "selectionChanged", value.asInstanceOf[js.Any])
    
    inline def setSelectionChanging(value: EventArgs): Self = StObject.set(x, "selectionChanging", value.asInstanceOf[js.Any])
    
    inline def setShortcut(value: ShortcutEventArgs): Self = StObject.set(x, "shortcut", value.asInstanceOf[js.Any])
    
    inline def setVisibleIntervalChanged(value: EventArgs): Self = StObject.set(x, "visibleIntervalChanged", value.asInstanceOf[js.Any])
  }
}
