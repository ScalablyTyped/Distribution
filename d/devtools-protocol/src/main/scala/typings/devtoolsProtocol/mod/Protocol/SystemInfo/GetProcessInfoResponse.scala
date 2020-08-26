package typings.devtoolsProtocol.mod.Protocol.SystemInfo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetProcessInfoResponse extends js.Object {
  /**
    * An array of process info blocks.
    */
  var processInfo: js.Array[ProcessInfo] = js.native
}

object GetProcessInfoResponse {
  @scala.inline
  def apply(processInfo: js.Array[ProcessInfo]): GetProcessInfoResponse = {
    val __obj = js.Dynamic.literal(processInfo = processInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetProcessInfoResponse]
  }
  @scala.inline
  implicit class GetProcessInfoResponseOps[Self <: GetProcessInfoResponse] (val x: Self) extends AnyVal {
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
    def setProcessInfoVarargs(value: ProcessInfo*): Self = this.set("processInfo", js.Array(value :_*))
    @scala.inline
    def setProcessInfo(value: js.Array[ProcessInfo]): Self = this.set("processInfo", value.asInstanceOf[js.Any])
  }
  
}

