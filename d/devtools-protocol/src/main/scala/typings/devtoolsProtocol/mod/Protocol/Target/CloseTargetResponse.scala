package typings.devtoolsProtocol.mod.Protocol.Target

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloseTargetResponse extends js.Object {
  var success: Boolean = js.native
}

object CloseTargetResponse {
  @scala.inline
  def apply(success: Boolean): CloseTargetResponse = {
    val __obj = js.Dynamic.literal(success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloseTargetResponse]
  }
  @scala.inline
  implicit class CloseTargetResponseOps[Self <: CloseTargetResponse] (val x: Self) extends AnyVal {
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
    def setSuccess(value: Boolean): Self = this.set("success", value.asInstanceOf[js.Any])
  }
  
}

