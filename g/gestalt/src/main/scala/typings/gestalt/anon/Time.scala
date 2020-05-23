package typings.gestalt.anon

import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Time extends js.Object {
  var event: typings.react.mod.SyntheticEvent[HTMLVideoElement, typings.std.Event]
  var time: Double
}

object Time {
  @scala.inline
  def apply(event: typings.react.mod.SyntheticEvent[HTMLVideoElement, typings.std.Event], time: Double): Time = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Time]
  }
}

