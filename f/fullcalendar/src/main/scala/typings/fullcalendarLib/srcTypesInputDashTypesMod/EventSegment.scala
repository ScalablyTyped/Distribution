package typings
package fullcalendarLib.srcTypesInputDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventSegment extends js.Object {
  var end: momentLib.momentMod.momentNs.Moment
  var event: EventObjectInput
  var isEnd: scala.Boolean
  var isStart: scala.Boolean
  var start: momentLib.momentMod.momentNs.Moment
}

object EventSegment {
  @scala.inline
  def apply(
    end: momentLib.momentMod.momentNs.Moment,
    event: EventObjectInput,
    isEnd: scala.Boolean,
    isStart: scala.Boolean,
    start: momentLib.momentMod.momentNs.Moment
  ): EventSegment = {
    val __obj = js.Dynamic.literal(end = end, event = event, isEnd = isEnd, isStart = isStart, start = start)
  
    __obj.asInstanceOf[EventSegment]
  }
}

