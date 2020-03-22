package typings.gestalt

import typings.react.mod.SyntheticEvent
import typings.std.Event_
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCheckedBoolean extends js.Object {
  var checked: Boolean
  var event: SyntheticEvent[HTMLElement, Event_]
}

object AnonCheckedBoolean {
  @scala.inline
  def apply(checked: Boolean, event: SyntheticEvent[HTMLElement, Event_]): AnonCheckedBoolean = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCheckedBoolean]
  }
}

