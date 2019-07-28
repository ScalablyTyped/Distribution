package typings.gestalt

import typings.react.Event
import typings.react.reactMod.SyntheticEvent
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
    val __obj = js.Dynamic.literal(event = event, value = value)
  
    __obj.asInstanceOf[Anon_EventValue]
  }
}

