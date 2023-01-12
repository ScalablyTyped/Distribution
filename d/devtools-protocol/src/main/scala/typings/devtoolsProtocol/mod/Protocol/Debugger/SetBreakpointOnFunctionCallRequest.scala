package typings.devtoolsProtocol.mod.Protocol.Debugger

import typings.devtoolsProtocol.mod.Protocol.Runtime.RemoteObjectId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetBreakpointOnFunctionCallRequest extends StObject {
  
  /**
    * Expression to use as a breakpoint condition. When specified, debugger will
    * stop on the breakpoint if this expression evaluates to true.
    */
  var condition: js.UndefOr[String] = js.undefined
  
  /**
    * Function object id.
    */
  var objectId: RemoteObjectId
}
object SetBreakpointOnFunctionCallRequest {
  
  inline def apply(objectId: RemoteObjectId): SetBreakpointOnFunctionCallRequest = {
    val __obj = js.Dynamic.literal(objectId = objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetBreakpointOnFunctionCallRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetBreakpointOnFunctionCallRequest] (val x: Self) extends AnyVal {
    
    inline def setCondition(value: String): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setObjectId(value: RemoteObjectId): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
  }
}
