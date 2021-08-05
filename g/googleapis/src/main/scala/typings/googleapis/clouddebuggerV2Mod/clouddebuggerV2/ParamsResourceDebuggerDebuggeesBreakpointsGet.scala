package typings.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceDebuggerDebuggeesBreakpointsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * ID of the breakpoint to get.
    */
  var breakpointId: js.UndefOr[String] = js.undefined
  
  /**
    * The client version making the call. Schema: `domain/type/version` (e.g.,
    * `google.com/intellij/v1`).
    */
  var clientVersion: js.UndefOr[String] = js.undefined
  
  /**
    * ID of the debuggee whose breakpoint to get.
    */
  var debuggeeId: js.UndefOr[String] = js.undefined
}
object ParamsResourceDebuggerDebuggeesBreakpointsGet {
  
  inline def apply(): ParamsResourceDebuggerDebuggeesBreakpointsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDebuggerDebuggeesBreakpointsGet]
  }
  
  extension [Self <: ParamsResourceDebuggerDebuggeesBreakpointsGet](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setBreakpointId(value: String): Self = StObject.set(x, "breakpointId", value.asInstanceOf[js.Any])
    
    inline def setBreakpointIdUndefined: Self = StObject.set(x, "breakpointId", js.undefined)
    
    inline def setClientVersion(value: String): Self = StObject.set(x, "clientVersion", value.asInstanceOf[js.Any])
    
    inline def setClientVersionUndefined: Self = StObject.set(x, "clientVersion", js.undefined)
    
    inline def setDebuggeeId(value: String): Self = StObject.set(x, "debuggeeId", value.asInstanceOf[js.Any])
    
    inline def setDebuggeeIdUndefined: Self = StObject.set(x, "debuggeeId", js.undefined)
  }
}
