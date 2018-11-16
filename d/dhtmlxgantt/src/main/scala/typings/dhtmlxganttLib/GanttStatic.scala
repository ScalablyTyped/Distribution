package typings
package dhtmlxganttLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GanttStatic extends js.Object {
  @JSName("$click")
  var $click: js.Any = js.native
  var config: GanttConfigOptions = js.native
  var date: GanttDateHelpers = js.native
  var keys: GanttHotkeys = js.native
  var locale: GanttLocale = js.native
  var skin: java.lang.String = js.native
  var templates: GanttTemplates = js.native
  var version: java.lang.String = js.native
  /**
  	 * adds a new dependency link
  	 * @param link the link object
  	*/
  def addLink(link: js.Any): java.lang.String | scala.Double = js.native
  /**
  	 * displayes an additional layer with custom elements for a link in the timeline area
  	 * @param func a render function  or a config object
  	*/
  def addLinkLayer(func: GanttCallback): java.lang.String = js.native
  /**
  	 * displayes an additional layer with custom elements for a link in the timeline area
  	 * @param func a render function  or a config object
  	*/
  def addLinkLayer(func: js.Any): java.lang.String = js.native
  /**
  	 * adds a marker to the timeline area
  	 * @param marker the marker's configuration object
  	*/
  def addMarker(marker: js.Any): java.lang.String = js.native
  /**
  	 * adds a new task
  	 * @param task the task object
  	 * @param parent the parent's id
  	 * @param index optional, the position the task will be added into (0 or greater)
  	*/
  def addTask(task: js.Any, parent: java.lang.String): java.lang.String | scala.Double = js.native
  /**
  	 * adds a new task
  	 * @param task the task object
  	 * @param parent the parent's id
  	 * @param index optional, the position the task will be added into (0 or greater)
  	*/
  def addTask(task: js.Any, parent: java.lang.String, index: scala.Double): java.lang.String | scala.Double = js.native
  /**
  	 * displayes an additional layer with custom elements for a task in the timeline area
  	 * @param func a render function  or a config object
  	*/
  def addTaskLayer(func: GanttCallback): java.lang.String = js.native
  /**
  	 * displayes an additional layer with custom elements for a task in the timeline area
  	 * @param func a render function  or a config object
  	*/
  def addTaskLayer(func: js.Any): java.lang.String = js.native
  /**
  	 * calls an alert message box
  	 * @param config the alert box's configuration
  	*/
  def alert(config: js.Any): scala.Unit = js.native
  /**
  	 * if the specified expression is false, an errorMessage is shown in the red popup at the top right corner of the screen
  	 * @param expression true to assert the expression, false - if assertion fails
  	 * @param errorMessage an error message that will be shown in the red popup
  	*/
  def assert(expression: scala.Boolean, errorMessage: java.lang.String): scala.Unit = js.native
  /**
  	 * attaches the handler to an inner event of dhtmlxGantt
  	 * @param name the event's name, case-insensitive
  	 * @param handler the handler function
  	*/
  def attachEvent(name: GanttEventName, handler: GanttCallback): java.lang.String = js.native
  /**
  	 * recalculates the schedule of the project
  	*/
  def autoSchedule(): scala.Unit = js.native
  /**
  	 * updates multiple tasks/links at once
  	 * @param callback the callback function
  	*/
  def batchUpdate(callback: GanttCallback): scala.Unit = js.native
  /**
  	 * creates a new function that, when called, has its <i>this</i> keyword set to the provided value
  	 * @param method the target function
  	 * @param thisArg the value to be passed as the <i>this</i> parameter to the target function when the bound function is called
  	*/
  def bind(method: GanttCallback, thisArg: js.Any): GanttCallback = js.native
  /**
  	 * calculates the duration of a task
  	 * @param start the date when a task is scheduled to begin
  	 * @param end the date when a task is scheduled to be completed
  	*/
  def calculateDuration(start: stdLib.Date, end: stdLib.Date): scala.Double = js.native
  /**
  	 * calculates the end date of a task
  	 * @param start the date when a task is scheduled to begin
  	 * @param duration the duration of a task
  	 * @param unit the time unit of the duration
  	*/
  def calculateEndDate(start: stdLib.Date, duration: scala.Double, unit: java.lang.String): stdLib.Date = js.native
  /**
  	 * calculates the level of a task
  	 * @param task the task's object
  	*/
  def calculateTaskLevel(task: js.Any): scala.Double = js.native
  /**
  	 * calls an inner event
  	 * @param name the event's name, case-insensitive
  	 * @param params an array of the event-related data
  	*/
  def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
  /**
  	 * changes the name of the lighbox's structure defined for  of the task
  	 * @param id the task id
  	*/
  def changeLightboxType(id: java.lang.String): scala.Unit = js.native
  /**
  	 * changes the name of the lighbox's structure defined for  of the task
  	 * @param id the task id
  	*/
  def changeLightboxType(id: scala.Double): scala.Unit = js.native
  /**
  	 * changes the link's id
  	 * @param id the current link's id
  	 * @param new_id the new link's id
  	*/
  def changeLinkId(id: java.lang.String, new_id: java.lang.String): scala.Unit = js.native
  /**
  	 * changes the link's id
  	 * @param id the current link's id
  	 * @param new_id the new link's id
  	*/
  def changeLinkId(id: java.lang.String, new_id: scala.Double): scala.Unit = js.native
  /**
  	 * changes the link's id
  	 * @param id the current link's id
  	 * @param new_id the new link's id
  	*/
  def changeLinkId(id: scala.Double, new_id: java.lang.String): scala.Unit = js.native
  /**
  	 * changes the link's id
  	 * @param id the current link's id
  	 * @param new_id the new link's id
  	*/
  def changeLinkId(id: scala.Double, new_id: scala.Double): scala.Unit = js.native
  /**
  	 * changes the task's id
  	 * @param id the current task's id
  	 * @param new_id the new task's id
  	*/
  def changeTaskId(id: java.lang.String, new_id: java.lang.String): scala.Unit = js.native
  /**
  	 * changes the task's id
  	 * @param id the current task's id
  	 * @param new_id the new task's id
  	*/
  def changeTaskId(id: java.lang.String, new_id: scala.Double): scala.Unit = js.native
  /**
  	 * changes the task's id
  	 * @param id the current task's id
  	 * @param new_id the new task's id
  	*/
  def changeTaskId(id: scala.Double, new_id: java.lang.String): scala.Unit = js.native
  /**
  	 * changes the task's id
  	 * @param id the current task's id
  	 * @param new_id the new task's id
  	*/
  def changeTaskId(id: scala.Double, new_id: scala.Double): scala.Unit = js.native
  /**
  	 * checks whether an event has some handler(s) specified
  	 * @param name the event's name
  	*/
  def checkEvent(name: GanttEventName): scala.Boolean = js.native
  /**
  	 * removes all tasks from the Gantt chart
  	*/
  def clearAll(): scala.Unit = js.native
  /**
  	 * closes the branch with the specified id
  	 * @param id the branch id
  	*/
  def close(id: java.lang.String): scala.Unit = js.native
  /**
  	 * closes the branch with the specified id
  	 * @param id the branch id
  	*/
  def close(id: scala.Double): scala.Unit = js.native
  /**
  	 * collapses gantt from the full screen mode to the normal mode
  	*/
  def collapse(): scala.Unit = js.native
  /**
  	 * calls a confirm message box
  	 * @param config the confirm box's configuration
  	*/
  def confirm(config: js.Any): scala.Unit = js.native
  /**
  	 * creates a deep copy of provided object
  	 * @param task the object that needs to be copied
  	*/
  def copy(task: js.Any): js.Any = js.native
  /**
  	 * recalculates the task duration in the work time
  	 * @param task the task's object
  	*/
  def correctTaskWorkTime(task: js.Any): scala.Unit = js.native
  /**
  	 * adds a new task and opens the lightbox to confirm
  	 * @param task the task object
  	 * @param parent the parent's id
  	 * @param index optional, the position the task will be added into (0 or greater)
  	*/
  def createTask(task: js.Any, parent: java.lang.String): java.lang.String | scala.Double = js.native
  /**
  	 * adds a new task and opens the lightbox to confirm
  	 * @param task the task object
  	 * @param parent the parent's id
  	 * @param index optional, the position the task will be added into (0 or greater)
  	*/
  def createTask(task: js.Any, parent: java.lang.String, index: scala.Double): java.lang.String | scala.Double = js.native
  /**
  	 * dataProcessor constructor
  	 * @param url url to the data feed
  	*/
  def dataProcessor(url: java.lang.String): scala.Unit = js.native
  /**
  	 * returns the date of the specified horizontal position in the chart area
  	 * @param pos the relative horizontal position you want to know the date of
  	*/
  def dateFromPos(pos: scala.Double): stdLib.Date = js.native
  /**
  	 * returns false if the provided argument is undefined, otherwise true
  	 * @param task the object that should be checked
  	*/
  def defined(task: js.Any): scala.Boolean = js.native
  /**
  	 * deletes the specified dependency link
  	 * @param id the dependency link's id
  	*/
  def deleteLink(id: java.lang.String): scala.Unit = js.native
  /**
  	 * deletes the specified dependency link
  	 * @param id the dependency link's id
  	*/
  def deleteLink(id: scala.Double): scala.Unit = js.native
  /**
  	 * deletes the specified marker
  	 * @param markerId the marker's id
  	*/
  def deleteMarker(markerId: java.lang.String): scala.Unit = js.native
  /**
  	 * deletes the specified  task
  	 * @param id the task's id
  	*/
  def deleteTask(id: java.lang.String): scala.Unit = js.native
  /**
  	 * detaches all events from dhtmlxGantt (both custom and inner)
  	*/
  def detachAllEvents(): scala.Unit = js.native
  /**
  	 * detaches a handler from an event (which was attached before by the attachEvent() method)
  	 * @param id the event's id
  	*/
  def detachEvent(id: java.lang.String): scala.Unit = js.native
  /**
  	 * iterates over all selected tasks in the Gantt chart
  	 * @param code a function that will iterate over tasks. Takes a task id as a parameter
  	*/
  def eachSelectedTask(code: GanttCallback): scala.Unit = js.native
  /**
  	 * iterates over specified tasks in the Gantt chart
  	 * @param code a function that will iterate over tasks. Takes a task object as a parameter
  	 * @param parent the parent id. If specified, the function will iterate over childs of the <br> specified parent
  	 * @param master the object, that 'this'  will refer to
  	*/
  def eachTask(code: GanttCallback): scala.Unit = js.native
  /**
  	 * iterates over specified tasks in the Gantt chart
  	 * @param code a function that will iterate over tasks. Takes a task object as a parameter
  	 * @param parent the parent id. If specified, the function will iterate over childs of the <br> specified parent
  	 * @param master the object, that 'this'  will refer to
  	*/
  def eachTask(code: GanttCallback, parent: java.lang.String): scala.Unit = js.native
  /**
  	 * iterates over specified tasks in the Gantt chart
  	 * @param code a function that will iterate over tasks. Takes a task object as a parameter
  	 * @param parent the parent id. If specified, the function will iterate over childs of the <br> specified parent
  	 * @param master the object, that 'this'  will refer to
  	*/
  def eachTask(code: GanttCallback, parent: java.lang.String, master: js.Any): scala.Unit = js.native
  /**
  	 * iterates over specified tasks in the Gantt chart
  	 * @param code a function that will iterate over tasks. Takes a task object as a parameter
  	 * @param parent the parent id. If specified, the function will iterate over childs of the <br> specified parent
  	 * @param master the object, that 'this'  will refer to
  	*/
  def eachTask(code: GanttCallback, parent: scala.Double): scala.Unit = js.native
  /**
  	 * iterates over specified tasks in the Gantt chart
  	 * @param code a function that will iterate over tasks. Takes a task object as a parameter
  	 * @param parent the parent id. If specified, the function will iterate over childs of the <br> specified parent
  	 * @param master the object, that 'this'  will refer to
  	*/
  def eachTask(code: GanttCallback, parent: scala.Double, master: js.Any): scala.Unit = js.native
  /**
  	 * attaches an event handler to an HTML element
  	 * @param node the HTML node or its id
  	 * @param event the name of an HTML event (without the 'on' prefix)
  	 * @param handler the event handler
  	 * @param master an object that the <i>this</i> keyword refers to
  	*/
  def event(node: java.lang.String, event: java.lang.String, handler: GanttCallback): java.lang.String = js.native
  /**
  	 * attaches an event handler to an HTML element
  	 * @param node the HTML node or its id
  	 * @param event the name of an HTML event (without the 'on' prefix)
  	 * @param handler the event handler
  	 * @param master an object that the <i>this</i> keyword refers to
  	*/
  def event(node: java.lang.String, event: java.lang.String, handler: GanttCallback, master: js.Any): java.lang.String = js.native
  /**
  	 * attaches an event handler to an HTML element
  	 * @param node the HTML node or its id
  	 * @param event the name of an HTML event (without the 'on' prefix)
  	 * @param handler the event handler
  	 * @param master an object that the <i>this</i> keyword refers to
  	*/
  def event(node: stdLib.HTMLElement, event: java.lang.String, handler: GanttCallback): java.lang.String = js.native
  /**
  	 * attaches an event handler to an HTML element
  	 * @param node the HTML node or its id
  	 * @param event the name of an HTML event (without the 'on' prefix)
  	 * @param handler the event handler
  	 * @param master an object that the <i>this</i> keyword refers to
  	*/
  def event(node: stdLib.HTMLElement, event: java.lang.String, handler: GanttCallback, master: js.Any): java.lang.String = js.native
  /**
  	 * removes an event handler from an HTML element
  	 * @param id the id of an event handler
  	*/
  def eventRemove(id: java.lang.String): scala.Unit = js.native
  /**
  	 * expands gantt to the full screen mode
  	*/
  def expand(): scala.Unit = js.native
  /**
  	 * returns the 1st-level child tasks of the specified parent branch
  	 * @param id the parent branch's id
  	*/
  def getChildren(id: java.lang.String): js.Array[_] = js.native
  /**
  	 * returns the 1st-level child tasks of the specified parent branch
  	 * @param id the parent branch's id
  	*/
  def getChildren(id: scala.Double): js.Array[_] = js.native
  /**
  	 * returns the closest working time
  	 * @param config the configuration object
  	*/
  def getClosestWorkTime(config: js.Any): stdLib.Date = js.native
  /**
  	 * get the index of a task in the tree
  	 * @param id the task id
  	*/
  def getGlobalTaskIndex(id: java.lang.String): scala.Unit = js.native
  /**
  	 * get the index of a task in the tree
  	 * @param id the task id
  	*/
  def getGlobalTaskIndex(id: scala.Double): scala.Unit = js.native
  /**
  	 * gets the configuration object of a column
  	 * @param name the column's name
  	*/
  def getGridColumn(name: java.lang.String): js.Any = js.native
  /**
  	 * gets columns of the Gantt chart
  	*/
  def getGridColumns(): js.Array[_] = js.native
  /**
  	 * gets the label of a select control in the lightbox
  	 * @param property the name of a data property that the control is mapped to
  	 * @param key the option's id. This parameter is compared with the task's data property to <br> assign the select's option to the task
  	*/
  def getLabel(property: java.lang.String, key: java.lang.String): scala.Unit = js.native
  /**
  	 * gets the label of a select control in the lightbox
  	 * @param property the name of a data property that the control is mapped to
  	 * @param key the option's id. This parameter is compared with the task's data property to <br> assign the select's option to the task
  	*/
  def getLabel(property: java.lang.String, key: scala.Double): scala.Unit = js.native
  /**
  	 * returns the id of the last selected task
  	*/
  def getLastSelectedTask(): java.lang.String | scala.Double = js.native
  /**
  	 * gets the lightbox's HTML object element
  	*/
  def getLightbox(): stdLib.HTMLElement = js.native
  /**
  	 * returns the object of the lightbox's section
  	 * @param name the name of the section
  	*/
  def getLightboxSection(name: java.lang.String): js.Any = js.native
  /**
  	 * returns the name of the active lighbox's structure
  	*/
  def getLightboxType(): java.lang.String = js.native
  /**
  	 * returns values of the lightbox's sections
  	*/
  def getLightboxValues(): js.Any = js.native
  /**
  	 * returns the dependency link object by the specified id
  	 * @param id the link id
  	*/
  def getLink(id: java.lang.String): js.Any = js.native
  /**
  	 * returns the dependency link object by the specified id
  	 * @param id the link id
  	*/
  def getLink(id: scala.Double): js.Any = js.native
  /**
  	 * returns the number of all dependency links presented in the Gantt chart
  	*/
  def getLinkCount(): scala.Double = js.native
  /**
  	 * returns the HTML element of the specified dependency link
  	 * @param id the link id
  	*/
  def getLinkNode(id: java.lang.String): stdLib.HTMLElement = js.native
  /**
  	 * returns the HTML element of the specified dependency link
  	 * @param id the link id
  	*/
  def getLinkNode(id: scala.Double): stdLib.HTMLElement = js.native
  /**
  	 * returns all links presented in the Gantt chart
  	*/
  def getLinks(): js.Array[_] = js.native
  /**
  	 * gets the marker's object
  	 * @param markerId the marker's id
  	*/
  def getMarker(markerId: java.lang.String): js.Any = js.native
  /**
  	 * returns the id of the next item (no matter what the level of nesting is: the same or different)
  	 * @param id the task id
  	*/
  def getNext(id: java.lang.String): java.lang.String | scala.Double = js.native
  /**
  	 * returns the id of the next item (no matter what the level of nesting is: the same or different)
  	 * @param id the task id
  	*/
  def getNext(id: scala.Double): java.lang.String | scala.Double = js.native
  /**
  	 * returns the id of the next task of the same level
  	 * @param id the task id
  	*/
  def getNextSibling(id: java.lang.String): java.lang.String | scala.Double = js.native
  /**
  	 * returns the id of the next task of the same level
  	 * @param id the task id
  	*/
  def getNextSibling(id: scala.Double): java.lang.String | scala.Double = js.native
  /**
  	 * returns the id of the parent task
  	 * @param id the task id
  	*/
  def getParent(id: java.lang.String): java.lang.String | scala.Double = js.native
  /**
  	 * returns the id of the parent task
  	 * @param id the task id
  	*/
  def getParent(id: scala.Double): java.lang.String | scala.Double = js.native
  /**
  	 * returns the id of the previous item (no matter what the level of nesting is: the same or different)
  	 * @param id the task id
  	*/
  def getPrev(id: java.lang.String): java.lang.String | scala.Double = js.native
  /**
  	 * returns the id of the previous item (no matter what the level of nesting is: the same or different)
  	 * @param id the task id
  	*/
  def getPrev(id: scala.Double): java.lang.String | scala.Double = js.native
  /**
  	 * returns the id of the previous task of the same level
  	 * @param id the task id
  	*/
  def getPrevSibling(id: java.lang.String): java.lang.String | scala.Double = js.native
  /**
  	 * returns the id of the previous task of the same level
  	 * @param id the task id
  	*/
  def getPrevSibling(id: scala.Double): java.lang.String | scala.Double = js.native
  /**
  	 * returns the stack of stored redo commands
  	*/
  def getRedoStack(): js.Array[_] = js.native
  /**
  	 * returns the scroll position
  	*/
  def getScrollState(): js.Any = js.native
  /**
  	 * returns the id of the selected task
  	*/
  def getSelectedId(): java.lang.String | scala.Double = js.native
  /**
  	 * returns an array of the currently selected tasks
  	*/
  def getSelectedTasks(): js.Array[_] = js.native
  /**
  	 * returns siblings of the specified  task (including itself)
  	 * @param id the task id
  	*/
  def getSiblings(id: java.lang.String): js.Array[_] = js.native
  /**
  	 * returns siblings of the specified  task (including itself)
  	 * @param id the task id
  	*/
  def getSiblings(id: scala.Double): js.Array[_] = js.native
  /**
  	 * checks how much time (in the current duration unit) a task has before it starts to affect other tasks
  	 * @param task1 the object of the 1st task to check the slack for
  	 * @param task2 the object of the 2nd task to check the slack for
  	*/
  def getSlack(task1: js.Any, task2: js.Any): scala.Double | java.lang.String = js.native
  /**
  	 * gets the current state of the Gantt chart
  	*/
  def getState(): js.Any = js.native
  /**
  	 * calculates the combined start/end dates of tasks nested in a project or another task
  	 * @param task_id the task's id, api/gantt_root_id_config.md will be used if not specified
  	*/
  def getSubtaskDates(): js.Any = js.native
  /**
  	 * calculates the combined start/end dates of tasks nested in a project or another task
  	 * @param task_id the task's id, api/gantt_root_id_config.md will be used if not specified
  	*/
  def getSubtaskDates(task_id: java.lang.String): js.Any = js.native
  /**
  	 * calculates the combined start/end dates of tasks nested in a project or another task
  	 * @param task_id the task's id, api/gantt_root_id_config.md will be used if not specified
  	*/
  def getSubtaskDates(task_id: scala.Double): js.Any = js.native
  /**
  	 * returns the task object
  	 * @param id the task id
  	*/
  def getTask(id: java.lang.String): js.Any = js.native
  /**
  	 * returns the task object
  	 * @param id the task id
  	*/
  def getTask(id: scala.Double): js.Any = js.native
  /**
  	 * returns a collection of tasks which occur during the specified period
  	 * @param from the start date of the period
  	 * @param to the end date of the period
  	*/
  def getTaskByTime(): js.Array[_] = js.native
  /**
  	 * returns a collection of tasks which occur during the specified period
  	 * @param from the start date of the period
  	 * @param to the end date of the period
  	*/
  def getTaskByTime(from: stdLib.Date): js.Array[_] = js.native
  /**
  	 * returns a collection of tasks which occur during the specified period
  	 * @param from the start date of the period
  	 * @param to the end date of the period
  	*/
  def getTaskByTime(from: stdLib.Date, to: stdLib.Date): js.Array[_] = js.native
  /**
  	 * gets the number of tasks that are currently loaded in the gantt
  	*/
  def getTaskCount(): scala.Double = js.native
  /**
  	 * get the index of a task in the branch
  	 * @param id the task id
  	*/
  def getTaskIndex(id: java.lang.String): scala.Double = js.native
  /**
  	 * get the index of a task in the branch
  	 * @param id the task id
  	*/
  def getTaskIndex(id: scala.Double): scala.Double = js.native
  /**
  	 * returns the HTML element of the task bar
  	 * @param id the task id
  	*/
  def getTaskNode(id: java.lang.String): stdLib.HTMLElement = js.native
  /**
  	 * returns the HTML element of the task bar
  	 * @param id the task id
  	*/
  def getTaskNode(id: scala.Double): stdLib.HTMLElement = js.native
  /**
  	 * calculates the position and size of the task's DOM element in the timeline area
  	 * @param task the task object
  	 * @param from the start date of the item
  	 * @param to the end date of the item
  	*/
  def getTaskPosition(task: js.Any, from: stdLib.Date, to: stdLib.Date): js.Any = js.native
  /**
  	 * returns the HTML element of the task row in the table
  	 * @param id the task id
  	*/
  def getTaskRowNode(id: java.lang.String): stdLib.HTMLElement = js.native
  /**
  	 * returns the HTML element of the task row in the table
  	 * @param id the task id
  	*/
  def getTaskRowNode(id: scala.Double): stdLib.HTMLElement = js.native
  /**
  	 * gets the top position of the task's DOM element in the timeline area
  	 * @param id the task's id
  	*/
  def getTaskTop(id: java.lang.String): scala.Double = js.native
  /**
  	 * gets the top position of the task's DOM element in the timeline area
  	 * @param id the task's id
  	*/
  def getTaskTop(id: scala.Double): scala.Double = js.native
  /**
  	 * returns the stack of stored undo commands
  	*/
  def getUndoStack(): js.Array[_] = js.native
  /**
  	 * gets the number of tasks visible on the screen (those that are not collapsed)
  	*/
  def getVisibleTaskCount(): scala.Double = js.native
  /**
  	 * returns the working hours of the specified date
  	 * @param date a date to check
  	*/
  def getWorkHours(date: stdLib.Date): js.Array[_] = js.native
  /**
  	 * groups tasks by the specified task's attribute
  	 * @param config the grouping configuration object
  	*/
  def groupBy(config: js.Any): scala.Unit = js.native
  /**
  	 * checks whether the specified item has child tasks
  	 * @param id the task id
  	*/
  def hasChild(id: java.lang.String): scala.Boolean = js.native
  /**
  	 * checks whether the specified item has child tasks
  	 * @param id the task id
  	*/
  def hasChild(id: scala.Double): scala.Boolean = js.native
  /**
  	 * hides the lightbox modal overlay that blocks interactions with the remaining screen
  	 * @param box an element to hide
  	*/
  def hideCover(): scala.Unit = js.native
  /**
  	 * hides the lightbox modal overlay that blocks interactions with the remaining screen
  	 * @param box an element to hide
  	*/
  def hideCover(box: stdLib.HTMLElement): scala.Unit = js.native
  /**
  	 * closes the lightbox if it's currently active
  	*/
  def hideLightbox(): scala.Unit = js.native
  /**
  	 * hides the pop-up task form (if it's currently active)
  	*/
  def hideQuickInfo(): scala.Unit = js.native
  /**
  	 * constructor. Initializes a dhtmlxGantt object
  	 * @param container an HTML container ( or its id) where a dhtmlxGantt object will be initialized
  	 * @param from the start value of the time scale	(X&ndash;Axis)
  	 * @param to the end value of the time scale (X&ndash;Axis)
  	*/
  def init(container: java.lang.String): scala.Unit = js.native
  /**
  	 * constructor. Initializes a dhtmlxGantt object
  	 * @param container an HTML container ( or its id) where a dhtmlxGantt object will be initialized
  	 * @param from the start value of the time scale	(X&ndash;Axis)
  	 * @param to the end value of the time scale (X&ndash;Axis)
  	*/
  def init(container: java.lang.String, from: stdLib.Date): scala.Unit = js.native
  /**
  	 * constructor. Initializes a dhtmlxGantt object
  	 * @param container an HTML container ( or its id) where a dhtmlxGantt object will be initialized
  	 * @param from the start value of the time scale	(X&ndash;Axis)
  	 * @param to the end value of the time scale (X&ndash;Axis)
  	*/
  def init(container: java.lang.String, from: stdLib.Date, to: stdLib.Date): scala.Unit = js.native
  /**
  	 * constructor. Initializes a dhtmlxGantt object
  	 * @param container an HTML container ( or its id) where a dhtmlxGantt object will be initialized
  	 * @param from the start value of the time scale	(X&ndash;Axis)
  	 * @param to the end value of the time scale (X&ndash;Axis)
  	*/
  def init(container: stdLib.HTMLElement): scala.Unit = js.native
  /**
  	 * constructor. Initializes a dhtmlxGantt object
  	 * @param container an HTML container ( or its id) where a dhtmlxGantt object will be initialized
  	 * @param from the start value of the time scale	(X&ndash;Axis)
  	 * @param to the end value of the time scale (X&ndash;Axis)
  	*/
  def init(container: stdLib.HTMLElement, from: stdLib.Date): scala.Unit = js.native
  /**
  	 * constructor. Initializes a dhtmlxGantt object
  	 * @param container an HTML container ( or its id) where a dhtmlxGantt object will be initialized
  	 * @param from the start value of the time scale	(X&ndash;Axis)
  	 * @param to the end value of the time scale (X&ndash;Axis)
  	*/
  def init(container: stdLib.HTMLElement, from: stdLib.Date, to: stdLib.Date): scala.Unit = js.native
  /**
  	 * checks whether a task is a child of other task
  	 * @param childId the id of a task that you want to check as a child
  	 * @param parentId the id of a task that you want to check as a parent
  	*/
  def isChildOf(childId: java.lang.String, parentId: java.lang.String): scala.Boolean = js.native
  /**
  	 * checks whether a task is a child of other task
  	 * @param childId the id of a task that you want to check as a child
  	 * @param parentId the id of a task that you want to check as a parent
  	*/
  def isChildOf(childId: java.lang.String, parentId: scala.Double): scala.Boolean = js.native
  /**
  	 * checks whether a task is a child of other task
  	 * @param childId the id of a task that you want to check as a child
  	 * @param parentId the id of a task that you want to check as a parent
  	*/
  def isChildOf(childId: scala.Double, parentId: java.lang.String): scala.Boolean = js.native
  /**
  	 * checks whether a task is a child of other task
  	 * @param childId the id of a task that you want to check as a child
  	 * @param parentId the id of a task that you want to check as a parent
  	*/
  def isChildOf(childId: scala.Double, parentId: scala.Double): scala.Boolean = js.native
  /**
  	 * checks whether the specified link is critical
  	 * @param link the link's object
  	*/
  def isCriticalLink(link: js.Any): scala.Boolean = js.native
  /**
  	 * checks whether the specified task is critical
  	 * @param task the task's object
  	*/
  def isCriticalTask(task: js.Any): scala.Boolean = js.native
  /**
  	 * checks whether the specified link is correct
  	 * @param link the link object
  	*/
  def isLinkAllowed(link: js.Any): scala.Boolean = js.native
  /**
  	 * checks whether the specified link exists
  	 * @param id the link id
  	*/
  def isLinkExists(id: java.lang.String): scala.Boolean = js.native
  /**
  	 * checks whether the specified link exists
  	 * @param id the link id
  	*/
  def isLinkExists(id: scala.Double): scala.Boolean = js.native
  /**
  	 * checks whether the specified task is currently selected
  	 * @param task the task's id
  	*/
  def isSelectedTask(task: java.lang.String): scala.Boolean = js.native
  /**
  	 * checks whether the specified task is currently selected
  	 * @param task the task's id
  	*/
  def isSelectedTask(task: scala.Double): scala.Boolean = js.native
  /**
  	 * checks whether the specified task exists
  	 * @param id the task id
  	*/
  def isTaskExists(id: java.lang.String): scala.Boolean = js.native
  /**
  	 * checks whether the specified task exists
  	 * @param id the task id
  	*/
  def isTaskExists(id: scala.Double): scala.Boolean = js.native
  /**
  	 * checks whether the specifies task is currently rendered in the Gantt chart
  	 * @param id the task's id
  	*/
  def isTaskVisible(id: java.lang.String): scala.Boolean = js.native
  /**
  	 * checks whether the specifies task is currently rendered in the Gantt chart
  	 * @param id the task's id
  	*/
  def isTaskVisible(id: scala.Double): scala.Boolean = js.native
  /**
  	 * checks if the task is unscheduled
  	 * @param task the task's object
  	*/
  def isUnscheduledTask(task: js.Any): scala.Boolean = js.native
  /**
  	 * checks whether the specified date is working or not
  	 * @param date a date to check
  	 * @param timeunit a time unit: 'hour' or 'day'.<br> If not specified, the value of 'gantt.config.duration_unit'  is used
  	*/
  def isWorkTime(date: stdLib.Date, timeunit: java.lang.String): scala.Boolean = js.native
  /**
  	 * loads data to the gantt from an external data source
  	 * @param url the server-side url (may be a static file or a server side script that outputs data)
  	 * @param type <i>('json', 'xml', 'oldxml')</i> the data type. The default value - <i>'json'</i>
  	 * @param callback the callback function
  	*/
  def load(url: java.lang.String): scala.Unit = js.native
  /**
  	 * loads data to the gantt from an external data source
  	 * @param url the server-side url (may be a static file or a server side script that outputs data)
  	 * @param type <i>('json', 'xml', 'oldxml')</i> the data type. The default value - <i>'json'</i>
  	 * @param callback the callback function
  	*/
  def load(url: java.lang.String, `type`: java.lang.String): scala.Unit = js.native
  /**
  	 * loads data to the gantt from an external data source
  	 * @param url the server-side url (may be a static file or a server side script that outputs data)
  	 * @param type <i>('json', 'xml', 'oldxml')</i> the data type. The default value - <i>'json'</i>
  	 * @param callback the callback function
  	*/
  def load(url: java.lang.String, `type`: java.lang.String, callback: GanttCallback): scala.Unit = js.native
  /**
  	 * gets the id of a task from the specified HTML event
  	 * @param e a native event
  	*/
  def locate(e: stdLib.Event): java.lang.String | scala.Double = js.native
  /**
  	 * calls a message box of the specified type
  	 * @param config the message box's configuration
  	*/
  def message(config: js.Any): scala.Unit = js.native
  /**
  	 * adds properties of the 'source' object into the 'target' object
  	 * @param target the target object
  	 * @param source the source object
  	 * @param force if true, properties of the 'source' will overwrite matching properties of the 'target', if there are any. If false, properties that already exist in the 'target' will be omitted
  	*/
  def mixin(target: js.Any, source: js.Any, force: scala.Boolean): scala.Unit = js.native
  /**
  	 * calls a modalbox
  	 * @param config the modal box' configuration
  	*/
  def modalbox(config: js.Any): scala.Unit = js.native
  /**
  	 * moves a task to a new position
  	 * @param sid the id of the task to move
  	 * @param tindex the index of the position that the task will be moved to <br> (the index within a branch)
  	 * @param parent the parent id. If specified, the <b>tindex</b> will  refer to the  index in the <br> <b>'parent'</b> branch
  	*/
  def moveTask(sid: java.lang.String, tindex: scala.Double): scala.Unit = js.native
  /**
  	 * moves a task to a new position
  	 * @param sid the id of the task to move
  	 * @param tindex the index of the position that the task will be moved to <br> (the index within a branch)
  	 * @param parent the parent id. If specified, the <b>tindex</b> will  refer to the  index in the <br> <b>'parent'</b> branch
  	*/
  def moveTask(sid: java.lang.String, tindex: scala.Double, parent: java.lang.String): scala.Unit = js.native
  /**
  	 * moves a task to a new position
  	 * @param sid the id of the task to move
  	 * @param tindex the index of the position that the task will be moved to <br> (the index within a branch)
  	 * @param parent the parent id. If specified, the <b>tindex</b> will  refer to the  index in the <br> <b>'parent'</b> branch
  	*/
  def moveTask(sid: java.lang.String, tindex: scala.Double, parent: scala.Double): scala.Unit = js.native
  /**
  	 * moves a task to a new position
  	 * @param sid the id of the task to move
  	 * @param tindex the index of the position that the task will be moved to <br> (the index within a branch)
  	 * @param parent the parent id. If specified, the <b>tindex</b> will  refer to the  index in the <br> <b>'parent'</b> branch
  	*/
  def moveTask(sid: scala.Double, tindex: scala.Double): scala.Unit = js.native
  /**
  	 * moves a task to a new position
  	 * @param sid the id of the task to move
  	 * @param tindex the index of the position that the task will be moved to <br> (the index within a branch)
  	 * @param parent the parent id. If specified, the <b>tindex</b> will  refer to the  index in the <br> <b>'parent'</b> branch
  	*/
  def moveTask(sid: scala.Double, tindex: scala.Double, parent: java.lang.String): scala.Unit = js.native
  /**
  	 * moves a task to a new position
  	 * @param sid the id of the task to move
  	 * @param tindex the index of the position that the task will be moved to <br> (the index within a branch)
  	 * @param parent the parent id. If specified, the <b>tindex</b> will  refer to the  index in the <br> <b>'parent'</b> branch
  	*/
  def moveTask(sid: scala.Double, tindex: scala.Double, parent: scala.Double): scala.Unit = js.native
  /**
  	 * opens the branch with the specified id
  	 * @param id the branch id
  	*/
  def open(id: java.lang.String): scala.Unit = js.native
  /**
  	 * opens the branch with the specified id
  	 * @param id the branch id
  	*/
  def open(id: scala.Double): scala.Unit = js.native
  /**
  	 * loads data from a client-side resource
  	 * @param url a string or object which represents data
  	 * @param type ( <i>'json', 'xml'</i> ) the data type. The default value - <i>'json'</i>
  	*/
  def parse(url: java.lang.String): scala.Unit = js.native
  /**
  	 * loads data from a client-side resource
  	 * @param url a string or object which represents data
  	 * @param type ( <i>'json', 'xml'</i> ) the data type. The default value - <i>'json'</i>
  	*/
  def parse(url: java.lang.String, `type`: java.lang.String): scala.Unit = js.native
  /**
  	 * loads data from a client-side resource
  	 * @param url a string or object which represents data
  	 * @param type ( <i>'json', 'xml'</i> ) the data type. The default value - <i>'json'</i>
  	*/
  def parse(url: js.Any): scala.Unit = js.native
  /**
  	 * loads data from a client-side resource
  	 * @param url a string or object which represents data
  	 * @param type ( <i>'json', 'xml'</i> ) the data type. The default value - <i>'json'</i>
  	*/
  def parse(url: js.Any, `type`: java.lang.String): scala.Unit = js.native
  /**
  	 * gets the relative horizontal position of the specified date in the chart area
  	 * @param date a date you want to know the position of
  	*/
  def posFromDate(date: stdLib.Date): scala.Unit = js.native
  /**
  	 * applies the reverted changes to the gantt once again
  	*/
  def redo(): scala.Unit = js.native
  /**
  	 * refreshes data in the Gantt chart
  	*/
  def refreshData(): scala.Unit = js.native
  /**
  	 * refreshes the specifies link
  	 * @param id the link id
  	*/
  def refreshLink(id: java.lang.String): scala.Unit = js.native
  /**
  	 * refreshes the specifies link
  	 * @param id the link id
  	*/
  def refreshLink(id: scala.Double): scala.Unit = js.native
  /**
  	 * refreshes the task and its related links
  	 * @param id the task id
  	*/
  def refreshTask(id: java.lang.String): scala.Unit = js.native
  /**
  	 * refreshes the task and its related links
  	 * @param id the task id
  	*/
  def refreshTask(id: scala.Double): scala.Unit = js.native
  /**
  	 * removes the specified layer related to a link
  	 * @param layerId a DOM element that will be displayed in the layer
  	*/
  def removeLinkLayer(layerId: java.lang.String): scala.Unit = js.native
  /**
  	 * removes the specified layer related to a task
  	 * @param layerId a DOM element that will be displayed in the layer
  	*/
  def removeTaskLayer(layerId: java.lang.String): scala.Unit = js.native
  /**
  	 * renders the whole Gantt chart
  	*/
  def render(): scala.Unit = js.native
  /**
  	 * updates all markers on the page
  	*/
  def renderMarkers(): scala.Unit = js.native
  /**
  	 * removes the current lightbox's HTML object element
  	*/
  def resetLightbox(): scala.Unit = js.native
  /**
  	 * re-calculates the duration of a project task depending on dates its childs
  	 * @param task the task's object
  	*/
  def resetProjectDates(task: js.Any): scala.Unit = js.native
  /**
  	 * re-calculates the skin's settings from the related attached skin CSS file
  	*/
  def resetSkin(): scala.Unit = js.native
  /**
  	 * forces the lightbox to resize
  	*/
  def resizeLightbox(): scala.Unit = js.native
  /**
  	 * rounds the specified date to the nearest date in the time scale
  	 * @param date the Date object to round
  	*/
  def roundDate(date: stdLib.Date): stdLib.Date = js.native
  /**
  	 * rounds the start and end task's dates to the nearest dates in the time scale
  	 * @param task the task object
  	*/
  def roundTaskDates(task: js.Any): scala.Unit = js.native
  /**
  	 * scrolls the Gantt container to the specified position
  	 * @param x the value of the horizontal scroll or 'null' (to not display the horizontal scroll)
  	 * @param y the value of the vertical scroll or 'null' (to not display the vertical scroll)
  	*/
  def scrollTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
  /**
  	 * selects the specified task
  	 * @param id the task id
  	*/
  def selectTask(id: java.lang.String): java.lang.String | scala.Double = js.native
  /**
  	 * selects the specified task
  	 * @param id the task id
  	*/
  def selectTask(id: scala.Double): java.lang.String | scala.Double = js.native
  /**
  	 * serializes the data into JSON or XML format
  	 * @param type the format that the data will be serialized into. <br> Possible values: 'json' (<i>default</i> ), 'xml'.
  	*/
  def serialize(): scala.Unit = js.native
  /**
  	 * serializes the data into JSON or XML format
  	 * @param type the format that the data will be serialized into. <br> Possible values: 'json' (<i>default</i> ), 'xml'.
  	*/
  def serialize(`type`: java.lang.String): scala.Unit = js.native
  /**
  	 * returns a list of options
  	 * @param list_name the name of a list
  	 * @param options an array of options
  	*/
  def serverList(list_name: java.lang.String): scala.Unit = js.native
  /**
  	 * returns a list of options
  	 * @param list_name the name of a list
  	 * @param options an array of options
  	*/
  def serverList(list_name: java.lang.String, options: js.Array[_]): scala.Unit = js.native
  /**
  	 * set the parent for a task
  	 * @param task the task id
  	 * @param pid the parent task id
  	*/
  def setParent(task: java.lang.String, pid: java.lang.String): scala.Unit = js.native
  /**
  	 * set the parent for a task
  	 * @param task the task id
  	 * @param pid the parent task id
  	*/
  def setParent(task: java.lang.String, pid: scala.Double): scala.Unit = js.native
  /**
  	 * set the parent for a task
  	 * @param task the task id
  	 * @param pid the parent task id
  	*/
  def setParent(task: scala.Double, pid: java.lang.String): scala.Unit = js.native
  /**
  	 * set the parent for a task
  	 * @param task the task id
  	 * @param pid the parent task id
  	*/
  def setParent(task: scala.Double, pid: scala.Double): scala.Unit = js.native
  /**
  	 * resizes the Gantt chart
  	*/
  def setSizes(): scala.Unit = js.native
  /**
  	 * sets the working time for the Gantt chart
  	 * @param config the configuration object of a time span
  	*/
  def setWorkTime(config: js.Any): scala.Unit = js.native
  /**
  	 * shows the lightbox modal overlay that blocks interactions with the remaining screen
  	 * @param box an element to hide
  	*/
  def showCover(): scala.Unit = js.native
  /**
  	 * shows the lightbox modal overlay that blocks interactions with the remaining screen
  	 * @param box an element to hide
  	*/
  def showCover(box: stdLib.HTMLElement): scala.Unit = js.native
  /**
  	 * scrolls the chart area to makes the specified date visible
  	 * @param date the date to show in the chart
  	*/
  def showDate(date: stdLib.Date): scala.Unit = js.native
  /**
  	 * opens the lightbox for the specified task
  	 * @param id the task id
  	*/
  def showLightbox(id: java.lang.String): scala.Unit = js.native
  /**
  	 * opens the lightbox for the specified task
  	 * @param id the task id
  	*/
  def showLightbox(id: scala.Double): scala.Unit = js.native
  /**
  	 * displays the pop-up task form for the specified task
  	 * @param id the task id
  	*/
  def showQuickInfo(id: java.lang.String): scala.Unit = js.native
  /**
  	 * displays the pop-up task form for the specified task
  	 * @param id the task id
  	*/
  def showQuickInfo(id: scala.Double): scala.Unit = js.native
  /**
  	 * makes the specified task visible on the screen
  	 * @param id the task id
  	*/
  def showTask(id: java.lang.String): scala.Unit = js.native
  /**
  	 * makes the specified task visible on the screen
  	 * @param id the task id
  	*/
  def showTask(id: scala.Double): scala.Unit = js.native
  /**
  	 * sorts the tasks in the grid
  	 * @param field the name of the column that the  grid will be sorted by or a custom <br> sorting function
  	 * @param desc specifies the sorting direction: <i>true</i> - descending sort and <i>false</i> - ascending<br> sort. By default, <i>false</i>
  	 * @param parent the id of the parent task. Specify the parameter if you want to sort tasks only in <br> the branch of the specified parent.
  	 * @param silent specifies whether rendering shall be invoked after reordering items
  	*/
  def sort(field: GanttCallback): scala.Unit = js.native
  /**
  	 * sorts the tasks in the grid
  	 * @param field the name of the column that the  grid will be sorted by or a custom <br> sorting function
  	 * @param desc specifies the sorting direction: <i>true</i> - descending sort and <i>false</i> - ascending<br> sort. By default, <i>false</i>
  	 * @param parent the id of the parent task. Specify the parameter if you want to sort tasks only in <br> the branch of the specified parent.
  	 * @param silent specifies whether rendering shall be invoked after reordering items
  	*/
  def sort(field: GanttCallback, desc: scala.Boolean): scala.Unit = js.native
  /**
  	 * sorts the tasks in the grid
  	 * @param field the name of the column that the  grid will be sorted by or a custom <br> sorting function
  	 * @param desc specifies the sorting direction: <i>true</i> - descending sort and <i>false</i> - ascending<br> sort. By default, <i>false</i>
  	 * @param parent the id of the parent task. Specify the parameter if you want to sort tasks only in <br> the branch of the specified parent.
  	 * @param silent specifies whether rendering shall be invoked after reordering items
  	*/
  def sort(field: GanttCallback, desc: scala.Boolean, parent: java.lang.String): scala.Unit = js.native
  /**
  	 * sorts the tasks in the grid
  	 * @param field the name of the column that the  grid will be sorted by or a custom <br> sorting function
  	 * @param desc specifies the sorting direction: <i>true</i> - descending sort and <i>false</i> - ascending<br> sort. By default, <i>false</i>
  	 * @param parent the id of the parent task. Specify the parameter if you want to sort tasks only in <br> the branch of the specified parent.
  	 * @param silent specifies whether rendering shall be invoked after reordering items
  	*/
  def sort(field: GanttCallback, desc: scala.Boolean, parent: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
  /**
  	 * sorts the tasks in the grid
  	 * @param field the name of the column that the  grid will be sorted by or a custom <br> sorting function
  	 * @param desc specifies the sorting direction: <i>true</i> - descending sort and <i>false</i> - ascending<br> sort. By default, <i>false</i>
  	 * @param parent the id of the parent task. Specify the parameter if you want to sort tasks only in <br> the branch of the specified parent.
  	 * @param silent specifies whether rendering shall be invoked after reordering items
  	*/
  def sort(field: GanttCallback, desc: scala.Boolean, parent: scala.Double): scala.Unit = js.native
  /**
  	 * sorts the tasks in the grid
  	 * @param field the name of the column that the  grid will be sorted by or a custom <br> sorting function
  	 * @param desc specifies the sorting direction: <i>true</i> - descending sort and <i>false</i> - ascending<br> sort. By default, <i>false</i>
  	 * @param parent the id of the parent task. Specify the parameter if you want to sort tasks only in <br> the branch of the specified parent.
  	 * @param silent specifies whether rendering shall be invoked after reordering items
  	*/
  def sort(field: GanttCallback, desc: scala.Boolean, parent: scala.Double, silent: scala.Boolean): scala.Unit = js.native
  /**
  	 * sorts the tasks in the grid
  	 * @param field the name of the column that the  grid will be sorted by or a custom <br> sorting function
  	 * @param desc specifies the sorting direction: <i>true</i> - descending sort and <i>false</i> - ascending<br> sort. By default, <i>false</i>
  	 * @param parent the id of the parent task. Specify the parameter if you want to sort tasks only in <br> the branch of the specified parent.
  	 * @param silent specifies whether rendering shall be invoked after reordering items
  	*/
  def sort(field: java.lang.String): scala.Unit = js.native
  /**
  	 * sorts the tasks in the grid
  	 * @param field the name of the column that the  grid will be sorted by or a custom <br> sorting function
  	 * @param desc specifies the sorting direction: <i>true</i> - descending sort and <i>false</i> - ascending<br> sort. By default, <i>false</i>
  	 * @param parent the id of the parent task. Specify the parameter if you want to sort tasks only in <br> the branch of the specified parent.
  	 * @param silent specifies whether rendering shall be invoked after reordering items
  	*/
  def sort(field: java.lang.String, desc: scala.Boolean): scala.Unit = js.native
  /**
  	 * sorts the tasks in the grid
  	 * @param field the name of the column that the  grid will be sorted by or a custom <br> sorting function
  	 * @param desc specifies the sorting direction: <i>true</i> - descending sort and <i>false</i> - ascending<br> sort. By default, <i>false</i>
  	 * @param parent the id of the parent task. Specify the parameter if you want to sort tasks only in <br> the branch of the specified parent.
  	 * @param silent specifies whether rendering shall be invoked after reordering items
  	*/
  def sort(field: java.lang.String, desc: scala.Boolean, parent: java.lang.String): scala.Unit = js.native
  /**
  	 * sorts the tasks in the grid
  	 * @param field the name of the column that the  grid will be sorted by or a custom <br> sorting function
  	 * @param desc specifies the sorting direction: <i>true</i> - descending sort and <i>false</i> - ascending<br> sort. By default, <i>false</i>
  	 * @param parent the id of the parent task. Specify the parameter if you want to sort tasks only in <br> the branch of the specified parent.
  	 * @param silent specifies whether rendering shall be invoked after reordering items
  	*/
  def sort(field: java.lang.String, desc: scala.Boolean, parent: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
  /**
  	 * sorts the tasks in the grid
  	 * @param field the name of the column that the  grid will be sorted by or a custom <br> sorting function
  	 * @param desc specifies the sorting direction: <i>true</i> - descending sort and <i>false</i> - ascending<br> sort. By default, <i>false</i>
  	 * @param parent the id of the parent task. Specify the parameter if you want to sort tasks only in <br> the branch of the specified parent.
  	 * @param silent specifies whether rendering shall be invoked after reordering items
  	*/
  def sort(field: java.lang.String, desc: scala.Boolean, parent: scala.Double): scala.Unit = js.native
  /**
  	 * sorts the tasks in the grid
  	 * @param field the name of the column that the  grid will be sorted by or a custom <br> sorting function
  	 * @param desc specifies the sorting direction: <i>true</i> - descending sort and <i>false</i> - ascending<br> sort. By default, <i>false</i>
  	 * @param parent the id of the parent task. Specify the parameter if you want to sort tasks only in <br> the branch of the specified parent.
  	 * @param silent specifies whether rendering shall be invoked after reordering items
  	*/
  def sort(field: java.lang.String, desc: scala.Boolean, parent: scala.Double, silent: scala.Boolean): scala.Unit = js.native
  /**
  	 * selects the specified task if it was unselected and vice versa
  	 * @param task the task's id
  	*/
  def toggleTaskSelection(task: java.lang.String): scala.Unit = js.native
  /**
  	 * selects the specified task if it was unselected and vice versa
  	 * @param task the task's id
  	*/
  def toggleTaskSelection(task: scala.Double): scala.Unit = js.native
  /**
  	 * returns a unique id
  	*/
  def uid(): scala.Double = js.native
  /**
  	 * reverts the changes made in the gantt
  	*/
  def undo(): scala.Unit = js.native
  /**
  	 * removes selection from the selected task
  	*/
  def unselectTask(): scala.Unit = js.native
  /**
  	 * updates the specified collection with new options
  	 * @param collection the name of the collection to update
  	 * @param options the new values of the collection
  	*/
  def updateCollection(collection: java.lang.String, options: js.Array[_]): scala.Boolean = js.native
  /**
  	 * updates the specified dependency link
  	 * @param id the task id
  	*/
  def updateLink(id: java.lang.String): scala.Unit = js.native
  /**
  	 * updates the specified marker
  	 * @param markerId the marker's id
  	*/
  def updateMarker(markerId: java.lang.String): scala.Unit = js.native
  /**
  	 * updates the specified task
  	 * @param id the task id
  	*/
  def updateTask(id: java.lang.String): scala.Unit = js.native
}

