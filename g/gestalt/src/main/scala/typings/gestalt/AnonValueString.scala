package typings.gestalt

import typings.react.mod.FocusEvent
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValueString extends js.Object {
  var event: SyntheticEvent[FocusEvent[Element], Event_]
  var value: String
}

object AnonValueString {
  @scala.inline
  def apply(event: SyntheticEvent[FocusEvent[Element], Event_], value: String): AnonValueString = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonValueString]
  }
}

