package typings.gapiCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// The type of the scope. Possible values are:
/* Rewritten from type alias, can be one of: 
  - typings.gapiCalendar.gapiCalendarStrings.default
  - typings.gapiCalendar.gapiCalendarStrings.user
  - typings.gapiCalendar.gapiCalendarStrings.group
  - typings.gapiCalendar.gapiCalendarStrings.domain
*/
trait ScopeType extends js.Object

object ScopeType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def default: typings.gapiCalendar.gapiCalendarStrings.default = this.cast("default")
  @scala.inline
  def domain: typings.gapiCalendar.gapiCalendarStrings.domain = this.cast("domain")
  @scala.inline
  def group: typings.gapiCalendar.gapiCalendarStrings.group = this.cast("group")
  @scala.inline
  def user: typings.gapiCalendar.gapiCalendarStrings.user = this.cast("user")
}

