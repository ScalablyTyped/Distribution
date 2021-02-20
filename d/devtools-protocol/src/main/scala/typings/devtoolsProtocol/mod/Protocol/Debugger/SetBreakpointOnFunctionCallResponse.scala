package typings.devtoolsProtocol.mod.Protocol.Debugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetBreakpointOnFunctionCallResponse extends StObject {
  
  /**
    * Id of the created breakpoint for further reference.
    */
  var breakpointId: BreakpointId = js.native
}
object SetBreakpointOnFunctionCallResponse {
  
  @scala.inline
  def apply(breakpointId: BreakpointId): SetBreakpointOnFunctionCallResponse = {
    val __obj = js.Dynamic.literal(breakpointId = breakpointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetBreakpointOnFunctionCallResponse]
  }
  
  @scala.inline
  implicit class SetBreakpointOnFunctionCallResponseMutableBuilder[Self <: SetBreakpointOnFunctionCallResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBreakpointId(value: BreakpointId): Self = StObject.set(x, "breakpointId", value.asInstanceOf[js.Any])
  }
}
