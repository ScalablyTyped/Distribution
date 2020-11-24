package typings.googleAppsScript.GoogleAppsScript.Calendar

import org.scalablytyped.runtime.StringDictionary
import typings.googleAppsScript.GoogleAppsScript.Base.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Allows a script to read and update the user's Google Calendar. This class provides direct access
  * to the user's default calendar, as well as the ability to retrieve additional calendars that the
  * user owns or is subscribed to.
  */
@js.native
trait CalendarApp extends js.Object {
  
  var Color: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Color */ js.Any = js.native
  
  var EventColor: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof EventColor */ js.Any = js.native
  
  var GuestStatus: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GuestStatus */ js.Any = js.native
  
  var Month: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Base.Month */ js.Any = js.native
  
  var Visibility: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Visibility */ js.Any = js.native
  
  var Weekday: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Base.Weekday */ js.Any = js.native
  
  def createAllDayEvent(title: String, date: Date): CalendarEvent = js.native
  def createAllDayEvent(title: String, date: Date, options: StringDictionary[js.Any]): CalendarEvent = js.native
  def createAllDayEvent(title: String, startDate: Date, endDate: Date): CalendarEvent = js.native
  def createAllDayEvent(title: String, startDate: Date, endDate: Date, options: StringDictionary[js.Any]): CalendarEvent = js.native
  
  def createAllDayEventSeries(title: String, startDate: Date, recurrence: EventRecurrence): CalendarEventSeries = js.native
  def createAllDayEventSeries(title: String, startDate: Date, recurrence: EventRecurrence, options: StringDictionary[js.Any]): CalendarEventSeries = js.native
  
  def createCalendar(name: String): typings.googleAppsScript.GoogleAppsScript.Calendar.Calendar = js.native
  def createCalendar(name: String, options: StringDictionary[js.Any]): typings.googleAppsScript.GoogleAppsScript.Calendar.Calendar = js.native
  
  def createEvent(title: String, startTime: Date, endTime: Date): CalendarEvent = js.native
  def createEvent(title: String, startTime: Date, endTime: Date, options: StringDictionary[js.Any]): CalendarEvent = js.native
  
  def createEventFromDescription(description: String): CalendarEvent = js.native
  
  def createEventSeries(title: String, startTime: Date, endTime: Date, recurrence: EventRecurrence): CalendarEventSeries = js.native
  def createEventSeries(
    title: String,
    startTime: Date,
    endTime: Date,
    recurrence: EventRecurrence,
    options: StringDictionary[js.Any]
  ): CalendarEventSeries = js.native
  
  def getAllCalendars(): js.Array[typings.googleAppsScript.GoogleAppsScript.Calendar.Calendar] = js.native
  
  def getAllOwnedCalendars(): js.Array[typings.googleAppsScript.GoogleAppsScript.Calendar.Calendar] = js.native
  
  def getCalendarById(id: String): typings.googleAppsScript.GoogleAppsScript.Calendar.Calendar = js.native
  
  def getCalendarsByName(name: String): js.Array[typings.googleAppsScript.GoogleAppsScript.Calendar.Calendar] = js.native
  
  def getColor(): String = js.native
  
  def getDefaultCalendar(): typings.googleAppsScript.GoogleAppsScript.Calendar.Calendar = js.native
  
  def getDescription(): String = js.native
  
  def getEventById(iCalId: String): CalendarEvent = js.native
  
  def getEventSeriesById(iCalId: String): CalendarEventSeries = js.native
  
  def getEvents(startTime: Date, endTime: Date): js.Array[CalendarEvent] = js.native
  def getEvents(startTime: Date, endTime: Date, options: StringDictionary[js.Any]): js.Array[CalendarEvent] = js.native
  
  def getEventsForDay(date: Date): js.Array[CalendarEvent] = js.native
  def getEventsForDay(date: Date, options: StringDictionary[js.Any]): js.Array[CalendarEvent] = js.native
  
  def getId(): String = js.native
  
  def getName(): String = js.native
  
  def getOwnedCalendarById(id: String): typings.googleAppsScript.GoogleAppsScript.Calendar.Calendar = js.native
  
  def getOwnedCalendarsByName(name: String): js.Array[typings.googleAppsScript.GoogleAppsScript.Calendar.Calendar] = js.native
  
  def getTimeZone(): String = js.native
  
  def isHidden(): Boolean = js.native
  
  def isMyPrimaryCalendar(): Boolean = js.native
  
  def isOwnedByMe(): Boolean = js.native
  
  def isSelected(): Boolean = js.native
  
  def newRecurrence(): EventRecurrence = js.native
  
  def setColor(color: String): typings.googleAppsScript.GoogleAppsScript.Calendar.Calendar = js.native
  
  def setDescription(description: String): typings.googleAppsScript.GoogleAppsScript.Calendar.Calendar = js.native
  
  def setHidden(hidden: Boolean): typings.googleAppsScript.GoogleAppsScript.Calendar.Calendar = js.native
  
  def setName(name: String): typings.googleAppsScript.GoogleAppsScript.Calendar.Calendar = js.native
  
  def setSelected(selected: Boolean): typings.googleAppsScript.GoogleAppsScript.Calendar.Calendar = js.native
  
  def setTimeZone(timeZone: String): typings.googleAppsScript.GoogleAppsScript.Calendar.Calendar = js.native
  
  def subscribeToCalendar(id: String): typings.googleAppsScript.GoogleAppsScript.Calendar.Calendar = js.native
  def subscribeToCalendar(id: String, options: StringDictionary[js.Any]): typings.googleAppsScript.GoogleAppsScript.Calendar.Calendar = js.native
}
