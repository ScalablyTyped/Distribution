package typings.devtoolsProtocol.mod.Protocol.Debugger

import typings.devtoolsProtocol.mod.Protocol.Runtime.StackTraceId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PauseOnAsyncCallRequest extends StObject {
  
  /**
    * Debugger will pause when async call with given stack trace is started.
    */
  var parentStackTraceId: StackTraceId
}
object PauseOnAsyncCallRequest {
  
  inline def apply(parentStackTraceId: StackTraceId): PauseOnAsyncCallRequest = {
    val __obj = js.Dynamic.literal(parentStackTraceId = parentStackTraceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PauseOnAsyncCallRequest]
  }
  
  extension [Self <: PauseOnAsyncCallRequest](x: Self) {
    
    inline def setParentStackTraceId(value: StackTraceId): Self = StObject.set(x, "parentStackTraceId", value.asInstanceOf[js.Any])
  }
}
