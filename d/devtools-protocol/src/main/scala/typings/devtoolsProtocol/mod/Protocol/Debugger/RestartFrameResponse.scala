package typings.devtoolsProtocol.mod.Protocol.Debugger

import typings.devtoolsProtocol.mod.Protocol.Runtime.StackTrace
import typings.devtoolsProtocol.mod.Protocol.Runtime.StackTraceId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestartFrameResponse extends StObject {
  
  /**
    * Async stack trace, if any.
    */
  var asyncStackTrace: js.UndefOr[StackTrace] = js.undefined
  
  /**
    * Async stack trace, if any.
    */
  var asyncStackTraceId: js.UndefOr[StackTraceId] = js.undefined
  
  /**
    * New stack trace.
    */
  var callFrames: js.Array[CallFrame]
}
object RestartFrameResponse {
  
  @scala.inline
  def apply(callFrames: js.Array[CallFrame]): RestartFrameResponse = {
    val __obj = js.Dynamic.literal(callFrames = callFrames.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestartFrameResponse]
  }
  
  @scala.inline
  implicit class RestartFrameResponseMutableBuilder[Self <: RestartFrameResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsyncStackTrace(value: StackTrace): Self = StObject.set(x, "asyncStackTrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsyncStackTraceId(value: StackTraceId): Self = StObject.set(x, "asyncStackTraceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsyncStackTraceIdUndefined: Self = StObject.set(x, "asyncStackTraceId", js.undefined)
    
    @scala.inline
    def setAsyncStackTraceUndefined: Self = StObject.set(x, "asyncStackTrace", js.undefined)
    
    @scala.inline
    def setCallFrames(value: js.Array[CallFrame]): Self = StObject.set(x, "callFrames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallFramesVarargs(value: CallFrame*): Self = StObject.set(x, "callFrames", js.Array(value :_*))
  }
}
