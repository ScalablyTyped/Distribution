package typings.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceDebuggerDebuggeesBreakpointsDelete extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * ID of the breakpoint to delete.
    */
  var breakpointId: js.UndefOr[String] = js.native
  
  /**
    * The client version making the call. Schema: `domain/type/version` (e.g.,
    * `google.com/intellij/v1`).
    */
  var clientVersion: js.UndefOr[String] = js.native
  
  /**
    * ID of the debuggee whose breakpoint to delete.
    */
  var debuggeeId: js.UndefOr[String] = js.native
}
object ParamsResourceDebuggerDebuggeesBreakpointsDelete {
  
  @scala.inline
  def apply(): ParamsResourceDebuggerDebuggeesBreakpointsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDebuggerDebuggeesBreakpointsDelete]
  }
  
  @scala.inline
  implicit class ParamsResourceDebuggerDebuggeesBreakpointsDeleteOps[Self <: ParamsResourceDebuggerDebuggeesBreakpointsDelete] (val x: Self) extends AnyVal {
    
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
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setBreakpointId(value: String): Self = this.set("breakpointId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBreakpointId: Self = this.set("breakpointId", js.undefined)
    
    @scala.inline
    def setClientVersion(value: String): Self = this.set("clientVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientVersion: Self = this.set("clientVersion", js.undefined)
    
    @scala.inline
    def setDebuggeeId(value: String): Self = this.set("debuggeeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebuggeeId: Self = this.set("debuggeeId", js.undefined)
  }
}
