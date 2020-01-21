package typings.gestalt

import typings.react.mod.FocusEvent
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEventValueElement extends js.Object {
  var event: SyntheticEvent[FocusEvent[Element], Event_]
  var value: String
}

object AnonEventValueElement {
  @scala.inline
  def apply(event: SyntheticEvent[FocusEvent[Element], Event_], value: String): AnonEventValueElement = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEventValueElement]
  }
}

