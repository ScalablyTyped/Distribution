package typings.dhtmlxgantt

import typings.std.Date
import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GanttStatic extends js.Object {
  /**
    * redefines the default click behavior for buttons of the Gantt chart
    */
  @JSName("$click")
  var $click: js.Any = js.native
  /**
    * dhtmlx ajax module
    */
  var ajax: js.Any = js.native
  /**
    * the interface of the working calendar object
    */
  var calendar: js.Any = js.native
  /**
    * defines configuration options for dates, scale, controls
    */
  var config: GanttConfigOptions = js.native
  /**
    * stores various constants to reduce the use of magic numbers in the code
    */
  var constants: js.Any = js.native
  /**
    * a set of date formatting methods
    */
  var date: GanttDateHelpers = js.native
  /**
    * a set of flags which describe current environment
    */
  var env: js.Any = js.native
  /**
    * an object that stores various extensions
    */
  var ext: js.Any = js.native
  /**
    * specifies JSON serialization and parsing
    */
  var json: js.Any = js.native
  /**
    * defines the hot keys for the Gantt chart
    */
  var keys: GanttHotkeys = js.native
  /**
    * a locale object (region-specific labels) of the Gantt chart
    */
  var locale: GanttLocale = js.native
  /**
    * specifies serialization and parsing in the XML format of dhtmlxGantt 1.0
    */
  var oldxml: js.Any = js.native
  /**
    * returns the current skin of the Gantt chart
    */
  var skin: String = js.native
  /**
    * returns objects of the available skins
    */
  var skins: js.Any = js.native
  /**
    * defines formatting templates for dates, titles, tooltips in the Gantt chart
    */
  var templates: GanttTemplates = js.native
  /**
    * returns the version of dhtmlxGantt
    */
  var version: String = js.native
  /**
    * specifies XML serialization and parsing
    */
  var xml: js.Any = js.native
  /**
    * adds a calendar into Gantt
    * @param calendar an object with configuration of the calendar
    */
  def addCalendar(calendar: js.Any): Double = js.native
  /**
    * adds a new dependency link
    * @param link the link object
    */
  def addLink(link: js.Any): String | Double = js.native
  /**
    * displays an additional layer with custom elements for a link in the timeline area
    * @param func a render function or a config object
    */
  def addLinkLayer(func: js.Any): String = js.native
  /**
    * adds a marker to the timeline area
    * @param marker the marker's configuration object
    */
  def addMarker(marker: js.Any): String = js.native
  /**
    * adds a new keyboard shortcut
    * @param shortcut the key name or the name of keys combination for a shortcut (<a href="desktop/keyboard_navigation.md#shortcutsyntax">shortcut syntax</a>)
    * @param handler the handler of the shortcut call
    * @param scope the name of the context element to attach the handler function to (<a href="desktop/keyboard_navigation.md#scopes">list of scopes</a>)
    */
  def addShortcut(shortcut: String, handler: GanttCallback, scope: String): Unit = js.native
  /**
    * adds a new task
    * @param task the task object
    * @param parent the parent's id
    * @param index optional, optional, the position the task will be added into (0 or greater)
    */
  def addTask(task: js.Any, parent: String): String | Double = js.native
  def addTask(task: js.Any, parent: String, index: Double): String | Double = js.native
  /**
    * displays an additional layer with custom elements for a task in the timeline area
    * @param func a render function or a config object
    */
  def addTaskLayer(func: js.Any): String = js.native
  /**
    * calls an alert message box
    * @param config the alert box's configuration
    */
  def alert(config: js.Any): HTMLElement = js.native
  /**
    * if the specified expression is false, an errorMessage is shown in the red popup at the top right corner of the screen
    * @param expression true to assert the expression, false - if assertion fails
    * @param errorMessage an error message that will be shown in the red popup
    */
  def assert(expression: Boolean, errorMessage: String): Unit = js.native
  /**
    * attaches the handler to an inner event of dhtmlxGantt
    * @param name the event's name, case-insensitive
    * @param handler the handler function
    */
  def attachEvent(name: GanttEventName, handler: GanttCallback): String = js.native
  /**
    * recalculates the schedule of the project
    * @param taskId optional, optional, the task id
    */
  def autoSchedule(): Unit = js.native
  def autoSchedule(taskId: String): Unit = js.native
  def autoSchedule(taskId: Double): Unit = js.native
  /**
    * updates multiple tasks/links at once
    * @param callback the callback function
    */
  def batchUpdate(callback: GanttCallback): Unit = js.native
  /**
    * creates a new function that, when called, has its <i>this</i> keyword set to the provided value
    * @param method the target function
    * @param thisArg the value to be passed as the <i>this</i> parameter to the target function when the bound function is called
    */
  def bind(method: GanttCallback, thisArg: js.Any): GanttCallback = js.native
  /**
    * calculates the duration of a task
    * @param config the <a href="#configurationobjectproperties">configuration object</a> of a time span
    */
  def calculateDuration(config: js.Any): Double = js.native
  /**
    * calculates the duration of a task
    * @param start the date when a task is scheduled to begin
    * @param end the date when a task is scheduled to be completed
    */
  def calculateDuration(start: Date, end: Date): Double = js.native
  /**
    * calculates the end date of a task
    * @param config the <a href="#configurationobjectproperties">configuration object</a> of a time span
    */
  def calculateEndDate(config: js.Any): Date = js.native
  /**
    * calculates the end date of a task
    * @param start the date when a task is scheduled to begin
    * @param duration the duration of a task
    * @param unit the time unit of the duration
    */
  def calculateEndDate(start: Date, duration: Double, unit: String): Date = js.native
  /**
    * calculates the level of a task
    * @param task the task's object
    */
  def calculateTaskLevel(task: js.Any): Double = js.native
  /**
    * calls an inner event
    * @param name the event's name, case-insensitive
    * @param params an array of the event-related data
    */
  def callEvent(name: String, params: js.Array[_]): Boolean = js.native
  /**
    * repaints the lighbox for the task according to its type
    * @param type the task type
    */
  def changeLightboxType(`type`: String): Unit = js.native
  /**
    * changes the link's id
    * @param id the current link's id
    * @param new_id the new link's id
    */
  def changeLinkId(id: String, new_id: String): Unit = js.native
  def changeLinkId(id: String, new_id: Double): Unit = js.native
  def changeLinkId(id: Double, new_id: String): Unit = js.native
  def changeLinkId(id: Double, new_id: Double): Unit = js.native
  /**
    * changes the task's id
    * @param id the current task's id
    * @param new_id the new task's id
    */
  def changeTaskId(id: String, new_id: String): Unit = js.native
  def changeTaskId(id: String, new_id: Double): Unit = js.native
  def changeTaskId(id: Double, new_id: String): Unit = js.native
  def changeTaskId(id: Double, new_id: Double): Unit = js.native
  /**
    * checks whether an event has some handler(s) specified
    * @param name the event's name
    */
  def checkEvent(name: GanttEventName): Boolean = js.native
  /**
    * removes all tasks and additional elements (including markers) from the Gantt chart
    */
  def clearAll(): Unit = js.native
  /**
    * clears the stack of stored redo commands
    */
  def clearRedoStack(): Unit = js.native
  /**
    * clears the stack of stored undo commands
    */
  def clearUndoStack(): Unit = js.native
  /**
    * closes the branch with the specified id
    * @param id the branch id
    */
  def close(id: String): Unit = js.native
  def close(id: Double): Unit = js.native
  /**
    * collapses gantt from the full screen mode to the normal mode
    */
  def collapse(): Unit = js.native
  /**
    * returns the index of the column by the date
    * @param date a date object
    */
  def columnIndexByDate(date: Date): Unit = js.native
  /**
    * calls a confirm message box
    * @param config the confirm box's configuration
    */
  def confirm(config: js.Any): HTMLElement = js.native
  /**
    * creates a deep copy of provided object
    * @param task the object that needs to be copied
    */
  def copy(task: js.Any): js.Any = js.native
  /**
    * recalculates the task duration in the work time
    * @param task the task's object
    */
  def correctTaskWorkTime(task: js.Any): Unit = js.native
  /**
    * creates a working calendar
    * @param parentCalendar optional, (optional) an existing calendar that is used for creating a new one on the base of it
    */
  def createCalendar(): Unit = js.native
  def createCalendar(parentCalendar: js.Any): Unit = js.native
  /**
    * creates a datastore according to the provided configuration
    * @param config a configuration object of a datastore
    */
  def createDatastore(config: js.Any): Unit = js.native
  /**
    * adds a new task and opens the lightbox to confirm
    * @param task the task object
    * @param parent the parent's id
    * @param index optional, optional, the position the task will be added into (0 or greater)
    */
  def createTask(task: js.Any, parent: String): String | Double = js.native
  def createTask(task: js.Any, parent: String, index: Double): String | Double = js.native
  /**
    * dataProcessor constructor
    * @param url url to the data feed
    */
  def dataProcessor(url: String): Unit = js.native
  /**
    * gets the date of the specified horizontal  position in the chart area
    * @param pos the relative horizontal position you want to know the date of
    */
  def dateFromPos(pos: Double): Date = js.native
  /**
    * returns false if the provided argument is undefined, otherwise true
    * @param task the object that should be checked
    */
  def defined(task: js.Any): Boolean = js.native
  /**
    * deletes a task calendar by its id
    * @param id the id of the calendar
    */
  def deleteCalendar(id: String): Unit = js.native
  def deleteCalendar(id: Double): Unit = js.native
  /**
    * deletes the specified dependency link
    * @param id the dependency link's id
    */
  def deleteLink(id: String): Unit = js.native
  def deleteLink(id: Double): Unit = js.native
  /**
    * deletes the specified marker
    * @param markerId the marker's id
    */
  def deleteMarker(markerId: String): Unit = js.native
  /**
    * deletes the specified  task
    * @param id the task's id
    */
  def deleteTask(id: String): Unit = js.native
  def deleteTask(id: Double): Unit = js.native
  /**
    * destroys the gantt instance
    */
  def destructor(): Unit = js.native
  /**
    * detaches all events from dhtmlxGantt (both custom and inner)
    */
  def detachAllEvents(): Unit = js.native
  /**
    * detaches a handler from an event (which was attached before by the attachEvent() method)
    * @param id the event's id
    */
  def detachEvent(id: String): Unit = js.native
  /**
    * iterates over all parent tasks of the specified task in the Gantt chart
    * @param code a function that will iterate over tasks. Takes a task object as a parameter
    * @param startTask the id of the item the parent tasks of which should be iterated over
    * @param master optional, the object, that 'this'  will refer to
    */
  def eachParent(code: GanttCallback, startTask: String): Unit = js.native
  def eachParent(code: GanttCallback, startTask: String, master: js.Any): Unit = js.native
  def eachParent(code: GanttCallback, startTask: Double): Unit = js.native
  def eachParent(code: GanttCallback, startTask: Double, master: js.Any): Unit = js.native
  /**
    * iterates over all selected tasks in the Gantt chart
    * @param code a function that will iterate over tasks. Takes a task id as a parameter
    */
  def eachSelectedTask(code: GanttCallback): Unit = js.native
  /**
    * iterates over all child tasks in the Gantt chart
    * @param code a function that will iterate over tasks. Takes a task object as a parameter
    * @param parent optional, the parent id. If specified, the function will iterate over childs of the <br> specified parent
    * @param master optional, the object, that 'this'  will refer to
    */
  def eachTask(code: GanttCallback): Unit = js.native
  def eachTask(code: GanttCallback, parent: String): Unit = js.native
  def eachTask(code: GanttCallback, parent: String, master: js.Any): Unit = js.native
  def eachTask(code: GanttCallback, parent: Double): Unit = js.native
  def eachTask(code: GanttCallback, parent: Double, master: js.Any): Unit = js.native
  def event(node: String, event: String, handler: GanttCallback): Unit = js.native
  def event(node: String, event: String, handler: GanttCallback, options: js.Any): Unit = js.native
  /**
    * attaches an event handler to an HTML element
    * @param node the HTML node or its id
    * @param event the name of an HTML event (without the 'on' prefix)
    * @param handler the event handler
    * @param options optional, optional, the value of either the <i>useCapture</i> or <i>options</i> parameter. <a href="https://developer.mozilla.org/en-US/docs/Web/API/EventTarget/addEventListener">Read details</a>
    */
  def event(node: HTMLElement, event: String, handler: GanttCallback): Unit = js.native
  def event(node: HTMLElement, event: String, handler: GanttCallback, options: js.Any): Unit = js.native
  def eventRemove(node: String, event: String, handler: GanttCallback): Unit = js.native
  def eventRemove(node: String, event: String, handler: GanttCallback, options: js.Any): Unit = js.native
  /**
    * removes an event handler from an HTML element
    * @param node the HTML node or its id
    * @param event the name of an HTML event (without the 'on' prefix)
    * @param handler the event handler
    * @param options optional, optional, the value of either the <i>useCapture</i> or <i>options</i> parameter. <a href="https://developer.mozilla.org/en-US/docs/Web/API/EventTarget/removeEventListener">Read details</a>
    */
  def eventRemove(node: HTMLElement, event: String, handler: GanttCallback): Unit = js.native
  def eventRemove(node: HTMLElement, event: String, handler: GanttCallback, options: js.Any): Unit = js.native
  /**
    * expands gantt to the full screen mode
    */
  def expand(): Unit = js.native
  /**
    * exports data from the Gantt chart to an Excel document
    * @param _export_ an object with export settings (see the details)
    */
  def exportToExcel(_export_ : js.Any): Unit = js.native
  /**
    * exports data from the Gantt chart to an iCal string
    * @param _export_ an object with export settings (see the details)
    */
  def exportToICal(_export_ : js.Any): Unit = js.native
  /**
    * exports the structure and data of a Gantt chart into a JSON object
    * @param config an object with Gantt configuration
    */
  def exportToJSON(config: js.Any): Unit = js.native
  /**
    * exports data from the Gantt chart to MS Project
    * @param _export_ an object with export settings (see the details)
    */
  def exportToMSProject(_export_ : js.Any): Unit = js.native
  /**
    * exports a Gantt chart into the PDF format
    * @param _export_ an object with export settings (see the details)
    */
  def exportToPDF(): Unit = js.native
  def exportToPDF(_export_ : js.Any): Unit = js.native
  /**
    * exports a Gantt chart into the PNG format
    * @param _export_ an object with export settings (see the details)
    */
  def exportToPNG(): Unit = js.native
  def exportToPNG(_export_ : js.Any): Unit = js.native
  /**
    * returns all dependency loops in the chart
    */
  def findCycles(): js.Array[_] = js.native
  /**
    * sets focus on the gantt
    */
  def focus(): Unit = js.native
  /**
    * gets worktime calendar by id
    * @param calendarId the id of the global calendar or "global"
    */
  def getCalendar(calendarId: String): js.Any = js.native
  def getCalendar(calendarId: Double): js.Any = js.native
  /**
    * gets all the calendars added into Gantt
    */
  def getCalendars(): js.Array[_] = js.native
  /**
    * returns the 1st-level child tasks of the specified parent branch
    * @param id the parent branch's id
    */
  def getChildren(id: String): js.Array[_] = js.native
  def getChildren(id: Double): js.Array[_] = js.native
  /**
    * returns the closest working time
    * @param config the configuration object
    */
  def getClosestWorkTime(config: js.Any): Date = js.native
  /**
    * returns the index of the column by its name
    * @param name the name of the column
    */
  def getColumnIndex(name: String): Double = js.native
  /**
    * returns all tasks and links that a task is connected with
    * @param id optional, optional, the id of a task
    */
  def getConnectedGroup(): js.Any = js.native
  def getConnectedGroup(id: String): js.Any = js.native
  def getConnectedGroup(id: Double): js.Any = js.native
  /**
    * returns the configuration object of a datastore
    * @param name the name of the datastore
    */
  def getDatastore(name: String): js.Any = js.native
  /**
    * returns the free slack of a task
    * @param task the object of a task
    */
  def getFreeSlack(task: js.Any): Double = js.native
  /**
    * gets the index of a task in the tree
    * @param id the task id
    */
  def getGlobalTaskIndex(id: String): Double = js.native
  def getGlobalTaskIndex(id: Double): Double = js.native
  /**
    * gets the configuration object of a column
    * @param name the column's name
    */
  def getGridColumn(name: String): js.Any = js.native
  /**
    * gets columns of the Gantt chart
    */
  def getGridColumns(): js.Array[_] = js.native
  /**
    * gets the label of a select control in the lightbox
    * @param property the name of a data property that the control is mapped to
    * @param key the option's id. This parameter is compared with the task's data property to <br> assign the select's option to the task
    */
  def getLabel(property: String, key: String): Unit = js.native
  def getLabel(property: String, key: Double): Unit = js.native
  /**
    * returns the id of the last selected task
    */
  def getLastSelectedTask(): String | Double = js.native
  /**
    * gets the lightbox's HTML object element
    */
  def getLightbox(): HTMLElement = js.native
  /**
    * returns the object of the lightbox's section
    * @param name the name of the section
    */
  def getLightboxSection(name: String): js.Any = js.native
  /**
    * returns the name of the active lighbox's structure
    */
  def getLightboxType(): String = js.native
  /**
    * returns values of the lightbox's sections
    */
  def getLightboxValues(): js.Any = js.native
  /**
    * returns the dependency link object by the specified id
    * @param id the link id
    */
  def getLink(id: String): js.Any = js.native
  def getLink(id: Double): js.Any = js.native
  /**
    * returns the number of all dependency links presented in the Gantt chart
    */
  def getLinkCount(): Double = js.native
  /**
    * returns the HTML element of the specified dependency link
    * @param id the link id
    */
  def getLinkNode(id: String): HTMLElement = js.native
  def getLinkNode(id: Double): HTMLElement = js.native
  /**
    * returns all links presented in the Gantt chart
    */
  def getLinks(): js.Array[_] = js.native
  /**
    * gets the marker's object
    * @param markerId the marker's id
    */
  def getMarker(markerId: String): js.Any = js.native
  /**
    * returns the id of the next item (no matter what the level of nesting is: the same or different)
    * @param id the task id
    */
  def getNext(id: String): String | Double = js.native
  def getNext(id: Double): String | Double = js.native
  /**
    * returns the id of the next task of the same level
    * @param id the task id
    */
  def getNextSibling(id: String): String | Double = js.native
  def getNextSibling(id: Double): String | Double = js.native
  /**
    * returns the id of the parent task
    * @param id the task id
    */
  def getParent(id: String): String | Double = js.native
  def getParent(id: Double): String | Double = js.native
  /**
    * returns the id of the previous item (no matter what the level of nesting is: the same or different)
    * @param id the task id
    */
  def getPrev(id: String): String | Double = js.native
  def getPrev(id: Double): String | Double = js.native
  /**
    * returns the id of the previous task of the same level
    * @param id the task id
    */
  def getPrevSibling(id: String): String | Double = js.native
  def getPrevSibling(id: Double): String | Double = js.native
  /**
    * returns the stack of stored redo user actions
    */
  def getRedoStack(): js.Array[_] = js.native
  /**
    * returns all tasks assigned to the resource
    * @param resourceId the id of the resource
    */
  def getResourceAssignments(resourceId: String): js.Array[_] = js.native
  def getResourceAssignments(resourceId: Double): js.Array[_] = js.native
  /**
    * returns the configuration of the time scale
    */
  def getScale(): js.Any = js.native
  /**
    * returns the scroll position
    */
  def getScrollState(): js.Any = js.native
  /**
    * returns the id of the selected task
    */
  def getSelectedId(): String = js.native
  /**
    * returns an array of the currently selected tasks
    */
  def getSelectedTasks(): js.Array[_] = js.native
  /**
    * gets a key navigation shortcut handler
    * @param shortcut the key name or the name of keys combination for a shortcut (<a href="desktop/keyboard_navigation.md#shortcutsyntax">shortcut syntax</a>)
    * @param scope the name of the context element to attach the handler function to (<a href="desktop/keyboard_navigation.md#scopes">list of scopes</a>)
    */
  def getShortcutHandler(shortcut: String, scope: String): GanttCallback = js.native
  /**
    * returns siblings of the specified  task (including itself)
    * @param id the task id
    */
  def getSiblings(id: String): js.Array[_] = js.native
  def getSiblings(id: Double): js.Array[_] = js.native
  /**
    * checks how much time (in the current duration unit) a task has before it starts to affect other tasks
    * @param task1 the object of the 1st task to check the slack for
    * @param task2 the object of the 2nd task to check the slack for
    */
  def getSlack(task1: js.Any, task2: js.Any): Double | String = js.native
  /**
    * gets the current state of the Gantt chart
    */
  def getState(): js.Any = js.native
  /**
    * calculates the combined start/end dates of tasks nested in a project or another task
    * @param task_id optional, the task's id, api/gantt_root_id_config.md will be used if not specified
    */
  def getSubtaskDates(): js.Any = js.native
  def getSubtaskDates(task_id: String): js.Any = js.native
  def getSubtaskDates(task_id: Double): js.Any = js.native
  /**
    * calculates the combined duration of tasks nested in a project or another task.
    * @param task_id optional, the task's id, api/gantt_root_id_config.md will be used if not specified
    */
  def getSubtaskDuration(): Double = js.native
  def getSubtaskDuration(task_id: String): Double = js.native
  def getSubtaskDuration(task_id: Double): Double = js.native
  /**
    * returns the task object
    * @param id the task id
    */
  def getTask(id: String): js.Any = js.native
  def getTask(id: Double): js.Any = js.native
  /**
    * finds a task by the specified criteria
    * @param propertyName the name of the property to match, or a filter function
    * @param propertyValue the property value
    */
  def getTaskBy(propertyName: String, propertyValue: js.Any): js.Array[_] = js.native
  def getTaskBy(propertyName: GanttCallback, propertyValue: js.Any): js.Array[_] = js.native
  /**
    * returns a task by its index
    * @param index the task index in the tree (zero-based numbering)
    */
  def getTaskByIndex(index: Double): js.Any = js.native
  /**
    * returns a collection of tasks which occur during the specified period
    * @param from optional, the start date of the period
    * @param to optional, the end date of the period
    */
  def getTaskByTime(): js.Array[_] = js.native
  def getTaskByTime(from: Date): js.Array[_] = js.native
  def getTaskByTime(from: Date, to: Date): js.Array[_] = js.native
  /**
    * returns a task by its WBS code
    * @param code the WBS code of the task
    */
  def getTaskByWBSCode(code: String): js.Any = js.native
  /**
    * gets a calendar assigned to the specified task (a task level calendar)
    * @param task the object of a task
    */
  def getTaskCalendar(task: js.Any): js.Any = js.native
  /**
    * gets the number of tasks that are currently loaded in the gantt
    */
  def getTaskCount(): Double = js.native
  /**
    * returns the visible height of a task
    */
  def getTaskHeight(): Double = js.native
  /**
    * gets the index of a task in the branch
    * @param id the task id
    */
  def getTaskIndex(id: String): Double = js.native
  def getTaskIndex(id: Double): Double = js.native
  /**
    * returns the HTML element of the task bar
    * @param id the task id
    */
  def getTaskNode(id: String): HTMLElement = js.native
  def getTaskNode(id: Double): HTMLElement = js.native
  /**
    * calculates the position and size of the task's DOM element in the timeline area
    * @param task the task object
    * @param from the start date of the item
    * @param to the end date of the item
    */
  def getTaskPosition(task: js.Any, from: Date, to: Date): js.Any = js.native
  /**
    * returns the HTML element of the task row in the table
    * @param id the task id
    */
  def getTaskRowNode(id: String): HTMLElement = js.native
  def getTaskRowNode(id: Double): HTMLElement = js.native
  def getTaskTop(id: String): Double = js.native
  /**
    * gets the top position of the task's DOM element in the timeline area
    * @param id the task's id
    */
  def getTaskTop(id: Double): Double = js.native
  /**
    * returns the type of a task
    * @param task the task object
    */
  def getTaskType(task: js.Any): String = js.native
  /**
    * returns the total slack of a task
    * @param task the object of a task
    */
  def getTotalSlack(task: js.Any): Double = js.native
  /**
    * returns the stack of stored undo user actions
    */
  def getUndoStack(): js.Array[_] = js.native
  /**
    * gets the number of tasks visible on the screen (those that are not collapsed)
    */
  def getVisibleTaskCount(): Double = js.native
  /**
    * returns the WBS code (the outline number) of a task
    * @param task the object of a task
    */
  def getWBSCode(task: js.Any): String = js.native
  /**
    * returns the working hours of the specified date
    * @param date a date to check
    */
  def getWorkHours(date: Date): js.Array[_] = js.native
  /**
    * groups tasks by the specified task's attribute
    * @param config the grouping configuration object
    */
  def groupBy(config: js.Any): Unit = js.native
  /**
    * checks whether the specified item has child tasks
    * @param id the task id
    */
  def hasChild(id: String): Boolean = js.native
  def hasChild(id: Double): Boolean = js.native
  /**
    * hides the lightbox modal overlay that blocks interactions with the remaining screen
    * @param box optional, an element to hide
    */
  def hideCover(): Unit = js.native
  def hideCover(box: HTMLElement): Unit = js.native
  /**
    * closes the lightbox if it's currently active
    */
  def hideLightbox(): Unit = js.native
  /**
    * hides the pop-up task form (if it's currently active)
    */
  def hideQuickInfo(): Unit = js.native
  /**
    * converts an Excel file to JSON
    * @param config an object with configuration properties of an imported file
    */
  def importFromExcel(config: js.Any): Unit = js.native
  /**
    * converts an XML or MPP MS Project file to JSON
    * @param config an object with configuration properties of an imported file
    */
  def importFromMSProject(config: js.Any): Unit = js.native
  /**
    * constructor. Initializes a dhtmlxGantt object
    * @param container an HTML container ( or its id) where a dhtmlxGantt object will be initialized
    * @param from optional, the start value of the time scale    (X&ndash;Axis)
    * @param to optional, the end value of the time scale (X&ndash;Axis)
    */
  def init(container: String): Unit = js.native
  def init(container: String, from: Date): Unit = js.native
  def init(container: String, from: Date, to: Date): Unit = js.native
  def init(container: HTMLElement): Unit = js.native
  def init(container: HTMLElement, from: Date): Unit = js.native
  def init(container: HTMLElement, from: Date, to: Date): Unit = js.native
  /**
    * checks whether a task is a child of other task
    * @param childId the id of a task that you want to check as a child
    * @param parentId the id of a task that you want to check as a parent
    */
  def isChildOf(childId: String, parentId: String): Boolean = js.native
  def isChildOf(childId: String, parentId: Double): Boolean = js.native
  def isChildOf(childId: Double, parentId: String): Boolean = js.native
  def isChildOf(childId: Double, parentId: Double): Boolean = js.native
  /**
    * checks whether the link is circular
    * @param link the link object
    */
  def isCircularLink(link: js.Any): Boolean = js.native
  /**
    * checks whether the specified link is critical
    * @param link the link's object
    */
  def isCriticalLink(link: js.Any): Boolean = js.native
  /**
    * checks whether the specified task is critical
    * @param task the task's object
    */
  def isCriticalTask(task: js.Any): Boolean = js.native
  /**
    * checks whether the specified link is correct
    * @param link the link object
    */
  def isLinkAllowed(link: js.Any): Boolean = js.native
  /**
    * checks whether the specified link exists
    * @param id the link id
    */
  def isLinkExists(id: String): Boolean = js.native
  def isLinkExists(id: Double): Boolean = js.native
  /**
    * checks whether the specified task or link is read-only
    * @param id the task/link id
    */
  def isReadonly(id: String): Boolean = js.native
  def isReadonly(id: Double): Boolean = js.native
  /**
    * checks whether the specified task is currently selected
    * @param task the task's id
    */
  def isSelectedTask(task: String): Boolean = js.native
  def isSelectedTask(task: Double): Boolean = js.native
  /**
    * checks whether the specified task is split
    * @param task the object of a task
    */
  def isSplitTask(task: js.Any): Boolean = js.native
  /**
    * checks whether the specified task is summary
    * @param task the object of a task
    */
  def isSummaryTask(task: js.Any): Boolean = js.native
  /**
    * checks whether the specified task exists
    * @param id the task id
    */
  def isTaskExists(id: String): Boolean = js.native
  def isTaskExists(id: Double): Boolean = js.native
  /**
    * checks whether the specifies task is currently rendered in the Gantt chart
    * @param id the task's id
    */
  def isTaskVisible(id: String): Boolean = js.native
  def isTaskVisible(id: Double): Boolean = js.native
  /**
    * checks if the task is unscheduled
    * @param task the task's object
    */
  def isUnscheduledTask(task: js.Any): Boolean = js.native
  /**
    * checks whether the specified date is working or not
    * @param config the configuration object of a time span
    */
  def isWorkTime(config: js.Any): Boolean = js.native
  /**
    * checks whether the specified date is working or not
    * @param date a date to check
    * @param timeunit a time unit: 'hour' or 'day'.<br> If not specified, the value of 'gantt.config.duration_unit'  is used
    */
  def isWorkTime(date: Date, timeunit: String): Boolean = js.native
  /**
    * loads data to the gantt from an external data source
    * @param url the server-side url (may be a static file or a server side script that outputs data)
    * @param type optional, <i>('json', 'xml', 'oldxml')</i> the data type. The default value - <i>'json'</i>
    * @param callback optional, the callback function
    */
  def load(url: String): Unit = js.native
  def load(url: String, `type`: String): Unit = js.native
  def load(url: String, `type`: String, callback: GanttCallback): Unit = js.native
  /**
    * gets the id of a task from the specified HTML event
    * @param e a native event
    */
  def locate(e: Event): String | Double = js.native
  /**
    * calls a message box of the specified type
    * @param config the message box's configuration
    */
  def message(config: js.Any): HTMLElement = js.native
  /**
    * adds properties of the 'source' object into the 'target' object
    * @param target the target object
    * @param source the source object
    * @param force if true, properties of the 'source' will overwrite matching properties of the 'target', if there are any. If false, properties that already exist in the 'target' will be omitted
    */
  def mixin(target: js.Any, source: js.Any, force: Boolean): Unit = js.native
  /**
    * calls a modalbox
    * @param config the modal box's configuration
    */
  def modalbox(config: js.Any): HTMLElement = js.native
  /**
    * moves a task to a new position
    * @param sid the id of the task to move
    * @param tindex the index of the position that the task will be moved to <br> (the index within a branch)
    * @param parent optional, the parent id. If specified, the <b>tindex</b> will  refer to the  index in the <br> <b>'parent'</b> branch
    */
  def moveTask(sid: String, tindex: Double): Unit = js.native
  def moveTask(sid: String, tindex: Double, parent: String): Unit = js.native
  def moveTask(sid: String, tindex: Double, parent: Double): Unit = js.native
  def moveTask(sid: Double, tindex: Double): Unit = js.native
  def moveTask(sid: Double, tindex: Double, parent: String): Unit = js.native
  def moveTask(sid: Double, tindex: Double, parent: Double): Unit = js.native
  /**
    * opens the branch with the specified id
    * @param id the branch id
    */
  def open(id: String): Unit = js.native
  def open(id: Double): Unit = js.native
  /**
    * loads data from a client-side resource
    * @param url a string or object which represents data
    * @param type optional, optional, (<i>'json', 'xml'</i>) the data type. The default value - <i>'json'</i>
    */
  def parse(url: js.Any): Unit = js.native
  def parse(url: js.Any, `type`: String): Unit = js.native
  /**
    * gets the relative horizontal position of the specified date in the chart area
    * @param date a date you want to know the position of
    */
  def posFromDate(date: Date): Double = js.native
  /**
    * applies the reverted changes to the gantt once again
    */
  def redo(): Unit = js.native
  /**
    * refreshes data in the Gantt chart
    */
  def refreshData(): Unit = js.native
  /**
    * refreshes the specifies link
    * @param id the link id
    */
  def refreshLink(id: String): Unit = js.native
  def refreshLink(id: Double): Unit = js.native
  /**
    * refreshes the task and its related links
    * @param id the task id
    * @param refresh_links optional, optional, defines whether links related to the task should be refreshed, <em>true</em> by default
    */
  def refreshTask(id: String): Unit = js.native
  def refreshTask(id: String, refresh_links: Boolean): Unit = js.native
  def refreshTask(id: Double): Unit = js.native
  def refreshTask(id: Double, refresh_links: Boolean): Unit = js.native
  /**
    * removes the specified layer related to a link
    * @param layerId a DOM element that will be displayed in the layer
    */
  def removeLinkLayer(layerId: String): Unit = js.native
  /**
    * removes a keyboard shortcut
    * @param shortcut the key name or the name of keys combination for a shortcut (<a href="desktop/keyboard_navigation.md#shortcutsyntax">shortcut syntax</a>)
    * @param scope the element to which the shortcut is attached (<a href="desktop/keyboard_navigation.md#scopes">list of scopes</a>)
    */
  def removeShortcut(shortcut: String, scope: js.Any): Unit = js.native
  /**
    * removes the specified layer related to a task
    * @param layerId a DOM element that will be displayed in the layer
    */
  def removeTaskLayer(layerId: String): Unit = js.native
  /**
    * renders the whole Gantt chart
    */
  def render(): Unit = js.native
  /**
    * updates all markers on the page
    */
  def renderMarkers(): Unit = js.native
  /**
    * removes the current lightbox's HTML object element
    */
  def resetLightbox(): Unit = js.native
  /**
    * re-calculates the duration of a project task depending on the dates of its children
    * @param task the task's object
    */
  def resetProjectDates(task: js.Any): Unit = js.native
  /**
    * re-calculates the skin's settings from the related attached skin CSS file
    */
  def resetSkin(): Unit = js.native
  /**
    * forces the lightbox to resize
    */
  def resizeLightbox(): Unit = js.native
  /**
    * rounds the specified date to the nearest date in the time scale
    * @param date the Date object to round
    */
  def roundDate(date: Date): Date = js.native
  /**
    * rounds the start and end task's dates to the nearest dates in the time scale
    * @param task the task object
    */
  def roundTaskDates(task: js.Any): Unit = js.native
  /**
    * scrolls the Gantt container to the specified position
    * @param x value of horizontal scroll or 'null' (if the scroll position shouldn't be changed)
    * @param y value of vertical scroll or 'null' (if the scroll position shouldn't be changed)
    */
  def scrollTo(x: Double, y: Double): Unit = js.native
  /**
    * selects the specified task
    * @param id the task id
    */
  def selectTask(id: String): String | Double = js.native
  def selectTask(id: Double): String | Double = js.native
  /**
    * serializes the data into JSON or XML format
    * @param type optional, the format that the data will be serialized into. <br> Possible values: 'json' (<i>default</i> ), 'xml'.
    */
  def serialize(): Unit = js.native
  def serialize(`type`: String): Unit = js.native
  /**
    * returns a list of options
    * @param list_name the name of a list
    * @param options optional, an array of options
    */
  def serverList(list_name: String): js.Array[_] = js.native
  def serverList(list_name: String, options: js.Array[_]): js.Array[_] = js.native
  def setParent(task: String, pid: String): Unit = js.native
  def setParent(task: String, pid: Double): Unit = js.native
  def setParent(task: Double, pid: String): Unit = js.native
  /**
    * set the parent for a task
    * @param task the task id
    * @param pid the parent task id
    */
  def setParent(task: Double, pid: Double): Unit = js.native
  /**
    * resizes the Gantt chart
    */
  def setSizes(): Unit = js.native
  /**
    * sets the working time for the Gantt chart
    * @param config the configuration object of a time span
    */
  def setWorkTime(config: js.Any): Unit = js.native
  /**
    * shows the lightbox modal overlay that blocks interactions with the remaining screen
    * @param box optional, an element to hide
    */
  def showCover(): Unit = js.native
  def showCover(box: HTMLElement): Unit = js.native
  /**
    * scrolls the chart area to makes the specified date visible
    * @param date the date to show in the chart
    */
  def showDate(date: Date): Unit = js.native
  /**
    * opens the lightbox for the specified task
    * @param id the task id
    */
  def showLightbox(id: String): Unit = js.native
  def showLightbox(id: Double): Unit = js.native
  /**
    * displays the pop-up task form for the specified task
    * @param id the task id
    */
  def showQuickInfo(id: String): Unit = js.native
  def showQuickInfo(id: Double): Unit = js.native
  /**
    * makes the specified task visible on the screen
    * @param id the task id
    */
  def showTask(id: String): Unit = js.native
  def showTask(id: Double): Unit = js.native
  /**
    * sorts tasks in the grid
    * @param field the name of the column that the  grid will be sorted by or a custom sorting function
    * @param desc optional, specifies the sorting direction: <i>true</i> - descending sort and <i>false</i> - ascending<br> sort. By default, <i>false</i>
    * @param parent optional, the id of the parent task. Specify the parameter if you want to sort tasks only in the branch of the specified parent.
    * @param silent optional, specifies whether rendering should be invoked after reordering items
    */
  def sort(field: String): Unit = js.native
  def sort(field: String, desc: Boolean): Unit = js.native
  def sort(field: String, desc: Boolean, parent: String): Unit = js.native
  def sort(field: String, desc: Boolean, parent: String, silent: Boolean): Unit = js.native
  def sort(field: String, desc: Boolean, parent: Double): Unit = js.native
  def sort(field: String, desc: Boolean, parent: Double, silent: Boolean): Unit = js.native
  def sort(field: GanttCallback): Unit = js.native
  def sort(field: GanttCallback, desc: Boolean): Unit = js.native
  def sort(field: GanttCallback, desc: Boolean, parent: String): Unit = js.native
  def sort(field: GanttCallback, desc: Boolean, parent: String, silent: Boolean): Unit = js.native
  def sort(field: GanttCallback, desc: Boolean, parent: Double): Unit = js.native
  def sort(field: GanttCallback, desc: Boolean, parent: Double, silent: Boolean): Unit = js.native
  /**
    * selects the specified task if it was unselected and vice versa
    * @param task the task's id
    */
  def toggleTaskSelection(task: String): Unit = js.native
  def toggleTaskSelection(task: Double): Unit = js.native
  /**
    * returns a unique id
    */
  def uid(): Double = js.native
  /**
    * reverts the changes made in the gantt
    */
  def undo(): Unit = js.native
  /**
    * removes selection from the selected task
    * @param id optional, optional, the id of the task to remove selection from, see details
    */
  def unselectTask(): Unit = js.native
  def unselectTask(id: String): Unit = js.native
  def unselectTask(id: Double): Unit = js.native
  /**
    * unsets a working time in the Gantt Chart
    * @param config the configuration object of a time span
    */
  def unsetWorkTime(config: js.Any): Unit = js.native
  /**
    * updates the specified collection with new options
    * @param collection the name of the collection to update
    * @param options the new values of the collection
    */
  def updateCollection(collection: String, options: js.Array[_]): Boolean = js.native
  /**
    * updates the specified dependency link
    * @param id the task id
    */
  def updateLink(id: String): Unit = js.native
  /**
    * updates the specified marker
    * @param markerId the marker's id
    */
  def updateMarker(markerId: String): Unit = js.native
  /**
    * updates the specified task
    * @param id the task id
    */
  def updateTask(id: String): Unit = js.native
}

