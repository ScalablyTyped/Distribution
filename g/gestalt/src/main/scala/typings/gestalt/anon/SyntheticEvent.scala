package typings.gestalt.anon

import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyntheticEvent extends js.Object {
  var syntheticEvent: typings.react.mod.SyntheticEvent[HTMLInputElement, typings.std.Event]
  var value: String
}

object SyntheticEvent {
  @scala.inline
  def apply(
    syntheticEvent: typings.react.mod.SyntheticEvent[HTMLInputElement, typings.std.Event],
    value: String
  ): SyntheticEvent = {
    val __obj = js.Dynamic.literal(syntheticEvent = syntheticEvent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyntheticEvent]
  }
}

