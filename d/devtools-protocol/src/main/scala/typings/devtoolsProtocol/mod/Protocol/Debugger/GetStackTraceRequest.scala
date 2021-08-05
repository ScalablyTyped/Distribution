package typings.devtoolsProtocol.mod.Protocol.Debugger

import typings.devtoolsProtocol.mod.Protocol.Runtime.StackTraceId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStackTraceRequest extends StObject {
  
  var stackTraceId: StackTraceId
}
object GetStackTraceRequest {
  
  inline def apply(stackTraceId: StackTraceId): GetStackTraceRequest = {
    val __obj = js.Dynamic.literal(stackTraceId = stackTraceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStackTraceRequest]
  }
  
  extension [Self <: GetStackTraceRequest](x: Self) {
    
    inline def setStackTraceId(value: StackTraceId): Self = StObject.set(x, "stackTraceId", value.asInstanceOf[js.Any])
  }
}
