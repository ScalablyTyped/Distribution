package typings.gestalt

import typings.react.mod.SyntheticEvent
import typings.std.Event_
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChecked extends js.Object {
  var checked: Boolean
  var event: SyntheticEvent[HTMLInputElement, Event_]
}

object AnonChecked {
  @scala.inline
  def apply(checked: Boolean, event: SyntheticEvent[HTMLInputElement, Event_]): AnonChecked = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChecked]
  }
}

