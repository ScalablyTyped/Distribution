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

object CalendarListInput {
  @scala.inline
  def apply(
    id: java.lang.String,
    backgroundColor: java.lang.String = null,
    colorId: java.lang.String = null,
    defaultReminders: js.Array[gapiDotCalendarLib.Anon_Method] = null,
    foregroundColor: java.lang.String = null,
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    notificationSettings: gapiDotCalendarLib.Anon_Notifications = null,
    selected: js.UndefOr[scala.Boolean] = js.undefined,
    summaryOverride: java.lang.String = null
  ): CalendarListInput = {
    val __obj = js.Dynamic.literal(id = id)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (colorId != null) __obj.updateDynamic("colorId")(colorId)
    if (defaultReminders != null) __obj.updateDynamic("defaultReminders")(defaultReminders)
    if (foregroundColor != null) __obj.updateDynamic("foregroundColor")(foregroundColor)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (notificationSettings != null) __obj.updateDynamic("notificationSettings")(notificationSettings)
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    if (summaryOverride != null) __obj.updateDynamic("summaryOverride")(summaryOverride)
    __obj.asInstanceOf[CalendarListInput]
  }
}

