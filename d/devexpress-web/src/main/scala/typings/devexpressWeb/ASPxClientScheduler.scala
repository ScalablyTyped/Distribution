package typings.devexpressWeb

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the ASPxScheduler control.
  */
@js.native
trait ASPxClientScheduler extends ASPxClientControl {
  /**
    * Client-side event. Occurs after the active view of the ASPxScheduler has been changed.
    */
  var ActiveViewChanged: ASPxClientEvent[ASPxClientEventHandler[ASPxClientScheduler]] = js.native
  /**
    * Occurs on the client side when the Scheduler control is about to change its active view.
    */
  var ActiveViewChanging: ASPxClientEvent[ActiveViewChangingEventHandler[ASPxClientScheduler]] = js.native
  /**
    * Occurs when the end-user clicks an appointment.
    */
  var AppointmentClick: ASPxClientEvent[AppointmentClickEventHandler[ASPxClientScheduler]] = js.native
  /**
    * Client-side event that fires before an appointment is deleted.
    */
  var AppointmentDeleting: ASPxClientEvent[ASPxClientAppointmentDeletingEventHandler[ASPxClientScheduler]] = js.native
  /**
    * Occurs when the end-user double clicks on an appointment.
    */
  var AppointmentDoubleClick: ASPxClientEvent[AppointmentClickEventHandler[ASPxClientScheduler]] = js.native
  /**
    * A client-side event that occurs when an appointment is being dragged.
    */
  var AppointmentDrag: ASPxClientEvent[AppointmentDragEventHandler[ASPxClientScheduler]] = js.native
  /**
    * Client-side event that occurs after an appointment has been dragged and dropped.
    */
  var AppointmentDrop: ASPxClientEvent[AppointmentDropEventHandler[ASPxClientScheduler]] = js.native
  /**
    * Client-side event that occurs when an appointment is resized.
    */
  var AppointmentResize: ASPxClientEvent[AppointmentResizeEventHandler[ASPxClientScheduler]] = js.native
  /**
    * A client-side event that occurs when an appointment is being resized.
    */
  var AppointmentResizing: ASPxClientEvent[AppointmentResizingEventHandler[ASPxClientScheduler]] = js.native
  /**
    * Fires on the client side before the appointment tooltip is shown.
    */
  var AppointmentToolTipShowing: ASPxClientEvent[ASPxClientAppointmentToolTipShowingEventHandler[ASPxClientScheduler]] = js.native
  /**
    * Occurs on the client side when the user selects an appointment.
    */
  var AppointmentsSelectionChanged: ASPxClientEvent[AppointmentsSelectionEventHandler[ASPxClientScheduler]] = js.native
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  var BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientScheduler]] = js.native
  /**
    * Fires on the client if any server error occurs during server-side processing of a callback sent by the ASPxClientScheduler.
    */
  var CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientScheduler]] = js.native
  /**
    * Occurs when an end-user clicks a time cell.
    */
  var CellClick: ASPxClientEvent[CellClickEventHandler[ASPxClientScheduler]] = js.native
  /**
    * Occurs when and end-user double-clicks a time cell.
    */
  var CellDoubleClick: ASPxClientEvent[CellClickEventHandler[ASPxClientScheduler]] = js.native
  /**
    * Occurs on the client side after a callback's server-side processing has been completed.
    */
  var EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientScheduler]] = js.native
  /**
    * Client-side event that occurs when a popup menu item is clicked.
    */
  var MenuItemClicked: ASPxClientEvent[MenuItemClickedEventHandler[ASPxClientScheduler]] = js.native
  /**
    * Occurs when one of  More Buttons is clicked.
    */
  var MoreButtonClicked: ASPxClientEvent[MoreButtonClickedEventHandler[ASPxClientScheduler]] = js.native
  /**
    * Fires on the client side when the time cell selection is changed.
    */
  var SelectionChanged: ASPxClientEvent[ASPxClientEventHandler[ASPxClientScheduler]] = js.native
  /**
    * Occurs on the client side when the time cell selection is about to change.
    */
  var SelectionChanging: ASPxClientEvent[ASPxClientEventHandler[ASPxClientScheduler]] = js.native
  /**
    * Occurs when an end-user presses a keyboard shortcut.
    */
  var Shortcut: ASPxClientEvent[ShortcutEventHandler[ASPxClientScheduler]] = js.native
  /**
    * Fires on the client side when the  time interval of the scheduling area is changed.
    */
  var VisibleIntervalChanged: ASPxClientEvent[ASPxClientEventHandler[ASPxClientScheduler]] = js.native
  /**
    * Client-side scripting method that cancels changes and closes the appointment editing form.
    */
  def AppointmentFormCancel(): Unit = js.native
  /**
    * Client-side scripting method that deletes the appointment being edited.
    */
  def AppointmentFormDelete(): Unit = js.native
  /**
    * Client-side scripting method that saves appointment modifications and closes the form.
    */
  def AppointmentFormSave(): Unit = js.native
  /**
    * Returns focus to the form if the ASPxScheduler control is not visible when the reminder fires.
    * @param container A DIV object that is located in such a way that it is visible on the page in situations when the ASPxScheduler control is hidden.
    */
  def ChangeFormContainer(container: js.Any): Unit = js.native
  /**
    * Changes the container that the ASPxScheduler pop-up menu belongs to.
    * @param container An object that serves as the new container for the pop-up menu.
    */
  def ChangePopupMenuContainer(container: js.Any): Unit = js.native
  /**
    * Client-side method which raises the callback command to change the SchedulerOptionsBehaviorBase.ClientTimeZoneId of the scheduler.
    * @param timeZoneId A string, a time zone identifier which is valid for the System.TimeZoneInfo.Id property.
    */
  def ChangeTimeZoneId(timeZoneId: String): Unit = js.native
  /**
    * Changes the container that the ASPxScheduler tooltip belongs to.
    * @param container An object that serves as the new container for the pop-up menu.
    */
  def ChangeToolTipContainer(container: js.Any): Unit = js.native
  /**
    * Client-side scripting  method to delete the specified appointment.
    * @param apt An ASPxClientAppointment object representing the client-side appointment.
    */
  def DeleteAppointment(apt: ASPxClientAppointment): Unit = js.native
  /**
    * Client-side function that removes the appointment specified by its client ID from a collection of selected appointments.
    * @param aptId An appointment's identifier.
    */
  def DeselectAppointmentById(aptId: String): Unit = js.native
  /**
    * Client-side scripting  method that gets the active View.
    */
  def GetActiveViewType(): ASPxSchedulerViewType = js.native
  /**
    * Gets the All-Day Area area height.
    */
  def GetAllDayAreaHeight(): Double = js.native
  /**
    * Client-side function that returns an appointment with the specified ID. An ASPxClientAppointment object, representing an appointment on the client.
    * @param id An appointment's identifier.
    */
  def GetAppointmentById(id: String): ASPxClientAppointment = js.native
  /**
    * Enables obtaining appointment property values in a client-side script. Executes the callback command with the SchedulerCallbackCommandId.AppointmentData identifier. An array of strings containing string representations of appointment properties.
    * @param aptId A string, representing the appointment ID.
    * @param propertyNames An array of strings, representing the appointment properties to query.
    * @param onCallBack A handler of a function which will receive and process the property values.
    */
  def GetAppointmentProperties(aptId: String, propertyNames: js.Array[String], onCallBack: js.Any): js.Array[String] = js.native
  /**
    * Returns the floating action button's object.
    */
  def GetFloatingActionButton(): ASPxClientFloatingActionButton = js.native
  /**
    * Client-side function that returns the type of grouping applied to the appointments displayed in the scheduler.
    */
  def GetGroupType(): ASPxSchedulerGroupType = js.native
  /**
    * Returns a value specifying whether the Resource Navigator is displayed.
    */
  def GetResourceNavigatorVisible(): Boolean = js.native
  /**
    * Returns the value specifying the Scheduler's scrollable area height.
    */
  def GetScrollAreaHeight(): Double = js.native
  /**
    * Client-side function that returns the id's of selected appointments.
    */
  def GetSelectedAppointmentIds(): js.Array[String] = js.native
  /**
    * Client-side function that returns the time interval, selected in the scheduler.
    */
  def GetSelectedInterval(): ASPxClientTimeInterval = js.native
  /**
    * Client-side function that returns the ResourceId of selected time cell's resource.
    */
  def GetSelectedResource(): String = js.native
  /**
    * Returns a value specifying whether a toolbar is displayed.
    */
  def GetToolbarVisible(): Boolean = js.native
  /**
    * Gets the time of the day corresponding to the start of the topmost displayed time cell row. An integer, representing the number of milliseconds passed since the start of the day.
    * @param viewType An ASPxSchedulerViewType enumeration member, representing the scheduler's View. It can be either "Day" or  "WorkWeek", otherwise the result is undefined.
    */
  def GetTopRowTime(): Double = js.native
  def GetTopRowTime(viewType: ASPxSchedulerViewType): Double = js.native
  /**
    * Gets a collection of visible appointments.
    */
  def GetVisibleAppointments(): js.Array[ASPxClientAppointment] = js.native
  /**
    * Client-side method that allows retrieving a collection of time intervals displayed by the ASPxScheduler.
    */
  def GetVisibleIntervals(): js.Array[ASPxClientTimeInterval] = js.native
  /**
    * Client-side scripting method that navigates the scheduler to the date selected in the GotoDate form and closes the form.
    */
  def GoToDateFormApply(): Unit = js.native
  /**
    * Client-side scripting method that cancels changes and closes the GotoDate form.
    */
  def GoToDateFormCancel(): Unit = js.native
  /**
    * Client-side scripting method which raises the SchedulerCallbackCommandId.GotoDate callback command.
    * @param date A DateTime value specifying the destination time.
    */
  def GotoDate(date: Date): Unit = js.native
  /**
    * Client-side method that navigates the scheduler to the current system date.
    */
  def GotoToday(): Unit = js.native
  /**
    * Client-side scripting method which hides the Loading Panel from view.
    */
  def HideLoadingPanel(): Unit = js.native
  /**
    * Client-side scripting method that cancels changes and closes the form.
    */
  def InplaceEditFormCancel(): Unit = js.native
  /**
    * Client-side scripting method that cancels changes and closes the form.
    */
  def InplaceEditFormSave(): Unit = js.native
  /**
    * Client-side scripting method that invokes the appointment editing form for the appointment being edited in the inplace editor.
    */
  def InplaceEditFormShowMore(): Unit = js.native
  /**
    * Client-side scripting  method to insert the specified appointment.
    * @param apt An ASPxClientAppointment object representing the client-side appointment.
    */
  def InsertAppointment(apt: ASPxClientAppointment): Unit = js.native
  /**
    * Client-side function which slides the visible interval one time span back.
    */
  def NavigateBackward(): Unit = js.native
  /**
    * Client-side function which slides the visible interval one time span forward.
    */
  def NavigateForward(): Unit = js.native
  /**
    * Sends a callback to the server and generates the server-side ASPxSchedulerDataWebControlBase.CustomCallback event, passing it the specified argument
    * @param parameter A string value that represents any information that needs to be sent to the server-side ASPxSchedulerDataWebControlBase.CustomCallback event.
    */
  def PerformCallback(parameter: String): Unit = js.native
  /**
    * Client-side scripting method which initiates a round trip to the server, so that the control will be reloaded using the specified refresh action.
    * @param refreshAction An ASPxClientSchedulerRefreshAction enumeration value, specifying the refresh action.
    */
  def Refresh(): Unit = js.native
  def Refresh(refreshAction: ASPxClientSchedulerRefreshAction): Unit = js.native
  /**
    * Initiates a callback to retrieve and apply the values for the specified list of properties to the specified appointment, and transfer control to the specified function.
    * @param clientAppointment An ASPxClientAppointment object that is the client appointment for which the data is retrieved.
    * @param propertyNames An array of strings, that are the names of appointment properties to query.
    * @param onCallBack A handler of a function executed after a callback.
    */
  def RefreshClientAppointmentProperties(clientAppointment: ASPxClientAppointment, propertyNames: js.Array[String], onCallBack: js.Any): Unit = js.native
  /**
    * Client-side scripting method that closes the Reminder form.
    */
  def ReminderFormCancel(): Unit = js.native
  /**
    * Client-side scripting method that calls the ReminderBase.Dismiss method for the selected reminder.
    */
  def ReminderFormDismiss(): Unit = js.native
  /**
    * Client-side scripting method that dismisses all reminders shown in the Reminder form.
    */
  def ReminderFormDismissAll(): Unit = js.native
  /**
    * Client-side scripting method that changes the alert time for the selected reminder to the specified interval.
    */
  def ReminderFormSnooze(): Unit = js.native
  /**
    * Selects the appointment with the specified ID.
    * @param aptId A string value specifying the appointment ID.
    * @param scrollToSelection true, to scroll to the selected appointment; otherwise, false.
    */
  def SelectAppointmentById(aptId: String): Unit = js.native
  def SelectAppointmentById(aptId: String, scrollToSelection: Boolean): Unit = js.native
  /**
    * Client-side scripting  method to change the ASPxScheduler's active View.
    * @param value A ASPxSchedulerViewType enumeration value, representing a view type to set.
    */
  def SetActiveViewType(value: ASPxSchedulerViewType): Unit = js.native
  /**
    * Specifies the All-Day Area area height.
    * @param height An integer value specifying the all-day area height.
    */
  def SetAllDayAreaHeight(height: Double): Unit = js.native
  /**
    * Client-side scripting method which raises the callback command to set the ASPxScheduler.GroupType.
    * @param value An ASPxSchedulerGroupType enumeration value, which specifies how appointments are grouped.
    */
  def SetGroupType(value: ASPxSchedulerGroupType): Unit = js.native
  /**
    * Specifies whether the Resource Navigator is visible.
    * @param visible true, to make the Resource Navigator visible; otherwise, false.
    */
  def SetResourceNavigatorVisible(visible: Boolean): Unit = js.native
  /**
    * Selects time cells which encompass the specified time interval on the client side.
    * @param interval Specifies the time interval to select.
    * @param resourceId Specifies the resource ID to which the specified time interval belongs.
    * @param scrollToSelection true, to scroll the scheduler content to make the selection visible; otherwise, false.
    */
  def SetSelection(interval: ASPxClientTimeInterval): Unit = js.native
  def SetSelection(interval: ASPxClientTimeInterval, resourceId: String): Unit = js.native
  def SetSelection(interval: ASPxClientTimeInterval, resourceId: String, scrollToSelection: Boolean): Unit = js.native
  /**
    * Specifies whether the toolbar is visible.
    * @param visible true, to make the toolbar visible; otherwise, false.
    */
  def SetToolbarVisible(visible: Boolean): Unit = js.native
  /**
    * Sets the time of the day corresponding to the start of the topmost displayed time cell row.
    * @param duration An integer, representing the number of milliseconds passed since the start of the day.
    * @param viewType An ASPxSchedulerViewType enumeration member, representing the scheduler's View. It can be either 'Day' or 'WorkWeek'.
    */
  def SetTopRowTime(duration: Double): Unit = js.native
  def SetTopRowTime(duration: Double, viewType: ASPxSchedulerViewType): Unit = js.native
  /**
    * Sets whether the resources with specified IDs are visible.
    * @param resourceIds An array of string values specifying the resources IDs.
    */
  def SetVisibleResources(resourceIds: js.Array[String]): Unit = js.native
  /**
    * Client-side function that invokes the editing form for the appointment specified by its client ID.
    * @param aptClientId A string, representing the appointment client identifier.
    */
  def ShowAppointmentFormByClientId(aptClientId: String): Unit = js.native
  /**
    * Client-side function that invokes the editing form for the appointment specified by its storage identifier.
    * @param aptServerId A string, representing the appointment identifier.
    */
  def ShowAppointmentFormByServerId(aptServerId: String): Unit = js.native
  /**
    * Client-side method that invokes the inplace editor form to create a new appointment.
    * @param start A date object, representing the start of the new appointment.
    * @param end A date object, representing the end of the new appointment.
    * @param resourceId An object representing the identifier of a resource associated with the new appointment.
    */
  def ShowInplaceEditor(start: Date, end: Date): Unit = js.native
  def ShowInplaceEditor(start: Date, end: Date, resourceId: String): Unit = js.native
  /**
    * Client-side scripting method which displays the Loading Panel.
    */
  def ShowLoadingPanel(): Unit = js.native
  /**
    * Displays a Selection ToolTip on a position given by the specified coordinates.
    * @param x An integer representing the X-coordinate.
    * @param y An integer representing the Y-coordinate.
    */
  def ShowSelectionToolTip(x: Double, y: Double): Unit = js.native
  /**
    * Client-side scripting  method to update the specified appointment.
    * @param apt An ASPxClientAppointment object representing the client-side appointment.
    */
  def UpdateAppointment(apt: ASPxClientAppointment): Unit = js.native
}

