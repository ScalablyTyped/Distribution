package typings.gestalt.anon

import typings.react.mod.KeyboardEvent
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `2` extends js.Object {
  var event: typings.react.mod.SyntheticEvent[KeyboardEvent[HTMLInputElement], typings.std.Event]
  var value: String
}

object `2` {
  @scala.inline
  def apply(
    event: typings.react.mod.SyntheticEvent[KeyboardEvent[HTMLInputElement], typings.std.Event],
    value: String
  ): `2` = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[`2`]
  }
}

