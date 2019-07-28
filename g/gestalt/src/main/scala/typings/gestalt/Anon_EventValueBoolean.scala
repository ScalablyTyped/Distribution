package typings.gestalt

import typings.react.Event
import typings.react.reactMod.SyntheticEvent
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventValueBoolean extends js.Object {
  var event: SyntheticEvent[HTMLInputElement, Event]
  var value: Boolean
}

object Anon_EventValueBoolean {
  @scala.inline
  def apply(event: SyntheticEvent[HTMLInputElement, Event], value: Boolean): Anon_EventValueBoolean = {
    val __obj = js.Dynamic.literal(event = event, value = value)
  
    __obj.asInstanceOf[Anon_EventValueBoolean]
  }
}

