package typings.gestalt.anon

import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Checked extends js.Object {
  var checked: Boolean
  var event: typings.react.mod.SyntheticEvent[HTMLInputElement, typings.std.Event]
}

object Checked {
  @scala.inline
  def apply(checked: Boolean, event: typings.react.mod.SyntheticEvent[HTMLInputElement, typings.std.Event]): Checked = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[Checked]
  }
}

