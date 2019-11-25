package typings.gestalt

import typings.react.reactMod.SyntheticEvent
import typings.std.Event
import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventLoaded extends js.Object {
  var event: SyntheticEvent[HTMLVideoElement, Event]
  var loaded: Double
}

object Anon_EventLoaded {
  @scala.inline
  def apply(event: SyntheticEvent[HTMLVideoElement, Event], loaded: Double): Anon_EventLoaded = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_EventLoaded]
  }
}

