package typings.ejWebAll.ej.Schedule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Triggers on the beginning of every action that starts within the Schedule.
    */
  var actionBegin: js.UndefOr[js.Function1[/* e */ ActionBeginEventArgs, Unit]] = js.native
  /** Triggers after the completion of every action within the Schedule.
    */
  var actionComplete: js.UndefOr[js.Function1[/* e */ ActionCompleteEventArgs, Unit]] = js.native
  /** Sets the week to display more than one week appointment summary.
    */
  var agendaViewSettings: js.UndefOr[AgendaViewSettings] = js.native
  /** Accepts the id value of the template layout defined for the all-day cells and customizes it.
    * @Default {null}
    */
  var allDayCellsTemplateId: js.UndefOr[String] = js.native
  /** When set to false, disables the appointment delete option on the Scheduler.
    * @Default {true}
    */
  var allowDelete: js.UndefOr[Boolean] = js.native
  /** When set to true, Schedule allows the appointments to be dragged and dropped at required time.
    * @Default {true}
    */
  var allowDragAndDrop: js.UndefOr[Boolean] = js.native
  /** When set to true, allows the user to create/edit appointments inline - simply through a single click made either on the Scheduler cells or on the existing appointmentâ€™s Subject
    * text respectively. Pressing enter key after the new Subject text   typed onto the inline created text box, will save/update the appointments appropriately.
    * @Default {false}
    */
  var allowInline: js.UndefOr[Boolean] = js.native
  /** When set to true, Scheduler allows interaction through keyboard shortcut keys.
    * @Default {true}
    */
  var allowKeyboardNavigation: js.UndefOr[Boolean] = js.native
  /** Triggers after an existing appointment is edited.
    */
  var appointmentChanged: js.UndefOr[js.Function1[/* e */ AppointmentChangedEventArgs, Unit]] = js.native
  /** Triggers after an appointment is clicked.
    */
  var appointmentClick: js.UndefOr[js.Function1[/* e */ AppointmentClickEventArgs, Unit]] = js.native
  /** Triggers after the new appointment is saved.
    */
  var appointmentCreated: js.UndefOr[js.Function1[/* e */ AppointmentCreatedEventArgs, Unit]] = js.native
  /** Allows setting draggable area for the Scheduler appointments. Also, turns on the external drag and drop, when set with some specific external drag area name.
    */
  var appointmentDragArea: js.UndefOr[String] = js.native
  /** Triggers on hovering the mouse over the appointments.
    */
  var appointmentHover: js.UndefOr[js.Function1[/* e */ AppointmentHoverEventArgs, Unit]] = js.native
  /** Triggers after the appointment is deleted.
    */
  var appointmentRemoved: js.UndefOr[js.Function1[/* e */ AppointmentRemovedEventArgs, Unit]] = js.native
  /** It includes the dataSource option and the fields related to Schedule appointments. The appointment fields within the appointmentSettings can accept both string and object type
    * values. To apply validation rules on the appointment window fields, then the appointment fields needs to be defined with object type values.
    */
  var appointmentSettings: js.UndefOr[AppointmentSettings] = js.native
  /** Template design that applies on the Schedule appointments. All the field names that are mapped from dataSource to the appropriate field properties within the appointmentSettings
    * can be used within the template.
    * @Default {null}
    */
  var appointmentTemplateId: js.UndefOr[String] = js.native
  /** Triggers before the appointment window opens.
    */
  var appointmentWindowOpen: js.UndefOr[js.Function1[/* e */ AppointmentWindowOpenEventArgs, Unit]] = js.native
  /** Triggers before the edited appointment is being saved.
    */
  var beforeAppointmentChange: js.UndefOr[js.Function1[/* e */ BeforeAppointmentChangeEventArgs, Unit]] = js.native
  /** Triggers before the new appointment gets saved.
    */
  var beforeAppointmentCreate: js.UndefOr[js.Function1[/* e */ BeforeAppointmentCreateEventArgs, Unit]] = js.native
  /** Triggers before the appointment is being removed from the Scheduler.
    */
  var beforeAppointmentRemove: js.UndefOr[js.Function1[/* e */ BeforeAppointmentRemoveEventArgs, Unit]] = js.native
  /** Triggers before the context menu opens.
    */
  var beforeContextMenuOpen: js.UndefOr[js.Function1[/* e */ BeforeContextMenuOpenEventArgs, Unit]] = js.native
  /** Blocks the user-specific time interval on the Scheduler, so that no appointments can be created on that particular time slots. It includes the dataSource option and also the
    * fields related to block intervals.
    */
  var blockoutSettings: js.UndefOr[BlockoutSettings] = js.native
  /** Sets various categorize colors to the Schedule appointments to differentiate it.
    */
  var categorizeSettings: js.UndefOr[CategorizeSettings] = js.native
  /** Triggers after the cell is clicked.
    */
  var cellClick: js.UndefOr[js.Function1[/* e */ CellClickEventArgs, Unit]] = js.native
  /** Triggers after the cell is clicked twice.
    */
  var cellDoubleClick: js.UndefOr[js.Function1[/* e */ CellDoubleClickEventArgs, Unit]] = js.native
  /** Sets the height for Schedule cells.
    * @Default {20px}
    */
  var cellHeight: js.UndefOr[String] = js.native
  /** Triggers on hovering the mouse overs the cells.
    */
  var cellHover: js.UndefOr[js.Function1[/* e */ CellHoverEventArgs, Unit]] = js.native
  /** Sets the width for Schedule cells.
    */
  var cellWidth: js.UndefOr[String] = js.native
  /** Holds all options related to the context menu settings of Scheduler.
    */
  var contextMenuSettings: js.UndefOr[ContextMenuSettings] = js.native
  /** Triggers when the Scheduler completely renders on the page.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
  /** Accepts the custom CSS class name that defines specific user-defined styles and themes to be applied for partial or complete elements of the Schedule.
    */
  var cssClass: js.UndefOr[String] = js.native
  /** Sets current date of the Schedule. The Schedule displays initially with the date that is provided here.
    * @Default {new Date()}
    */
  var currentDate: js.UndefOr[js.Any] = js.native
  /** Sets current view of the Schedule. Schedule renders initially with the view that is specified here. The available views are day, week, workweek, month, agenda and custom view -
    * from which any one of the required view can be set to the Schedule. It accepts both string or enum values. The enum values that are accepted by
    * currentView(ej.Schedule.CurrentView) are as follows,
    * @Default {ej.Schedule.CurrentView.Week}
    */
  var currentView: js.UndefOr[String | CurrentView] = js.native
  /** Sets the date format for Schedule.
    */
  var dateFormat: js.UndefOr[String] = js.native
  /** Accepts the id value of the template layout defined for the date header cells and customizes it.
    * @Default {null}
    */
  var dateHeaderTemplateId: js.UndefOr[String] = js.native
  /** Triggers when the Scheduler and all its sub-components gets destroyed.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
  /** Triggers while the appointment is being dragged over the work cells.
    */
  var drag: js.UndefOr[js.Function1[/* e */ DragEventArgs, Unit]] = js.native
  /** Triggers when the appointment dragging begins.
    */
  var dragStart: js.UndefOr[js.Function1[/* e */ DragStartEventArgs, Unit]] = js.native
  /** Triggers when the appointment is dropped.
    */
  var dragStop: js.UndefOr[js.Function1[/* e */ DragStopEventArgs, Unit]] = js.native
  /** When set to true, enables the resize behavior of appointments within the Schedule.
    * @Default {true}
    */
  var enableAppointmentResize: js.UndefOr[Boolean] = js.native
  /** When set to true, enables the loading of Schedule appointments based on your demand. With this load on demand concept, the data consumption of the Schedule can be limited.
    * @Default {false}
    */
  var enableLoadOnDemand: js.UndefOr[Boolean] = js.native
  /** Saves the current model value to browser cookies for state maintenance. When the page gets refreshed, Schedule control values are retained.
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[Boolean] = js.native
  /** When set to true, the Schedule layout and behavior changes as per the common RTL conventions.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.native
  /** When set to true, Schedule allows the validation of recurrence pattern to take place before it is being assigned to the appointments. For example, when one of the instance of
    * recurrence appointment is dragged beyond the next or previous instance of the same recurrence appointment, a pop-up is displayed with the validation message disallowing the drag
    * functionality.
    * @Default {true}
    */
  var enableRecurrenceValidation: js.UndefOr[Boolean] = js.native
  /** Sets the end hour time limit to be displayed on the Schedule.
    * @Default {24}
    */
  var endHour: js.UndefOr[Double] = js.native
  /** Sets specific day as the starting day of the week.
    * @Default {null}
    */
  var firstDayOfWeek: js.UndefOr[String] = js.native
  /** To configure resource grouping on the Schedule.
    */
  var group: js.UndefOr[Group] = js.native
  /** Sets the height of the Schedule. Accepts both pixel and percentage values.
    * @Default {1120px}
    */
  var height: js.UndefOr[String] = js.native
  /** When set to true, enables the Schedule to observe Daylight Saving Time for supported timezones.
    * @Default {false}
    */
  var isDST: js.UndefOr[Boolean] = js.native
  /** When set to true, adapts the Schedule layout to fit the screen size of devices on which it renders.
    * @Default {true}
    */
  var isResponsive: js.UndefOr[Boolean] = js.native
  /** Triggers when any of the keyboard keys are pressed.
    */
  var keyDown: js.UndefOr[js.Function1[/* e */ KeyDownEventArgs, Unit]] = js.native
  /** Sets the specific culture to the Schedule.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  /** Sets the maximum date limit to display on the Schedule. Setting maxDate with specific date value disallows the Schedule to navigate beyond that date.
    * @Default {new Date(2099, 12, 31)}
    */
  var maxDate: js.UndefOr[js.Any] = js.native
  /** Triggers after the menu/sub-menu items within the context menu is clicked.
    */
  var menuItemClick: js.UndefOr[js.Function1[/* e */ MenuItemClickEventArgs, Unit]] = js.native
  /** Sets the minimum date limit to display on the Schedule. Setting minDate with specific date value disallows the Schedule to navigate beyond that date.
    * @Default {new Date(1900, 01, 01)}
    */
  var minDate: js.UndefOr[js.Any] = js.native
  /** Triggers after the Schedule view or date is navigated.
    */
  var navigation: js.UndefOr[js.Function1[/* e */ NavigationEventArgs, Unit]] = js.native
  /** Sets the mode of Schedule rendering either in a vertical or horizontal direction. It accepts either string(&quot;vertical&quot; or &quot;horizontal&quot;) or enum values. The enum
    * values that are accepted by orientation(ej.Schedule.Orientation) are as follows,
    * @Default {ej.Schedule.Orientation.Vertical}
    */
  var orientation: js.UndefOr[String | Orientation] = js.native
  /** Triggers when the overflow button is clicked.
    */
  var overflowButtonClick: js.UndefOr[js.Function1[/* e */ OverflowButtonClickEventArgs, Unit]] = js.native
  /** Triggers while mouse hovering on the overflow button.
    */
  var overflowButtonHover: js.UndefOr[js.Function1[/* e */ OverflowButtonHoverEventArgs, Unit]] = js.native
  /** Holds all the options related to priority settings of the Schedule.
    */
  var prioritySettings: js.UndefOr[PrioritySettings] = js.native
  /** Triggers every time before the elements of the scheduler such as work cells, time cells or header cells and so on renders or re-renders on a page.
    */
  var queryCellInfo: js.UndefOr[js.Function1[/* e */ QueryCellInfoEventArgs, Unit]] = js.native
  /** When set to true, disables the interaction with the Schedule appointments, simply allowing the date and view navigation to occur.
    * @Default {false}
    */
  var readOnly: js.UndefOr[Boolean] = js.native
  /** Triggers when the reminder is raised for an appointment based on the alertBefore value.
    */
  var reminder: js.UndefOr[js.Function1[/* e */ ReminderEventArgs, Unit]] = js.native
  /** Holds all the options related to reminder settings of the Schedule.
    */
  var reminderSettings: js.UndefOr[ReminderSettings] = js.native
  /** Defines the specific start and end dates to be rendered in the Schedule control. To render such user-specified custom date ranges in the Schedule control, set the currentView
    * property to ej.Schedule.CurrentView.CustomView.
    * @Default {null}
    */
  var renderDates: js.UndefOr[RenderDates] = js.native
  /** Triggers while resizing the appointment.
    */
  var resize: js.UndefOr[js.Function1[/* e */ ResizeEventArgs, Unit]] = js.native
  /** Triggers when the appointment resizing begins.
    */
  var resizeStart: js.UndefOr[js.Function1[/* e */ ResizeStartEventArgs, Unit]] = js.native
  /** Triggers when an appointment resizing stops.
    */
  var resizeStop: js.UndefOr[js.Function1[/* e */ ResizeStopEventArgs, Unit]] = js.native
  /** Template design that applies on the Schedule resource header.
    * @Default {null}
    */
  var resourceHeaderTemplateId: js.UndefOr[String] = js.native
  /** Holds all the options related to the resources settings of the Schedule. It is a collection of one or more resource objects, where the levels of resources are rendered on the
    * Schedule based on the order of the resource data provided within this collection.
    * @Default {null}
    */
  var resources: js.UndefOr[js.Array[Resource]] = js.native
  /** When set to true, displays the all-day row cells on the Schedule.
    * @Default {true}
    */
  var showAllDayRow: js.UndefOr[Boolean] = js.native
  /** When set to true, shows the previous/next appointment navigator button on the Scheduler.
    * @Default {true}
    */
  var showAppointmentNavigator: js.UndefOr[Boolean] = js.native
  /** When set to true, displays the current time indicator on the Schedule.
    * @Default {true}
    */
  var showCurrentTimeIndicator: js.UndefOr[Boolean] = js.native
  /** When set to true, shows the delete confirmation dialog before deleting an appointment.
    * @Default {true}
    */
  var showDeleteConfirmationDialog: js.UndefOr[Boolean] = js.native
  /** When set to true, displays the header bar on the Schedule.
    * @Default {true}
    */
  var showHeaderBar: js.UndefOr[Boolean] = js.native
  /** When set to true, displays the location field additionally on Schedule appointment window.
    * @Default {false}
    */
  var showLocationField: js.UndefOr[Boolean] = js.native
  /** When set to true, displays the other months days from the current month on the Schedule.
    * @Default {true}
    */
  var showNextPrevMonth: js.UndefOr[Boolean] = js.native
  /** when set to false, allows the height of the work-cells to adjust automatically (either expand or collapse) based on the number of appointment count it has.
    * @Default {true}
    */
  var showOverflowButton: js.UndefOr[Boolean] = js.native
  /** When set to true, displays the quick window for every single click made on the Schedule cells or appointments.
    * @Default {true}
    */
  var showQuickWindow: js.UndefOr[Boolean] = js.native
  /** When set to false, doesn't render the start and end timezone fields on the Schedule appointment window.
    * @Default {true}
    */
  var showTimeZoneFields: js.UndefOr[Boolean] = js.native
  /** When set to false, hides the weekend days on all the Scheduler views.
    * @Default {true}
    */
  var showWeekend: js.UndefOr[Boolean] = js.native
  /** Sets the start hour time range to be displayed on the Schedule.
    * @Default {0}
    */
  var startHour: js.UndefOr[Double] = js.native
  /** Sets either 12 or 24 hour time mode on the Schedule. It accepts either the string value(&quot;12&quot; or &quot;24&quot;) or the below mentioned enum values. The enum values that
    * are accepted by timeMode(ej.Schedule.TimeMode) are as follows,
    * @Default {null}
    */
  var timeMode: js.UndefOr[String | TimeMode] = js.native
  /** Holds all the options related to the time scale of Scheduler. The timeslots either major or minor slots can be customized with this property.
    */
  var timeScale: js.UndefOr[TimeScale] = js.native
  /** Sets the timezone for the Schedule.
    * @Default {null}
    */
  var timeZone: js.UndefOr[String] = js.native
  /** Sets the collection of timezone items to be bound to the Schedule. Only the items bound to this property gets listed out in the timezone field of the appointment window.
    */
  var timeZoneCollection: js.UndefOr[TimeZoneCollection] = js.native
  /** Allows to pop-up appointment details in a tooltip while hovering over the appointments.
    */
  var tooltipSettings: js.UndefOr[TooltipSettings] = js.native
  /** Defines the view collection to be displayed on the Schedule. By default, it displays all the views namely, Day, Week, WorkWeek and Month.
    * @Default {[Day, Week, WorkWeek, Month, Agenda]}
    */
  var views: js.UndefOr[js.Array[_]] = js.native
  /** Sets the width of the Schedule. Accepts both pixel and percentage values.
    * @Default {100%}
    */
  var width: js.UndefOr[String] = js.native
  /** Accepts the id value of the template layout defined for the work cells and month cells.
    * @Default {null}
    */
  var workCellsTemplateId: js.UndefOr[String] = js.native
  /** To define the work hours within the Schedule control.
    */
  var workHours: js.UndefOr[WorkHours] = js.native
  /** Sets different day collection within workWeek view.
    * @Default {[Monday, Tuesday, Wednesday, Thursday, Friday]}
    */
  var workWeek: js.UndefOr[js.Array[_]] = js.native
}

