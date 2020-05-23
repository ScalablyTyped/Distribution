package typings.gapiCalendar.gapi.client.calendar

import typings.gapiCalendar.anon.Method
import typings.gapiCalendar.anon.Notifications
import typings.gapiCalendar.gapiCalendarStrings.calendarNumbersigncalendarListEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarListEntry extends js.Object {
  // The effective access role that the authenticated user has on the calendar. Read-only.
  var accessRole: AccessRoleWithoutNone
  var backgroundColor: js.UndefOr[String] = js.undefined
  var colorId: js.UndefOr[String] = js.undefined
  var defaultReminders: js.Array[Method]
  var deleted: js.UndefOr[Boolean] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var etag: typings.gapiCalendar.gapi.client.calendar.etag
  var foregroundColor: js.UndefOr[String] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var id: String
  var kind: calendarNumbersigncalendarListEntry
  var location: js.UndefOr[String] = js.undefined
  var notificationSettings: js.UndefOr[Notifications] = js.undefined
  var primary: js.UndefOr[Boolean] = js.undefined
  var selected: js.UndefOr[Boolean] = js.undefined
  var summary: String
  var summaryOverride: js.UndefOr[String] = js.undefined
  var timeZone: js.UndefOr[String] = js.undefined
}

object CalendarListEntry {
  @scala.inline
  def apply(
    accessRole: AccessRoleWithoutNone,
    defaultReminders: js.Array[Method],
    etag: etag,
    id: String,
    kind: calendarNumbersigncalendarListEntry,
    summary: String,
    backgroundColor: String = null,
    colorId: String = null,
    deleted: js.UndefOr[Boolean] = js.undefined,
    description: String = null,
    foregroundColor: String = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    location: String = null,
    notificationSettings: Notifications = null,
    primary: js.UndefOr[Boolean] = js.undefined,
    selected: js.UndefOr[Boolean] = js.undefined,
    summaryOverride: String = null,
    timeZone: String = null
  ): CalendarListEntry = {
    val __obj = js.Dynamic.literal(accessRole = accessRole.asInstanceOf[js.Any], defaultReminders = defaultReminders.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (colorId != null) __obj.updateDynamic("colorId")(colorId.asInstanceOf[js.Any])
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted.get.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (foregroundColor != null) __obj.updateDynamic("foregroundColor")(foregroundColor.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.get.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (notificationSettings != null) __obj.updateDynamic("notificationSettings")(notificationSettings.asInstanceOf[js.Any])
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary.get.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.get.asInstanceOf[js.Any])
    if (summaryOverride != null) __obj.updateDynamic("summaryOverride")(summaryOverride.asInstanceOf[js.Any])
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarListEntry]
  }
}

