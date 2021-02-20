package typings.devtoolsProtocol.mod.Protocol.Debugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetBreakpointRequest extends StObject {
  
  /**
    * Expression to use as a breakpoint condition. When specified, debugger will only stop on the
    * breakpoint if this expression evaluates to true.
    */
  var condition: js.UndefOr[String] = js.native
  
  /**
    * Location to set breakpoint in.
    */
  var location: Location = js.native
}
object SetBreakpointRequest {
  
  @scala.inline
  def apply(location: Location): SetBreakpointRequest = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetBreakpointRequest]
  }
  
  @scala.inline
  implicit class SetBreakpointRequestMutableBuilder[Self <: SetBreakpointRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCondition(value: String): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    @scala.inline
    def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
  }
}
