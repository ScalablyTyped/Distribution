package typings.atEmberRunloop.dashPrivateBackburnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueueItem extends js.Object {
  var args: js.Array[js.Object]
  var method: String
  var stack: js.UndefOr[String] = js.undefined
  var target: js.Object
}

object QueueItem {
  @scala.inline
  def apply(args: js.Array[js.Object], method: String, target: js.Object, stack: String = null): QueueItem = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueItem]
  }
}

