package typings.devtoolsProtocol.mod.Protocol.Target

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetAutoAttachRequest extends js.Object {
  
  /**
    * Whether to auto-attach to related targets.
    */
  var autoAttach: Boolean = js.native
  
  /**
    * Enables "flat" access to the session via specifying sessionId attribute in the commands.
    * We plan to make this the default, deprecate non-flattened mode,
    * and eventually retire it. See crbug.com/991325.
    */
  var flatten: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to pause new targets when attaching to them. Use `Runtime.runIfWaitingForDebugger`
    * to run paused targets.
    */
  var waitForDebuggerOnStart: Boolean = js.native
}
object SetAutoAttachRequest {
  
  @scala.inline
  def apply(autoAttach: Boolean, waitForDebuggerOnStart: Boolean): SetAutoAttachRequest = {
    val __obj = js.Dynamic.literal(autoAttach = autoAttach.asInstanceOf[js.Any], waitForDebuggerOnStart = waitForDebuggerOnStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetAutoAttachRequest]
  }
  
  @scala.inline
  implicit class SetAutoAttachRequestOps[Self <: SetAutoAttachRequest] (val x: Self) extends AnyVal {
    
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
    def setAutoAttach(value: Boolean): Self = this.set("autoAttach", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitForDebuggerOnStart(value: Boolean): Self = this.set("waitForDebuggerOnStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlatten(value: Boolean): Self = this.set("flatten", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlatten: Self = this.set("flatten", js.undefined)
  }
}
