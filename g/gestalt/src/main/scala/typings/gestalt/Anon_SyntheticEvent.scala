package typings.gestalt

import typings.react.reactMod.SyntheticEvent
import typings.std.Event
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SyntheticEvent extends js.Object {
  var syntheticEvent: SyntheticEvent[HTMLInputElement, Event]
  var value: String
}

object Anon_SyntheticEvent {
  @scala.inline
  def apply(syntheticEvent: SyntheticEvent[HTMLInputElement, Event], value: String): Anon_SyntheticEvent = {
    val __obj = js.Dynamic.literal(syntheticEvent = syntheticEvent, value = value)
  
    __obj.asInstanceOf[Anon_SyntheticEvent]
  }
}

