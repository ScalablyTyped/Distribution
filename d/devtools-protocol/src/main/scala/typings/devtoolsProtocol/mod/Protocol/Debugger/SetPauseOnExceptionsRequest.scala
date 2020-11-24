package typings.devtoolsProtocol.mod.Protocol.Debugger

import typings.devtoolsProtocol.devtoolsProtocolStrings.all
import typings.devtoolsProtocol.devtoolsProtocolStrings.none_
import typings.devtoolsProtocol.devtoolsProtocolStrings.uncaught
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetPauseOnExceptionsRequest extends js.Object {
  
  /**
    * Pause on exceptions mode. (SetPauseOnExceptionsRequestState enum)
    */
  var state: none_ | uncaught | all = js.native
}
object SetPauseOnExceptionsRequest {
  
  @scala.inline
  def apply(state: none_ | uncaught | all): SetPauseOnExceptionsRequest = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetPauseOnExceptionsRequest]
  }
  
  @scala.inline
  implicit class SetPauseOnExceptionsRequestOps[Self <: SetPauseOnExceptionsRequest] (val x: Self) extends AnyVal {
    
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
    def setState(value: none_ | uncaught | all): Self = this.set("state", value.asInstanceOf[js.Any])
  }
}
