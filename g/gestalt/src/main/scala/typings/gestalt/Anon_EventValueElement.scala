package typings.gestalt

import typings.react.Element
import typings.react.Event
import typings.react.reactMod.FocusEvent
import typings.react.reactMod.SyntheticEvent
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

