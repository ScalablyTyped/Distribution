package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.activeViewChanged
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.activeViewChanging
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.appointmentClick
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.appointmentDeleting
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.appointmentDoubleClick
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.appointmentDrag
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.appointmentDrop
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.appointmentResize
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.appointmentResizing
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.appointmentToolTipShowing
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.appointmentsSelectionChanged
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.beginCallback
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.callbackError
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.cellClick
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.cellDoubleClick
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.endCallback
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.menuItemClicked
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.moreButtonClicked
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.selectionChanged
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.selectionChanging
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.shortcut
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.visibleIntervalChanged
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DevExpress.AspNetCore.BootstrapScheduler")
@js.native
class BootstrapScheduler () extends Control {
  def appointmentFormCancel(): Unit = js.native
  def appointmentFormDelete(): Unit = js.native
  def appointmentFormSave(): Unit = js.native
  def changeFormContainer(container: js.Any): Unit = js.native
  def changePopupMenuContainer(container: js.Any): Unit = js.native
  def changeTimeZoneId(timeZoneId: String): Unit = js.native
  def changeToolTipContainer(container: js.Any): Unit = js.native
  def deleteAppointment(apt: BootstrapSchedulerAppointment): Unit = js.native
  def deselectAppointmentById(aptId: js.Any): Unit = js.native
  def getActiveViewType(): BootstrapSchedulerViewType = js.native
  def getAllDayAreaHeight(): Double = js.native
  def getAppointmentById(id: js.Any): BootstrapSchedulerAppointment | Null = js.native
  def getAppointmentProperties(aptId: Double, propertyNames: js.Array[String], onCallBack: js.Any): js.Array[String] = js.native
  def getGroupType(): BootstrapSchedulerGroupType = js.native
  def getResourceNavigatorVisible(): Boolean = js.native
  def getScrollAreaHeight(): Double = js.native
  def getSelectedAppointmentIds(): js.Array[String] = js.native
  def getSelectedInterval(): BootstrapTimeInterval | Null = js.native
  def getSelectedResource(): String = js.native
  def getToolbarVisible(): Boolean = js.native
  def getTopRowTime(viewType: BootstrapSchedulerViewType): Double = js.native
  def getVisibleAppointments(): js.Array[BootstrapSchedulerAppointment] = js.native
  def getVisibleIntervals(): js.Array[BootstrapTimeInterval] = js.native
  def goToDateFormApply(): Unit = js.native
  def goToDateFormCancel(): Unit = js.native
  def gotoDate(date: Date): Unit = js.native
  def gotoToday(): Unit = js.native
  def hideLoadingPanel(): Unit = js.native
  def inplaceEditFormCancel(): Unit = js.native
  def inplaceEditFormSave(): Unit = js.native
  def inplaceEditFormShowMore(): Unit = js.native
  def insertAppointment(apt: BootstrapSchedulerAppointment): Unit = js.native
  def navigateBackward(): Unit = js.native
  def navigateForward(): Unit = js.native
  @JSName("off")
  def off_activeViewChanged(eventName: activeViewChanged): this.type = js.native
  @JSName("off")
  def off_activeViewChanged(
    eventName: activeViewChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_activeViewChanging(eventName: activeViewChanging): this.type = js.native
  @JSName("off")
  def off_activeViewChanging(
    eventName: activeViewChanging,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ActiveViewChangingEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_appointmentClick(eventName: appointmentClick): this.type = js.native
  @JSName("off")
  def off_appointmentClick(
    eventName: appointmentClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[AppointmentClickEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_appointmentDeleting(eventName: appointmentDeleting): this.type = js.native
  @JSName("off")
  def off_appointmentDeleting(
    eventName: appointmentDeleting,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[AppointmentDeletingEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_appointmentDoubleClick(eventName: appointmentDoubleClick): this.type = js.native
  @JSName("off")
  def off_appointmentDoubleClick(
    eventName: appointmentDoubleClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[AppointmentClickEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_appointmentDrag(eventName: appointmentDrag): this.type = js.native
  @JSName("off")
  def off_appointmentDrag(
    eventName: appointmentDrag,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[AppointmentDragEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_appointmentDrop(eventName: appointmentDrop): this.type = js.native
  @JSName("off")
  def off_appointmentDrop(
    eventName: appointmentDrop,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[AppointmentDropEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_appointmentResize(eventName: appointmentResize): this.type = js.native
  @JSName("off")
  def off_appointmentResize(
    eventName: appointmentResize,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[AppointmentResizeEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_appointmentResizing(eventName: appointmentResizing): this.type = js.native
  @JSName("off")
  def off_appointmentResizing(
    eventName: appointmentResizing,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[AppointmentResizingEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_appointmentToolTipShowing(eventName: appointmentToolTipShowing): this.type = js.native
  @JSName("off")
  def off_appointmentToolTipShowing(
    eventName: appointmentToolTipShowing,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[AppointmentToolTipShowingEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_appointmentsSelectionChanged(eventName: appointmentsSelectionChanged): this.type = js.native
  @JSName("off")
  def off_appointmentsSelectionChanged(
    eventName: appointmentsSelectionChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[AppointmentsSelectionEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_beginCallback(eventName: beginCallback): this.type = js.native
  @JSName("off")
  def off_beginCallback(
    eventName: beginCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BeginCallbackEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_callbackError(eventName: callbackError): this.type = js.native
  @JSName("off")
  def off_callbackError(
    eventName: callbackError,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CallbackErrorEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_cellClick(eventName: cellClick): this.type = js.native
  @JSName("off")
  def off_cellClick(
    eventName: cellClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CellClickEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_cellDoubleClick(eventName: cellDoubleClick): this.type = js.native
  @JSName("off")
  def off_cellDoubleClick(
    eventName: cellDoubleClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CellClickEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_endCallback(eventName: endCallback): this.type = js.native
  @JSName("off")
  def off_endCallback(
    eventName: endCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EndCallbackEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_menuItemClicked(eventName: menuItemClicked): this.type = js.native
  @JSName("off")
  def off_menuItemClicked(
    eventName: menuItemClicked,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[MenuItemClickedEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_moreButtonClicked(eventName: moreButtonClicked): this.type = js.native
  @JSName("off")
  def off_moreButtonClicked(
    eventName: moreButtonClicked,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[MoreButtonClickedEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_selectionChanged(eventName: selectionChanged): this.type = js.native
  @JSName("off")
  def off_selectionChanged(
    eventName: selectionChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_selectionChanging(eventName: selectionChanging): this.type = js.native
  @JSName("off")
  def off_selectionChanging(
    eventName: selectionChanging,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_shortcut(eventName: shortcut): this.type = js.native
  @JSName("off")
  def off_shortcut(
    eventName: shortcut,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ShortcutEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_visibleIntervalChanged(eventName: visibleIntervalChanged): this.type = js.native
  @JSName("off")
  def off_visibleIntervalChanged(
    eventName: visibleIntervalChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_activeViewChanged(
    eventName: activeViewChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_activeViewChanging(
    eventName: activeViewChanging,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ActiveViewChangingEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_appointmentClick(
    eventName: appointmentClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[AppointmentClickEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_appointmentDeleting(
    eventName: appointmentDeleting,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[AppointmentDeletingEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_appointmentDoubleClick(
    eventName: appointmentDoubleClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[AppointmentClickEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_appointmentDrag(
    eventName: appointmentDrag,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[AppointmentDragEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_appointmentDrop(
    eventName: appointmentDrop,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[AppointmentDropEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_appointmentResize(
    eventName: appointmentResize,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[AppointmentResizeEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_appointmentResizing(
    eventName: appointmentResizing,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[AppointmentResizingEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_appointmentToolTipShowing(
    eventName: appointmentToolTipShowing,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[AppointmentToolTipShowingEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_appointmentsSelectionChanged(
    eventName: appointmentsSelectionChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[AppointmentsSelectionEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_beginCallback(
    eventName: beginCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BeginCallbackEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_callbackError(
    eventName: callbackError,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CallbackErrorEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_cellClick(
    eventName: cellClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CellClickEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_cellDoubleClick(
    eventName: cellDoubleClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CellClickEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_endCallback(
    eventName: endCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EndCallbackEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_menuItemClicked(
    eventName: menuItemClicked,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[MenuItemClickedEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_moreButtonClicked(
    eventName: moreButtonClicked,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[MoreButtonClickedEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_selectionChanged(
    eventName: selectionChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_selectionChanging(
    eventName: selectionChanging,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_shortcut(
    eventName: shortcut,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ShortcutEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_visibleIntervalChanged(
    eventName: visibleIntervalChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_activeViewChanged(
    eventName: activeViewChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_activeViewChanging(
    eventName: activeViewChanging,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ActiveViewChangingEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_appointmentClick(
    eventName: appointmentClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[AppointmentClickEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_appointmentDeleting(
    eventName: appointmentDeleting,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[AppointmentDeletingEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_appointmentDoubleClick(
    eventName: appointmentDoubleClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[AppointmentClickEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_appointmentDrag(
    eventName: appointmentDrag,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[AppointmentDragEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_appointmentDrop(
    eventName: appointmentDrop,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[AppointmentDropEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_appointmentResize(
    eventName: appointmentResize,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[AppointmentResizeEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_appointmentResizing(
    eventName: appointmentResizing,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[AppointmentResizingEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_appointmentToolTipShowing(
    eventName: appointmentToolTipShowing,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[AppointmentToolTipShowingEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_appointmentsSelectionChanged(
    eventName: appointmentsSelectionChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[AppointmentsSelectionEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_beginCallback(
    eventName: beginCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BeginCallbackEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_callbackError(
    eventName: callbackError,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CallbackErrorEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_cellClick(
    eventName: cellClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CellClickEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_cellDoubleClick(
    eventName: cellDoubleClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CellClickEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_endCallback(
    eventName: endCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EndCallbackEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_menuItemClicked(
    eventName: menuItemClicked,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[MenuItemClickedEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_moreButtonClicked(
    eventName: moreButtonClicked,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[MoreButtonClickedEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_selectionChanged(
    eventName: selectionChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_selectionChanging(
    eventName: selectionChanging,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_shortcut(
    eventName: shortcut,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ShortcutEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_visibleIntervalChanged(
    eventName: visibleIntervalChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], Unit]
  ): this.type = js.native
  def performCallback(parameter: String): Unit = js.native
  def refresh(): Unit = js.native
  def refreshClientAppointmentProperties(
    clientAppointment: BootstrapSchedulerAppointment,
    propertyNames: js.Array[String],
    onCallBack: js.Any
  ): Unit = js.native
  def reminderFormCancel(): Unit = js.native
  def reminderFormDismiss(): Unit = js.native
  def reminderFormDismissAll(): Unit = js.native
  def reminderFormSnooze(): Unit = js.native
  def selectAppointmentById(aptId: js.Any): Unit = js.native
  def selectAppointmentById(aptId: js.Any, scrollToSelection: Boolean): Unit = js.native
   // tslint:disable-line:unified-signatures
  def setActiveViewType(value: BootstrapSchedulerViewType): Unit = js.native
  def setAllDayAreaHeight(height: Double): Unit = js.native
  def setGroupType(value: BootstrapSchedulerGroupType): Unit = js.native
  def setResourceNavigatorVisible(visible: Boolean): Unit = js.native
  def setSelection(interval: BootstrapTimeInterval): Unit = js.native
  def setSelection(interval: BootstrapTimeInterval, resourceId: String): Unit = js.native
   // tslint:disable-line:unified-signatures
  def setSelection(interval: BootstrapTimeInterval, resourceId: String, scrollToSelection: Boolean): Unit = js.native
   // tslint:disable-line:unified-signatures
  def setToolbarVisible(visible: Boolean): Unit = js.native
  def setTopRowTime(duration: Double): Unit = js.native
  def setTopRowTime(duration: Double, viewType: BootstrapSchedulerViewType): Unit = js.native
   // tslint:disable-line:unified-signatures
  def setVisibleResources(resourceIds: js.Array[String]): Unit = js.native
  def showAppointmentFormByClientId(aptClientId: String): Unit = js.native
  def showAppointmentFormByServerId(aptServerId: String): Unit = js.native
  def showInplaceEditor(start: Date, end: Date): Unit = js.native
  def showInplaceEditor(start: Date, end: Date, resourceId: String): Unit = js.native
   // tslint:disable-line:unified-signatures
  def showLoadingPanel(): Unit = js.native
  def showSelectionToolTip(x: Double, y: Double): Unit = js.native
  def updateAppointment(apt: BootstrapSchedulerAppointment): Unit = js.native
}

