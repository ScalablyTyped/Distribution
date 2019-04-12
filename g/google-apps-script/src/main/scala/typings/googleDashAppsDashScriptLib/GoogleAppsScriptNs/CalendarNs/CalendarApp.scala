package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalendarApp extends js.Object {
  var Color: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Color */ js.Any = js.native
  var EventColor: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof EventColor */ js.Any = js.native
  var GuestStatus: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GuestStatus */ js.Any = js.native
  var Month: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Base.Month */ js.Any = js.native
  var Visibility: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Visibility */ js.Any = js.native
  var Weekday: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Base.Weekday */ js.Any = js.native
  def createAllDayEvent(title: java.lang.String, date: stdLib.Date): CalendarEvent = js.native
  def createAllDayEvent(title: java.lang.String, date: stdLib.Date, options: js.Object): CalendarEvent = js.native
  def createAllDayEvent(title: java.lang.String, startDate: stdLib.Date, endDate: stdLib.Date): CalendarEvent = js.native
  def createAllDayEvent(title: java.lang.String, startDate: stdLib.Date, endDate: stdLib.Date, options: js.Object): CalendarEvent = js.native
  def createAllDayEventSeries(title: java.lang.String, startDate: stdLib.Date, recurrence: EventRecurrence): CalendarEventSeries = js.native
  def createAllDayEventSeries(title: java.lang.String, startDate: stdLib.Date, recurrence: EventRecurrence, options: js.Object): CalendarEventSeries = js.native
  def createCalendar(name: java.lang.String): Calendar = js.native
  def createCalendar(name: java.lang.String, options: js.Object): Calendar = js.native
  def createEvent(title: java.lang.String, startTime: stdLib.Date, endTime: stdLib.Date): CalendarEvent = js.native
  def createEvent(title: java.lang.String, startTime: stdLib.Date, endTime: stdLib.Date, options: js.Object): CalendarEvent = js.native
  def createEventFromDescription(description: java.lang.String): CalendarEvent = js.native
  def createEventSeries(title: java.lang.String, startTime: stdLib.Date, endTime: stdLib.Date, recurrence: EventRecurrence): CalendarEventSeries = js.native
  def createEventSeries(
    title: java.lang.String,
    startTime: stdLib.Date,
    endTime: stdLib.Date,
    recurrence: EventRecurrence,
    options: js.Object
  ): CalendarEventSeries = js.native
  def getAllCalendars(): js.Array[Calendar] = js.native
  def getAllOwnedCalendars(): js.Array[Calendar] = js.native
  def getCalendarById(id: java.lang.String): Calendar = js.native
  def getCalendarsByName(name: java.lang.String): js.Array[Calendar] = js.native
  def getColor(): java.lang.String = js.native
  def getDefaultCalendar(): Calendar = js.native
  def getDescription(): java.lang.String = js.native
  def getEventById(iCalId: java.lang.String): CalendarEvent = js.native
  def getEventSeriesById(iCalId: java.lang.String): CalendarEventSeries = js.native
  def getEvents(startTime: stdLib.Date, endTime: stdLib.Date): js.Array[CalendarEvent] = js.native
  def getEvents(startTime: stdLib.Date, endTime: stdLib.Date, options: js.Object): js.Array[CalendarEvent] = js.native
  def getEventsForDay(date: stdLib.Date): js.Array[CalendarEvent] = js.native
  def getEventsForDay(date: stdLib.Date, options: js.Object): js.Array[CalendarEvent] = js.native
  def getId(): java.lang.String = js.native
  def getName(): java.lang.String = js.native
  def getOwnedCalendarById(id: java.lang.String): Calendar = js.native
  def getOwnedCalendarsByName(name: java.lang.String): js.Array[Calendar] = js.native
  def getTimeZone(): java.lang.String = js.native
  def isHidden(): scala.Boolean = js.native
  def isMyPrimaryCalendar(): scala.Boolean = js.native
  def isOwnedByMe(): scala.Boolean = js.native
  def isSelected(): scala.Boolean = js.native
  def newRecurrence(): EventRecurrence = js.native
  def setColor(color: java.lang.String): Calendar = js.native
  def setDescription(description: java.lang.String): Calendar = js.native
  def setHidden(hidden: scala.Boolean): Calendar = js.native
  def setName(name: java.lang.String): Calendar = js.native
  def setSelected(selected: scala.Boolean): Calendar = js.native
  def setTimeZone(timeZone: java.lang.String): Calendar = js.native
  def subscribeToCalendar(id: java.lang.String): Calendar = js.native
  def subscribeToCalendar(id: java.lang.String, options: js.Object): Calendar = js.native
}

