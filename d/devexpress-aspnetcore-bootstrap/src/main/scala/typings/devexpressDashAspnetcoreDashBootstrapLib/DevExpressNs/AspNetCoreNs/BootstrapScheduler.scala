package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DevExpress.AspNetCore.BootstrapScheduler")
@js.native
class BootstrapScheduler () extends Control {
  def appointmentFormCancel(): scala.Unit = js.native
  def appointmentFormDelete(): scala.Unit = js.native
  def appointmentFormSave(): scala.Unit = js.native
  def changeFormContainer(container: js.Any): scala.Unit = js.native
  def changePopupMenuContainer(container: js.Any): scala.Unit = js.native
  def changeTimeZoneId(timeZoneId: java.lang.String): scala.Unit = js.native
  def changeToolTipContainer(container: js.Any): scala.Unit = js.native
  def deleteAppointment(apt: BootstrapSchedulerAppointment): scala.Unit = js.native
  def deselectAppointmentById(aptId: js.Any): scala.Unit = js.native
  def getActiveViewType(): BootstrapSchedulerViewType = js.native
  def getAllDayAreaHeight(): scala.Double = js.native
  def getAppointmentById(id: js.Any): BootstrapSchedulerAppointment | scala.Null = js.native
  def getAppointmentProperties(aptId: scala.Double, propertyNames: js.Array[java.lang.String], onCallBack: js.Any): js.Array[java.lang.String] = js.native
  def getGroupType(): BootstrapSchedulerGroupType = js.native
  def getResourceNavigatorVisible(): scala.Boolean = js.native
  def getScrollAreaHeight(): scala.Double = js.native
  def getSelectedAppointmentIds(): js.Array[java.lang.String] = js.native
  def getSelectedInterval(): BootstrapTimeInterval | scala.Null = js.native
  def getSelectedResource(): java.lang.String = js.native
  def getToolbarVisible(): scala.Boolean = js.native
  def getTopRowTime(viewType: BootstrapSchedulerViewType): scala.Double = js.native
  def getVisibleAppointments(): js.Array[BootstrapSchedulerAppointment] = js.native
  def getVisibleIntervals(): js.Array[BootstrapTimeInterval] = js.native
  def goToDateFormApply(): scala.Unit = js.native
  def goToDateFormCancel(): scala.Unit = js.native
  def gotoDate(date: stdLib.Date): scala.Unit = js.native
  def gotoToday(): scala.Unit = js.native
  def hideLoadingPanel(): scala.Unit = js.native
  def inplaceEditFormCancel(): scala.Unit = js.native
  def inplaceEditFormSave(): scala.Unit = js.native
  def inplaceEditFormShowMore(): scala.Unit = js.native
  def insertAppointment(apt: BootstrapSchedulerAppointment): scala.Unit = js.native
  def navigateBackward(): scala.Unit = js.native
  def navigateForward(): scala.Unit = js.native
  @JSName("off")
  def off_activeViewChanged(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.activeViewChanged
  ): this.type = js.native
  @JSName("off")
  def off_activeViewChanged(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.activeViewChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_activeViewChanging(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.activeViewChanging
  ): this.type = js.native
  @JSName("off")
  def off_activeViewChanging(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.activeViewChanging,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ActiveViewChangingEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_appointmentClick(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.appointmentClick
  ): this.type = js.native
  @JSName("off")
  def off_appointmentClick(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.appointmentClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[AppointmentClickEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_appointmentDeleting(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.appointmentDeleting
  ): this.type = js.native
  @JSName("off")
  def off_appointmentDeleting(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.appointmentDeleting,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[AppointmentDeletingEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_appointmentDoubleClick(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.appointmentDoubleClick
  ): this.type = js.native
  @JSName("off")
  def off_appointmentDoubleClick(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.appointmentDoubleClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[AppointmentClickEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_appointmentDrag(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.appointmentDrag
  ): this.type = js.native
  @JSName("off")
  def off_appointmentDrag(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.appointmentDrag,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[AppointmentDragEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_appointmentDrop(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.appointmentDrop
  ): this.type = js.native
  @JSName("off")
  def off_appointmentDrop(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.appointmentDrop,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[AppointmentDropEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_appointmentResize(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.appointmentResize
  ): this.type = js.native
  @JSName("off")
  def off_appointmentResize(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.appointmentResize,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[AppointmentResizeEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_appointmentResizing(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.appointmentResizing
  ): this.type = js.native
  @JSName("off")
  def off_appointmentResizing(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.appointmentResizing,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[AppointmentResizingEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_appointmentToolTipShowing(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.appointmentToolTipShowing
  ): this.type = js.native
  @JSName("off")
  def off_appointmentToolTipShowing(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.appointmentToolTipShowing,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[AppointmentToolTipShowingEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_appointmentsSelectionChanged(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.appointmentsSelectionChanged
  ): this.type = js.native
  @JSName("off")
  def off_appointmentsSelectionChanged(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.appointmentsSelectionChanged,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[AppointmentsSelectionEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_beginCallback(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.beginCallback
  ): this.type = js.native
  @JSName("off")
  def off_beginCallback(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.beginCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BeginCallbackEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_callbackError(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.callbackError
  ): this.type = js.native
  @JSName("off")
  def off_callbackError(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.callbackError,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CallbackErrorEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_cellClick(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.cellClick
  ): this.type = js.native
  @JSName("off")
  def off_cellClick(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.cellClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CellClickEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_cellDoubleClick(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.cellDoubleClick
  ): this.type = js.native
  @JSName("off")
  def off_cellDoubleClick(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.cellDoubleClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CellClickEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_endCallback(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.endCallback
  ): this.type = js.native
  @JSName("off")
  def off_endCallback(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.endCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EndCallbackEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_menuItemClicked(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.menuItemClicked
  ): this.type = js.native
  @JSName("off")
  def off_menuItemClicked(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.menuItemClicked,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[MenuItemClickedEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_moreButtonClicked(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.moreButtonClicked
  ): this.type = js.native
  @JSName("off")
  def off_moreButtonClicked(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.moreButtonClicked,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[MoreButtonClickedEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_selectionChanged(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.selectionChanged
  ): this.type = js.native
  @JSName("off")
  def off_selectionChanged(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.selectionChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_selectionChanging(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.selectionChanging
  ): this.type = js.native
  @JSName("off")
  def off_selectionChanging(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.selectionChanging,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_shortcut(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.shortcut
  ): this.type = js.native
  @JSName("off")
  def off_shortcut(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.shortcut,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ShortcutEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_visibleIntervalChanged(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.visibleIntervalChanged
  ): this.type = js.native
  @JSName("off")
  def off_visibleIntervalChanged(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.visibleIntervalChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_activeViewChanged(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.activeViewChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_activeViewChanging(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.activeViewChanging,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ActiveViewChangingEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_appointmentClick(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.appointmentClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[AppointmentClickEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_appointmentDeleting(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.appointmentDeleting,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[AppointmentDeletingEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_appointmentDoubleClick(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.appointmentDoubleClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[AppointmentClickEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_appointmentDrag(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.appointmentDrag,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[AppointmentDragEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_appointmentDrop(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.appointmentDrop,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[AppointmentDropEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_appointmentResize(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.appointmentResize,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[AppointmentResizeEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_appointmentResizing(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.appointmentResizing,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[AppointmentResizingEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_appointmentToolTipShowing(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.appointmentToolTipShowing,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[AppointmentToolTipShowingEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_appointmentsSelectionChanged(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.appointmentsSelectionChanged,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[AppointmentsSelectionEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_beginCallback(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.beginCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BeginCallbackEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_callbackError(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.callbackError,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CallbackErrorEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_cellClick(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.cellClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CellClickEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_cellDoubleClick(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.cellDoubleClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CellClickEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_endCallback(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.endCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EndCallbackEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_menuItemClicked(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.menuItemClicked,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[MenuItemClickedEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_moreButtonClicked(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.moreButtonClicked,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[MoreButtonClickedEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_selectionChanged(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.selectionChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_selectionChanging(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.selectionChanging,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_shortcut(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.shortcut,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ShortcutEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_visibleIntervalChanged(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.visibleIntervalChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_activeViewChanged(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.activeViewChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_activeViewChanging(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.activeViewChanging,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ActiveViewChangingEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_appointmentClick(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.appointmentClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[AppointmentClickEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_appointmentDeleting(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.appointmentDeleting,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[AppointmentDeletingEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_appointmentDoubleClick(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.appointmentDoubleClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[AppointmentClickEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_appointmentDrag(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.appointmentDrag,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[AppointmentDragEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_appointmentDrop(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.appointmentDrop,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[AppointmentDropEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_appointmentResize(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.appointmentResize,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[AppointmentResizeEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_appointmentResizing(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.appointmentResizing,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[AppointmentResizingEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_appointmentToolTipShowing(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.appointmentToolTipShowing,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[AppointmentToolTipShowingEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_appointmentsSelectionChanged(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.appointmentsSelectionChanged,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[AppointmentsSelectionEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_beginCallback(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.beginCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BeginCallbackEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_callbackError(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.callbackError,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CallbackErrorEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_cellClick(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.cellClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CellClickEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_cellDoubleClick(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.cellDoubleClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CellClickEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_endCallback(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.endCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EndCallbackEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_menuItemClicked(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.menuItemClicked,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[MenuItemClickedEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_moreButtonClicked(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.moreButtonClicked,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[MoreButtonClickedEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_selectionChanged(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.selectionChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_selectionChanging(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.selectionChanging,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_shortcut(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.shortcut,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ShortcutEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_visibleIntervalChanged(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.visibleIntervalChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], scala.Unit]
  ): this.type = js.native
  def performCallback(parameter: java.lang.String): scala.Unit = js.native
  def refresh(): scala.Unit = js.native
  def refreshClientAppointmentProperties(
    clientAppointment: BootstrapSchedulerAppointment,
    propertyNames: js.Array[java.lang.String],
    onCallBack: js.Any
  ): scala.Unit = js.native
  def reminderFormCancel(): scala.Unit = js.native
  def reminderFormDismiss(): scala.Unit = js.native
  def reminderFormDismissAll(): scala.Unit = js.native
  def reminderFormSnooze(): scala.Unit = js.native
  def selectAppointmentById(aptId: js.Any): scala.Unit = js.native
  def selectAppointmentById(aptId: js.Any, scrollToSelection: scala.Boolean): scala.Unit = js.native
   // tslint:disable-line:unified-signatures
  def setActiveViewType(value: BootstrapSchedulerViewType): scala.Unit = js.native
  def setAllDayAreaHeight(height: scala.Double): scala.Unit = js.native
  def setGroupType(value: BootstrapSchedulerGroupType): scala.Unit = js.native
  def setResourceNavigatorVisible(visible: scala.Boolean): scala.Unit = js.native
  def setSelection(interval: BootstrapTimeInterval): scala.Unit = js.native
  def setSelection(interval: BootstrapTimeInterval, resourceId: java.lang.String): scala.Unit = js.native
   // tslint:disable-line:unified-signatures
  def setSelection(interval: BootstrapTimeInterval, resourceId: java.lang.String, scrollToSelection: scala.Boolean): scala.Unit = js.native
   // tslint:disable-line:unified-signatures
  def setToolbarVisible(visible: scala.Boolean): scala.Unit = js.native
  def setTopRowTime(duration: scala.Double): scala.Unit = js.native
  def setTopRowTime(duration: scala.Double, viewType: BootstrapSchedulerViewType): scala.Unit = js.native
   // tslint:disable-line:unified-signatures
  def setVisibleResources(resourceIds: js.Array[java.lang.String]): scala.Unit = js.native
  def showAppointmentFormByClientId(aptClientId: java.lang.String): scala.Unit = js.native
  def showAppointmentFormByServerId(aptServerId: java.lang.String): scala.Unit = js.native
  def showInplaceEditor(start: stdLib.Date, end: stdLib.Date): scala.Unit = js.native
  def showInplaceEditor(start: stdLib.Date, end: stdLib.Date, resourceId: java.lang.String): scala.Unit = js.native
   // tslint:disable-line:unified-signatures
  def showLoadingPanel(): scala.Unit = js.native
  def showSelectionToolTip(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def updateAppointment(apt: BootstrapSchedulerAppointment): scala.Unit = js.native
}

