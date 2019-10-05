package typings.gapiDotCalendar.gapi.client.calendar

import typings.gapiDotCalendar.Anon_Method
import typings.gapiDotCalendar.Anon_Notifications
import typings.gapiDotCalendar.gapiDotCalendarStrings.`calendar#calendarListEntry`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarListEntry extends js.Object {
  // The effective access role that the authenticated user has on the calendar. Read-only.
  var accessRole: AccessRoleWithoutNone
  var backgroundColor: js.UndefOr[String] = js.undefined
  var colorId: js.UndefOr[String] = js.undefined
  var defaultReminders: js.Array[Anon_Method]
  var deleted: js.UndefOr[Boolean] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var etag: typings.gapiDotCalendar.gapi.client.calendar.etag
  var foregroundColor: js.UndefOr[String] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var id: String
  var kind: `calendar#calendarListEntry`
  var location: js.UndefOr[String] = js.undefined
  var notificationSettings: js.UndefOr[Anon_Notifications] = js.undefined
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
    defaultReminders: js.Array[Anon_Method],
    etag: etag,
    id: String,
    kind: `calendar#calendarListEntry`,
    summary: String,
    backgroundColor: String = null,
    colorId: String = null,
    deleted: js.UndefOr[Boolean] = js.undefined,
    description: String = null,
    foregroundColor: String = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    location: String = null,
    notificationSettings: Anon_Notifications = null,
    primary: js.UndefOr[Boolean] = js.undefined,
    selected: js.UndefOr[Boolean] = js.undefined,
    summaryOverride: String = null,
    timeZone: String = null
  ): CalendarListEntry = {
    val __obj = js.Dynamic.literal(accessRole = accessRole, defaultReminders = defaultReminders, etag = etag, id = id, kind = kind, summary = summary)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (colorId != null) __obj.updateDynamic("colorId")(colorId)
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted)
    if (description != null) __obj.updateDynamic("description")(description)
    if (foregroundColor != null) __obj.updateDynamic("foregroundColor")(foregroundColor)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (location != null) __obj.updateDynamic("location")(location)
    if (notificationSettings != null) __obj.updateDynamic("notificationSettings")(notificationSettings)
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary)
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    if (summaryOverride != null) __obj.updateDynamic("summaryOverride")(summaryOverride)
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone)
    __obj.asInstanceOf[CalendarListEntry]
  }
}

