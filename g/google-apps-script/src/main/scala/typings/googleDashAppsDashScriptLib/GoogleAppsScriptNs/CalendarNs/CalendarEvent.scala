package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalendarEvent extends js.Object {
  def addEmailReminder(minutesBefore: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): CalendarEvent = js.native
  def addGuest(email: java.lang.String): CalendarEvent = js.native
  def addPopupReminder(minutesBefore: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): CalendarEvent = js.native
  def addSmsReminder(minutesBefore: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): CalendarEvent = js.native
  def anyoneCanAddSelf(): scala.Boolean = js.native
  def deleteEvent(): scala.Unit = js.native
  def deleteTag(key: java.lang.String): CalendarEvent = js.native
  def getAllDayEndDate(): stdLib.Date = js.native
  def getAllDayStartDate(): stdLib.Date = js.native
  def getAllTagKeys(): js.Array[java.lang.String] = js.native
  def getColor(): java.lang.String = js.native
  def getCreators(): js.Array[java.lang.String] = js.native
  def getDateCreated(): stdLib.Date = js.native
  def getDescription(): java.lang.String = js.native
  def getEmailReminders(): js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer] = js.native
  def getEndTime(): stdLib.Date = js.native
  def getEventSeries(): CalendarEventSeries = js.native
  def getGuestByEmail(email: java.lang.String): EventGuest = js.native
  def getGuestList(): js.Array[EventGuest] = js.native
  def getGuestList(includeOwner: scala.Boolean): js.Array[EventGuest] = js.native
  def getId(): java.lang.String = js.native
  def getLastUpdated(): stdLib.Date = js.native
  def getLocation(): java.lang.String = js.native
  def getMyStatus(): GuestStatus = js.native
  def getOriginalCalendarId(): java.lang.String = js.native
  def getPopupReminders(): js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer] = js.native
  def getSmsReminders(): js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer] = js.native
  def getStartTime(): stdLib.Date = js.native
  def getTag(key: java.lang.String): java.lang.String = js.native
  def getTitle(): java.lang.String = js.native
  def getVisibility(): Visibility = js.native
  def guestsCanInviteOthers(): scala.Boolean = js.native
  def guestsCanModify(): scala.Boolean = js.native
  def guestsCanSeeGuests(): scala.Boolean = js.native
  def isAllDayEvent(): scala.Boolean = js.native
  def isOwnedByMe(): scala.Boolean = js.native
  def isRecurringEvent(): scala.Boolean = js.native
  def removeAllReminders(): CalendarEvent = js.native
  def removeGuest(email: java.lang.String): CalendarEvent = js.native
  def resetRemindersToDefault(): CalendarEvent = js.native
  def setAllDayDate(date: stdLib.Date): CalendarEvent = js.native
  def setAllDayDates(startDate: stdLib.Date, endDate: stdLib.Date): CalendarEvent = js.native
  def setAnyoneCanAddSelf(anyoneCanAddSelf: scala.Boolean): CalendarEvent = js.native
  def setColor(color: java.lang.String): CalendarEvent = js.native
  def setDescription(description: java.lang.String): CalendarEvent = js.native
  def setGuestsCanInviteOthers(guestsCanInviteOthers: scala.Boolean): CalendarEvent = js.native
  def setGuestsCanModify(guestsCanModify: scala.Boolean): CalendarEvent = js.native
  def setGuestsCanSeeGuests(guestsCanSeeGuests: scala.Boolean): CalendarEvent = js.native
  def setLocation(location: java.lang.String): CalendarEvent = js.native
  def setMyStatus(status: GuestStatus): CalendarEvent = js.native
  def setTag(key: java.lang.String, value: java.lang.String): CalendarEvent = js.native
  def setTime(startTime: stdLib.Date, endTime: stdLib.Date): CalendarEvent = js.native
  def setTitle(title: java.lang.String): CalendarEvent = js.native
  def setVisibility(visibility: Visibility): CalendarEvent = js.native
}

