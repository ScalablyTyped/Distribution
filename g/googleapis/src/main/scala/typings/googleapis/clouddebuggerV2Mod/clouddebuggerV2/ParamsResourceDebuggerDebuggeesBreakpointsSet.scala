package typings.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceDebuggerDebuggeesBreakpointsSet
  extends StObject
     with StandardParameters {
  
  /**
    * The canary option set by the user upon setting breakpoint.
    */
  var canaryOption: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The client version making the call. Schema: `domain/type/version` (e.g., `google.com/intellij/v1`).
    */
  var clientVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Required. ID of the debuggee where the breakpoint is to be set.
    */
  var debuggeeId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaBreakpoint] = js.undefined
}
object ParamsResourceDebuggerDebuggeesBreakpointsSet {
  
  inline def apply(): ParamsResourceDebuggerDebuggeesBreakpointsSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDebuggerDebuggeesBreakpointsSet]
  }
  
  extension [Self <: ParamsResourceDebuggerDebuggeesBreakpointsSet](x: Self) {
    
    inline def setCanaryOption(value: String): Self = StObject.set(x, "canaryOption", value.asInstanceOf[js.Any])
    
    inline def setCanaryOptionUndefined: Self = StObject.set(x, "canaryOption", js.undefined)
    
    inline def setClientVersion(value: String): Self = StObject.set(x, "clientVersion", value.asInstanceOf[js.Any])
    
    inline def setClientVersionUndefined: Self = StObject.set(x, "clientVersion", js.undefined)
    
    inline def setDebuggeeId(value: String): Self = StObject.set(x, "debuggeeId", value.asInstanceOf[js.Any])
    
    inline def setDebuggeeIdUndefined: Self = StObject.set(x, "debuggeeId", js.undefined)
    
    inline def setRequestBody(value: SchemaBreakpoint): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
