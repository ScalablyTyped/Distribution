package typings.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceDebuggerDebuggeesBreakpointsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. ID of the breakpoint to delete.
    */
  var breakpointId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The client version making the call. Schema: `domain/type/version` (e.g., `google.com/intellij/v1`).
    */
  var clientVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Required. ID of the debuggee whose breakpoint to delete.
    */
  var debuggeeId: js.UndefOr[String] = js.undefined
}
object ParamsResourceDebuggerDebuggeesBreakpointsDelete {
  
  inline def apply(): ParamsResourceDebuggerDebuggeesBreakpointsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDebuggerDebuggeesBreakpointsDelete]
  }
  
  extension [Self <: ParamsResourceDebuggerDebuggeesBreakpointsDelete](x: Self) {
    
    inline def setBreakpointId(value: String): Self = StObject.set(x, "breakpointId", value.asInstanceOf[js.Any])
    
    inline def setBreakpointIdUndefined: Self = StObject.set(x, "breakpointId", js.undefined)
    
    inline def setClientVersion(value: String): Self = StObject.set(x, "clientVersion", value.asInstanceOf[js.Any])
    
    inline def setClientVersionUndefined: Self = StObject.set(x, "clientVersion", js.undefined)
    
    inline def setDebuggeeId(value: String): Self = StObject.set(x, "debuggeeId", value.asInstanceOf[js.Any])
    
    inline def setDebuggeeIdUndefined: Self = StObject.set(x, "debuggeeId", js.undefined)
  }
}
