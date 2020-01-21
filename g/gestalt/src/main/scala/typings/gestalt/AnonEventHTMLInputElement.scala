package typings.gestalt

import typings.react.mod.SyntheticEvent
import typings.std.Event_
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEventHTMLInputElement extends js.Object {
  var event: SyntheticEvent[HTMLInputElement, Event_]
}

object AnonEventHTMLInputElement {
  @scala.inline
  def apply(event: SyntheticEvent[HTMLInputElement, Event_]): AnonEventHTMLInputElement = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEventHTMLInputElement]
  }
}

