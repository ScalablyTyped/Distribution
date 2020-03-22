package typings.gestalt

import typings.react.mod.SyntheticEvent
import typings.std.Event_
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValue extends js.Object {
  var event: SyntheticEvent[HTMLInputElement, Event_]
  var value: String
}

object AnonValue {
  @scala.inline
  def apply(event: SyntheticEvent[HTMLInputElement, Event_], value: String): AnonValue = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonValue]
  }
}

