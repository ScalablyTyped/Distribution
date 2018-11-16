package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalendarEventSeries extends js.Object {
  def addEmailReminder(minutesBefore: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): CalendarEventSeries = js.native
  def addGuest(email: java.lang.String): CalendarEventSeries = js.native
  def addPopupReminder(minutesBefore: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): CalendarEventSeries = js.native
  def addSmsReminder(minutesBefore: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): CalendarEventSeries = js.native
  def anyoneCanAddSelf(): scala.Boolean = js.native
  def deleteEventSeries(): scala.Unit = js.native
  def deleteTag(key: java.lang.String): CalendarEventSeries = js.native
  def getAllTagKeys(): js.Array[java.lang.String] = js.native
  def getColor(): java.lang.String = js.native
  def getCreators(): js.Array[java.lang.String] = js.native
  def getDateCreated(): stdLib.Date = js.native
  def getDescription(): java.lang.String = js.native
  def getEmailReminders(): js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer] = js.native
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
  def getTag(key: java.lang.String): java.lang.String = js.native
  def getTitle(): java.lang.String = js.native
  def getVisibility(): Visibility = js.native
  def guestsCanInviteOthers(): scala.Boolean = js.native
  def guestsCanModify(): scala.Boolean = js.native
  def guestsCanSeeGuests(): scala.Boolean = js.native
  def isOwnedByMe(): scala.Boolean = js.native
  def removeAllReminders(): CalendarEventSeries = js.native
  def removeGuest(email: java.lang.String): CalendarEventSeries = js.native
  def resetRemindersToDefault(): CalendarEventSeries = js.native
  def setAnyoneCanAddSelf(anyoneCanAddSelf: scala.Boolean): CalendarEventSeries = js.native
  def setColor(color: java.lang.String): CalendarEventSeries = js.native
  def setDescription(description: java.lang.String): CalendarEventSeries = js.native
  def setGuestsCanInviteOthers(guestsCanInviteOthers: scala.Boolean): CalendarEventSeries = js.native
  def setGuestsCanModify(guestsCanModify: scala.Boolean): CalendarEventSeries = js.native
  def setGuestsCanSeeGuests(guestsCanSeeGuests: scala.Boolean): CalendarEventSeries = js.native
  def setLocation(location: java.lang.String): CalendarEventSeries = js.native
  def setMyStatus(status: GuestStatus): CalendarEventSeries = js.native
  def setRecurrence(recurrence: EventRecurrence, startDate: stdLib.Date): CalendarEventSeries = js.native
  def setRecurrence(recurrence: EventRecurrence, startTime: stdLib.Date, endTime: stdLib.Date): CalendarEventSeries = js.native
  def setTag(key: java.lang.String, value: java.lang.String): CalendarEventSeries = js.native
  def setTitle(title: java.lang.String): CalendarEventSeries = js.native
  def setVisibility(visibility: Visibility): CalendarEventSeries = js.native
}

