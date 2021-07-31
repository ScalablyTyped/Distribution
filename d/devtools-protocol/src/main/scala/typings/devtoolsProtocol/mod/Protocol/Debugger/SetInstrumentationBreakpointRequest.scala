package typings.devtoolsProtocol.mod.Protocol.Debugger

import typings.devtoolsProtocol.devtoolsProtocolStrings.beforeScriptExecution
import typings.devtoolsProtocol.devtoolsProtocolStrings.beforeScriptWithSourceMapExecution
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetInstrumentationBreakpointRequest extends StObject {
  
  /**
    * Instrumentation name. (SetInstrumentationBreakpointRequestInstrumentation enum)
    */
  var instrumentation: beforeScriptExecution | beforeScriptWithSourceMapExecution
}
object SetInstrumentationBreakpointRequest {
  
  @scala.inline
  def apply(instrumentation: beforeScriptExecution | beforeScriptWithSourceMapExecution): SetInstrumentationBreakpointRequest = {
    val __obj = js.Dynamic.literal(instrumentation = instrumentation.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetInstrumentationBreakpointRequest]
  }
  
  @scala.inline
  implicit class SetInstrumentationBreakpointRequestMutableBuilder[Self <: SetInstrumentationBreakpointRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstrumentation(value: beforeScriptExecution | beforeScriptWithSourceMapExecution): Self = StObject.set(x, "instrumentation", value.asInstanceOf[js.Any])
  }
}
