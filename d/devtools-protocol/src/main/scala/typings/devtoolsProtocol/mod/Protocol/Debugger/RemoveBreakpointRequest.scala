package typings.devtoolsProtocol.mod.Protocol.Debugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveBreakpointRequest extends StObject {
  
  var breakpointId: BreakpointId
}
object RemoveBreakpointRequest {
  
  inline def apply(breakpointId: BreakpointId): RemoveBreakpointRequest = {
    val __obj = js.Dynamic.literal(breakpointId = breakpointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveBreakpointRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemoveBreakpointRequest] (val x: Self) extends AnyVal {
    
    inline def setBreakpointId(value: BreakpointId): Self = StObject.set(x, "breakpointId", value.asInstanceOf[js.Any])
  }
}
