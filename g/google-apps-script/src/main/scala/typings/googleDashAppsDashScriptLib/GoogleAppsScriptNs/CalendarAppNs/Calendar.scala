package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarAppNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Calendar extends js.Object {
  def createAllDayEvent(title: java.lang.String, date: stdLib.Date): CalendarEvent = js.native
  def createAllDayEvent(title: java.lang.String, date: stdLib.Date, options: js.Object): CalendarEvent = js.native
  def createAllDayEvent(title: java.lang.String, startDate: stdLib.Date, endDate: stdLib.Date): CalendarEvent = js.native
  def createAllDayEvent(title: java.lang.String, startDate: stdLib.Date, endDate: stdLib.Date, options: js.Object): CalendarEvent = js.native
  def createAllDayEventSeries(title: java.lang.String, startDate: stdLib.Date, recurrence: EventRecurrence): CalendarEventSeries = js.native
  def createAllDayEventSeries(title: java.lang.String, startDate: stdLib.Date, recurrence: EventRecurrence, options: js.Object): CalendarEventSeries = js.native
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
  def deleteCalendar(): scala.Unit = js.native
  def getColor(): java.lang.String = js.native
  def getDescription(): java.lang.String = js.native
  def getEventById(iCalId: java.lang.String): CalendarEvent = js.native
  def getEventSeriesById(iCalId: java.lang.String): CalendarEventSeries = js.native
  def getEvents(startTime: stdLib.Date, endTime: stdLib.Date): js.Array[CalendarEvent] = js.native
  def getEvents(startTime: stdLib.Date, endTime: stdLib.Date, options: js.Object): js.Array[CalendarEvent] = js.native
  def getEventsForDay(date: stdLib.Date): js.Array[CalendarEvent] = js.native
  def getEventsForDay(date: stdLib.Date, options: js.Object): js.Array[CalendarEvent] = js.native
  def getId(): java.lang.String = js.native
  def getName(): java.lang.String = js.native
  def getTimeZone(): java.lang.String = js.native
  def isHidden(): scala.Boolean = js.native
  def isMyPrimaryCalendar(): scala.Boolean = js.native
  def isOwnedByMe(): scala.Boolean = js.native
  def isSelected(): scala.Boolean = js.native
  def setColor(color: java.lang.String): Calendar = js.native
  def setDescription(description: java.lang.String): Calendar = js.native
  def setHidden(hidden: scala.Boolean): Calendar = js.native
  def setName(name: java.lang.String): Calendar = js.native
  def setSelected(selected: scala.Boolean): Calendar = js.native
  def setTimeZone(timeZone: java.lang.String): Calendar = js.native
  def unsubscribeFromCalendar(): scala.Unit = js.native
}

