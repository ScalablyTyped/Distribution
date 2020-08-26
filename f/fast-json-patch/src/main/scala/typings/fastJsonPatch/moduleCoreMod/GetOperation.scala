package typings.fastJsonPatch.moduleCoreMod

import typings.fastJsonPatch.fastJsonPatchStrings._get
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOperation[T] extends BaseOperation {
  var op: _get = js.native
  var value: T = js.native
}

object GetOperation {
  @scala.inline
  def apply[T](op: _get, path: String, value: T): GetOperation[T] = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOperation[T]]
  }
  @scala.inline
  implicit class GetOperationOps[Self <: GetOperation[_], T] (val x: Self with GetOperation[T]) extends AnyVal {
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
    def setOp(value: _get): Self = this.set("op", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: T): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

