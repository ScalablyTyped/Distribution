package typings.gestalt

import typings.react.reactMod.SyntheticEvent
import typings.std.Event
import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Duration extends js.Object {
  var duration: Double
  var event: SyntheticEvent[HTMLVideoElement, Event]
}

object Anon_Duration {
  @scala.inline
  def apply(duration: Double, event: SyntheticEvent[HTMLVideoElement, Event]): Anon_Duration = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Duration]
  }
}

