package typings.devtoolsProtocol.mod.Protocol.Debugger

import typings.devtoolsProtocol.mod.Protocol.Runtime.StackTrace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStackTraceResponse extends StObject {
  
  var stackTrace: StackTrace
}
object GetStackTraceResponse {
  
  inline def apply(stackTrace: StackTrace): GetStackTraceResponse = {
    val __obj = js.Dynamic.literal(stackTrace = stackTrace.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStackTraceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetStackTraceResponse] (val x: Self) extends AnyVal {
    
    inline def setStackTrace(value: StackTrace): Self = StObject.set(x, "stackTrace", value.asInstanceOf[js.Any])
  }
}
