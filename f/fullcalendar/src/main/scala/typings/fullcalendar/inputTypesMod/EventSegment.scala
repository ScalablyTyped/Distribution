package typings.fullcalendar.inputTypesMod

import typings.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventSegment extends js.Object {
  var end: Moment
  var event: EventObjectInput
  var isEnd: Boolean
  var isStart: Boolean
  var start: Moment
}

object EventSegment {
  @scala.inline
  def apply(end: Moment, event: EventObjectInput, isEnd: Boolean, isStart: Boolean, start: Moment): EventSegment = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], isEnd = isEnd.asInstanceOf[js.Any], isStart = isStart.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventSegment]
  }
}

