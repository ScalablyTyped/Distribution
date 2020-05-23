package typings.figma.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reaction extends js.Object {
  var action: Action
  var trigger: Trigger
}

object Reaction {
  @scala.inline
  def apply(action: Action, trigger: Trigger): Reaction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reaction]
  }
}

