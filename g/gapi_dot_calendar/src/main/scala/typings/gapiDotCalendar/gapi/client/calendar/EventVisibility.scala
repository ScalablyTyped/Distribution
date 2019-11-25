package typings.gapiDotCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Visibility of the event. Optional. Possible values are:
/* Rewritten from type alias, can be one of: 
  - typings.gapiDotCalendar.gapiDotCalendarStrings.default
  - typings.gapiDotCalendar.gapiDotCalendarStrings.public
  - typings.gapiDotCalendar.gapiDotCalendarStrings.`private`
  - typings.gapiDotCalendar.gapiDotCalendarStrings.confidential
*/
trait EventVisibility extends js.Object

object EventVisibility {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def confidential: typings.gapiDotCalendar.gapiDotCalendarStrings.confidential = this.cast("confidential")
  @scala.inline
  def default: typings.gapiDotCalendar.gapiDotCalendarStrings.default = this.cast("default")
  @scala.inline
  def `private`: typings.gapiDotCalendar.gapiDotCalendarStrings.`private` = this.cast("private")
  @scala.inline
  def public: typings.gapiDotCalendar.gapiDotCalendarStrings.public = this.cast("public")
}

