package typings
package gapiDotCalendarLib.gapiNs.clientNs.calendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarListEntry extends js.Object {
  // The effective access role that the authenticated user has on the calendar. Read-only.
  var accessRole: AccessRoleWithoutNone
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  var colorId: js.UndefOr[java.lang.String] = js.undefined
  var defaultReminders: js.Array[gapiDotCalendarLib.Anon_Method]
  var deleted: js.UndefOr[scala.Boolean] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var etag: etag
  var foregroundColor: js.UndefOr[java.lang.String] = js.undefined
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  var id: java.lang.String
  var kind: gapiDotCalendarLib.gapiDotCalendarLibStrings.`calendar#calendarListEntry`
  var location: js.UndefOr[java.lang.String] = js.undefined
  var notificationSettings: js.UndefOr[gapiDotCalendarLib.Anon_Notifications] = js.undefined
  var primary: js.UndefOr[scala.Boolean] = js.undefined
  var selected: js.UndefOr[scala.Boolean] = js.undefined
  var summary: java.lang.String
  var summaryOverride: js.UndefOr[java.lang.String] = js.undefined
  var timeZone: js.UndefOr[java.lang.String] = js.undefined
}

object CalendarListEntry {
  @scala.inline
  def apply(
    accessRole: AccessRoleWithoutNone,
    defaultReminders: js.Array[gapiDotCalendarLib.Anon_Method],
    etag: etag,
    id: java.lang.String,
    kind: gapiDotCalendarLib.gapiDotCalendarLibStrings.`calendar#calendarListEntry`,
    summary: java.lang.String,
    backgroundColor: java.lang.String = null,
    colorId: java.lang.String = null,
    deleted: js.UndefOr[scala.Boolean] = js.undefined,
    description: java.lang.String = null,
    foregroundColor: java.lang.String = null,
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    location: java.lang.String = null,
    notificationSettings: gapiDotCalendarLib.Anon_Notifications = null,
    primary: js.UndefOr[scala.Boolean] = js.undefined,
    selected: js.UndefOr[scala.Boolean] = js.undefined,
    summaryOverride: java.lang.String = null,
    timeZone: java.lang.String = null
  ): CalendarListEntry = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accessRole")(accessRole)
    __obj.updateDynamic("defaultReminders")(defaultReminders)
    __obj.updateDynamic("etag")(etag)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("summary")(summary)
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

