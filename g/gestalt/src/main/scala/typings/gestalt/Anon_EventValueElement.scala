package typings.gestalt

import typings.react.reactMod.FocusEvent
import typings.react.reactMod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventValueElement extends js.Object {
  var event: SyntheticEvent[FocusEvent[Element], Event]
  var value: String
}

object Anon_EventValueElement {
  @scala.inline
  def apply(event: SyntheticEvent[FocusEvent[Element], Event], value: String): Anon_EventValueElement = {
    val __obj = js.Dynamic.literal(event = event, value = value)
  
    __obj.asInstanceOf[Anon_EventValueElement]
  }
}

