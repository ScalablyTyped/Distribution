package typings.gapiCalendar

import typings.gapiCalendar.gapi.client.calendar.datetime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEnd extends js.Object {
  var end: datetime
  var start: datetime
}

object AnonEnd {
  @scala.inline
  def apply(end: datetime, start: datetime): AnonEnd = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEnd]
  }
}

