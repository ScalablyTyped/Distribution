package typings
package gapiDotClientDotCalendarLib.gapiNs.clientNs.calendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarNotification extends js.Object {
  /**
    * The method used to deliver the notification. Possible values are:
    * - "email" - Reminders are sent via email.
    * - "sms" - Reminders are sent via SMS. This value is read-only and is ignored on inserts and updates. SMS reminders are only available for G Suite
    * customers.
    */
  var method: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The type of notification. Possible values are:
    * - "eventCreation" - Notification sent when a new event is put on the calendar.
    * - "eventChange" - Notification sent when an event is changed.
    * - "eventCancellation" - Notification sent when an event is cancelled.
    * - "eventResponse" - Notification sent when an event is changed.
    * - "agenda" - An agenda with the events of the day (sent out in the morning).
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object CalendarNotification {
  @scala.inline
  def apply(method: java.lang.String = null, `type`: java.lang.String = null): CalendarNotification = {
    val __obj = js.Dynamic.literal()
    if (method != null) __obj.updateDynamic("method")(method)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CalendarNotification]
  }
}

