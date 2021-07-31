package typings.devtoolsProtocol.mod.Protocol.Debugger

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
    * Exception details if any.
    */
  var exceptionDetails: js.UndefOr[ExceptionDetails] = js.undefined
  
  /**
    * Whether current call stack  was modified after applying the changes.
    */
  var stackChanged: js.UndefOr[Boolean] = js.undefined
}
object SetScriptSourceResponse {
  
  @scala.inline
  def apply(): SetScriptSourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetScriptSourceResponse]
  }
  
  @scala.inline
  implicit class SetScriptSourceResponseMutableBuilder[Self <: SetScriptSourceResponse] (val x: Self) extends AnyVal {
    
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
    def setCallFramesUndefined: Self = StObject.set(x, "callFrames", js.undefined)
    
    @scala.inline
    def setCallFramesVarargs(value: CallFrame*): Self = StObject.set(x, "callFrames", js.Array(value :_*))
    
    @scala.inline
    def setExceptionDetails(value: ExceptionDetails): Self = StObject.set(x, "exceptionDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExceptionDetailsUndefined: Self = StObject.set(x, "exceptionDetails", js.undefined)
    
    @scala.inline
    def setStackChanged(value: Boolean): Self = StObject.set(x, "stackChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackChangedUndefined: Self = StObject.set(x, "stackChanged", js.undefined)
  }
}
