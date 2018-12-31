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

