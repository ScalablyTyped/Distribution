package typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Calendar extends js.Object {
  def createAllDayEvent(title: String, date: Date): CalendarEvent = js.native
  def createAllDayEvent(title: String, date: Date, options: js.Object): CalendarEvent = js.native
  def createAllDayEvent(title: String, startDate: Date, endDate: Date): CalendarEvent = js.native
  def createAllDayEvent(title: String, startDate: Date, endDate: Date, options: js.Object): CalendarEvent = js.native
  def createAllDayEventSeries(title: String, startDate: Date, recurrence: EventRecurrence): CalendarEventSeries = js.native
  def createAllDayEventSeries(title: String, startDate: Date, recurrence: EventRecurrence, options: js.Object): CalendarEventSeries = js.native
  def createEvent(title: String, startTime: Date, endTime: Date): CalendarEvent = js.native
  def createEvent(title: String, startTime: Date, endTime: Date, options: js.Object): CalendarEvent = js.native
  def createEventFromDescription(description: String): CalendarEvent = js.native
  def createEventSeries(title: String, startTime: Date, endTime: Date, recurrence: EventRecurrence): CalendarEventSeries = js.native
  def createEventSeries(title: String, startTime: Date, endTime: Date, recurrence: EventRecurrence, options: js.Object): CalendarEventSeries = js.native
  def deleteCalendar(): Unit = js.native
  def getColor(): String = js.native
  def getDescription(): String = js.native
  def getEventById(iCalId: String): CalendarEvent = js.native
  def getEventSeriesById(iCalId: String): CalendarEventSeries = js.native
  def getEvents(startTime: Date, endTime: Date): js.Array[CalendarEvent] = js.native
  def getEvents(startTime: Date, endTime: Date, options: js.Object): js.Array[CalendarEvent] = js.native
  def getEventsForDay(date: Date): js.Array[CalendarEvent] = js.native
  def getEventsForDay(date: Date, options: js.Object): js.Array[CalendarEvent] = js.native
  def getId(): String = js.native
  def getName(): String = js.native
  def getTimeZone(): String = js.native
  def isHidden(): Boolean = js.native
  def isMyPrimaryCalendar(): Boolean = js.native
  def isOwnedByMe(): Boolean = js.native
  def isSelected(): Boolean = js.native
  def setColor(color: String): typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.Calendar = js.native
  def setDescription(description: String): typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.Calendar = js.native
  def setHidden(hidden: Boolean): typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.Calendar = js.native
  def setName(name: String): typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.Calendar = js.native
  def setSelected(selected: Boolean): typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.Calendar = js.native
  def setTimeZone(timeZone: String): typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.Calendar = js.native
  def unsubscribeFromCalendar(): Unit = js.native
}

