package typings.devtoolsProtocol.mod.Protocol.Debugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestartFrameRequest extends js.Object {
  
  /**
    * Call frame identifier to evaluate on.
    */
  var callFrameId: CallFrameId = js.native
}
object RestartFrameRequest {
  
  @scala.inline
  def apply(callFrameId: CallFrameId): RestartFrameRequest = {
    val __obj = js.Dynamic.literal(callFrameId = callFrameId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestartFrameRequest]
  }
  
  @scala.inline
  implicit class RestartFrameRequestOps[Self <: RestartFrameRequest] (val x: Self) extends AnyVal {
    
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
    def setCallFrameId(value: CallFrameId): Self = this.set("callFrameId", value.asInstanceOf[js.Any])
  }
}
