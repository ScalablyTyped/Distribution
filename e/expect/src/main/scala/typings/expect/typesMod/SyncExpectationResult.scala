package typings.expect.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SyncExpectationResult extends js.Object {
  var pass: Boolean = js.native
  def message(): String = js.native
}

object SyncExpectationResult {
  @scala.inline
  def apply(message: () => String, pass: Boolean): SyncExpectationResult = {
    val __obj = js.Dynamic.literal(message = js.Any.fromFunction0(message), pass = pass.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyncExpectationResult]
  }
  @scala.inline
  implicit class SyncExpectationResultOps[Self <: SyncExpectationResult] (val x: Self) extends AnyVal {
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
    def setMessage(value: () => String): Self = this.set("message", js.Any.fromFunction0(value))
    @scala.inline
    def setPass(value: Boolean): Self = this.set("pass", value.asInstanceOf[js.Any])
  }
  
}

