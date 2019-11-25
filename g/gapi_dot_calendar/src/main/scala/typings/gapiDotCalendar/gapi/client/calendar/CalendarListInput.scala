package typings.gapiDotCalendar.gapi.client.calendar

import typings.gapiDotCalendar.Anon_Method
import typings.gapiDotCalendar.Anon_Notifications
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarListInput extends js.Object {
  // Optional Properties
  var backgroundColor: js.UndefOr[String] = js.undefined
  var colorId: js.UndefOr[String] = js.undefined
  var defaultReminders: js.UndefOr[js.Array[Anon_Method]] = js.undefined
  var foregroundColor: js.UndefOr[String] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  // Required Properties
  var id: String
  var notificationSettings: js.UndefOr[Anon_Notifications] = js.undefined
  var selected: js.UndefOr[Boolean] = js.undefined
  var summaryOverride: js.UndefOr[String] = js.undefined
}

object CalendarListInput {
  @scala.inline
  def apply(
    id: String,
    backgroundColor: String = null,
    colorId: String = null,
    defaultReminders: js.Array[Anon_Method] = null,
    foregroundColor: String = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    notificationSettings: Anon_Notifications = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    summaryOverride: String = null
  ): CalendarListInput = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (colorId != null) __obj.updateDynamic("colorId")(colorId.asInstanceOf[js.Any])
    if (defaultReminders != null) __obj.updateDynamic("defaultReminders")(defaultReminders.asInstanceOf[js.Any])
    if (foregroundColor != null) __obj.updateDynamic("foregroundColor")(foregroundColor.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (notificationSettings != null) __obj.updateDynamic("notificationSettings")(notificationSettings.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (summaryOverride != null) __obj.updateDynamic("summaryOverride")(summaryOverride.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarListInput]
  }
}

