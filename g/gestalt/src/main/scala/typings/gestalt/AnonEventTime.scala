package typings.gestalt

import typings.react.mod.SyntheticEvent
import typings.std.Event_
import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEventTime extends js.Object {
  var event: SyntheticEvent[HTMLVideoElement, Event_]
  var time: Double
}

object AnonEventTime {
  @scala.inline
  def apply(event: SyntheticEvent[HTMLVideoElement, Event_], time: Double): AnonEventTime = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEventTime]
  }
}

