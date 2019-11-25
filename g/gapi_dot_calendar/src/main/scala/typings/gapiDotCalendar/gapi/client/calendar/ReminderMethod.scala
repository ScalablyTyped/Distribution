package typings.gapiDotCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// The method used by this reminder. Possible values are:
/* Rewritten from type alias, can be one of: 
  - typings.gapiDotCalendar.gapiDotCalendarStrings.email
  - typings.gapiDotCalendar.gapiDotCalendarStrings.sms
  - typings.gapiDotCalendar.gapiDotCalendarStrings.popup
*/
trait ReminderMethod extends js.Object

object ReminderMethod {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def email: typings.gapiDotCalendar.gapiDotCalendarStrings.email = this.cast("email")
  @scala.inline
  def popup: typings.gapiDotCalendar.gapiDotCalendarStrings.popup = this.cast("popup")
  @scala.inline
  def sms: typings.gapiDotCalendar.gapiDotCalendarStrings.sms = this.cast("sms")
}

