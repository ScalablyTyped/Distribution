package typings.gestalt.anon

import typings.std.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueString extends js.Object {
  var event: typings.react.mod.SyntheticEvent[HTMLTextAreaElement, typings.std.Event]
  var value: String
}

object ValueString {
  @scala.inline
  def apply(event: typings.react.mod.SyntheticEvent[HTMLTextAreaElement, typings.std.Event], value: String): ValueString = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueString]
  }
}

