package typings.googleDashAppsDashScript.GoogleAppsScript.Calendar

import typings.googleDashAppsDashScript.GoogleAppsScript.Integer
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalendarEventSeries extends js.Object {
  def addEmailReminder(minutesBefore: Integer): CalendarEventSeries = js.native
  def addGuest(email: String): CalendarEventSeries = js.native
  def addPopupReminder(minutesBefore: Integer): CalendarEventSeries = js.native
  def addSmsReminder(minutesBefore: Integer): CalendarEventSeries = js.native
  def anyoneCanAddSelf(): Boolean = js.native
  def deleteEventSeries(): Unit = js.native
  def deleteTag(key: String): CalendarEventSeries = js.native
  def getAllTagKeys(): js.Array[String] = js.native
  def getColor(): String = js.native
  def getCreators(): js.Array[String] = js.native
  def getDateCreated(): Date = js.native
  def getDescription(): String = js.native
  def getEmailReminders(): js.Array[Integer] = js.native
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
  def getTag(key: String): String = js.native
  def getTitle(): String = js.native
  def getVisibility(): Visibility = js.native
  def guestsCanInviteOthers(): Boolean = js.native
  def guestsCanModify(): Boolean = js.native
  def guestsCanSeeGuests(): Boolean = js.native
  def isOwnedByMe(): Boolean = js.native
  def removeAllReminders(): CalendarEventSeries = js.native
  def removeGuest(email: String): CalendarEventSeries = js.native
  def resetRemindersToDefault(): CalendarEventSeries = js.native
  def setAnyoneCanAddSelf(anyoneCanAddSelf: Boolean): CalendarEventSeries = js.native
  def setColor(color: String): CalendarEventSeries = js.native
  def setDescription(description: String): CalendarEventSeries = js.native
  def setGuestsCanInviteOthers(guestsCanInviteOthers: Boolean): CalendarEventSeries = js.native
  def setGuestsCanModify(guestsCanModify: Boolean): CalendarEventSeries = js.native
  def setGuestsCanSeeGuests(guestsCanSeeGuests: Boolean): CalendarEventSeries = js.native
  def setLocation(location: String): CalendarEventSeries = js.native
  def setMyStatus(status: GuestStatus): CalendarEventSeries = js.native
  def setRecurrence(recurrence: EventRecurrence, startDate: Date): CalendarEventSeries = js.native
  def setRecurrence(recurrence: EventRecurrence, startTime: Date, endTime: Date): CalendarEventSeries = js.native
  def setTag(key: String, value: String): CalendarEventSeries = js.native
  def setTitle(title: String): CalendarEventSeries = js.native
  def setVisibility(visibility: Visibility): CalendarEventSeries = js.native
}

