package typings.gestalt

import typings.react.mod.SyntheticEvent
import typings.std.Event_
import typings.std.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValueString extends js.Object {
  var event: SyntheticEvent[HTMLTextAreaElement, Event_]
  var value: String
}

object AnonValueString {
  @scala.inline
  def apply(event: SyntheticEvent[HTMLTextAreaElement, Event_], value: String): AnonValueString = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonValueString]
  }
}

