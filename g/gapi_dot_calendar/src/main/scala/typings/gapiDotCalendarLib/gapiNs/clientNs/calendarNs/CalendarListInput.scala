package typings
package gapiDotCalendarLib.gapiNs.clientNs.calendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarListInput extends js.Object {
  // Optional Properties
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  var colorId: js.UndefOr[java.lang.String] = js.undefined
  var defaultReminders: js.UndefOr[js.Array[gapiDotCalendarLib.Anon_Method]] = js.undefined
  var foregroundColor: js.UndefOr[java.lang.String] = js.undefined
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  // Required Properties
  var id: java.lang.String
  var notificationSettings: js.UndefOr[gapiDotCalendarLib.Anon_Notifications] = js.undefined
  var selected: js.UndefOr[scala.Boolean] = js.undefined
  var summaryOverride: js.UndefOr[java.lang.String] = js.undefined
}

