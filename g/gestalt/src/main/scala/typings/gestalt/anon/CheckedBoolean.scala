package typings.gestalt.anon

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckedBoolean extends js.Object {
  var checked: Boolean
  var event: typings.react.mod.SyntheticEvent[HTMLElement, typings.std.Event]
}

object CheckedBoolean {
  @scala.inline
  def apply(checked: Boolean, event: typings.react.mod.SyntheticEvent[HTMLElement, typings.std.Event]): CheckedBoolean = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckedBoolean]
  }
}

