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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PausedEvent extends js.Object {
  
  /**
    * Never present, will be removed.
    */
  var asyncCallStackTraceId: js.UndefOr[StackTraceId] = js.native
  
  /**
    * Async stack trace, if any.
    */
  var asyncStackTrace: js.UndefOr[StackTrace] = js.native
  
  /**
    * Async stack trace, if any.
    */
  var asyncStackTraceId: js.UndefOr[StackTraceId] = js.native
  
  /**
    * Call stack the virtual machine stopped on.
    */
  var callFrames: js.Array[CallFrame] = js.native
  
  /**
    * Object containing break-specific auxiliary properties.
    */
  var data: js.UndefOr[js.Any] = js.native
  
  /**
    * Hit breakpoints IDs
    */
  var hitBreakpoints: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Pause reason. (PausedEventReason enum)
    */
  var reason: ambiguous | assert | debugCommand | DOM | EventListener | exception | instrumentation | OOM | other_ | promiseRejection | XHR = js.native
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
  implicit class PausedEventOps[Self <: PausedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCallFramesVarargs(value: CallFrame*): Self = this.set("callFrames", js.Array(value :_*))
    
    @scala.inline
    def setCallFrames(value: js.Array[CallFrame]): Self = this.set("callFrames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(
      value: ambiguous | assert | debugCommand | DOM | EventListener | exception | instrumentation | OOM | other_ | promiseRejection | XHR
    ): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsyncCallStackTraceId(value: StackTraceId): Self = this.set("asyncCallStackTraceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsyncCallStackTraceId: Self = this.set("asyncCallStackTraceId", js.undefined)
    
    @scala.inline
    def setAsyncStackTrace(value: StackTrace): Self = this.set("asyncStackTrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsyncStackTrace: Self = this.set("asyncStackTrace", js.undefined)
    
    @scala.inline
    def setAsyncStackTraceId(value: StackTraceId): Self = this.set("asyncStackTraceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsyncStackTraceId: Self = this.set("asyncStackTraceId", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setHitBreakpointsVarargs(value: String*): Self = this.set("hitBreakpoints", js.Array(value :_*))
    
    @scala.inline
    def setHitBreakpoints(value: js.Array[String]): Self = this.set("hitBreakpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHitBreakpoints: Self = this.set("hitBreakpoints", js.undefined)
  }
}
