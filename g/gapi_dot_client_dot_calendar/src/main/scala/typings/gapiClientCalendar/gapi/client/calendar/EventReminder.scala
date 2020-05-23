package typings.gapiClientCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventReminder extends js.Object {
  /**
    * The method used by this reminder. Possible values are:
    * - "email" - Reminders are sent via email.
    * - "popup" - Reminders are sent via a UI popup.
    * Required when adding a reminder.
    */
  var method: js.UndefOr[String] = js.undefined
  /**
    * Number of minutes before the start of the event when the reminder should trigger. Valid values are between 0 and 40320 (4 weeks in minutes).
    * Required when adding a reminder.
    */
  var minutes: js.UndefOr[Double] = js.undefined
}

object EventReminder {
  @scala.inline
  def apply(method: String = null, minutes: js.UndefOr[Double] = js.undefined): EventReminder = {
    val __obj = js.Dynamic.literal()
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(minutes)) __obj.updateDynamic("minutes")(minutes.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventReminder]
  }
}

