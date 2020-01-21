package typings.gapiCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Visibility of the event. Optional. Possible values are:
/* Rewritten from type alias, can be one of: 
  - typings.gapiCalendar.gapiCalendarStrings.default
  - typings.gapiCalendar.gapiCalendarStrings.public
  - typings.gapiCalendar.gapiCalendarStrings.`private`
  - typings.gapiCalendar.gapiCalendarStrings.confidential
*/
trait EventVisibility extends js.Object

object EventVisibility {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def confidential: typings.gapiCalendar.gapiCalendarStrings.confidential = this.cast("confidential")
  @scala.inline
  def default: typings.gapiCalendar.gapiCalendarStrings.default = this.cast("default")
  @scala.inline
  def `private`: typings.gapiCalendar.gapiCalendarStrings.`private` = this.cast("private")
  @scala.inline
  def public: typings.gapiCalendar.gapiCalendarStrings.public = this.cast("public")
}

