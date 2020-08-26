package typings.emberRunloop.backburnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueueItem extends js.Object {
  var args: js.Array[js.Object] = js.native
  var method: String = js.native
  var stack: js.UndefOr[String] = js.native
  var target: js.Object = js.native
}

object QueueItem {
  @scala.inline
  def apply(args: js.Array[js.Object], method: String, target: js.Object): QueueItem = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueItem]
  }
  @scala.inline
  implicit class QueueItemOps[Self <: QueueItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArgsVarargs(value: js.Object*): Self = this.set("args", js.Array(value :_*))
    @scala.inline
    def setArgs(value: js.Array[js.Object]): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: js.Object): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setStack(value: String): Self = this.set("stack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStack: Self = this.set("stack", js.undefined)
  }
  
}

