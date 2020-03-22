package typings.gestalt

import typings.react.mod.SyntheticEvent
import typings.std.Event_
import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLoaded extends js.Object {
  var event: SyntheticEvent[HTMLVideoElement, Event_]
  var loaded: Double
}

object AnonLoaded {
  @scala.inline
  def apply(event: SyntheticEvent[HTMLVideoElement, Event_], loaded: Double): AnonLoaded = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLoaded]
  }
}

