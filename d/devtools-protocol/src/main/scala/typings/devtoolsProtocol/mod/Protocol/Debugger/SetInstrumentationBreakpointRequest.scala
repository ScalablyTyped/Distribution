package typings.devtoolsProtocol.mod.Protocol.Debugger

import typings.devtoolsProtocol.devtoolsProtocolStrings.beforeScriptExecution
import typings.devtoolsProtocol.devtoolsProtocolStrings.beforeScriptWithSourceMapExecution
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetInstrumentationBreakpointRequest extends js.Object {
  
  /**
    * Instrumentation name. (SetInstrumentationBreakpointRequestInstrumentation enum)
    */
  var instrumentation: beforeScriptExecution | beforeScriptWithSourceMapExecution = js.native
}
object SetInstrumentationBreakpointRequest {
  
  @scala.inline
  def apply(instrumentation: beforeScriptExecution | beforeScriptWithSourceMapExecution): SetInstrumentationBreakpointRequest = {
    val __obj = js.Dynamic.literal(instrumentation = instrumentation.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetInstrumentationBreakpointRequest]
  }
  
  @scala.inline
  implicit class SetInstrumentationBreakpointRequestOps[Self <: SetInstrumentationBreakpointRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInstrumentation(value: beforeScriptExecution | beforeScriptWithSourceMapExecution): Self = this.set("instrumentation", value.asInstanceOf[js.Any])
  }
}
