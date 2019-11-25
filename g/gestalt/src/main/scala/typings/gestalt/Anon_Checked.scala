package typings.gestalt

import typings.react.reactMod.SyntheticEvent
import typings.std.Event
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Checked extends js.Object {
  var checked: Boolean
  var event: SyntheticEvent[HTMLInputElement, Event]
}

object Anon_Checked {
  @scala.inline
  def apply(checked: Boolean, event: SyntheticEvent[HTMLInputElement, Event]): Anon_Checked = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Checked]
  }
}

