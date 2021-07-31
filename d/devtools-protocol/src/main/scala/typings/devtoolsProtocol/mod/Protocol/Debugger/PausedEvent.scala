package typings.devtoolsProtocol.mod.Protocol.Debugger

import typings.devtoolsProtocol.devtoolsProtocolStrings.DOM
import typings.devtoolsProtocol.devtoolsProtocolStrings.EventListener
import typings.devtoolsProtocol.devtoolsProtocolStrings.OOM
import typings.devtoolsProtocol.devtoolsProtocolStrings.XHR
import typings.devtoolsProtocol.devtoolsProtocolStrings.ambiguous
import typings.devtoolsProtocol.devtoolsProtocolStrings.assert
import typings.devtoolsProtocol.devtoolsProtocolStrings.debugCommand
import typings.devtoolsProtocol.devtoolsProtocolStrings.exception
import typings.devtoolsProtocol.devtoolsProtocolStrings.instrumentation
import typings.devtoolsProtocol.devtoolsProtocolStrings.other_
import typings.devtoolsProtocol.devtoolsProtocolStrings.promiseRejection
import typings.devtoolsProtocol.mod.Protocol.Runtime.StackTrace
import typings.devtoolsProtocol.mod.Protocol.Runtime.StackTraceId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PausedEvent extends StObject {
  
  /**
    * Never present, will be removed.
    */
  var asyncCallStackTraceId: js.UndefOr[StackTraceId] = js.undefined
  
  /**
    * Async stack trace, if any.
    */
  var asyncStackTrace: js.UndefOr[StackTrace] = js.undefined
  
  /**
    * Async stack trace, if any.
    */
  var asyncStackTraceId: js.UndefOr[StackTraceId] = js.undefined
  
  /**
    * Call stack the virtual machine stopped on.
    */
  var callFrames: js.Array[CallFrame]
  
  /**
    * Object containing break-specific auxiliary properties.
    */
  var data: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Hit breakpoints IDs
    */
  var hitBreakpoints: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Pause reason. (PausedEventReason enum)
    */
  var reason: ambiguous | assert | debugCommand | DOM | EventListener | exception | instrumentation | OOM | other_ | promiseRejection | XHR
}
object PausedEvent {
  
  @scala.inline
  def apply(
    callFrames: js.Array[CallFrame],
    reason: ambiguous | assert | debugCommand | DOM | EventListener | exception | instrumentation | OOM | other_ | promiseRejection | XHR
  ): PausedEvent = {
    val __obj = js.Dynamic.literal(callFrames = callFrames.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[PausedEvent]
  }
  
  @scala.inline
  implicit class PausedEventMutableBuilder[Self <: PausedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsyncCallStackTraceId(value: StackTraceId): Self = StObject.set(x, "asyncCallStackTraceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsyncCallStackTraceIdUndefined: Self = StObject.set(x, "asyncCallStackTraceId", js.undefined)
    
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
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setHitBreakpoints(value: js.Array[String]): Self = StObject.set(x, "hitBreakpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHitBreakpointsUndefined: Self = StObject.set(x, "hitBreakpoints", js.undefined)
    
    @scala.inline
    def setHitBreakpointsVarargs(value: String*): Self = StObject.set(x, "hitBreakpoints", js.Array(value :_*))
    
    @scala.inline
    def setReason(
      value: ambiguous | assert | debugCommand | DOM | EventListener | exception | instrumentation | OOM | other_ | promiseRejection | XHR
    ): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}
