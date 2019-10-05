package typings.googleDashAppsDashScript.GoogleAppsScript.Calendar.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarListEntry extends js.Object {
  var accessRole: js.UndefOr[String] = js.undefined
  var backgroundColor: js.UndefOr[String] = js.undefined
  var colorId: js.UndefOr[String] = js.undefined
  var conferenceProperties: js.UndefOr[ConferenceProperties] = js.undefined
  var defaultReminders: js.UndefOr[js.Array[EventReminder]] = js.undefined
  var deleted: js.UndefOr[Boolean] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var etag: js.UndefOr[String] = js.undefined
  var foregroundColor: js.UndefOr[String] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var location: js.UndefOr[String] = js.undefined
  var notificationSettings: js.UndefOr[CalendarListEntryNotificationSettings] = js.undefined
  var primary: js.UndefOr[Boolean] = js.undefined
  var selected: js.UndefOr[Boolean] = js.undefined
  var summary: js.UndefOr[String] = js.undefined
  var summaryOverride: js.UndefOr[String] = js.undefined
  var timeZone: js.UndefOr[String] = js.undefined
}

object CalendarListEntry {
  @scala.inline
  def apply(
    accessRole: String = null,
    backgroundColor: String = null,
    colorId: String = null,
    conferenceProperties: ConferenceProperties = null,
    defaultReminders: js.Array[EventReminder] = null,
    deleted: js.UndefOr[Boolean] = js.undefined,
    description: String = null,
    etag: String = null,
    foregroundColor: String = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    kind: String = null,
    location: String = null,
    notificationSettings: CalendarListEntryNotificationSettings = null,
    primary: js.UndefOr[Boolean] = js.undefined,
    selected: js.UndefOr[Boolean] = js.undefined,
    summary: String = null,
    summaryOverride: String = null,
    timeZone: String = null
  ): CalendarListEntry = {
    val __obj = js.Dynamic.literal()
    if (accessRole != null) __obj.updateDynamic("accessRole")(accessRole)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (colorId != null) __obj.updateDynamic("colorId")(colorId)
    if (conferenceProperties != null) __obj.updateDynamic("conferenceProperties")(conferenceProperties)
    if (defaultReminders != null) __obj.updateDynamic("defaultReminders")(defaultReminders)
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted)
    if (description != null) __obj.updateDynamic("description")(description)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (foregroundColor != null) __obj.updateDynamic("foregroundColor")(foregroundColor)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (location != null) __obj.updateDynamic("location")(location)
    if (notificationSettings != null) __obj.updateDynamic("notificationSettings")(notificationSettings)
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary)
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    if (summary != null) __obj.updateDynamic("summary")(summary)
    if (summaryOverride != null) __obj.updateDynamic("summaryOverride")(summaryOverride)
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone)
    __obj.asInstanceOf[CalendarListEntry]
  }
}

