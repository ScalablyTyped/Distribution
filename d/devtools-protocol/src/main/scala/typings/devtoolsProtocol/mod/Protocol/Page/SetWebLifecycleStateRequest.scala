package typings.devtoolsProtocol.mod.Protocol.Page

import typings.devtoolsProtocol.devtoolsProtocolStrings.active
import typings.devtoolsProtocol.devtoolsProtocolStrings.frozen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetWebLifecycleStateRequest extends js.Object {
  
  /**
    * Target lifecycle state (SetWebLifecycleStateRequestState enum)
    */
  var state: frozen | active = js.native
}
object SetWebLifecycleStateRequest {
  
  @scala.inline
  def apply(state: frozen | active): SetWebLifecycleStateRequest = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetWebLifecycleStateRequest]
  }
  
  @scala.inline
  implicit class SetWebLifecycleStateRequestOps[Self <: SetWebLifecycleStateRequest] (val x: Self) extends AnyVal {
    
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
    def setState(value: frozen | active): Self = this.set("state", value.asInstanceOf[js.Any])
  }
}
