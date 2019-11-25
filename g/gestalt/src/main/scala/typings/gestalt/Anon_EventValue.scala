package typings.gestalt

import typings.react.reactMod.SyntheticEvent
import typings.std.Event
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventValue extends js.Object {
  var event: SyntheticEvent[HTMLInputElement, Event]
  var value: String
}

object Anon_EventValue {
  @scala.inline
  def apply(event: SyntheticEvent[HTMLInputElement, Event], value: String): Anon_EventValue = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_EventValue]
  }
}

