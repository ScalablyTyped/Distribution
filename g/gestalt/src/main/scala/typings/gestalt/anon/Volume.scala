package typings.gestalt.anon

import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Volume extends js.Object {
  var event: typings.react.mod.SyntheticEvent[HTMLDivElement, typings.std.Event]
  var volume: Double
}

object Volume {
  @scala.inline
  def apply(event: typings.react.mod.SyntheticEvent[HTMLDivElement, typings.std.Event], volume: Double): Volume = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[Volume]
  }
}

