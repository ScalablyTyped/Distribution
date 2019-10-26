package typings.gestalt

import typings.react.reactMod.SyntheticEvent
import typings.std.Event
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventFullscreen extends js.Object {
  var event: SyntheticEvent[HTMLDivElement, Event]
  var fullscreen: Boolean
}

object Anon_EventFullscreen {
  @scala.inline
  def apply(event: SyntheticEvent[HTMLDivElement, Event], fullscreen: Boolean): Anon_EventFullscreen = {
    val __obj = js.Dynamic.literal(event = event, fullscreen = fullscreen)
  
    __obj.asInstanceOf[Anon_EventFullscreen]
  }
}

