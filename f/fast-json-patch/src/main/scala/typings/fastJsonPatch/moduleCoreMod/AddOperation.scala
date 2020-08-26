package typings.fastJsonPatch.moduleCoreMod

import typings.fastJsonPatch.fastJsonPatchStrings.add
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddOperation[T] extends BaseOperation {
  var op: add = js.native
  var value: T = js.native
}

object AddOperation {
  @scala.inline
  def apply[T](op: add, path: String, value: T): AddOperation[T] = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddOperation[T]]
  }
  @scala.inline
  implicit class AddOperationOps[Self <: AddOperation[_], T] (val x: Self with AddOperation[T]) extends AnyVal {
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
    def setOp(value: add): Self = this.set("op", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: T): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

