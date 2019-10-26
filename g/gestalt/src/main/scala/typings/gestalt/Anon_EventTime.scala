package typings.gestalt

import typings.react.reactMod.SyntheticEvent
import typings.std.Event
import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventTime extends js.Object {
  var event: SyntheticEvent[HTMLVideoElement, Event]
  var time: Double
}

object Anon_EventTime {
  @scala.inline
  def apply(event: SyntheticEvent[HTMLVideoElement, Event], time: Double): Anon_EventTime = {
    val __obj = js.Dynamic.literal(event = event, time = time)
  
    __obj.asInstanceOf[Anon_EventTime]
  }
}

