package typings.devtoolsProtocol.mod.Protocol.Debugger

import typings.devtoolsProtocol.mod.Protocol.Runtime.StackTraceId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetStackTraceRequest extends js.Object {
  var stackTraceId: StackTraceId = js.native
}

object GetStackTraceRequest {
  @scala.inline
  def apply(stackTraceId: StackTraceId): GetStackTraceRequest = {
    val __obj = js.Dynamic.literal(stackTraceId = stackTraceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStackTraceRequest]
  }
  @scala.inline
  implicit class GetStackTraceRequestOps[Self <: GetStackTraceRequest] (val x: Self) extends AnyVal {
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
    def setStackTraceId(value: StackTraceId): Self = this.set("stackTraceId", value.asInstanceOf[js.Any])
  }
  
}

