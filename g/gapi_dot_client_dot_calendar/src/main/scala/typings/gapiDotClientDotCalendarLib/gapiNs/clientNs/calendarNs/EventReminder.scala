package typings
package gapiDotClientDotCalendarLib.gapiNs.clientNs.calendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventReminder extends js.Object {
  /**
    * The method used by this reminder. Possible values are:
    * - "email" - Reminders are sent via email.
    * - "sms" - Reminders are sent via SMS. These are only available for G Suite customers. Requests to set SMS reminders for other account types are
    * ignored.
    * - "popup" - Reminders are sent via a UI popup.
    */
  var method: js.UndefOr[java.lang.String] = js.undefined
  /** Number of minutes before the start of the event when the reminder should trigger. Valid values are between 0 and 40320 (4 weeks in minutes). */
  var minutes: js.UndefOr[scala.Double] = js.undefined
}

