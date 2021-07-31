package typings.devtoolsProtocol.mod.Protocol.Debugger

import typings.devtoolsProtocol.mod.Protocol.Runtime.StackTraceId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStackTraceRequest extends StObject {
  
  var stackTraceId: StackTraceId
}
object GetStackTraceRequest {
  
  @scala.inline
  def apply(stackTraceId: StackTraceId): GetStackTraceRequest = {
    val __obj = js.Dynamic.literal(stackTraceId = stackTraceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStackTraceRequest]
  }
  
  @scala.inline
  implicit class GetStackTraceRequestMutableBuilder[Self <: GetStackTraceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStackTraceId(value: StackTraceId): Self = StObject.set(x, "stackTraceId", value.asInstanceOf[js.Any])
  }
}
