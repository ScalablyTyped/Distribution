package typings.googleapis.buildSrcApisCalendarV3Mod.calendar_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$EventReminder extends js.Object {
  /**
    * The method used by this reminder. Possible values are:   -
    * &quot;email&quot; - Reminders are sent via email.  - &quot;sms&quot; -
    * Deprecated. Once this feature is shutdown, the API will no longer return
    * reminders using this method. Any newly added SMS reminders will be
    * ignored. See  Google Calendar SMS notifications to be removed for more
    * information. Reminders are sent via SMS. These are only available for G
    * Suite customers. Requests to set SMS reminders for other account types
    * are ignored.  - &quot;popup&quot; - Reminders are sent via a UI popup.
    * Required when adding a reminder.
    */
  var method: js.UndefOr[String] = js.native
  /**
    * Number of minutes before the start of the event when the reminder should
    * trigger. Valid values are between 0 and 40320 (4 weeks in minutes).
    * Required when adding a reminder.
    */
  var minutes: js.UndefOr[Double] = js.native
}

object Schema$EventReminder {
  @scala.inline
  def apply(method: String = null, minutes: Int | Double = null): Schema$EventReminder = {
    val __obj = js.Dynamic.literal()
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (minutes != null) __obj.updateDynamic("minutes")(minutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$EventReminder]
  }
}

