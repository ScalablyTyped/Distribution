package typings.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGetBreakpointResponse extends StObject {
  
  /**
    * Complete breakpoint state. The fields `id` and `location` are guaranteed to be set.
    */
  var breakpoint: js.UndefOr[SchemaBreakpoint] = js.undefined
}
object SchemaGetBreakpointResponse {
  
  inline def apply(): SchemaGetBreakpointResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetBreakpointResponse]
  }
  
  extension [Self <: SchemaGetBreakpointResponse](x: Self) {
    
    inline def setBreakpoint(value: SchemaBreakpoint): Self = StObject.set(x, "breakpoint", value.asInstanceOf[js.Any])
    
    inline def setBreakpointUndefined: Self = StObject.set(x, "breakpoint", js.undefined)
  }
}
