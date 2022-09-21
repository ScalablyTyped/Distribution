package typings.devtoolsProtocol.mod.Protocol.Debugger

import typings.devtoolsProtocol.devtoolsProtocolStrings.BlockedByActiveFunction
import typings.devtoolsProtocol.devtoolsProtocolStrings.BlockedByActiveGenerator
import typings.devtoolsProtocol.devtoolsProtocolStrings.CompileError
import typings.devtoolsProtocol.devtoolsProtocolStrings.Ok
import typings.devtoolsProtocol.mod.Protocol.Runtime.ExceptionDetails
import typings.devtoolsProtocol.mod.Protocol.Runtime.StackTrace
import typings.devtoolsProtocol.mod.Protocol.Runtime.StackTraceId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetScriptSourceResponse extends StObject {
  
  /**
    * Async stack trace, if any.
    */
  var asyncStackTrace: js.UndefOr[StackTrace] = js.undefined
  
  /**
    * Async stack trace, if any.
    */
  var asyncStackTraceId: js.UndefOr[StackTraceId] = js.undefined
  
  /**
    * New stack trace in case editing has happened while VM was stopped.
    */
  var callFrames: js.UndefOr[js.Array[CallFrame]] = js.undefined
  
  /**
    * Exception details if any. Only present when `status` is `CompileError`.
    */
  var exceptionDetails: js.UndefOr[ExceptionDetails] = js.undefined
  
  /**
    * Whether current call stack  was modified after applying the changes.
    */
  var stackChanged: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the operation was successful or not. Only `Ok` denotes a
    * successful live edit while the other enum variants denote why
    * the live edit failed. (SetScriptSourceResponseStatus enum)
    */
  var status: Ok | CompileError | BlockedByActiveGenerator | BlockedByActiveFunction
}
object SetScriptSourceResponse {
  
  inline def apply(status: Ok | CompileError | BlockedByActiveGenerator | BlockedByActiveFunction): SetScriptSourceResponse = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetScriptSourceResponse]
  }
  
  extension [Self <: SetScriptSourceResponse](x: Self) {
    
    inline def setAsyncStackTrace(value: StackTrace): Self = StObject.set(x, "asyncStackTrace", value.asInstanceOf[js.Any])
    
    inline def setAsyncStackTraceId(value: StackTraceId): Self = StObject.set(x, "asyncStackTraceId", value.asInstanceOf[js.Any])
    
    inline def setAsyncStackTraceIdUndefined: Self = StObject.set(x, "asyncStackTraceId", js.undefined)
    
    inline def setAsyncStackTraceUndefined: Self = StObject.set(x, "asyncStackTrace", js.undefined)
    
    inline def setCallFrames(value: js.Array[CallFrame]): Self = StObject.set(x, "callFrames", value.asInstanceOf[js.Any])
    
    inline def setCallFramesUndefined: Self = StObject.set(x, "callFrames", js.undefined)
    
    inline def setCallFramesVarargs(value: CallFrame*): Self = StObject.set(x, "callFrames", js.Array(value*))
    
    inline def setExceptionDetails(value: ExceptionDetails): Self = StObject.set(x, "exceptionDetails", value.asInstanceOf[js.Any])
    
    inline def setExceptionDetailsUndefined: Self = StObject.set(x, "exceptionDetails", js.undefined)
    
    inline def setStackChanged(value: Boolean): Self = StObject.set(x, "stackChanged", value.asInstanceOf[js.Any])
    
    inline def setStackChangedUndefined: Self = StObject.set(x, "stackChanged", js.undefined)
    
    inline def setStatus(value: Ok | CompileError | BlockedByActiveGenerator | BlockedByActiveFunction): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
