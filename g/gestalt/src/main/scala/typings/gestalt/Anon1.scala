package typings.gestalt

import typings.react.mod.FocusEvent
import typings.react.mod.SyntheticEvent
import typings.std.Event_
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon1 extends js.Object {
  var event: SyntheticEvent[FocusEvent[HTMLInputElement], Event_]
  var value: String
}

object Anon1 {
  @scala.inline
  def apply(event: SyntheticEvent[FocusEvent[HTMLInputElement], Event_], value: String): Anon1 = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon1]
  }
}

