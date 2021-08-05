package typings.devtoolsProtocol.mod.Protocol.Debugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetInstrumentationBreakpointResponse extends StObject {
  
  /**
    * Id of the created breakpoint for further reference.
    */
  var breakpointId: BreakpointId
}
object SetInstrumentationBreakpointResponse {
  
  inline def apply(breakpointId: BreakpointId): SetInstrumentationBreakpointResponse = {
    val __obj = js.Dynamic.literal(breakpointId = breakpointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetInstrumentationBreakpointResponse]
  }
  
  extension [Self <: SetInstrumentationBreakpointResponse](x: Self) {
    
    inline def setBreakpointId(value: BreakpointId): Self = StObject.set(x, "breakpointId", value.asInstanceOf[js.Any])
  }
}
