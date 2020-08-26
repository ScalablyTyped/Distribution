package typings.fastJsonPatch.coreMod

import typings.fastJsonPatch.fastJsonPatchStrings.remove
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveOperation
  extends BaseOperation
     with _Operation {
  var op: remove = js.native
}

object RemoveOperation {
  @scala.inline
  def apply(op: remove, path: String): RemoveOperation = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveOperation]
  }
  @scala.inline
  implicit class RemoveOperationOps[Self <: RemoveOperation] (val x: Self) extends AnyVal {
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
    def setOp(value: remove): Self = this.set("op", value.asInstanceOf[js.Any])
  }
  
}

