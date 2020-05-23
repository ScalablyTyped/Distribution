package typings.gestalt.anon

import typings.react.mod.FocusEvent
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1` extends js.Object {
  var event: typings.react.mod.SyntheticEvent[FocusEvent[HTMLInputElement], typings.std.Event]
  var value: String
}

object `1` {
  @scala.inline
  def apply(
    event: typings.react.mod.SyntheticEvent[FocusEvent[HTMLInputElement], typings.std.Event],
    value: String
  ): `1` = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
}

