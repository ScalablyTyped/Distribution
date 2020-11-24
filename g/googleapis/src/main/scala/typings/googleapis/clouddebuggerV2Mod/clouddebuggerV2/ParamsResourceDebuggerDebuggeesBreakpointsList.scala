package typings.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceDebuggerDebuggeesBreakpointsList extends StandardParameters {
  
  /**
    * Only breakpoints with the specified action will pass the filter.
    */
  @JSName("action.value")
  var actionDotvalue: js.UndefOr[String] = js.native
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The client version making the call. Schema: `domain/type/version` (e.g.,
    * `google.com/intellij/v1`).
    */
  var clientVersion: js.UndefOr[String] = js.native
  
  /**
    * ID of the debuggee whose breakpoints to list.
    */
  var debuggeeId: js.UndefOr[String] = js.native
  
  /**
    * When set to `true`, the response includes the list of breakpoints set by
    * any user. Otherwise, it includes only breakpoints set by the caller.
    */
  var includeAllUsers: js.UndefOr[Boolean] = js.native
  
  /**
    * When set to `true`, the response includes active and inactive
    * breakpoints. Otherwise, it includes only active breakpoints.
    */
  var includeInactive: js.UndefOr[Boolean] = js.native
  
  /**
    * This field is deprecated. The following fields are always stripped out of
    * the result: `stack_frames`, `evaluated_expressions` and `variable_table`.
    */
  var stripResults: js.UndefOr[Boolean] = js.native
  
  /**
    * A wait token that, if specified, blocks the call until the breakpoints
    * list has changed, or a server selected timeout has expired.  The value
    * should be set from the last response. The error code
    * `google.rpc.Code.ABORTED` (RPC) is returned on wait timeout, which should
    * be called again with the same `wait_token`.
    */
  var waitToken: js.UndefOr[String] = js.native
}
object ParamsResourceDebuggerDebuggeesBreakpointsList {
  
  @scala.inline
  def apply(): ParamsResourceDebuggerDebuggeesBreakpointsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDebuggerDebuggeesBreakpointsList]
  }
  
  @scala.inline
  implicit class ParamsResourceDebuggerDebuggeesBreakpointsListOps[Self <: ParamsResourceDebuggerDebuggeesBreakpointsList] (val x: Self) extends AnyVal {
    
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
    def setActionDotvalue(value: String): Self = this.set("action.value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionDotvalue: Self = this.set("action.value", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setClientVersion(value: String): Self = this.set("clientVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientVersion: Self = this.set("clientVersion", js.undefined)
    
    @scala.inline
    def setDebuggeeId(value: String): Self = this.set("debuggeeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebuggeeId: Self = this.set("debuggeeId", js.undefined)
    
    @scala.inline
    def setIncludeAllUsers(value: Boolean): Self = this.set("includeAllUsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeAllUsers: Self = this.set("includeAllUsers", js.undefined)
    
    @scala.inline
    def setIncludeInactive(value: Boolean): Self = this.set("includeInactive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeInactive: Self = this.set("includeInactive", js.undefined)
    
    @scala.inline
    def setStripResults(value: Boolean): Self = this.set("stripResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStripResults: Self = this.set("stripResults", js.undefined)
    
    @scala.inline
    def setWaitToken(value: String): Self = this.set("waitToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaitToken: Self = this.set("waitToken", js.undefined)
  }
}
