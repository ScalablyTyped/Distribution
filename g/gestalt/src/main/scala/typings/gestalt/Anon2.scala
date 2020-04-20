package typings.gestalt

import typings.react.mod.KeyboardEvent
import typings.react.mod.SyntheticEvent
import typings.std.Event_
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon2 extends js.Object {
  var event: SyntheticEvent[KeyboardEvent[HTMLInputElement], Event_]
  var value: String
}

object Anon2 {
  @scala.inline
  def apply(event: SyntheticEvent[KeyboardEvent[HTMLInputElement], Event_], value: String): Anon2 = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon2]
  }
}

