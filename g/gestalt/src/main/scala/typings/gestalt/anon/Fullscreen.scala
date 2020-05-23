package typings.gestalt.anon

import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fullscreen extends js.Object {
  var event: typings.react.mod.SyntheticEvent[HTMLDivElement, typings.std.Event]
  var fullscreen: Boolean
}

object Fullscreen {
  @scala.inline
  def apply(event: typings.react.mod.SyntheticEvent[HTMLDivElement, typings.std.Event], fullscreen: Boolean): Fullscreen = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], fullscreen = fullscreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fullscreen]
  }
}

