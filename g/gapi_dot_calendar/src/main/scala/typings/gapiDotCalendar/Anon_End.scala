package typings.gapiDotCalendar

import typings.gapiDotCalendar.gapi.client.calendar.datetime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_End extends js.Object {
  var end: datetime
  var start: datetime
}

object Anon_End {
  @scala.inline
  def apply(end: datetime, start: datetime): Anon_End = {
    val __obj = js.Dynamic.literal(end = end, start = start)
  
    __obj.asInstanceOf[Anon_End]
  }
}

