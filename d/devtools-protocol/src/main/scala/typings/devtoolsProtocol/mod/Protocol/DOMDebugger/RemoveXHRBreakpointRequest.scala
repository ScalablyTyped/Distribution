package typings.devtoolsProtocol.mod.Protocol.DOMDebugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveXHRBreakpointRequest extends js.Object {
  /**
    * Resource URL substring.
    */
  var url: String = js.native
}

object RemoveXHRBreakpointRequest {
  @scala.inline
  def apply(url: String): RemoveXHRBreakpointRequest = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveXHRBreakpointRequest]
  }
  @scala.inline
  implicit class RemoveXHRBreakpointRequestOps[Self <: RemoveXHRBreakpointRequest] (val x: Self) extends AnyVal {
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

