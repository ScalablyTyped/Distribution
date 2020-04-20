package typings.gestalt

import typings.react.mod.SyntheticEvent
import typings.std.Event_
import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDuration extends js.Object {
  var duration: Double
  var event: SyntheticEvent[HTMLVideoElement, Event_]
}

object AnonDuration {
  @scala.inline
  def apply(duration: Double, event: SyntheticEvent[HTMLVideoElement, Event_]): AnonDuration = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDuration]
  }
}

