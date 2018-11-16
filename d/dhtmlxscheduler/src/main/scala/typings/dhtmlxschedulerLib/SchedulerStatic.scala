package typings
package dhtmlxschedulerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchedulerStatic extends js.Object {
  var config: SchedulerConfigOptions = js.native
  var date: SchedulerDateHelpers = js.native
  /**
  	 * filter events that will be displayed on the agenda view
  	*/
  @JSName("filter_agenda")
  var filter_agenda_Original: SchedulerFilterCallback = js.native
  /**
  	 * filter events that will be displayed on the day view
  	*/
  @JSName("filter_day")
  var filter_day_Original: SchedulerFilterCallback = js.native
  /**
  	 * filter events that will be displayed on the grid view
  	*/
  @JSName("filter_grid")
  var filter_grid_Original: SchedulerFilterCallback = js.native
  /**
  	 * filter events that will be displayed on the month view
  	*/
  @JSName("filter_month")
  var filter_month_Original: SchedulerFilterCallback = js.native
  /**
  	 * filter events that will be displayed on the timeline view
  	*/
  @JSName("filter_timeline")
  var filter_timeline_Original: SchedulerFilterCallback = js.native
  /**
  	 * filter events that will be displayed on the units view
  	*/
  @JSName("filter_units")
  var filter_units_Original: SchedulerFilterCallback = js.native
  /**
  	 * filter events that will be displayed on the week view
  	*/
  @JSName("filter_week")
  var filter_week_Original: SchedulerFilterCallback = js.native
  /**
  	 * filter events that will be displayed on the year view
  	*/
  @JSName("filter_year")
  var filter_year_Original: SchedulerFilterCallback = js.native
  var keys: SchedulerHotkeys = js.native
  var locale: SchedulerLocale = js.native
  var skin: java.lang.String = js.native
  var templates: SchedulerTemplates = js.native
  var version: java.lang.String = js.native
  var xy: SchedulerSizes = js.native
  /**
  	 * adds a new event
  	 * @param event the event object
  	*/
  def addEvent(event: js.Any): java.lang.String = js.native
  /**
  	 * adds a new event and opens the lightbox to confirm
  	 * @param event the event object
  	*/
  def addEventNow(event: js.Any): java.lang.String = js.native
  /**
  	 * marks dates, but with certain settings makes blocking (unlike blockTime() allows setting custom styling for the limit)
  	 * @param config the configuration object of the timespan to mark/block
  	*/
  def addMarkedTimespan(config: js.Any): scala.Double = js.native
  /**
  	 * adds a section to the currently active view (if the opened view isn't Timeline in the 'Tree' mode - the method will be ignored)
  	 * @param section the object of the section to add
  	 * @param parent_id the id of the parent section. Pass 'null' if you are adding a section to the root
  	*/
  def addSection(section: js.Any, parent_id: java.lang.String): scala.Boolean = js.native
  /**
  	 * adds a new keyboard shortcut
  	 * @param shortcut the key name or the name of keys combination for a shortcut (shortcut syntax)
  	 * @param handler the handler of the shortcut call
  	 * @param scope the name of the context element to attach the handler function to (list of scopes)
  	 */
  def addShortcut(shortcut: java.lang.String, handler: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
  	 * adds a new keyboard shortcut
  	 * @param shortcut the key name or the name of keys combination for a shortcut (shortcut syntax)
  	 * @param handler the handler of the shortcut call
  	 * @param scope the name of the context element to attach the handler function to (list of scopes)
  	 */
  def addShortcut(shortcut: java.lang.String, handler: js.Function0[scala.Unit], scope: js.Any): scala.Unit = js.native
  /**
  	 * attaches the handler to an inner event of dhtmlxScheduler
  	 * @param name the event's name, case-insensitive
  	 * @param handler the handler function
  	*/
  def attachEvent(name: SchedulerEventName, handler: SchedulerCallback): java.lang.String = js.native
  /**
  	 * makes the scheduler reflect all data changes in the Backbone model and vice versa
  	 * @param events the Backbone data collection
  	*/
  def backbone(events: js.Any): scala.Unit = js.native
  /**
  	 * blocks the specified date and applies the default 'dimmed' style to it.
  	 * @param date a date to block ( if a number is provided, the parameter will be treated as a week <br> day: '0' index refers to Sunday,'6' - to Saturday )
  	 * @param time_points an array <b>[start_minute,end_minute,..,start_minute_N,end_minute_N]</b>, <br> where each pair sets a certain limit range. The array can have any number of <br> such pairs
  	 * @param items defines specific items of  view(s) to block
  	*/
  def blockTime(date: scala.Double, time_points: js.Array[_]): scala.Unit = js.native
  /**
  	 * blocks the specified date and applies the default 'dimmed' style to it.
  	 * @param date a date to block ( if a number is provided, the parameter will be treated as a week <br> day: '0' index refers to Sunday,'6' - to Saturday )
  	 * @param time_points an array <b>[start_minute,end_minute,..,start_minute_N,end_minute_N]</b>, <br> where each pair sets a certain limit range. The array can have any number of <br> such pairs
  	 * @param items defines specific items of  view(s) to block
  	*/
  def blockTime(date: scala.Double, time_points: js.Array[_], items: js.Any): scala.Unit = js.native
  /**
  	 * blocks the specified date and applies the default 'dimmed' style to it.
  	 * @param date a date to block ( if a number is provided, the parameter will be treated as a week <br> day: '0' index refers to Sunday,'6' - to Saturday )
  	 * @param time_points an array <b>[start_minute,end_minute,..,start_minute_N,end_minute_N]</b>, <br> where each pair sets a certain limit range. The array can have any number of <br> such pairs
  	 * @param items defines specific items of  view(s) to block
  	*/
  def blockTime(date: stdLib.Date, time_points: js.Array[_]): scala.Unit = js.native
  /**
  	 * blocks the specified date and applies the default 'dimmed' style to it.
  	 * @param date a date to block ( if a number is provided, the parameter will be treated as a week <br> day: '0' index refers to Sunday,'6' - to Saturday )
  	 * @param time_points an array <b>[start_minute,end_minute,..,start_minute_N,end_minute_N]</b>, <br> where each pair sets a certain limit range. The array can have any number of <br> such pairs
  	 * @param items defines specific items of  view(s) to block
  	*/
  def blockTime(date: stdLib.Date, time_points: js.Array[_], items: js.Any): scala.Unit = js.native
  /**
  	 * calls an inner event
  	 * @param name the event's name, case-insensitive
  	 * @param params an array of the event-related data
  	*/
  def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
  /**
  	 * changes the event's id
  	 * @param id the current event's id
  	 * @param new_id the new event's id
  	*/
  def changeEventId(id: java.lang.String, new_id: java.lang.String): scala.Unit = js.native
  /**
  	 * checks whether the specified event occurs at the time that has already been occupied by another event(s)
  	 * @param event the event object
  	*/
  def checkCollision(event: js.Any): scala.Boolean = js.native
  /**
  	 * checks whether an event has some handler(s) specified
  	 * @param name the event's name
  	*/
  def checkEvent(name: SchedulerEventName): scala.Boolean = js.native
  /**
  	 * checks whether an event resides in a timespan of a specific type
  	 * @param event the event object
  	 * @param timespan the timespan's type
  	*/
  def checkInMarkedTimespan(event: js.Any, timespan: java.lang.String): scala.Boolean = js.native
  /**
  	 * checks whether the specified event takes place at the blocked time period
  	 * @param event the event object
  	*/
  def checkLimitViolation(event: js.Any): scala.Boolean = js.native
  /**
  	 * removes all events from the scheduler
  	*/
  def clearAll(): scala.Unit = js.native
  /**
  	 * closes all sections in the currently active view (if the opened view isn't Timeline in the 'Tree' mode - the method will be ignored)
  	*/
  def closeAllSections(): scala.Unit = js.native
  /**
  	 * closes the specified section in the currently active view (if the opened view isn't Timeline in the 'Tree' mode - the method will be ignored)
  	 * @param section_id the section's id
  	*/
  def closeSection(section_id: java.lang.String): scala.Unit = js.native
  /**
  	 * collapses the expanded scheduler back to the normal size
  	*/
  def collapse(): scala.Unit = js.native
  /**
  	 * creates the Grid view in the scheduler
  	 * @param config the configuration object of the Grid view
  	*/
  def createGridView(config: js.Any): scala.Unit = js.native
  /**
  	 * creates the Timeline view in the scheduler
  	 * @param config the configuration object of the Timeline view
  	*/
  def createTimelineView(config: js.Any): scala.Unit = js.native
  /**
  	 * creates the Units view in the scheduler
  	 * @param config the configuration object of the Units view
  	*/
  def createUnitsView(config: js.Any): scala.Unit = js.native
  /**
  	 * deletes all sections from  the currently active view (if the opened view isn't Timeline in the 'Tree' mode - the method will be ignored)
  	*/
  def deleteAllSections(): scala.Unit = js.native
  /**
  	 * deletes the specified event
  	 * @param id the event's id
  	*/
  def deleteEvent(id: java.lang.String): scala.Unit = js.native
  /**
  	 * deletes the specified event
  	 * @param id the event's id
  	*/
  def deleteEvent(id: scala.Double): scala.Unit = js.native
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
  def deleteMarkedTimespan(id: java.lang.String): scala.Unit = js.native
  /**
  	 * deletes a section from  the currently active view (if the opened view isn't Timeline in the 'Tree' mode - the method will be ignored)
  	 * @param section_id the section's id
  	*/
  def deleteSection(section_id: java.lang.String): scala.Boolean = js.native
  /**
  	 * destroys previously created mini-calendar
  	 * @param name the mini-calendar's object (if not specified, the scheduler attempts <br> to destroy the last created mini calendar)
  	*/
  def destroyCalendar(): scala.Unit = js.native
  /**
  	 * destroys previously created mini-calendar
  	 * @param name the mini-calendar's object (if not specified, the scheduler attempts <br> to destroy the last created mini calendar)
  	*/
  def destroyCalendar(name: js.Any): scala.Unit = js.native
  /**
  	 * detaches a handler from an event (which was attached before by the attachEvent method)
  	 * @param id the event's id
  	*/
  def detachEvent(id: java.lang.String): scala.Unit = js.native
  /**
  	 * opens the inline editor to alter the event's text  (the editor in the event's box)
  	 * @param id the event's id
  	*/
  def edit(id: java.lang.String): scala.Unit = js.native
  /**
  	 * closes the inline event editor, if it's currently open
  	 * @param id the event's id
  	*/
  def editStop(id: java.lang.String): scala.Unit = js.native
  /**
  	 * closes the lightbox
  	 * @param mode if set to <i>true</i>, the changes, made in the lightbox, will be saved before closing. <br> If - <i>false</i>, the changes will be cancelled.
  	 * @param box the HTML container for the lightbox
  	*/
  def endLightbox(mode: scala.Boolean): scala.Unit = js.native
  /**
  	 * closes the lightbox
  	 * @param mode if set to <i>true</i>, the changes, made in the lightbox, will be saved before closing. <br> If - <i>false</i>, the changes will be cancelled.
  	 * @param box the HTML container for the lightbox
  	*/
  def endLightbox(mode: scala.Boolean, box: stdLib.HTMLElement): scala.Unit = js.native
  /**
  	 * expands the scheduler to the full screen view
  	*/
  def expand(): scala.Unit = js.native
  /**
  	 * filter events that will be displayed on the agenda view
  	*/
  def filter_agenda(id: java.lang.String, event: js.Any): scala.Boolean = js.native
  /**
  	 * filter events that will be displayed on the agenda view
  	*/
  def filter_agenda(id: scala.Double, event: js.Any): scala.Boolean = js.native
  /**
  	 * filter events that will be displayed on the day view
  	*/
  def filter_day(id: java.lang.String, event: js.Any): scala.Boolean = js.native
  /**
  	 * filter events that will be displayed on the day view
  	*/
  def filter_day(id: scala.Double, event: js.Any): scala.Boolean = js.native
  /**
  	 * filter events that will be displayed on the grid view
  	*/
  def filter_grid(id: java.lang.String, event: js.Any): scala.Boolean = js.native
  /**
  	 * filter events that will be displayed on the grid view
  	*/
  def filter_grid(id: scala.Double, event: js.Any): scala.Boolean = js.native
  /**
  	 * filter events that will be displayed on the month view
  	*/
  def filter_month(id: java.lang.String, event: js.Any): scala.Boolean = js.native
  /**
  	 * filter events that will be displayed on the month view
  	*/
  def filter_month(id: scala.Double, event: js.Any): scala.Boolean = js.native
  /**
  	 * filter events that will be displayed on the timeline view
  	*/
  def filter_timeline(id: java.lang.String, event: js.Any): scala.Boolean = js.native
  /**
  	 * filter events that will be displayed on the timeline view
  	*/
  def filter_timeline(id: scala.Double, event: js.Any): scala.Boolean = js.native
  /**
  	 * filter events that will be displayed on the units view
  	*/
  def filter_units(id: java.lang.String, event: js.Any): scala.Boolean = js.native
  /**
  	 * filter events that will be displayed on the units view
  	*/
  def filter_units(id: scala.Double, event: js.Any): scala.Boolean = js.native
  /**
  	 * filter events that will be displayed on the week view
  	*/
  def filter_week(id: java.lang.String, event: js.Any): scala.Boolean = js.native
  /**
  	 * filter events that will be displayed on the week view
  	*/
  def filter_week(id: scala.Double, event: js.Any): scala.Boolean = js.native
  /**
  	 * filter events that will be displayed on the year view
  	*/
  def filter_year(id: java.lang.String, event: js.Any): scala.Boolean = js.native
  /**
  	 * filter events that will be displayed on the year view
  	*/
  def filter_year(id: scala.Double, event: js.Any): scala.Boolean = js.native
  /**
  	 * gives access to the objects of lightbox's sections
  	 * @param name the name of a lightbox section
  	*/
  def formSection(name: java.lang.String): js.Any = js.native
  /**
  	 * returns the current cursor-pointed date and section (if defined)
  	 * @param e a native event object
  	*/
  def getActionData(e: stdLib.Event): js.Any = js.native
  /**
  	 * returns the event object by its id
  	 * @param event_id the  event's id
  	*/
  def getEvent(event_id: java.lang.String): js.Any = js.native
  /**
  	 * returns the event object by its id
  	 * @param event_id the  event's id
  	*/
  def getEvent(event_id: scala.Double): js.Any = js.native
  /**
  	 * gets the event's end date
  	 * @param id the event's id
  	*/
  def getEventEndDate(id: java.lang.String): stdLib.Date = js.native
  /**
  	 * gets the event's end date
  	 * @param id the event's id
  	*/
  def getEventEndDate(id: scala.Double): stdLib.Date = js.native
  /**
  	 * gets the event's start date
  	 * @param id the event's id
  	*/
  def getEventStartDate(id: java.lang.String): stdLib.Date = js.native
  /**
  	 * gets the event's start date
  	 * @param id the event's id
  	*/
  def getEventStartDate(id: scala.Double): stdLib.Date = js.native
  /**
  	 * gets the event's text
  	 * @param id the event's id
  	*/
  def getEventText(id: java.lang.String): java.lang.String = js.native
  /**
  	 * gets the event's text
  	 * @param id the event's id
  	*/
  def getEventText(id: scala.Double): java.lang.String = js.native
  /**
  	 * returns a collection of events which occur during the specified period
  	 * @param from the start date of the period
  	 * @param to the end date of the period
  	*/
  def getEvents(): js.Any = js.native
  /**
  	 * returns a collection of events which occur during the specified period
  	 * @param from the start date of the period
  	 * @param to the end date of the period
  	*/
  def getEvents(from: stdLib.Date): js.Any = js.native
  /**
  	 * returns a collection of events which occur during the specified period
  	 * @param from the start date of the period
  	 * @param to the end date of the period
  	*/
  def getEvents(from: stdLib.Date, to: stdLib.Date): js.Any = js.native
  /**
  	 * gets the label of a select control in the lightbox
  	 * @param property the name of a data property that the control is mapped to
  	 * @param key the option's id. This parameter is compared with the event's data property <br> to assign the select's option to an event
  	*/
  def getLabel(property: java.lang.String, key: java.lang.String): js.Any = js.native
  /**
  	 * gets the label of a select control in the lightbox
  	 * @param property the name of a data property that the control is mapped to
  	 * @param key the option's id. This parameter is compared with the event's data property <br> to assign the select's option to an event
  	*/
  def getLabel(property: java.lang.String, key: scala.Double): js.Any = js.native
  /**
  	 * gets the lightbox's HTML object element
  	*/
  def getLightbox(): stdLib.HTMLElement = js.native
  /**
  	 * returns all occurrences of a recurring event
  	 * @param id the id of a recurring event
  	 * @param number the maximum number of occurrences to return (by default, 100)
  	*/
  def getRecDates(id: java.lang.String, number: scala.Double): js.Any = js.native
  /**
  	 * gets the object of the currently displayed event
  	 * @param id the event's id
  	*/
  def getRenderedEvent(id: java.lang.String): stdLib.HTMLElement = js.native
  /**
  	 * gets the object of the specified section in the currently active view (if the opened view isn't Timeline in the 'Tree' mode - the method will be ignored)
  	 * @param section_id the section's id
  	*/
  def getSection(section_id: java.lang.String): js.Any = js.native
  /**
  	 * gets the current state of the scheduler
  	*/
  def getState(): js.Any = js.native
  /**
  	 * gets the user data associated with the specified event
  	 * @param id the event's id
  	 * @param name the user data name
  	*/
  def getUserData(id: java.lang.String, name: java.lang.String): js.Any = js.native
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
  	 * hides the pop-up event form (if it's currently active)
  	*/
  def hideQuickInfo(): scala.Unit = js.native
  /**
  	 * highlights the event's duration on the time scale
  	 * @param event the event object
  	*/
  def highlightEventPosition(event: js.Any): scala.Unit = js.native
  /**
  	 * constructor. Initializes a dhtmlxScheduler object
  	 * @param container an HTML container ( or its id) where a dhtmlxScheduler object will be initialized
  	 * @param date the initial date of the scheduler (by default, the current date)
  	 * @param view the name of the initial view (by default, "week")
  	*/
  def init(container: java.lang.String): scala.Unit = js.native
  /**
  	 * constructor. Initializes a dhtmlxScheduler object
  	 * @param container an HTML container ( or its id) where a dhtmlxScheduler object will be initialized
  	 * @param date the initial date of the scheduler (by default, the current date)
  	 * @param view the name of the initial view (by default, "week")
  	*/
  def init(container: java.lang.String, date: stdLib.Date): scala.Unit = js.native
  /**
  	 * constructor. Initializes a dhtmlxScheduler object
  	 * @param container an HTML container ( or its id) where a dhtmlxScheduler object will be initialized
  	 * @param date the initial date of the scheduler (by default, the current date)
  	 * @param view the name of the initial view (by default, "week")
  	*/
  def init(container: java.lang.String, date: stdLib.Date, view: java.lang.String): scala.Unit = js.native
  /**
  	 * constructor. Initializes a dhtmlxScheduler object
  	 * @param container an HTML container ( or its id) where a dhtmlxScheduler object will be initialized
  	 * @param date the initial date of the scheduler (by default, the current date)
  	 * @param view the name of the initial view (by default, "week")
  	*/
  def init(container: stdLib.HTMLElement): scala.Unit = js.native
  /**
  	 * constructor. Initializes a dhtmlxScheduler object
  	 * @param container an HTML container ( or its id) where a dhtmlxScheduler object will be initialized
  	 * @param date the initial date of the scheduler (by default, the current date)
  	 * @param view the name of the initial view (by default, "week")
  	*/
  def init(container: stdLib.HTMLElement, date: stdLib.Date): scala.Unit = js.native
  /**
  	 * constructor. Initializes a dhtmlxScheduler object
  	 * @param container an HTML container ( or its id) where a dhtmlxScheduler object will be initialized
  	 * @param date the initial date of the scheduler (by default, the current date)
  	 * @param view the name of the initial view (by default, "week")
  	*/
  def init(container: stdLib.HTMLElement, date: stdLib.Date, view: java.lang.String): scala.Unit = js.native
  /**
  	 * inverts the specified time zones
  	 * @param zones an array **[start_minute,end_minute,..,start_minute_N,end_minute_N]** <br >where each pair sets a certain limit range (in minutes). The array can have any <br> number of such pairs
  	*/
  def invertZones(zones: js.Array[_]): scala.Unit = js.native
  /**
  	 * checks whether the calendar is currently opened in the scheduler
  	*/
  def isCalendarVisible(): scala.Boolean | stdLib.HTMLElement = js.native
  /**
  	 * checks whether the specified event one-day or multi-day
  	 * @param event the event object
  	*/
  def isOneDayEvent(event: js.Any): scala.Boolean = js.native
  /**
  	 * checks whether a view with the specified name exists
  	 * @param name the view name
  	*/
  def isViewExists(name: java.lang.String): scala.Boolean = js.native
  /**
  	 * 'says' to change the active date in the mini calendar each time, the active date in the scheduler is changed
  	 * @param calendar the mini calendar object
  	 * @param shift a function that defines the difference between active dates in the mini-calendar <br> and the scheduler. The function takes the scheduler's date as a parameter and <br> returns the date that should be displayed in the mini calendar
  	*/
  def linkCalendar(calendar: js.Any, shift: SchedulerCallback): scala.Unit = js.native
  /**
  	 * loads data to the scheduler from an external data source
  	 * @param url the server side url (may be a static file or a server side script which outputs data <br>  as XML)
  	 * @param type <i>('json', 'xml', 'ical')</i> the data type. The default value - <i>'xml'</i>
  	 * @param callback the callback function
  	*/
  def load(url: java.lang.String): scala.Unit = js.native
  /**
  	 * loads data to the scheduler from an external data source
  	 * @param url the server side url (may be a static file or a server side script which outputs data <br>  as XML)
  	 * @param type <i>('json', 'xml', 'ical')</i> the data type. The default value - <i>'xml'</i>
  	 * @param callback the callback function
  	*/
  def load(url: java.lang.String, `type`: java.lang.String): scala.Unit = js.native
  /**
  	 * loads data to the scheduler from an external data source
  	 * @param url the server side url (may be a static file or a server side script which outputs data <br>  as XML)
  	 * @param type <i>('json', 'xml', 'ical')</i> the data type. The default value - <i>'xml'</i>
  	 * @param callback the callback function
  	*/
  def load(url: java.lang.String, `type`: java.lang.String, callback: SchedulerCallback): scala.Unit = js.native
  /**
  	 * applies a css class to the specified date
  	 * @param calendar the calendar object
  	 * @param date the date to mark
  	 * @param css the name of a css class
  	*/
  def markCalendar(calendar: js.Any, date: stdLib.Date, css: java.lang.String): scala.Unit = js.native
  /**
  	 * marks and/or blocks date(s) by applying the default or a custom style to them. Marking is cancelled right after any internal update in the app. Can be used for highlighting
  	 * @param config the configuration object of the timespan to mark/block
  	*/
  def markTimespan(config: js.Any): scala.Unit = js.native
  /**
  	 * opens all sections in the currently active view (if the opened view isn't Timeline in the 'Tree' mode - the method will be ignored)
  	*/
  def openAllSections(): scala.Unit = js.native
  /**
  	 * opens the specified section in the currently active view (if the opened view isn't Timeline in the 'Tree' mode - the method will be ignored)
  	 * @param section_id the section's id
  	*/
  def openSection(section_id: java.lang.String): scala.Unit = js.native
  /**
  	 * loads data from a client-side resource
  	 * @param data a string or object which represents data
  	 * @param type (<i>'json', 'xml', 'ical'</i>) the data type. The default value - <i>'xml'</i>
  	*/
  def parse(data: js.Any): scala.Unit = js.native
  /**
  	 * loads data from a client-side resource
  	 * @param data a string or object which represents data
  	 * @param type (<i>'json', 'xml', 'ical'</i>) the data type. The default value - <i>'xml'</i>
  	*/
  def parse(data: js.Any, `type`: java.lang.String): scala.Unit = js.native
  /**
  	 * removes a keyboard shortcut
  	 * @param shortcut the key name or the name of keys combination for a shortcut (shortcut syntax)
  	 * @param scope the element to which the shortcut is attached (list of scopes)
  	 */
  def removeShortcut(shortcut: java.lang.String, scope: js.Any): scala.Unit = js.native
  /**
  	 * creates a mini calendar
  	 * @param config the calendar configuration object
  	*/
  def renderCalendar(config: js.Any): scala.Unit = js.native
  /**
  	 * generates HTML content for a custom event's box
  	 * @param container the event container
  	 * @param event the event object
  	*/
  def renderEvent(container: stdLib.HTMLElement, event: js.Any): scala.Boolean = js.native
  /**
  	 * removes the current lightbox's HTML object element
  	*/
  def resetLightbox(): scala.Unit = js.native
  /**
  	 * scrolls the specified number of units in the Units view
  	 * @param step the number of units to scroll (<i>set the positive value to scroll units to the right <br> side,  the negative value - to the left side</i>).
  	*/
  def scrollUnit(step: scala.Double): scala.Unit = js.native
  /**
  	 * selects the specified event
  	 * @param id the event's id
  	*/
  def select(id: java.lang.String): scala.Unit = js.native
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
  	 * displays the specified view and date
  	 * @param date the date to display
  	 * @param view the name of a view to display
  	*/
  def setCurrentView(): scala.Unit = js.native
  /**
  	 * displays the specified view and date
  	 * @param date the date to display
  	 * @param view the name of a view to display
  	*/
  def setCurrentView(date: stdLib.Date): scala.Unit = js.native
  /**
  	 * displays the specified view and date
  	 * @param date the date to display
  	 * @param view the name of a view to display
  	*/
  def setCurrentView(date: stdLib.Date, view: java.lang.String): scala.Unit = js.native
  /**
  	 * adds a new event to the scheduler's data pool
  	 * @param id the event's id
  	 * @param event the event object
  	*/
  def setEvent(id: java.lang.String, event: js.Any): scala.Unit = js.native
  /**
  	 * adds a new event to the scheduler's data pool
  	 * @param id the event's id
  	 * @param event the event object
  	*/
  def setEvent(id: scala.Double, event: js.Any): scala.Unit = js.native
  /**
  	 * sets the event's end date
  	 * @param id the event's id
  	 * @param date the new end date of the event
  	*/
  def setEventEndDate(id: java.lang.String, date: stdLib.Date): scala.Unit = js.native
  /**
  	 * sets the event's start date
  	 * @param id the event's id
  	 * @param date the new start date of the event
  	*/
  def setEventStartDate(id: java.lang.String, date: stdLib.Date): scala.Unit = js.native
  /**
  	 * sets the event's text
  	 * @param id the event's id
  	 * @param text the new text of the event
  	*/
  def setEventText(id: java.lang.String, text: java.lang.String): scala.Unit = js.native
  /**
  	 * forces the lightbox to resize
  	*/
  def setLightboxSize(): scala.Unit = js.native
  /**
  	 * sets the mode that allows loading data by parts (enables the dynamic loading)
  	 * @param mode the loading mode
  	*/
  def setLoadMode(mode: java.lang.String): scala.Unit = js.native
  /**
  	 * sets the user data associated with the specified event
  	 * @param id the event's id
  	 * @param name the user data name
  	 * @param value the user data value
  	*/
  def setUserData(id: java.lang.String, name: java.lang.String, value: js.Any): scala.Unit = js.native
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
  	 * shows and highlights the specified event in the current or specified view
  	 * @param id the event's id
  	 * @param view the view name
  	*/
  def showEvent(id: java.lang.String): scala.Unit = js.native
  /**
  	 * shows and highlights the specified event in the current or specified view
  	 * @param id the event's id
  	 * @param view the view name
  	*/
  def showEvent(id: java.lang.String, view: java.lang.String): scala.Unit = js.native
  /**
  	 * opens the lightbox for the specified event
  	 * @param id the event's id
  	*/
  def showLightbox(id: java.lang.String): scala.Unit = js.native
  /**
  	 * displays the pop-up event form for the specified event
  	 * @param id the event's id
  	*/
  def showQuickInfo(id: java.lang.String): scala.Unit = js.native
  /**
  	 * shows a custom lightbox in the specified HTML container centered on the screen
  	 * @param id the event's id
  	 * @param box the lightbox's HTML container
  	*/
  def startLightbox(id: java.lang.String, box: stdLib.HTMLElement): scala.Unit = js.native
  /**
  	 * converts scheduler's data to the ICal format
  	 * @param header sets the value for the content's header field
  	*/
  def toICal(): java.lang.String = js.native
  /**
  	 * converts scheduler's data to the ICal format
  	 * @param header sets the value for the content's header field
  	*/
  def toICal(header: java.lang.String): java.lang.String = js.native
  /**
  	 * converts scheduler's data into the JSON format
  	*/
  def toJSON(): java.lang.String = js.native
  /**
  	 * exports the  current view to a PDF document (can be used for printing)
  	 * @param url the path to the server-side PDF converter
  	 * @param mode the color map of the resulting PDF document
  	*/
  def toPDF(url: java.lang.String): scala.Unit = js.native
  /**
  	 * exports the  current view to a PDF document (can be used for printing)
  	 * @param url the path to the server-side PDF converter
  	 * @param mode the color map of the resulting PDF document
  	*/
  def toPDF(url: java.lang.String, mode: java.lang.String): scala.Unit = js.native
  /**
  	 * exports several scheduler's views to a PDF document (can be used for printing)
  	 * @param from the date to start export events from
  	 * @param to the date to export events until
  	 * @param view the name of a view that the export should be applied to
  	 * @param path the path to the php file which generates a PDF file (<a href="pdf.md#configuringservice">details</a>)
  	 * @param color the color map in use
  	*/
  def toPDFRange(
    from: stdLib.Date,
    to: stdLib.Date,
    view: java.lang.String,
    path: java.lang.String,
    color: java.lang.String
  ): scala.Unit = js.native
  /**
  	 * converts scheduler's data into the XML format
  	*/
  def toXML(): java.lang.String = js.native
  /**
  	 * generates a unique ID (unique inside the current scheduler, not GUID)
  	*/
  def uid(): scala.Unit = js.native
  /**
  	 * removes blocking set by the blockTime() method
  	 * @param days (<i>Date, number,array, string</i>) days that should be limited
  	 * @param zones the period in minutes that should be limited. Can be set to 'fullday' value <br> to limit the entire day
  	 * @param sections allows blocking date(s) just for specific items of specific views. BTW, the specified date(s) will be blocked just in the related view(s)
  	*/
  def unblockTime(days: js.Any): scala.Unit = js.native
  /**
  	 * removes blocking set by the blockTime() method
  	 * @param days (<i>Date, number,array, string</i>) days that should be limited
  	 * @param zones the period in minutes that should be limited. Can be set to 'fullday' value <br> to limit the entire day
  	 * @param sections allows blocking date(s) just for specific items of specific views. BTW, the specified date(s) will be blocked just in the related view(s)
  	*/
  def unblockTime(days: js.Any, zones: js.Array[_]): scala.Unit = js.native
  /**
  	 * removes blocking set by the blockTime() method
  	 * @param days (<i>Date, number,array, string</i>) days that should be limited
  	 * @param zones the period in minutes that should be limited. Can be set to 'fullday' value <br> to limit the entire day
  	 * @param sections allows blocking date(s) just for specific items of specific views. BTW, the specified date(s) will be blocked just in the related view(s)
  	*/
  def unblockTime(days: js.Any, zones: js.Array[_], sections: js.Any): scala.Unit = js.native
  /**
  	 * removes a css class from the specified date
  	 * @param calendar the mini calendar object
  	 * @param date the date to unmark
  	 * @param css the name of a css class to remove
  	*/
  def unmarkCalendar(calendar: js.Any, date: stdLib.Date, css: java.lang.String): scala.Unit = js.native
  /**
  	 * removes marking/blocking set by the markTimespan() method
  	 * @param divs a timespan to remove marking/blocking from (or an array of timespans)
  	*/
  def unmarkTimespan(divs: js.Array[_]): scala.Unit = js.native
  /**
  	 * removes marking/blocking set by the markTimespan() method
  	 * @param divs a timespan to remove marking/blocking from (or an array of timespans)
  	*/
  def unmarkTimespan(divs: stdLib.HTMLElement): scala.Unit = js.native
  /**
  	 * unselects the specified event
  	 * @param id the event's id (if not specified, the currently selected event will be unselected)
  	*/
  def unselect(): scala.Unit = js.native
  /**
  	 * unselects the specified event
  	 * @param id the event's id (if not specified, the currently selected event will be unselected)
  	*/
  def unselect(id: java.lang.String): scala.Unit = js.native
  /**
  	 * displays the specified date in the mini calendar
  	 * @param calendar the mini calendar object
  	 * @param new_date a new date to display in the mini calendar
  	*/
  def updateCalendar(calendar: js.Any, new_date: stdLib.Date): scala.Unit = js.native
  /**
  	 * updates the specified collection with new options
  	 * @param collection the name of the collection to update
  	 * @param options the new values of the collection
  	*/
  def updateCollection(collection: java.lang.String, options: js.Array[_]): scala.Boolean = js.native
  /**
  	 * updates the specified event
  	 * @param id the event's id
  	*/
  def updateEvent(id: java.lang.String): scala.Unit = js.native
  /**
  	 * displays the specified view and date (doesn't invoke any events)
  	 * the function will just refresh the current view if invoked without parameters.
  	 * @param date the date to set
  	 * @param view the view name
  	*/
  def updateView(): scala.Unit = js.native
  /**
  	 * displays the specified view and date (doesn't invoke any events)
  	 * the function will just refresh the current view if invoked without parameters.
  	 * @param date the date to set
  	 * @param view the view name
  	*/
  def updateView(date: stdLib.Date): scala.Unit = js.native
  /**
  	 * displays the specified view and date (doesn't invoke any events)
  	 * the function will just refresh the current view if invoked without parameters.
  	 * @param date the date to set
  	 * @param view the view name
  	*/
  def updateView(date: stdLib.Date, view: java.lang.String): scala.Unit = js.native
}

