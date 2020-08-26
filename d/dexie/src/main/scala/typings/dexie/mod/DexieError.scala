package typings.dexie.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DexieError extends Error {
  var inner: js.Any = js.native
  @JSName("stack")
  var stack_DexieError: String = js.native
}

object DexieError {
  @scala.inline
  def apply(inner: js.Any, message: String, name: String, stack: String): DexieError = {
    val __obj = js.Dynamic.literal(inner = inner.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[DexieError]
  }
  @scala.inline
  implicit class DexieErrorOps[Self <: DexieError] (val x: Self) extends AnyVal {
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
    def setInner(value: js.Any): Self = this.set("inner", value.asInstanceOf[js.Any])
    @scala.inline
    def setStack(value: String): Self = this.set("stack", value.asInstanceOf[js.Any])
  }
  
}

