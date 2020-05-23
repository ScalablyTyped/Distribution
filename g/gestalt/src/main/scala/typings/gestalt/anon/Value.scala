package typings.gestalt.anon

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Value extends js.Object {
  var event: typings.react.mod.SyntheticEvent[HTMLElement, typings.std.Event]
  var value: String
}

object Value {
  @scala.inline
  def apply(event: typings.react.mod.SyntheticEvent[HTMLElement, typings.std.Event], value: String): Value = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
}

