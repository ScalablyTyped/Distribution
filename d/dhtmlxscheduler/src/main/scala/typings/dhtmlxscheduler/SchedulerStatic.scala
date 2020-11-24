package typings.dhtmlxscheduler

import typings.std.Date
import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchedulerStatic extends js.Object {
  
  /**
    * adds a new event
    * @param event the event object
    */
  def addEvent(event: js.Any): String = js.native
  
  /**
    * adds a new event and opens the lightbox to confirm
    * @param event the event object
    */
  def addEventNow(event: js.Any): String = js.native
  
  /**
    * marks dates, but with certain settings makes blocking (unlike blockTime() allows setting custom styling for the limit)
    * @param config the configuration object of the timespan to mark/block
    */
  def addMarkedTimespan(config: js.Any): Double = js.native
  
  /**
    * adds a section to the currently active view (if the opened view isn't Timeline in the 'Tree' mode - the method will be ignored)
    * @param section the object of the section to add
    * @param parent_id the id of the parent section. Pass 'null' if you are adding a section to the root
    */
  def addSection(section: js.Any, parent_id: String): Boolean = js.native
  
  /**
    * adds a new keyboard shortcut
    * @param shortcut the key name or the name of keys combination for a shortcut (shortcut syntax)
    * @param handler the handler of the shortcut call
    * @param scope the name of the context element to attach the handler function to (list of scopes)
    */
  def addShortcut(shortcut: String, handler: js.Function0[Unit]): Unit = js.native
  def addShortcut(shortcut: String, handler: js.Function0[Unit], scope: js.Any): Unit = js.native
  
  /**
    * attaches the handler to an inner event of dhtmlxScheduler
    * @param name the event's name, case-insensitive
    * @param handler the handler function
    */
  def attachEvent(name: SchedulerEventName, handler: SchedulerCallback): String = js.native
  
  /**
    * makes the scheduler reflect all data changes in the Backbone model and vice versa
    * @param events the Backbone data collection
    */
  def backbone(events: js.Any): Unit = js.native
  
  def blockTime(date: Double, time_points: js.Array[_]): Unit = js.native
  def blockTime(date: Double, time_points: js.Array[_], items: js.Any): Unit = js.native
  /**
    * blocks the specified date and applies the default 'dimmed' style to it.
    * @param date a date to block ( if a number is provided, the parameter will be treated as a week <br> day: '0' index refers to Sunday,'6' - to Saturday )
    * @param time_points an array <b>[start_minute,end_minute,..,start_minute_N,end_minute_N]</b>, <br> where each pair sets a certain limit range. The array can have any number of <br> such pairs
    * @param items defines specific items of  view(s) to block
    */
  def blockTime(date: Date, time_points: js.Array[_]): Unit = js.native
  def blockTime(date: Date, time_points: js.Array[_], items: js.Any): Unit = js.native
  
  /**
    * calls an inner event
    * @param name the event's name, case-insensitive
    * @param params an array of the event-related data
    */
  def callEvent(name: String, params: js.Array[_]): Boolean = js.native
  
  /**
    * changes the event's id
    * @param id the current event's id
    * @param new_id the new event's id
    */
  def changeEventId(id: String, new_id: String): Unit = js.native
  
  /**
    * checks whether the specified event occurs at the time that has already been occupied by another event(s)
    * @param event the event object
    */
  def checkCollision(event: js.Any): Boolean = js.native
  
  /**
    * checks whether an event has some handler(s) specified
    * @param name the event's name
    */
  def checkEvent(name: SchedulerEventName): Boolean = js.native
  
  /**
    * checks whether an event resides in a timespan of a specific type
    * @param event the event object
    * @param timespan the timespan's type
    */
  def checkInMarkedTimespan(event: js.Any, timespan: String): Boolean = js.native
  
  /**
    * checks whether the specified event takes place at the blocked time period
    * @param event the event object
    */
  def checkLimitViolation(event: js.Any): Boolean = js.native
  
  /**
    * removes all events from the scheduler
    */
  def clearAll(): Unit = js.native
  
  /**
    * closes all sections in the currently active view (if the opened view isn't Timeline in the 'Tree' mode - the method will be ignored)
    */
  def closeAllSections(): Unit = js.native
  
  /**
    * closes the specified section in the currently active view (if the opened view isn't Timeline in the 'Tree' mode - the method will be ignored)
    * @param section_id the section's id
    */
  def closeSection(section_id: String): Unit = js.native
  
  /**
    * collapses the expanded scheduler back to the normal size
    */
  def collapse(): Unit = js.native
  
  var config: SchedulerConfigOptions = js.native
  
  /**
    * creates the Grid view in the scheduler
    * @param config the configuration object of the Grid view
    */
  def createGridView(config: js.Any): Unit = js.native
  
  /**
    * creates the Timeline view in the scheduler
    * @param config the configuration object of the Timeline view
    */
  def createTimelineView(config: js.Any): Unit = js.native
  
  /**
    * creates the Units view in the scheduler
    * @param config the configuration object of the Units view
    */
  def createUnitsView(config: js.Any): Unit = js.native
  
  var date: SchedulerDateHelpers = js.native
  
  /**
    * deletes all sections from  the currently active view (if the opened view isn't Timeline in the 'Tree' mode - the method will be ignored)
    */
  def deleteAllSections(): Unit = js.native
  
  /**
    * deletes the specified event
    * @param id the event's id
    */
  def deleteEvent(id: String): Unit = js.native
  def deleteEvent(id: Double): Unit = js.native
  
  /**
    * removes all blocking sets from the scheduler
    */
  def deleteMarkedTimespan(): js.Any = js.native
  /**
    * removes marking/blocking set by the addMarkedTimespan() and blockTime() methods
    * @param configuration for deleting
    */
  def deleteMarkedTimespan(config: js.Any): js.Any = js.native
  /**
    * removes marking/blocking set by the addMarkedTimespan() and blockTime() methods
    * @param id the timespan's id
    */
  def deleteMarkedTimespan(id: String): Unit = js.native
  
  /**
    * deletes a section from  the currently active view (if the opened view isn't Timeline in the 'Tree' mode - the method will be ignored)
    * @param section_id the section's id
    */
  def deleteSection(section_id: String): Boolean = js.native
  
  /**
    * destroys previously created mini-calendar
    * @param name the mini-calendar's object (if not specified, the scheduler attempts <br> to destroy the last created mini calendar)
    */
  def destroyCalendar(): Unit = js.native
  def destroyCalendar(name: js.Any): Unit = js.native
  
  /**
    * detaches a handler from an event (which was attached before by the attachEvent method)
    * @param id the event's id
    */
  def detachEvent(id: String): Unit = js.native
  
  /**
    * opens the inline editor to alter the event's text  (the editor in the event's box)
    * @param id the event's id
    */
  def edit(id: String): Unit = js.native
  
  /**
    * closes the inline event editor, if it's currently open
    * @param id the event's id
    */
  def editStop(id: String): Unit = js.native
  
  /**
    * closes the lightbox
    * @param mode if set to <i>true</i>, the changes, made in the lightbox, will be saved before closing. <br> If - <i>false</i>, the changes will be cancelled.
    * @param box the HTML container for the lightbox
    */
  def endLightbox(mode: Boolean): Unit = js.native
  def endLightbox(mode: Boolean, box: HTMLElement): Unit = js.native
  
  /**
    * expands the scheduler to the full screen view
    */
  def expand(): Unit = js.native
  
  /**
    * filter events that will be displayed on the agenda view
    */
  def filter_agenda(id: String, event: js.Any): Boolean = js.native
  def filter_agenda(id: Double, event: js.Any): Boolean = js.native
  /**
    * filter events that will be displayed on the agenda view
    */
  @JSName("filter_agenda")
  var filter_agenda_Original: SchedulerFilterCallback = js.native
  
  /**
    * filter events that will be displayed on the day view
    */
  def filter_day(id: String, event: js.Any): Boolean = js.native
  def filter_day(id: Double, event: js.Any): Boolean = js.native
  /**
    * filter events that will be displayed on the day view
    */
  @JSName("filter_day")
  var filter_day_Original: SchedulerFilterCallback = js.native
  
  /**
    * filter events that will be displayed on the grid view
    */
  def filter_grid(id: String, event: js.Any): Boolean = js.native
  def filter_grid(id: Double, event: js.Any): Boolean = js.native
  /**
    * filter events that will be displayed on the grid view
    */
  @JSName("filter_grid")
  var filter_grid_Original: SchedulerFilterCallback = js.native
  
  /**
    * filter events that will be displayed on the month view
    */
  def filter_month(id: String, event: js.Any): Boolean = js.native
  def filter_month(id: Double, event: js.Any): Boolean = js.native
  /**
    * filter events that will be displayed on the month view
    */
  @JSName("filter_month")
  var filter_month_Original: SchedulerFilterCallback = js.native
  
  /**
    * filter events that will be displayed on the timeline view
    */
  def filter_timeline(id: String, event: js.Any): Boolean = js.native
  def filter_timeline(id: Double, event: js.Any): Boolean = js.native
  /**
    * filter events that will be displayed on the timeline view
    */
  @JSName("filter_timeline")
  var filter_timeline_Original: SchedulerFilterCallback = js.native
  
  /**
    * filter events that will be displayed on the units view
    */
  def filter_units(id: String, event: js.Any): Boolean = js.native
  def filter_units(id: Double, event: js.Any): Boolean = js.native
  /**
    * filter events that will be displayed on the units view
    */
  @JSName("filter_units")
  var filter_units_Original: SchedulerFilterCallback = js.native
  
  /**
    * filter events that will be displayed on the week view
    */
  def filter_week(id: String, event: js.Any): Boolean = js.native
  def filter_week(id: Double, event: js.Any): Boolean = js.native
  /**
    * filter events that will be displayed on the week view
    */
  @JSName("filter_week")
  var filter_week_Original: SchedulerFilterCallback = js.native
  
  /**
    * filter events that will be displayed on the year view
    */
  def filter_year(id: String, event: js.Any): Boolean = js.native
  def filter_year(id: Double, event: js.Any): Boolean = js.native
  /**
    * filter events that will be displayed on the year view
    */
  @JSName("filter_year")
  var filter_year_Original: SchedulerFilterCallback = js.native
  
  /**
    * gives access to the objects of lightbox's sections
    * @param name the name of a lightbox section
    */
  def formSection(name: String): js.Any = js.native
  
  /**
    * returns the current cursor-pointed date and section (if defined)
    * @param e a native event object
    */
  def getActionData(e: Event): js.Any = js.native
  
  /**
    * returns the event object by its id
    * @param event_id the  event's id
    */
  def getEvent(event_id: String): js.Any = js.native
  def getEvent(event_id: Double): js.Any = js.native
  
  /**
    * gets the event's end date
    * @param id the event's id
    */
  def getEventEndDate(id: String): Date = js.native
  def getEventEndDate(id: Double): Date = js.native
  
  /**
    * gets the event's start date
    * @param id the event's id
    */
  def getEventStartDate(id: String): Date = js.native
  def getEventStartDate(id: Double): Date = js.native
  
  /**
    * gets the event's text
    * @param id the event's id
    */
  def getEventText(id: String): String = js.native
  def getEventText(id: Double): String = js.native
  
  /**
    * returns a collection of events which occur during the specified period
    * @param from the start date of the period
    * @param to the end date of the period
    */
  def getEvents(): js.Any = js.native
  def getEvents(from: js.UndefOr[scala.Nothing], to: Date): js.Any = js.native
  def getEvents(from: Date): js.Any = js.native
  def getEvents(from: Date, to: Date): js.Any = js.native
  
  /**
    * gets the label of a select control in the lightbox
    * @param property the name of a data property that the control is mapped to
    * @param key the option's id. This parameter is compared with the event's data property <br> to assign the select's option to an event
    */
  def getLabel(property: String, key: String): js.Any = js.native
  def getLabel(property: String, key: Double): js.Any = js.native
  
  /**
    * gets the lightbox's HTML object element
    */
  def getLightbox(): HTMLElement = js.native
  
  /**
    * returns all occurrences of a recurring event
    * @param id the id of a recurring event
    * @param number the maximum number of occurrences to return (by default, 100)
    */
  def getRecDates(id: String, number: Double): js.Any = js.native
  
  /**
    * gets the object of the currently displayed event
    * @param id the event's id
    */
  def getRenderedEvent(id: String): HTMLElement = js.native
  
  /**
    * gets the object of the specified section in the currently active view (if the opened view isn't Timeline in the 'Tree' mode - the method will be ignored)
    * @param section_id the section's id
    */
  def getSection(section_id: String): js.Any = js.native
  
  /**
    * gets the current state of the scheduler
    */
  def getState(): js.Any = js.native
  
  /**
    * gets the user data associated with the specified event
    * @param id the event's id
    * @param name the user data name
    */
  def getUserData(id: String, name: String): js.Any = js.native
  
  /**
    * hides the lightbox modal overlay that blocks interactions with the remaining screen
    * @param box an element to hide
    */
  def hideCover(): Unit = js.native
  def hideCover(box: HTMLElement): Unit = js.native
  
  /**
    * hides the pop-up event form (if it's currently active)
    */
  def hideQuickInfo(): Unit = js.native
  
  /**
    * highlights the event's duration on the time scale
    * @param event the event object
    */
  def highlightEventPosition(event: js.Any): Unit = js.native
  
  /**
    * constructor. Initializes a dhtmlxScheduler object
    * @param container an HTML container ( or its id) where a dhtmlxScheduler object will be initialized
    * @param date the initial date of the scheduler (by default, the current date)
    * @param view the name of the initial view (by default, "week")
    */
  def init(container: String): Unit = js.native
  def init(container: String, date: js.UndefOr[scala.Nothing], view: String): Unit = js.native
  def init(container: String, date: Date): Unit = js.native
  def init(container: String, date: Date, view: String): Unit = js.native
  def init(container: HTMLElement): Unit = js.native
  def init(container: HTMLElement, date: js.UndefOr[scala.Nothing], view: String): Unit = js.native
  def init(container: HTMLElement, date: Date): Unit = js.native
  def init(container: HTMLElement, date: Date, view: String): Unit = js.native
  
  /**
    * inverts the specified time zones
    * @param zones an array **[start_minute,end_minute,..,start_minute_N,end_minute_N]** <br >where each pair sets a certain limit range (in minutes). The array can have any <br> number of such pairs
    */
  def invertZones(zones: js.Array[_]): Unit = js.native
  
  /**
    * checks whether the calendar is currently opened in the scheduler
    */
  def isCalendarVisible(): Boolean | HTMLElement = js.native
  
  /**
    * checks whether the specified event one-day or multi-day
    * @param event the event object
    */
  def isOneDayEvent(event: js.Any): Boolean = js.native
  
  /**
    * checks whether a view with the specified name exists
    * @param name the view name
    */
  def isViewExists(name: String): Boolean = js.native
  
  var keys: SchedulerHotkeys = js.native
  
  /**
    * 'says' to change the active date in the mini calendar each time, the active date in the scheduler is changed
    * @param calendar the mini calendar object
    * @param shift a function that defines the difference between active dates in the mini-calendar <br> and the scheduler. The function takes the scheduler's date as a parameter and <br> returns the date that should be displayed in the mini calendar
    */
  def linkCalendar(calendar: js.Any, shift: SchedulerCallback): Unit = js.native
  
  /**
    * loads data to the scheduler from an external data source
    * @param url the server side url (may be a static file or a server side script which outputs data <br>  as XML)
    * @param type <i>('json', 'xml', 'ical')</i> the data type. The default value - <i>'xml'</i>
    * @param callback the callback function
    */
  def load(url: String): Unit = js.native
  def load(url: String, `type`: js.UndefOr[scala.Nothing], callback: SchedulerCallback): Unit = js.native
  def load(url: String, `type`: String): Unit = js.native
  def load(url: String, `type`: String, callback: SchedulerCallback): Unit = js.native
  
  var locale: SchedulerLocale = js.native
  
  /**
    * applies a css class to the specified date
    * @param calendar the calendar object
    * @param date the date to mark
    * @param css the name of a css class
    */
  def markCalendar(calendar: js.Any, date: Date, css: String): Unit = js.native
  
  /**
    * marks and/or blocks date(s) by applying the default or a custom style to them. Marking is cancelled right after any internal update in the app. Can be used for highlighting
    * @param config the configuration object of the timespan to mark/block
    */
  def markTimespan(config: js.Any): Unit = js.native
  
  /**
    * opens all sections in the currently active view (if the opened view isn't Timeline in the 'Tree' mode - the method will be ignored)
    */
  def openAllSections(): Unit = js.native
  
  /**
    * opens the specified section in the currently active view (if the opened view isn't Timeline in the 'Tree' mode - the method will be ignored)
    * @param section_id the section's id
    */
  def openSection(section_id: String): Unit = js.native
  
  /**
    * loads data from a client-side resource
    * @param data a string or object which represents data
    * @param type (<i>'json', 'xml', 'ical'</i>) the data type. The default value - <i>'xml'</i>
    */
  def parse(data: js.Any): Unit = js.native
  def parse(data: js.Any, `type`: String): Unit = js.native
  
  /**
    * removes a keyboard shortcut
    * @param shortcut the key name or the name of keys combination for a shortcut (shortcut syntax)
    * @param scope the element to which the shortcut is attached (list of scopes)
    */
  def removeShortcut(shortcut: String, scope: js.Any): Unit = js.native
  
  /**
    * creates a mini calendar
    * @param config the calendar configuration object
    */
  def renderCalendar(config: js.Any): Unit = js.native
  
  /**
    * generates HTML content for a custom event's box
    * @param container the event container
    * @param event the event object
    */
  def renderEvent(container: HTMLElement, event: js.Any): Boolean = js.native
  
  /**
    * removes the current lightbox's HTML object element
    */
  def resetLightbox(): Unit = js.native
  
  /**
    * scrolls the specified number of units in the Units view
    * @param step the number of units to scroll (<i>set the positive value to scroll units to the right <br> side,  the negative value - to the left side</i>).
    */
  def scrollUnit(step: Double): Unit = js.native
  
  /**
    * selects the specified event
    * @param id the event's id
    */
  def select(id: String): Unit = js.native
  
  /**
    * returns a list of options
    * @param list_name the name of a list
    * @param options an array of options
    */
  def serverList(list_name: String): Unit = js.native
  def serverList(list_name: String, options: js.Array[_]): Unit = js.native
  
  /**
    * displays the specified view and date
    * @param date the date to display
    * @param view the name of a view to display
    */
  def setCurrentView(): Unit = js.native
  def setCurrentView(date: js.UndefOr[scala.Nothing], view: String): Unit = js.native
  def setCurrentView(date: Date): Unit = js.native
  def setCurrentView(date: Date, view: String): Unit = js.native
  
  /**
    * adds a new event to the scheduler's data pool
    * @param id the event's id
    * @param event the event object
    */
  def setEvent(id: String, event: js.Any): Unit = js.native
  def setEvent(id: Double, event: js.Any): Unit = js.native
  
  /**
    * sets the event's end date
    * @param id the event's id
    * @param date the new end date of the event
    */
  def setEventEndDate(id: String, date: Date): Unit = js.native
  
  /**
    * sets the event's start date
    * @param id the event's id
    * @param date the new start date of the event
    */
  def setEventStartDate(id: String, date: Date): Unit = js.native
  
  /**
    * sets the event's text
    * @param id the event's id
    * @param text the new text of the event
    */
  def setEventText(id: String, text: String): Unit = js.native
  
  /**
    * forces the lightbox to resize
    */
  def setLightboxSize(): Unit = js.native
  
  /**
    * sets the mode that allows loading data by parts (enables the dynamic loading)
    * @param mode the loading mode
    */
  def setLoadMode(mode: String): Unit = js.native
  
  /**
    * sets the user data associated with the specified event
    * @param id the event's id
    * @param name the user data name
    * @param value the user data value
    */
  def setUserData(id: String, name: String, value: js.Any): Unit = js.native
  
  /**
    * shows the lightbox modal overlay that blocks interactions with the remaining screen
    * @param box an element to hide
    */
  def showCover(): Unit = js.native
  def showCover(box: HTMLElement): Unit = js.native
  
  /**
    * shows and highlights the specified event in the current or specified view
    * @param id the event's id
    * @param view the view name
    */
  def showEvent(id: String): Unit = js.native
  def showEvent(id: String, view: String): Unit = js.native
  
  /**
    * opens the lightbox for the specified event
    * @param id the event's id
    */
  def showLightbox(id: String): Unit = js.native
  
  /**
    * displays the pop-up event form for the specified event
    * @param id the event's id
    */
  def showQuickInfo(id: String): Unit = js.native
  
  var skin: String = js.native
  
  /**
    * shows a custom lightbox in the specified HTML container centered on the screen
    * @param id the event's id
    * @param box the lightbox's HTML container
    */
  def startLightbox(id: String, box: HTMLElement): Unit = js.native
  
  var templates: SchedulerTemplates = js.native
  
  /**
    * converts scheduler's data to the ICal format
    * @param header sets the value for the content's header field
    */
  def toICal(): String = js.native
  def toICal(header: String): String = js.native
  
  /**
    * converts scheduler's data into the JSON format
    */
  def toJSON(): String = js.native
  
  /**
    * exports the  current view to a PDF document (can be used for printing)
    * @param url the path to the server-side PDF converter
    * @param mode the color map of the resulting PDF document
    */
  def toPDF(url: String): Unit = js.native
  def toPDF(url: String, mode: String): Unit = js.native
  
  /**
    * exports several scheduler's views to a PDF document (can be used for printing)
    * @param from the date to start export events from
    * @param to the date to export events until
    * @param view the name of a view that the export should be applied to
    * @param path the path to the php file which generates a PDF file (<a href="pdf.md#configuringservice">details</a>)
    * @param color the color map in use
    */
  def toPDFRange(from: Date, to: Date, view: String, path: String, color: String): Unit = js.native
  
  /**
    * converts scheduler's data into the XML format
    */
  def toXML(): String = js.native
  
  /**
    * generates a unique ID (unique inside the current scheduler, not GUID)
    */
  def uid(): Unit = js.native
  
  /**
    * removes blocking set by the blockTime() method
    * @param days (<i>Date, number,array, string</i>) days that should be limited
    * @param zones the period in minutes that should be limited. Can be set to 'fullday' value <br> to limit the entire day
    * @param sections allows blocking date(s) just for specific items of specific views. BTW, the specified date(s) will be blocked just in the related view(s)
    */
  def unblockTime(days: js.Any): Unit = js.native
  def unblockTime(days: js.Any, zones: js.UndefOr[scala.Nothing], sections: js.Any): Unit = js.native
  def unblockTime(days: js.Any, zones: js.Array[_]): Unit = js.native
  def unblockTime(days: js.Any, zones: js.Array[_], sections: js.Any): Unit = js.native
  
  /**
    * removes a css class from the specified date
    * @param calendar the mini calendar object
    * @param date the date to unmark
    * @param css the name of a css class to remove
    */
  def unmarkCalendar(calendar: js.Any, date: Date, css: String): Unit = js.native
  
  def unmarkTimespan(divs: js.Array[_]): Unit = js.native
  /**
    * removes marking/blocking set by the markTimespan() method
    * @param divs a timespan to remove marking/blocking from (or an array of timespans)
    */
  def unmarkTimespan(divs: HTMLElement): Unit = js.native
  
  /**
    * unselects the specified event
    * @param id the event's id (if not specified, the currently selected event will be unselected)
    */
  def unselect(): Unit = js.native
  def unselect(id: String): Unit = js.native
  
  /**
    * displays the specified date in the mini calendar
    * @param calendar the mini calendar object
    * @param new_date a new date to display in the mini calendar
    */
  def updateCalendar(calendar: js.Any, new_date: Date): Unit = js.native
  
  /**
    * updates the specified collection with new options
    * @param collection the name of the collection to update
    * @param options the new values of the collection
    */
  def updateCollection(collection: String, options: js.Array[_]): Boolean = js.native
  
  /**
    * updates the specified event
    * @param id the event's id
    */
  def updateEvent(id: String): Unit = js.native
  
  /**
    * displays the specified view and date (doesn't invoke any events)
    * the function will just refresh the current view if invoked without parameters.
    * @param date the date to set
    * @param view the view name
    */
  def updateView(): Unit = js.native
  def updateView(date: js.UndefOr[scala.Nothing], view: String): Unit = js.native
  def updateView(date: Date): Unit = js.native
  def updateView(date: Date, view: String): Unit = js.native
  
  var version: String = js.native
  
  var xy: SchedulerSizes = js.native
}
