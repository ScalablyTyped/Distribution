package typings.gestalt.anon

import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventSyntheticEventValueString extends js.Object {
  var event: typings.react.mod.SyntheticEvent[HTMLInputElement, typings.std.Event]
  var value: String
}

object EventSyntheticEventValueString {
  @scala.inline
  def apply(event: typings.react.mod.SyntheticEvent[HTMLInputElement, typings.std.Event], value: String): EventSyntheticEventValueString = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventSyntheticEventValueString]
  }
}

