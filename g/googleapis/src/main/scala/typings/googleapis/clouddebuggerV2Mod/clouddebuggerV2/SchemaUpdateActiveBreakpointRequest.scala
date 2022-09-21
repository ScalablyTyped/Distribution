package typings.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUpdateActiveBreakpointRequest extends StObject {
  
  /**
    * Required. Updated breakpoint information. The field `id` must be set. The agent must echo all Breakpoint specification fields in the update.
    */
  var breakpoint: js.UndefOr[SchemaBreakpoint] = js.undefined
}
object SchemaUpdateActiveBreakpointRequest {
  
  inline def apply(): SchemaUpdateActiveBreakpointRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateActiveBreakpointRequest]
  }
  
  extension [Self <: SchemaUpdateActiveBreakpointRequest](x: Self) {
    
    inline def setBreakpoint(value: SchemaBreakpoint): Self = StObject.set(x, "breakpoint", value.asInstanceOf[js.Any])
    
    inline def setBreakpointUndefined: Self = StObject.set(x, "breakpoint", js.undefined)
  }
}
