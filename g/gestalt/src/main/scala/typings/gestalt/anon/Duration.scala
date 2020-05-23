package typings.gestalt.anon

import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Duration extends js.Object {
  var duration: Double
  var event: typings.react.mod.SyntheticEvent[HTMLVideoElement, typings.std.Event]
}

object Duration {
  @scala.inline
  def apply(duration: Double, event: typings.react.mod.SyntheticEvent[HTMLVideoElement, typings.std.Event]): Duration = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[Duration]
  }
}

