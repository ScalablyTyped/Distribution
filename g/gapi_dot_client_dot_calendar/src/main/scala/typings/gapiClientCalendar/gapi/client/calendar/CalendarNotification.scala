package typings.gapiClientCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarNotification extends js.Object {
  /**
    * The method used to deliver the notification. The possible value is:
    * - "email" - Notifications are sent via email.
    * Required when adding a notification.
    */
  var method: js.UndefOr[String] = js.undefined
  /**
    * The type of notification. Possible values are:
    * - "eventCreation" - Notification sent when a new event is put on the calendar.
    * - "eventChange" - Notification sent when an event is changed.
    * - "eventCancellation" - Notification sent when an event is cancelled.
    * - "eventResponse" - Notification sent when an attendee responds to the event invitation.
    * - "agenda" - An agenda with the events of the day (sent out in the morning).
    * Required when adding a notification.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object CalendarNotification {
  @scala.inline
  def apply(method: String = null, `type`: String = null): CalendarNotification = {
    val __obj = js.Dynamic.literal()
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarNotification]
  }
}