object Model {
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
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
    def setActionBegin(value: /* e */ ActionBeginEventArgs => Unit): Self = this.set("actionBegin", js.Any.fromFunction1(value))
    @scala.inline
    def deleteActionBegin: Self = this.set("actionBegin", js.undefined)
    @scala.inline
    def setActionComplete(value: /* e */ ActionCompleteEventArgs => Unit): Self = this.set("actionComplete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteActionComplete: Self = this.set("actionComplete", js.undefined)
    @scala.inline
    def setAgendaViewSettings(value: AgendaViewSettings): Self = this.set("agendaViewSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAgendaViewSettings: Self = this.set("agendaViewSettings", js.undefined)
    @scala.inline
    def setAllDayCellsTemplateId(value: String): Self = this.set("allDayCellsTemplateId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllDayCellsTemplateId: Self = this.set("allDayCellsTemplateId", js.undefined)
    @scala.inline
    def setAllowDelete(value: Boolean): Self = this.set("allowDelete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowDelete: Self = this.set("allowDelete", js.undefined)
    @scala.inline
    def setAllowDragAndDrop(value: Boolean): Self = this.set("allowDragAndDrop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowDragAndDrop: Self = this.set("allowDragAndDrop", js.undefined)
    @scala.inline
    def setAllowInline(value: Boolean): Self = this.set("allowInline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowInline: Self = this.set("allowInline", js.undefined)
    @scala.inline
    def setAllowKeyboardNavigation(value: Boolean): Self = this.set("allowKeyboardNavigation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowKeyboardNavigation: Self = this.set("allowKeyboardNavigation", js.undefined)
    @scala.inline
    def setAppointmentChanged(value: /* e */ AppointmentChangedEventArgs => Unit): Self = this.set("appointmentChanged", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAppointmentChanged: Self = this.set("appointmentChanged", js.undefined)
    @scala.inline
    def setAppointmentClick(value: /* e */ AppointmentClickEventArgs => Unit): Self = this.set("appointmentClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAppointmentClick: Self = this.set("appointmentClick", js.undefined)
    @scala.inline
    def setAppointmentCreated(value: /* e */ AppointmentCreatedEventArgs => Unit): Self = this.set("appointmentCreated", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAppointmentCreated: Self = this.set("appointmentCreated", js.undefined)
    @scala.inline
    def setAppointmentDragArea(value: String): Self = this.set("appointmentDragArea", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppointmentDragArea: Self = this.set("appointmentDragArea", js.undefined)
    @scala.inline
    def setAppointmentHover(value: /* e */ AppointmentHoverEventArgs => Unit): Self = this.set("appointmentHover", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAppointmentHover: Self = this.set("appointmentHover", js.undefined)
    @scala.inline
    def setAppointmentRemoved(value: /* e */ AppointmentRemovedEventArgs => Unit): Self = this.set("appointmentRemoved", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAppointmentRemoved: Self = this.set("appointmentRemoved", js.undefined)
    @scala.inline
    def setAppointmentSettings(value: AppointmentSettings): Self = this.set("appointmentSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppointmentSettings: Self = this.set("appointmentSettings", js.undefined)
    @scala.inline
    def setAppointmentTemplateId(value: String): Self = this.set("appointmentTemplateId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppointmentTemplateId: Self = this.set("appointmentTemplateId", js.undefined)
    @scala.inline
    def setAppointmentWindowOpen(value: /* e */ AppointmentWindowOpenEventArgs => Unit): Self = this.set("appointmentWindowOpen", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAppointmentWindowOpen: Self = this.set("appointmentWindowOpen", js.undefined)
    @scala.inline
    def setBeforeAppointmentChange(value: /* e */ BeforeAppointmentChangeEventArgs => Unit): Self = this.set("beforeAppointmentChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeAppointmentChange: Self = this.set("beforeAppointmentChange", js.undefined)
    @scala.inline
    def setBeforeAppointmentCreate(value: /* e */ BeforeAppointmentCreateEventArgs => Unit): Self = this.set("beforeAppointmentCreate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeAppointmentCreate: Self = this.set("beforeAppointmentCreate", js.undefined)
    @scala.inline
    def setBeforeAppointmentRemove(value: /* e */ BeforeAppointmentRemoveEventArgs => Unit): Self = this.set("beforeAppointmentRemove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeAppointmentRemove: Self = this.set("beforeAppointmentRemove", js.undefined)
    @scala.inline
    def setBeforeContextMenuOpen(value: /* e */ BeforeContextMenuOpenEventArgs => Unit): Self = this.set("beforeContextMenuOpen", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeContextMenuOpen: Self = this.set("beforeContextMenuOpen", js.undefined)
    @scala.inline
    def setBlockoutSettings(value: BlockoutSettings): Self = this.set("blockoutSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlockoutSettings: Self = this.set("blockoutSettings", js.undefined)
    @scala.inline
    def setCategorizeSettings(value: CategorizeSettings): Self = this.set("categorizeSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategorizeSettings: Self = this.set("categorizeSettings", js.undefined)
    @scala.inline
    def setCellClick(value: /* e */ CellClickEventArgs => Unit): Self = this.set("cellClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCellClick: Self = this.set("cellClick", js.undefined)
    @scala.inline
    def setCellDoubleClick(value: /* e */ CellDoubleClickEventArgs => Unit): Self = this.set("cellDoubleClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCellDoubleClick: Self = this.set("cellDoubleClick", js.undefined)
    @scala.inline
    def setCellHeight(value: String): Self = this.set("cellHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellHeight: Self = this.set("cellHeight", js.undefined)
    @scala.inline
    def setCellHover(value: /* e */ CellHoverEventArgs => Unit): Self = this.set("cellHover", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCellHover: Self = this.set("cellHover", js.undefined)
    @scala.inline
    def setCellWidth(value: String): Self = this.set("cellWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellWidth: Self = this.set("cellWidth", js.undefined)
    @scala.inline
    def setContextMenuSettings(value: ContextMenuSettings): Self = this.set("contextMenuSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContextMenuSettings: Self = this.set("contextMenuSettings", js.undefined)
    @scala.inline
    def setCreate(value: /* e */ CreateEventArgs => Unit): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    @scala.inline
    def setCurrentDate(value: js.Any): Self = this.set("currentDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentDate: Self = this.set("currentDate", js.undefined)
    @scala.inline
    def setCurrentView(value: String | CurrentView): Self = this.set("currentView", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentView: Self = this.set("currentView", js.undefined)
    @scala.inline
    def setDateFormat(value: String): Self = this.set("dateFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateFormat: Self = this.set("dateFormat", js.undefined)
    @scala.inline
    def setDateHeaderTemplateId(value: String): Self = this.set("dateHeaderTemplateId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateHeaderTemplateId: Self = this.set("dateHeaderTemplateId", js.undefined)
    @scala.inline
    def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = this.set("destroy", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    @scala.inline
    def setDrag(value: /* e */ DragEventArgs => Unit): Self = this.set("drag", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDrag: Self = this.set("drag", js.undefined)
    @scala.inline
    def setDragStart(value: /* e */ DragStartEventArgs => Unit): Self = this.set("dragStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDragStart: Self = this.set("dragStart", js.undefined)
    @scala.inline
    def setDragStop(value: /* e */ DragStopEventArgs => Unit): Self = this.set("dragStop", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDragStop: Self = this.set("dragStop", js.undefined)
    @scala.inline
    def setEnableAppointmentResize(value: Boolean): Self = this.set("enableAppointmentResize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableAppointmentResize: Self = this.set("enableAppointmentResize", js.undefined)
    @scala.inline
    def setEnableLoadOnDemand(value: Boolean): Self = this.set("enableLoadOnDemand", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableLoadOnDemand: Self = this.set("enableLoadOnDemand", js.undefined)
    @scala.inline
    def setEnablePersistence(value: Boolean): Self = this.set("enablePersistence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnablePersistence: Self = this.set("enablePersistence", js.undefined)
    @scala.inline
    def setEnableRTL(value: Boolean): Self = this.set("enableRTL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableRTL: Self = this.set("enableRTL", js.undefined)
    @scala.inline
    def setEnableRecurrenceValidation(value: Boolean): Self = this.set("enableRecurrenceValidation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableRecurrenceValidation: Self = this.set("enableRecurrenceValidation", js.undefined)
    @scala.inline
    def setEndHour(value: Double): Self = this.set("endHour", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndHour: Self = this.set("endHour", js.undefined)
    @scala.inline
    def setFirstDayOfWeek(value: String): Self = this.set("firstDayOfWeek", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstDayOfWeek: Self = this.set("firstDayOfWeek", js.undefined)
    @scala.inline
    def setGroup(value: Group): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    @scala.inline
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setIsDST(value: Boolean): Self = this.set("isDST", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDST: Self = this.set("isDST", js.undefined)
    @scala.inline
    def setIsResponsive(value: Boolean): Self = this.set("isResponsive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsResponsive: Self = this.set("isResponsive", js.undefined)
    @scala.inline
    def setKeyDown(value: /* e */ KeyDownEventArgs => Unit): Self = this.set("keyDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteKeyDown: Self = this.set("keyDown", js.undefined)
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setMaxDate(value: js.Any): Self = this.set("maxDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDate: Self = this.set("maxDate", js.undefined)
    @scala.inline
    def setMenuItemClick(value: /* e */ MenuItemClickEventArgs => Unit): Self = this.set("menuItemClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMenuItemClick: Self = this.set("menuItemClick", js.undefined)
    @scala.inline
    def setMinDate(value: js.Any): Self = this.set("minDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinDate: Self = this.set("minDate", js.undefined)
    @scala.inline
    def setNavigation(value: /* e */ NavigationEventArgs => Unit): Self = this.set("navigation", js.Any.fromFunction1(value))
    @scala.inline
    def deleteNavigation: Self = this.set("navigation", js.undefined)
    @scala.inline
    def setOrientation(value: String | Orientation): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def setOverflowButtonClick(value: /* e */ OverflowButtonClickEventArgs => Unit): Self = this.set("overflowButtonClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOverflowButtonClick: Self = this.set("overflowButtonClick", js.undefined)
    @scala.inline
    def setOverflowButtonHover(value: /* e */ OverflowButtonHoverEventArgs => Unit): Self = this.set("overflowButtonHover", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOverflowButtonHover: Self = this.set("overflowButtonHover", js.undefined)
    @scala.inline
    def setPrioritySettings(value: PrioritySettings): Self = this.set("prioritySettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrioritySettings: Self = this.set("prioritySettings", js.undefined)
    @scala.inline
    def setQueryCellInfo(value: /* e */ QueryCellInfoEventArgs => Unit): Self = this.set("queryCellInfo", js.Any.fromFunction1(value))
    @scala.inline
    def deleteQueryCellInfo: Self = this.set("queryCellInfo", js.undefined)
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    @scala.inline
    def setReminder(value: /* e */ ReminderEventArgs => Unit): Self = this.set("reminder", js.Any.fromFunction1(value))
    @scala.inline
    def deleteReminder: Self = this.set("reminder", js.undefined)
    @scala.inline
    def setReminderSettings(value: ReminderSettings): Self = this.set("reminderSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReminderSettings: Self = this.set("reminderSettings", js.undefined)
    @scala.inline
    def setRenderDates(value: RenderDates): Self = this.set("renderDates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderDates: Self = this.set("renderDates", js.undefined)
    @scala.inline
    def setResize(value: /* e */ ResizeEventArgs => Unit): Self = this.set("resize", js.Any.fromFunction1(value))
    @scala.inline
    def deleteResize: Self = this.set("resize", js.undefined)
    @scala.inline
    def setResizeStart(value: /* e */ ResizeStartEventArgs => Unit): Self = this.set("resizeStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteResizeStart: Self = this.set("resizeStart", js.undefined)
    @scala.inline
    def setResizeStop(value: /* e */ ResizeStopEventArgs => Unit): Self = this.set("resizeStop", js.Any.fromFunction1(value))
    @scala.inline
    def deleteResizeStop: Self = this.set("resizeStop", js.undefined)
    @scala.inline
    def setResourceHeaderTemplateId(value: String): Self = this.set("resourceHeaderTemplateId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceHeaderTemplateId: Self = this.set("resourceHeaderTemplateId", js.undefined)
    @scala.inline
    def setResourcesVarargs(value: Resource*): Self = this.set("resources", js.Array(value :_*))
    @scala.inline
    def setResources(value: js.Array[Resource]): Self = this.set("resources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResources: Self = this.set("resources", js.undefined)
    @scala.inline
    def setShowAllDayRow(value: Boolean): Self = this.set("showAllDayRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowAllDayRow: Self = this.set("showAllDayRow", js.undefined)
    @scala.inline
    def setShowAppointmentNavigator(value: Boolean): Self = this.set("showAppointmentNavigator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowAppointmentNavigator: Self = this.set("showAppointmentNavigator", js.undefined)
    @scala.inline
    def setShowCurrentTimeIndicator(value: Boolean): Self = this.set("showCurrentTimeIndicator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowCurrentTimeIndicator: Self = this.set("showCurrentTimeIndicator", js.undefined)
    @scala.inline
    def setShowDeleteConfirmationDialog(value: Boolean): Self = this.set("showDeleteConfirmationDialog", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowDeleteConfirmationDialog: Self = this.set("showDeleteConfirmationDialog", js.undefined)
    @scala.inline
    def setShowHeaderBar(value: Boolean): Self = this.set("showHeaderBar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowHeaderBar: Self = this.set("showHeaderBar", js.undefined)
    @scala.inline
    def setShowLocationField(value: Boolean): Self = this.set("showLocationField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowLocationField: Self = this.set("showLocationField", js.undefined)
    @scala.inline
    def setShowNextPrevMonth(value: Boolean): Self = this.set("showNextPrevMonth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowNextPrevMonth: Self = this.set("showNextPrevMonth", js.undefined)
    @scala.inline
    def setShowOverflowButton(value: Boolean): Self = this.set("showOverflowButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowOverflowButton: Self = this.set("showOverflowButton", js.undefined)
    @scala.inline
    def setShowQuickWindow(value: Boolean): Self = this.set("showQuickWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowQuickWindow: Self = this.set("showQuickWindow", js.undefined)
    @scala.inline
    def setShowTimeZoneFields(value: Boolean): Self = this.set("showTimeZoneFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowTimeZoneFields: Self = this.set("showTimeZoneFields", js.undefined)
    @scala.inline
    def setShowWeekend(value: Boolean): Self = this.set("showWeekend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowWeekend: Self = this.set("showWeekend", js.undefined)
    @scala.inline
    def setStartHour(value: Double): Self = this.set("startHour", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartHour: Self = this.set("startHour", js.undefined)
    @scala.inline
    def setTimeMode(value: String | TimeMode): Self = this.set("timeMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeMode: Self = this.set("timeMode", js.undefined)
    @scala.inline
    def setTimeScale(value: TimeScale): Self = this.set("timeScale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeScale: Self = this.set("timeScale", js.undefined)
    @scala.inline
    def setTimeZone(value: String): Self = this.set("timeZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeZone: Self = this.set("timeZone", js.undefined)
    @scala.inline
    def setTimeZoneCollection(value: TimeZoneCollection): Self = this.set("timeZoneCollection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeZoneCollection: Self = this.set("timeZoneCollection", js.undefined)
    @scala.inline
    def setTooltipSettings(value: TooltipSettings): Self = this.set("tooltipSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipSettings: Self = this.set("tooltipSettings", js.undefined)
    @scala.inline
    def setViewsVarargs(value: js.Any*): Self = this.set("views", js.Array(value :_*))
    @scala.inline
    def setViews(value: js.Array[_]): Self = this.set("views", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViews: Self = this.set("views", js.undefined)
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setWorkCellsTemplateId(value: String): Self = this.set("workCellsTemplateId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkCellsTemplateId: Self = this.set("workCellsTemplateId", js.undefined)
    @scala.inline
    def setWorkHours(value: WorkHours): Self = this.set("workHours", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkHours: Self = this.set("workHours", js.undefined)
    @scala.inline
    def setWorkWeekVarargs(value: js.Any*): Self = this.set("workWeek", js.Array(value :_*))
    @scala.inline
    def setWorkWeek(value: js.Array[_]): Self = this.set("workWeek", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkWeek: Self = this.set("workWeek", js.undefined)
  }
  
}

