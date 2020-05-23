package typings.gestalt.anon

import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Loaded extends js.Object {
  var event: typings.react.mod.SyntheticEvent[HTMLVideoElement, typings.std.Event]
  var loaded: Double
}

object Loaded {
  @scala.inline
  def apply(event: typings.react.mod.SyntheticEvent[HTMLVideoElement, typings.std.Event], loaded: Double): Loaded = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any])
    __obj.asInstanceOf[Loaded]
  }
}

