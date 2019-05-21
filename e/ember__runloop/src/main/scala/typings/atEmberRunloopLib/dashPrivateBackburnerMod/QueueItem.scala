package typings
package atEmberRunloopLib.dashPrivateBackburnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueueItem extends js.Object {
  var args: js.Array[js.Object]
  var method: java.lang.String
  var stack: js.UndefOr[java.lang.String] = js.undefined
  var target: js.Object
}

object QueueItem {
  @scala.inline
  def apply(
    args: js.Array[js.Object],
    method: java.lang.String,
    target: js.Object,
    stack: java.lang.String = null
  ): QueueItem = {
    val __obj = js.Dynamic.literal(args = args, method = method, target = target)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[QueueItem]
  }
}

