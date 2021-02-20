package typings.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceControllerDebuggeesBreakpointsList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Identifies the debuggee.
    */
  var debuggeeId: js.UndefOr[String] = js.native
  
  /**
    * If set to `true` (recommended), returns `google.rpc.Code.OK` status and
    * sets the `wait_expired` response field to `true` when the server-selected
    * timeout has expired.  If set to `false` (deprecated), returns
    * `google.rpc.Code.ABORTED` status when the server-selected timeout has
    * expired.
    */
  var successOnTimeout: js.UndefOr[Boolean] = js.native
  
  /**
    * A token that, if specified, blocks the method call until the list of
    * active breakpoints has changed, or a server-selected timeout has expired.
    * The value should be set from the `next_wait_token` field in the last
    * response. The initial value should be set to `"init"`.
    */
  var waitToken: js.UndefOr[String] = js.native
}
object ParamsResourceControllerDebuggeesBreakpointsList {
  
  @scala.inline
  def apply(): ParamsResourceControllerDebuggeesBreakpointsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceControllerDebuggeesBreakpointsList]
  }
  
  @scala.inline
  implicit class ParamsResourceControllerDebuggeesBreakpointsListMutableBuilder[Self <: ParamsResourceControllerDebuggeesBreakpointsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setDebuggeeId(value: String): Self = StObject.set(x, "debuggeeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebuggeeIdUndefined: Self = StObject.set(x, "debuggeeId", js.undefined)
    
    @scala.inline
    def setSuccessOnTimeout(value: Boolean): Self = StObject.set(x, "successOnTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessOnTimeoutUndefined: Self = StObject.set(x, "successOnTimeout", js.undefined)
    
    @scala.inline
    def setWaitToken(value: String): Self = StObject.set(x, "waitToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitTokenUndefined: Self = StObject.set(x, "waitToken", js.undefined)
  }
}
