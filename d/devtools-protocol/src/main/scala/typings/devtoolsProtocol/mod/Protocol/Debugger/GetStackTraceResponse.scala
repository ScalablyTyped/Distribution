package typings.devtoolsProtocol.mod.Protocol.Debugger

import typings.devtoolsProtocol.mod.Protocol.Runtime.StackTrace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetStackTraceResponse extends StObject {
  
  var stackTrace: StackTrace = js.native
}
object GetStackTraceResponse {
  
  @scala.inline
  def apply(stackTrace: StackTrace): GetStackTraceResponse = {
    val __obj = js.Dynamic.literal(stackTrace = stackTrace.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStackTraceResponse]
  }
  
  @scala.inline
  implicit class GetStackTraceResponseMutableBuilder[Self <: GetStackTraceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStackTrace(value: StackTrace): Self = StObject.set(x, "stackTrace", value.asInstanceOf[js.Any])
  }
}
