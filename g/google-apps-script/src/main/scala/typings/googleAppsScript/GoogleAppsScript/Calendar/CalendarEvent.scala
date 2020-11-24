package typings.googleAppsScript.GoogleAppsScript.Calendar

import typings.googleAppsScript.GoogleAppsScript.Base.Date
import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a single calendar event.
  */
@js.native
trait CalendarEvent extends js.Object {
  
  def addEmailReminder(minutesBefore: Integer): CalendarEvent = js.native
  
  def addGuest(email: String): CalendarEvent = js.native
  
  def addPopupReminder(minutesBefore: Integer): CalendarEvent = js.native
  
  def addSmsReminder(minutesBefore: Integer): CalendarEvent = js.native
  
  def anyoneCanAddSelf(): Boolean = js.native
  
  def deleteEvent(): Unit = js.native
  
  def deleteTag(key: String): CalendarEvent = js.native
  
  def getAllDayEndDate(): Date = js.native
  
  def getAllDayStartDate(): Date = js.native
  
  def getAllTagKeys(): js.Array[String] = js.native
  
  def getColor(): String = js.native
  
  def getCreators(): js.Array[String] = js.native
  
  def getDateCreated(): Date = js.native
  
  def getDescription(): String = js.native
  
  def getEmailReminders(): js.Array[Integer] = js.native
  
  def getEndTime(): Date = js.native
  
  def getEventSeries(): CalendarEventSeries = js.native
  
  def getGuestByEmail(email: String): EventGuest = js.native
  
  def getGuestList(): js.Array[EventGuest] = js.native
  def getGuestList(includeOwner: Boolean): js.Array[EventGuest] = js.native
  
  def getId(): String = js.native
  
  def getLastUpdated(): Date = js.native
  
  def getLocation(): String = js.native
  
  def getMyStatus(): GuestStatus = js.native
  
  def getOriginalCalendarId(): String = js.native
  
  def getPopupReminders(): js.Array[Integer] = js.native
  
  def getSmsReminders(): js.Array[Integer] = js.native
  
  def getStartTime(): Date = js.native
  
  def getTag(key: String): String = js.native
  
  def getTitle(): String = js.native
  
  def getVisibility(): Visibility = js.native
  
  def guestsCanInviteOthers(): Boolean = js.native
  
  def guestsCanModify(): Boolean = js.native
  
  def guestsCanSeeGuests(): Boolean = js.native
  
  def isAllDayEvent(): Boolean = js.native
  
  def isOwnedByMe(): Boolean = js.native
  
  def isRecurringEvent(): Boolean = js.native
  
  def removeAllReminders(): CalendarEvent = js.native
  
  def removeGuest(email: String): CalendarEvent = js.native
  
  def resetRemindersToDefault(): CalendarEvent = js.native
  
  def setAllDayDate(date: Date): CalendarEvent = js.native
  
  def setAllDayDates(startDate: Date, endDate: Date): CalendarEvent = js.native
  
  def setAnyoneCanAddSelf(anyoneCanAddSelf: Boolean): CalendarEvent = js.native
  
  def setColor(color: String): CalendarEvent = js.native
  
  def setDescription(description: String): CalendarEvent = js.native
  
  def setGuestsCanInviteOthers(guestsCanInviteOthers: Boolean): CalendarEvent = js.native
  
  def setGuestsCanModify(guestsCanModify: Boolean): CalendarEvent = js.native
  
  def setGuestsCanSeeGuests(guestsCanSeeGuests: Boolean): CalendarEvent = js.native
  
  def setLocation(location: String): CalendarEvent = js.native
  
  def setMyStatus(status: GuestStatus): CalendarEvent = js.native
  
  def setTag(key: String, value: String): CalendarEvent = js.native
  
  def setTime(startTime: Date, endTime: Date): CalendarEvent = js.native
  
  def setTitle(title: String): CalendarEvent = js.native
  
  def setVisibility(visibility: Visibility): CalendarEvent = js.native
}
