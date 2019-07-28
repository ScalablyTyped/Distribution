package typings.ejDotWebDotAll.ejNs.ScheduleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Triggers on the beginning of every action that starts within the Schedule.
    */
  var actionBegin: js.UndefOr[js.Function1[/* e */ ActionBeginEventArgs, Unit]] = js.undefined
  /** Triggers after the completion of every action within the Schedule.
    */
  var actionComplete: js.UndefOr[js.Function1[/* e */ ActionCompleteEventArgs, Unit]] = js.undefined
  /** Sets the week to display more than one week appointment summary.
    */
  var agendaViewSettings: js.UndefOr[AgendaViewSettings] = js.undefined
  /** Accepts the id value of the template layout defined for the all-day cells and customizes it.
    * @Default {null}
    */
  var allDayCellsTemplateId: js.UndefOr[String] = js.undefined
  /** When set to false, disables the appointment delete option on the Scheduler.
    * @Default {true}
    */
  var allowDelete: js.UndefOr[Boolean] = js.undefined
  /** When set to true, Schedule allows the appointments to be dragged and dropped at required time.
    * @Default {true}
    */
  var allowDragAndDrop: js.UndefOr[Boolean] = js.undefined
  /** When set to true, allows the user to create/edit appointments inline - simply through a single click made either on the Scheduler cells or on the existing appointmentâ€™s Subject
    * text respectively. Pressing enter key after the new Subject text   typed onto the inline created text box, will save/update the appointments appropriately.
    * @Default {false}
    */
  var allowInline: js.UndefOr[Boolean] = js.undefined
  /** When set to true, Scheduler allows interaction through keyboard shortcut keys.
    * @Default {true}
    */
  var allowKeyboardNavigation: js.UndefOr[Boolean] = js.undefined
  /** Triggers after an existing appointment is edited.
    */
  var appointmentChanged: js.UndefOr[js.Function1[/* e */ AppointmentChangedEventArgs, Unit]] = js.undefined
  /** Triggers after an appointment is clicked.
    */
  var appointmentClick: js.UndefOr[js.Function1[/* e */ AppointmentClickEventArgs, Unit]] = js.undefined
  /** Triggers after the new appointment is saved.
    */
  var appointmentCreated: js.UndefOr[js.Function1[/* e */ AppointmentCreatedEventArgs, Unit]] = js.undefined
  /** Allows setting draggable area for the Scheduler appointments. Also, turns on the external drag and drop, when set with some specific external drag area name.
    */
  var appointmentDragArea: js.UndefOr[String] = js.undefined
  /** Triggers on hovering the mouse over the appointments.
    */
  var appointmentHover: js.UndefOr[js.Function1[/* e */ AppointmentHoverEventArgs, Unit]] = js.undefined
  /** Triggers after the appointment is deleted.
    */
  var appointmentRemoved: js.UndefOr[js.Function1[/* e */ AppointmentRemovedEventArgs, Unit]] = js.undefined
  /** It includes the dataSource option and the fields related to Schedule appointments. The appointment fields within the appointmentSettings can accept both string and object type
    * values. To apply validation rules on the appointment window fields, then the appointment fields needs to be defined with object type values.
    */
  var appointmentSettings: js.UndefOr[AppointmentSettings] = js.undefined
  /** Template design that applies on the Schedule appointments. All the field names that are mapped from dataSource to the appropriate field properties within the appointmentSettings
    * can be used within the template.
    * @Default {null}
    */
  var appointmentTemplateId: js.UndefOr[String] = js.undefined
  /** Triggers before the appointment window opens.
    */
  var appointmentWindowOpen: js.UndefOr[js.Function1[/* e */ AppointmentWindowOpenEventArgs, Unit]] = js.undefined
  /** Triggers before the edited appointment is being saved.
    */
  var beforeAppointmentChange: js.UndefOr[js.Function1[/* e */ BeforeAppointmentChangeEventArgs, Unit]] = js.undefined
  /** Triggers before the new appointment gets saved.
    */
  var beforeAppointmentCreate: js.UndefOr[js.Function1[/* e */ BeforeAppointmentCreateEventArgs, Unit]] = js.undefined
  /** Triggers before the appointment is being removed from the Scheduler.
    */
  var beforeAppointmentRemove: js.UndefOr[js.Function1[/* e */ BeforeAppointmentRemoveEventArgs, Unit]] = js.undefined
  /** Triggers before the context menu opens.
    */
  var beforeContextMenuOpen: js.UndefOr[js.Function1[/* e */ BeforeContextMenuOpenEventArgs, Unit]] = js.undefined
  /** Blocks the user-specific time interval on the Scheduler, so that no appointments can be created on that particular time slots. It includes the dataSource option and also the
    * fields related to block intervals.
    */
  var blockoutSettings: js.UndefOr[BlockoutSettings] = js.undefined
  /** Sets various categorize colors to the Schedule appointments to differentiate it.
    */
  var categorizeSettings: js.UndefOr[CategorizeSettings] = js.undefined
  /** Triggers after the cell is clicked.
    */
  var cellClick: js.UndefOr[js.Function1[/* e */ CellClickEventArgs, Unit]] = js.undefined
  /** Triggers after the cell is clicked twice.
    */
  var cellDoubleClick: js.UndefOr[js.Function1[/* e */ CellDoubleClickEventArgs, Unit]] = js.undefined
  /** Sets the height for Schedule cells.
    * @Default {20px}
    */
  var cellHeight: js.UndefOr[String] = js.undefined
  /** Triggers on hovering the mouse overs the cells.
    */
  var cellHover: js.UndefOr[js.Function1[/* e */ CellHoverEventArgs, Unit]] = js.undefined
  /** Sets the width for Schedule cells.
    */
  var cellWidth: js.UndefOr[String] = js.undefined
  /** Holds all options related to the context menu settings of Scheduler.
    */
  var contextMenuSettings: js.UndefOr[ContextMenuSettings] = js.undefined
  /** Triggers when the Scheduler completely renders on the page.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.undefined
  /** Accepts the custom CSS class name that defines specific user-defined styles and themes to be applied for partial or complete elements of the Schedule.
    */
  var cssClass: js.UndefOr[String] = js.undefined
  /** Sets current date of the Schedule. The Schedule displays initially with the date that is provided here.
    * @Default {new Date()}
    */
  var currentDate: js.UndefOr[js.Any] = js.undefined
  /** Sets current view of the Schedule. Schedule renders initially with the view that is specified here. The available views are day, week, workweek, month, agenda and custom view -
    * from which any one of the required view can be set to the Schedule. It accepts both string or enum values. The enum values that are accepted by
    * currentView(ej.Schedule.CurrentView) are as follows,
    * @Default {ej.Schedule.CurrentView.Week}
    */
  var currentView: js.UndefOr[String | CurrentView] = js.undefined
  /** Sets the date format for Schedule.
    */
  var dateFormat: js.UndefOr[String] = js.undefined
  /** Accepts the id value of the template layout defined for the date header cells and customizes it.
    * @Default {null}
    */
  var dateHeaderTemplateId: js.UndefOr[String] = js.undefined
  /** Triggers when the Scheduler and all its sub-components gets destroyed.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.undefined
  /** Triggers while the appointment is being dragged over the work cells.
    */
  var drag: js.UndefOr[js.Function1[/* e */ DragEventArgs, Unit]] = js.undefined
  /** Triggers when the appointment dragging begins.
    */
  var dragStart: js.UndefOr[js.Function1[/* e */ DragStartEventArgs, Unit]] = js.undefined
  /** Triggers when the appointment is dropped.
    */
  var dragStop: js.UndefOr[js.Function1[/* e */ DragStopEventArgs, Unit]] = js.undefined
  /** When set to true, enables the resize behavior of appointments within the Schedule.
    * @Default {true}
    */
  var enableAppointmentResize: js.UndefOr[Boolean] = js.undefined
  /** When set to true, enables the loading of Schedule appointments based on your demand. With this load on demand concept, the data consumption of the Schedule can be limited.
    * @Default {false}
    */
  var enableLoadOnDemand: js.UndefOr[Boolean] = js.undefined
  /** Saves the current model value to browser cookies for state maintenance. When the page gets refreshed, Schedule control values are retained.
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[Boolean] = js.undefined
  /** When set to true, the Schedule layout and behavior changes as per the common RTL conventions.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.undefined
  /** When set to true, Schedule allows the validation of recurrence pattern to take place before it is being assigned to the appointments. For example, when one of the instance of
    * recurrence appointment is dragged beyond the next or previous instance of the same recurrence appointment, a pop-up is displayed with the validation message disallowing the drag
    * functionality.
    * @Default {true}
    */
  var enableRecurrenceValidation: js.UndefOr[Boolean] = js.undefined
  /** Sets the end hour time limit to be displayed on the Schedule.
    * @Default {24}
    */
  var endHour: js.UndefOr[Double] = js.undefined
  /** Sets specific day as the starting day of the week.
    * @Default {null}
    */
  var firstDayOfWeek: js.UndefOr[String] = js.undefined
  /** To configure resource grouping on the Schedule.
    */
  var group: js.UndefOr[Group] = js.undefined
  /** Sets the height of the Schedule. Accepts both pixel and percentage values.
    * @Default {1120px}
    */
  var height: js.UndefOr[String] = js.undefined
  /** When set to true, enables the Schedule to observe Daylight Saving Time for supported timezones.
    * @Default {false}
    */
  var isDST: js.UndefOr[Boolean] = js.undefined
  /** When set to true, adapts the Schedule layout to fit the screen size of devices on which it renders.
    * @Default {true}
    */
  var isResponsive: js.UndefOr[Boolean] = js.undefined
  /** Triggers when any of the keyboard keys are pressed.
    */
  var keyDown: js.UndefOr[js.Function1[/* e */ KeyDownEventArgs, Unit]] = js.undefined
  /** Sets the specific culture to the Schedule.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.undefined
  /** Sets the maximum date limit to display on the Schedule. Setting maxDate with specific date value disallows the Schedule to navigate beyond that date.
    * @Default {new Date(2099, 12, 31)}
    */
  var maxDate: js.UndefOr[js.Any] = js.undefined
  /** Triggers after the menu/sub-menu items within the context menu is clicked.
    */
  var menuItemClick: js.UndefOr[js.Function1[/* e */ MenuItemClickEventArgs, Unit]] = js.undefined
  /** Sets the minimum date limit to display on the Schedule. Setting minDate with specific date value disallows the Schedule to navigate beyond that date.
    * @Default {new Date(1900, 01, 01)}
    */
  var minDate: js.UndefOr[js.Any] = js.undefined
  /** Triggers after the Schedule view or date is navigated.
    */
  var navigation: js.UndefOr[js.Function1[/* e */ NavigationEventArgs, Unit]] = js.undefined
  /** Sets the mode of Schedule rendering either in a vertical or horizontal direction. It accepts either string(&quot;vertical&quot; or &quot;horizontal&quot;) or enum values. The enum
    * values that are accepted by orientation(ej.Schedule.Orientation) are as follows,
    * @Default {ej.Schedule.Orientation.Vertical}
    */
  var orientation: js.UndefOr[String | typings.ejDotWebDotAll.ejNs.ScheduleNs.Orientation] = js.undefined
  /** Triggers when the overflow button is clicked.
    */
  var overflowButtonClick: js.UndefOr[js.Function1[/* e */ OverflowButtonClickEventArgs, Unit]] = js.undefined
  /** Triggers while mouse hovering on the overflow button.
    */
  var overflowButtonHover: js.UndefOr[js.Function1[/* e */ OverflowButtonHoverEventArgs, Unit]] = js.undefined
  /** Holds all the options related to priority settings of the Schedule.
    */
  var prioritySettings: js.UndefOr[PrioritySettings] = js.undefined
  /** Triggers every time before the elements of the scheduler such as work cells, time cells or header cells and so on renders or re-renders on a page.
    */
  var queryCellInfo: js.UndefOr[js.Function1[/* e */ QueryCellInfoEventArgs, Unit]] = js.undefined
  /** When set to true, disables the interaction with the Schedule appointments, simply allowing the date and view navigation to occur.
    * @Default {false}
    */
  var readOnly: js.UndefOr[Boolean] = js.undefined
  /** Triggers when the reminder is raised for an appointment based on the alertBefore value.
    */
  var reminder: js.UndefOr[js.Function1[/* e */ ReminderEventArgs, Unit]] = js.undefined
  /** Holds all the options related to reminder settings of the Schedule.
    */
  var reminderSettings: js.UndefOr[ReminderSettings] = js.undefined
  /** Defines the specific start and end dates to be rendered in the Schedule control. To render such user-specified custom date ranges in the Schedule control, set the currentView
    * property to ej.Schedule.CurrentView.CustomView.
    * @Default {null}
    */
  var renderDates: js.UndefOr[RenderDates] = js.undefined
  /** Triggers while resizing the appointment.
    */
  var resize: js.UndefOr[js.Function1[/* e */ ResizeEventArgs, Unit]] = js.undefined
  /** Triggers when the appointment resizing begins.
    */
  var resizeStart: js.UndefOr[js.Function1[/* e */ ResizeStartEventArgs, Unit]] = js.undefined
  /** Triggers when an appointment resizing stops.
    */
  var resizeStop: js.UndefOr[js.Function1[/* e */ ResizeStopEventArgs, Unit]] = js.undefined
  /** Template design that applies on the Schedule resource header.
    * @Default {null}
    */
  var resourceHeaderTemplateId: js.UndefOr[String] = js.undefined
  /** Holds all the options related to the resources settings of the Schedule. It is a collection of one or more resource objects, where the levels of resources are rendered on the
    * Schedule based on the order of the resource data provided within this collection.
    * @Default {null}
    */
  var resources: js.UndefOr[js.Array[Resource]] = js.undefined
  /** When set to true, displays the all-day row cells on the Schedule.
    * @Default {true}
    */
  var showAllDayRow: js.UndefOr[Boolean] = js.undefined
  /** When set to true, shows the previous/next appointment navigator button on the Scheduler.
    * @Default {true}
    */
  var showAppointmentNavigator: js.UndefOr[Boolean] = js.undefined
  /** When set to true, displays the current time indicator on the Schedule.
    * @Default {true}
    */
  var showCurrentTimeIndicator: js.UndefOr[Boolean] = js.undefined
  /** When set to true, shows the delete confirmation dialog before deleting an appointment.
    * @Default {true}
    */
  var showDeleteConfirmationDialog: js.UndefOr[Boolean] = js.undefined
  /** When set to true, displays the header bar on the Schedule.
    * @Default {true}
    */
  var showHeaderBar: js.UndefOr[Boolean] = js.undefined
  /** When set to true, displays the location field additionally on Schedule appointment window.
    * @Default {false}
    */
  var showLocationField: js.UndefOr[Boolean] = js.undefined
  /** When set to true, displays the other months days from the current month on the Schedule.
    * @Default {true}
    */
  var showNextPrevMonth: js.UndefOr[Boolean] = js.undefined
  /** when set to false, allows the height of the work-cells to adjust automatically (either expand or collapse) based on the number of appointment count it has.
    * @Default {true}
    */
  var showOverflowButton: js.UndefOr[Boolean] = js.undefined
  /** When set to true, displays the quick window for every single click made on the Schedule cells or appointments.
    * @Default {true}
    */
  var showQuickWindow: js.UndefOr[Boolean] = js.undefined
  /** When set to false, doesn't render the start and end timezone fields on the Schedule appointment window.
    * @Default {true}
    */
  var showTimeZoneFields: js.UndefOr[Boolean] = js.undefined
  /** When set to false, hides the weekend days on all the Scheduler views.
    * @Default {true}
    */
  var showWeekend: js.UndefOr[Boolean] = js.undefined
  /** Sets the start hour time range to be displayed on the Schedule.
    * @Default {0}
    */
  var startHour: js.UndefOr[Double] = js.undefined
  /** Sets either 12 or 24 hour time mode on the Schedule. It accepts either the string value(&quot;12&quot; or &quot;24&quot;) or the below mentioned enum values. The enum values that
    * are accepted by timeMode(ej.Schedule.TimeMode) are as follows,
    * @Default {null}
    */
  var timeMode: js.UndefOr[String | TimeMode] = js.undefined
  /** Holds all the options related to the time scale of Scheduler. The timeslots either major or minor slots can be customized with this property.
    */
  var timeScale: js.UndefOr[TimeScale] = js.undefined
  /** Sets the timezone for the Schedule.
    * @Default {null}
    */
  var timeZone: js.UndefOr[String] = js.undefined
  /** Sets the collection of timezone items to be bound to the Schedule. Only the items bound to this property gets listed out in the timezone field of the appointment window.
    */
  var timeZoneCollection: js.UndefOr[TimeZoneCollection] = js.undefined
  /** Allows to pop-up appointment details in a tooltip while hovering over the appointments.
    */
  var tooltipSettings: js.UndefOr[TooltipSettings] = js.undefined
  /** Defines the view collection to be displayed on the Schedule. By default, it displays all the views namely, Day, Week, WorkWeek and Month.
    * @Default {[Day, Week, WorkWeek, Month, Agenda]}
    */
  var views: js.UndefOr[js.Array[_]] = js.undefined
  /** Sets the width of the Schedule. Accepts both pixel and percentage values.
    * @Default {100%}
    */
  var width: js.UndefOr[String] = js.undefined
  /** Accepts the id value of the template layout defined for the work cells and month cells.
    * @Default {null}
    */
  var workCellsTemplateId: js.UndefOr[String] = js.undefined
  /** To define the work hours within the Schedule control.
    */
  var workHours: js.UndefOr[WorkHours] = js.undefined
  /** Sets different day collection within workWeek view.
    * @Default {[Monday, Tuesday, Wednesday, Thursday, Friday]}
    */
  var workWeek: js.UndefOr[js.Array[_]] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    actionBegin: /* e */ ActionBeginEventArgs => Unit = null,
    actionComplete: /* e */ ActionCompleteEventArgs => Unit = null,
    agendaViewSettings: AgendaViewSettings = null,
    allDayCellsTemplateId: String = null,
    allowDelete: js.UndefOr[Boolean] = js.undefined,
    allowDragAndDrop: js.UndefOr[Boolean] = js.undefined,
    allowInline: js.UndefOr[Boolean] = js.undefined,
    allowKeyboardNavigation: js.UndefOr[Boolean] = js.undefined,
    appointmentChanged: /* e */ AppointmentChangedEventArgs => Unit = null,
    appointmentClick: /* e */ AppointmentClickEventArgs => Unit = null,
    appointmentCreated: /* e */ AppointmentCreatedEventArgs => Unit = null,
    appointmentDragArea: String = null,
    appointmentHover: /* e */ AppointmentHoverEventArgs => Unit = null,
    appointmentRemoved: /* e */ AppointmentRemovedEventArgs => Unit = null,
    appointmentSettings: AppointmentSettings = null,
    appointmentTemplateId: String = null,
    appointmentWindowOpen: /* e */ AppointmentWindowOpenEventArgs => Unit = null,
    beforeAppointmentChange: /* e */ BeforeAppointmentChangeEventArgs => Unit = null,
    beforeAppointmentCreate: /* e */ BeforeAppointmentCreateEventArgs => Unit = null,
    beforeAppointmentRemove: /* e */ BeforeAppointmentRemoveEventArgs => Unit = null,
    beforeContextMenuOpen: /* e */ BeforeContextMenuOpenEventArgs => Unit = null,
    blockoutSettings: BlockoutSettings = null,
    categorizeSettings: CategorizeSettings = null,
    cellClick: /* e */ CellClickEventArgs => Unit = null,
    cellDoubleClick: /* e */ CellDoubleClickEventArgs => Unit = null,
    cellHeight: String = null,
    cellHover: /* e */ CellHoverEventArgs => Unit = null,
    cellWidth: String = null,
    contextMenuSettings: ContextMenuSettings = null,
    create: /* e */ CreateEventArgs => Unit = null,
    cssClass: String = null,
    currentDate: js.Any = null,
    currentView: String | CurrentView = null,
    dateFormat: String = null,
    dateHeaderTemplateId: String = null,
    destroy: /* e */ DestroyEventArgs => Unit = null,
    drag: /* e */ DragEventArgs => Unit = null,
    dragStart: /* e */ DragStartEventArgs => Unit = null,
    dragStop: /* e */ DragStopEventArgs => Unit = null,
    enableAppointmentResize: js.UndefOr[Boolean] = js.undefined,
    enableLoadOnDemand: js.UndefOr[Boolean] = js.undefined,
    enablePersistence: js.UndefOr[Boolean] = js.undefined,
    enableRTL: js.UndefOr[Boolean] = js.undefined,
    enableRecurrenceValidation: js.UndefOr[Boolean] = js.undefined,
    endHour: Int | Double = null,
    firstDayOfWeek: String = null,
    group: Group = null,
    height: String = null,
    isDST: js.UndefOr[Boolean] = js.undefined,
    isResponsive: js.UndefOr[Boolean] = js.undefined,
    keyDown: /* e */ KeyDownEventArgs => Unit = null,
    locale: String = null,
    maxDate: js.Any = null,
    menuItemClick: /* e */ MenuItemClickEventArgs => Unit = null,
    minDate: js.Any = null,
    navigation: /* e */ NavigationEventArgs => Unit = null,
    orientation: String | typings.ejDotWebDotAll.ejNs.ScheduleNs.Orientation = null,
    overflowButtonClick: /* e */ OverflowButtonClickEventArgs => Unit = null,
    overflowButtonHover: /* e */ OverflowButtonHoverEventArgs => Unit = null,
    prioritySettings: PrioritySettings = null,
    queryCellInfo: /* e */ QueryCellInfoEventArgs => Unit = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    reminder: /* e */ ReminderEventArgs => Unit = null,
    reminderSettings: ReminderSettings = null,
    renderDates: RenderDates = null,
    resize: /* e */ ResizeEventArgs => Unit = null,
    resizeStart: /* e */ ResizeStartEventArgs => Unit = null,
    resizeStop: /* e */ ResizeStopEventArgs => Unit = null,
    resourceHeaderTemplateId: String = null,
    resources: js.Array[Resource] = null,
    showAllDayRow: js.UndefOr[Boolean] = js.undefined,
    showAppointmentNavigator: js.UndefOr[Boolean] = js.undefined,
    showCurrentTimeIndicator: js.UndefOr[Boolean] = js.undefined,
    showDeleteConfirmationDialog: js.UndefOr[Boolean] = js.undefined,
    showHeaderBar: js.UndefOr[Boolean] = js.undefined,
    showLocationField: js.UndefOr[Boolean] = js.undefined,
    showNextPrevMonth: js.UndefOr[Boolean] = js.undefined,
    showOverflowButton: js.UndefOr[Boolean] = js.undefined,
    showQuickWindow: js.UndefOr[Boolean] = js.undefined,
    showTimeZoneFields: js.UndefOr[Boolean] = js.undefined,
    showWeekend: js.UndefOr[Boolean] = js.undefined,
    startHour: Int | Double = null,
    timeMode: String | TimeMode = null,
    timeScale: TimeScale = null,
    timeZone: String = null,
    timeZoneCollection: TimeZoneCollection = null,
    tooltipSettings: TooltipSettings = null,
    views: js.Array[_] = null,
    width: String = null,
    workCellsTemplateId: String = null,
    workHours: WorkHours = null,
    workWeek: js.Array[_] = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (actionBegin != null) __obj.updateDynamic("actionBegin")(js.Any.fromFunction1(actionBegin))
    if (actionComplete != null) __obj.updateDynamic("actionComplete")(js.Any.fromFunction1(actionComplete))
    if (agendaViewSettings != null) __obj.updateDynamic("agendaViewSettings")(agendaViewSettings)
    if (allDayCellsTemplateId != null) __obj.updateDynamic("allDayCellsTemplateId")(allDayCellsTemplateId)
    if (!js.isUndefined(allowDelete)) __obj.updateDynamic("allowDelete")(allowDelete)
    if (!js.isUndefined(allowDragAndDrop)) __obj.updateDynamic("allowDragAndDrop")(allowDragAndDrop)
    if (!js.isUndefined(allowInline)) __obj.updateDynamic("allowInline")(allowInline)
    if (!js.isUndefined(allowKeyboardNavigation)) __obj.updateDynamic("allowKeyboardNavigation")(allowKeyboardNavigation)
    if (appointmentChanged != null) __obj.updateDynamic("appointmentChanged")(js.Any.fromFunction1(appointmentChanged))
    if (appointmentClick != null) __obj.updateDynamic("appointmentClick")(js.Any.fromFunction1(appointmentClick))
    if (appointmentCreated != null) __obj.updateDynamic("appointmentCreated")(js.Any.fromFunction1(appointmentCreated))
    if (appointmentDragArea != null) __obj.updateDynamic("appointmentDragArea")(appointmentDragArea)
    if (appointmentHover != null) __obj.updateDynamic("appointmentHover")(js.Any.fromFunction1(appointmentHover))
    if (appointmentRemoved != null) __obj.updateDynamic("appointmentRemoved")(js.Any.fromFunction1(appointmentRemoved))
    if (appointmentSettings != null) __obj.updateDynamic("appointmentSettings")(appointmentSettings)
    if (appointmentTemplateId != null) __obj.updateDynamic("appointmentTemplateId")(appointmentTemplateId)
    if (appointmentWindowOpen != null) __obj.updateDynamic("appointmentWindowOpen")(js.Any.fromFunction1(appointmentWindowOpen))
    if (beforeAppointmentChange != null) __obj.updateDynamic("beforeAppointmentChange")(js.Any.fromFunction1(beforeAppointmentChange))
    if (beforeAppointmentCreate != null) __obj.updateDynamic("beforeAppointmentCreate")(js.Any.fromFunction1(beforeAppointmentCreate))
    if (beforeAppointmentRemove != null) __obj.updateDynamic("beforeAppointmentRemove")(js.Any.fromFunction1(beforeAppointmentRemove))
    if (beforeContextMenuOpen != null) __obj.updateDynamic("beforeContextMenuOpen")(js.Any.fromFunction1(beforeContextMenuOpen))
    if (blockoutSettings != null) __obj.updateDynamic("blockoutSettings")(blockoutSettings)
    if (categorizeSettings != null) __obj.updateDynamic("categorizeSettings")(categorizeSettings)
    if (cellClick != null) __obj.updateDynamic("cellClick")(js.Any.fromFunction1(cellClick))
    if (cellDoubleClick != null) __obj.updateDynamic("cellDoubleClick")(js.Any.fromFunction1(cellDoubleClick))
    if (cellHeight != null) __obj.updateDynamic("cellHeight")(cellHeight)
    if (cellHover != null) __obj.updateDynamic("cellHover")(js.Any.fromFunction1(cellHover))
    if (cellWidth != null) __obj.updateDynamic("cellWidth")(cellWidth)
    if (contextMenuSettings != null) __obj.updateDynamic("contextMenuSettings")(contextMenuSettings)
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction1(create))
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass)
    if (currentDate != null) __obj.updateDynamic("currentDate")(currentDate)
    if (currentView != null) __obj.updateDynamic("currentView")(currentView.asInstanceOf[js.Any])
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat)
    if (dateHeaderTemplateId != null) __obj.updateDynamic("dateHeaderTemplateId")(dateHeaderTemplateId)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction1(destroy))
    if (drag != null) __obj.updateDynamic("drag")(js.Any.fromFunction1(drag))
    if (dragStart != null) __obj.updateDynamic("dragStart")(js.Any.fromFunction1(dragStart))
    if (dragStop != null) __obj.updateDynamic("dragStop")(js.Any.fromFunction1(dragStop))
    if (!js.isUndefined(enableAppointmentResize)) __obj.updateDynamic("enableAppointmentResize")(enableAppointmentResize)
    if (!js.isUndefined(enableLoadOnDemand)) __obj.updateDynamic("enableLoadOnDemand")(enableLoadOnDemand)
    if (!js.isUndefined(enablePersistence)) __obj.updateDynamic("enablePersistence")(enablePersistence)
    if (!js.isUndefined(enableRTL)) __obj.updateDynamic("enableRTL")(enableRTL)
    if (!js.isUndefined(enableRecurrenceValidation)) __obj.updateDynamic("enableRecurrenceValidation")(enableRecurrenceValidation)
    if (endHour != null) __obj.updateDynamic("endHour")(endHour.asInstanceOf[js.Any])
    if (firstDayOfWeek != null) __obj.updateDynamic("firstDayOfWeek")(firstDayOfWeek)
    if (group != null) __obj.updateDynamic("group")(group)
    if (height != null) __obj.updateDynamic("height")(height)
    if (!js.isUndefined(isDST)) __obj.updateDynamic("isDST")(isDST)
    if (!js.isUndefined(isResponsive)) __obj.updateDynamic("isResponsive")(isResponsive)
    if (keyDown != null) __obj.updateDynamic("keyDown")(js.Any.fromFunction1(keyDown))
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate)
    if (menuItemClick != null) __obj.updateDynamic("menuItemClick")(js.Any.fromFunction1(menuItemClick))
    if (minDate != null) __obj.updateDynamic("minDate")(minDate)
    if (navigation != null) __obj.updateDynamic("navigation")(js.Any.fromFunction1(navigation))
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (overflowButtonClick != null) __obj.updateDynamic("overflowButtonClick")(js.Any.fromFunction1(overflowButtonClick))
    if (overflowButtonHover != null) __obj.updateDynamic("overflowButtonHover")(js.Any.fromFunction1(overflowButtonHover))
    if (prioritySettings != null) __obj.updateDynamic("prioritySettings")(prioritySettings)
    if (queryCellInfo != null) __obj.updateDynamic("queryCellInfo")(js.Any.fromFunction1(queryCellInfo))
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (reminder != null) __obj.updateDynamic("reminder")(js.Any.fromFunction1(reminder))
    if (reminderSettings != null) __obj.updateDynamic("reminderSettings")(reminderSettings)
    if (renderDates != null) __obj.updateDynamic("renderDates")(renderDates)
    if (resize != null) __obj.updateDynamic("resize")(js.Any.fromFunction1(resize))
    if (resizeStart != null) __obj.updateDynamic("resizeStart")(js.Any.fromFunction1(resizeStart))
    if (resizeStop != null) __obj.updateDynamic("resizeStop")(js.Any.fromFunction1(resizeStop))
    if (resourceHeaderTemplateId != null) __obj.updateDynamic("resourceHeaderTemplateId")(resourceHeaderTemplateId)
    if (resources != null) __obj.updateDynamic("resources")(resources)
    if (!js.isUndefined(showAllDayRow)) __obj.updateDynamic("showAllDayRow")(showAllDayRow)
    if (!js.isUndefined(showAppointmentNavigator)) __obj.updateDynamic("showAppointmentNavigator")(showAppointmentNavigator)
    if (!js.isUndefined(showCurrentTimeIndicator)) __obj.updateDynamic("showCurrentTimeIndicator")(showCurrentTimeIndicator)
    if (!js.isUndefined(showDeleteConfirmationDialog)) __obj.updateDynamic("showDeleteConfirmationDialog")(showDeleteConfirmationDialog)
    if (!js.isUndefined(showHeaderBar)) __obj.updateDynamic("showHeaderBar")(showHeaderBar)
    if (!js.isUndefined(showLocationField)) __obj.updateDynamic("showLocationField")(showLocationField)
    if (!js.isUndefined(showNextPrevMonth)) __obj.updateDynamic("showNextPrevMonth")(showNextPrevMonth)
    if (!js.isUndefined(showOverflowButton)) __obj.updateDynamic("showOverflowButton")(showOverflowButton)
    if (!js.isUndefined(showQuickWindow)) __obj.updateDynamic("showQuickWindow")(showQuickWindow)
    if (!js.isUndefined(showTimeZoneFields)) __obj.updateDynamic("showTimeZoneFields")(showTimeZoneFields)
    if (!js.isUndefined(showWeekend)) __obj.updateDynamic("showWeekend")(showWeekend)
    if (startHour != null) __obj.updateDynamic("startHour")(startHour.asInstanceOf[js.Any])
    if (timeMode != null) __obj.updateDynamic("timeMode")(timeMode.asInstanceOf[js.Any])
    if (timeScale != null) __obj.updateDynamic("timeScale")(timeScale)
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone)
    if (timeZoneCollection != null) __obj.updateDynamic("timeZoneCollection")(timeZoneCollection)
    if (tooltipSettings != null) __obj.updateDynamic("tooltipSettings")(tooltipSettings)
    if (views != null) __obj.updateDynamic("views")(views)
    if (width != null) __obj.updateDynamic("width")(width)
    if (workCellsTemplateId != null) __obj.updateDynamic("workCellsTemplateId")(workCellsTemplateId)
    if (workHours != null) __obj.updateDynamic("workHours")(workHours)
    if (workWeek != null) __obj.updateDynamic("workWeek")(workWeek)
    __obj.asInstanceOf[Model]
  }
}

