package typings.googleapis.buildSrcApisCalendarV3Mod.calendar_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$CalendarNotification extends js.Object {
  /**
    * The method used to deliver the notification. Possible values are:   -
    * &quot;email&quot; - Notifications are sent via email.  - &quot;sms&quot;
    * - Deprecated. Once this feature is shutdown, the API will no longer
    * return notifications using this method. Any newly added SMS notifications
    * will be ignored. See  Google Calendar SMS notifications to be removed for
    * more information. Notifications are sent via SMS. This value is read-only
    * and is ignored on inserts and updates. SMS notifications are only
    * available for G Suite customers.   Required when adding a notification.
    */
  var method: js.UndefOr[String] = js.native
  /**
    * The type of notification. Possible values are:   -
    * &quot;eventCreation&quot; - Notification sent when a new event is put on
    * the calendar.  - &quot;eventChange&quot; - Notification sent when an
    * event is changed.  - &quot;eventCancellation&quot; - Notification sent
    * when an event is cancelled.  - &quot;eventResponse&quot; - Notification
    * sent when an attendee responds to the event invitation.  -
    * &quot;agenda&quot; - An agenda with the events of the day (sent out in
    * the morning).   Required when adding a notification.
    */
  var `type`: js.UndefOr[String] = js.native
}

object Schema$CalendarNotification {
  @scala.inline
  def apply(method: String = null, `type`: String = null): Schema$CalendarNotification = {
    val __obj = js.Dynamic.literal()
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CalendarNotification]
  }
}

