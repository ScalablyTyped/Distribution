package typings.gestalt

import typings.react.mod.SyntheticEvent
import typings.std.Event_
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEventFullscreen extends js.Object {
  var event: SyntheticEvent[HTMLDivElement, Event_]
  var fullscreen: Boolean
}

object AnonEventFullscreen {
  @scala.inline
  def apply(event: SyntheticEvent[HTMLDivElement, Event_], fullscreen: Boolean): AnonEventFullscreen = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], fullscreen = fullscreen.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEventFullscreen]
  }
}

