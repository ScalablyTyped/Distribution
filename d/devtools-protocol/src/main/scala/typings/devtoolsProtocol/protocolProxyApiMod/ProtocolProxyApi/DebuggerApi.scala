package typings.devtoolsProtocol.protocolProxyApiMod.ProtocolProxyApi

import typings.devtoolsProtocol.devtoolsProtocolStrings.breakpointResolved
import typings.devtoolsProtocol.devtoolsProtocolStrings.paused
import typings.devtoolsProtocol.devtoolsProtocolStrings.resumed
import typings.devtoolsProtocol.devtoolsProtocolStrings.scriptFailedToParse
import typings.devtoolsProtocol.devtoolsProtocolStrings.scriptParsed
import typings.devtoolsProtocol.mod.Protocol.Debugger.BreakpointResolvedEvent
import typings.devtoolsProtocol.mod.Protocol.Debugger.ContinueToLocationRequest
import typings.devtoolsProtocol.mod.Protocol.Debugger.DisassembleWasmModuleRequest
import typings.devtoolsProtocol.mod.Protocol.Debugger.DisassembleWasmModuleResponse
import typings.devtoolsProtocol.mod.Protocol.Debugger.EnableRequest
import typings.devtoolsProtocol.mod.Protocol.Debugger.EnableResponse
import typings.devtoolsProtocol.mod.Protocol.Debugger.EvaluateOnCallFrameRequest
import typings.devtoolsProtocol.mod.Protocol.Debugger.EvaluateOnCallFrameResponse
import typings.devtoolsProtocol.mod.Protocol.Debugger.GetPossibleBreakpointsRequest
import typings.devtoolsProtocol.mod.Protocol.Debugger.GetPossibleBreakpointsResponse
import typings.devtoolsProtocol.mod.Protocol.Debugger.GetScriptSourceRequest
import typings.devtoolsProtocol.mod.Protocol.Debugger.GetScriptSourceResponse
import typings.devtoolsProtocol.mod.Protocol.Debugger.GetStackTraceRequest
import typings.devtoolsProtocol.mod.Protocol.Debugger.GetStackTraceResponse
import typings.devtoolsProtocol.mod.Protocol.Debugger.GetWasmBytecodeRequest
import typings.devtoolsProtocol.mod.Protocol.Debugger.GetWasmBytecodeResponse
import typings.devtoolsProtocol.mod.Protocol.Debugger.NextWasmDisassemblyChunkRequest
import typings.devtoolsProtocol.mod.Protocol.Debugger.NextWasmDisassemblyChunkResponse
import typings.devtoolsProtocol.mod.Protocol.Debugger.PauseOnAsyncCallRequest
import typings.devtoolsProtocol.mod.Protocol.Debugger.PausedEvent
import typings.devtoolsProtocol.mod.Protocol.Debugger.RemoveBreakpointRequest
import typings.devtoolsProtocol.mod.Protocol.Debugger.RestartFrameRequest
import typings.devtoolsProtocol.mod.Protocol.Debugger.RestartFrameResponse
import typings.devtoolsProtocol.mod.Protocol.Debugger.ResumeRequest
import typings.devtoolsProtocol.mod.Protocol.Debugger.ScriptFailedToParseEvent
import typings.devtoolsProtocol.mod.Protocol.Debugger.ScriptParsedEvent
import typings.devtoolsProtocol.mod.Protocol.Debugger.SearchInContentRequest
import typings.devtoolsProtocol.mod.Protocol.Debugger.SearchInContentResponse
import typings.devtoolsProtocol.mod.Protocol.Debugger.SetAsyncCallStackDepthRequest
import typings.devtoolsProtocol.mod.Protocol.Debugger.SetBlackboxPatternsRequest
import typings.devtoolsProtocol.mod.Protocol.Debugger.SetBlackboxedRangesRequest
import typings.devtoolsProtocol.mod.Protocol.Debugger.SetBreakpointByUrlRequest
import typings.devtoolsProtocol.mod.Protocol.Debugger.SetBreakpointByUrlResponse
import typings.devtoolsProtocol.mod.Protocol.Debugger.SetBreakpointOnFunctionCallRequest
import typings.devtoolsProtocol.mod.Protocol.Debugger.SetBreakpointOnFunctionCallResponse
import typings.devtoolsProtocol.mod.Protocol.Debugger.SetBreakpointRequest
import typings.devtoolsProtocol.mod.Protocol.Debugger.SetBreakpointResponse
import typings.devtoolsProtocol.mod.Protocol.Debugger.SetBreakpointsActiveRequest
import typings.devtoolsProtocol.mod.Protocol.Debugger.SetInstrumentationBreakpointRequest
import typings.devtoolsProtocol.mod.Protocol.Debugger.SetInstrumentationBreakpointResponse
import typings.devtoolsProtocol.mod.Protocol.Debugger.SetPauseOnExceptionsRequest
import typings.devtoolsProtocol.mod.Protocol.Debugger.SetReturnValueRequest
import typings.devtoolsProtocol.mod.Protocol.Debugger.SetScriptSourceRequest
import typings.devtoolsProtocol.mod.Protocol.Debugger.SetScriptSourceResponse
import typings.devtoolsProtocol.mod.Protocol.Debugger.SetSkipAllPausesRequest
import typings.devtoolsProtocol.mod.Protocol.Debugger.SetVariableValueRequest
import typings.devtoolsProtocol.mod.Protocol.Debugger.StepIntoRequest
import typings.devtoolsProtocol.mod.Protocol.Debugger.StepOverRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DebuggerApi extends StObject {
  
  /**
    * Continues execution until specific location is reached.
    */
  def continueToLocation(params: ContinueToLocationRequest): js.Promise[Unit] = js.native
  
  /**
    * Disables debugger for given page.
    */
  def disable(): js.Promise[Unit] = js.native
  
  def disassembleWasmModule(params: DisassembleWasmModuleRequest): js.Promise[DisassembleWasmModuleResponse] = js.native
  
  /**
    * Enables debugger for the given page. Clients should not assume that the debugging has been
    * enabled until the result for this command is received.
    */
  def enable(params: EnableRequest): js.Promise[EnableResponse] = js.native
  
  /**
    * Evaluates expression on a given call frame.
    */
  def evaluateOnCallFrame(params: EvaluateOnCallFrameRequest): js.Promise[EvaluateOnCallFrameResponse] = js.native
  
  /**
    * Returns possible locations for breakpoint. scriptId in start and end range locations should be
    * the same.
    */
  def getPossibleBreakpoints(params: GetPossibleBreakpointsRequest): js.Promise[GetPossibleBreakpointsResponse] = js.native
  
  /**
    * Returns source for the script with given id.
    */
  def getScriptSource(params: GetScriptSourceRequest): js.Promise[GetScriptSourceResponse] = js.native
  
  /**
    * Returns stack trace with given `stackTraceId`.
    */
  def getStackTrace(params: GetStackTraceRequest): js.Promise[GetStackTraceResponse] = js.native
  
  /**
    * This command is deprecated. Use getScriptSource instead.
    */
  def getWasmBytecode(params: GetWasmBytecodeRequest): js.Promise[GetWasmBytecodeResponse] = js.native
  
  /**
    * Disassemble the next chunk of lines for the module corresponding to the
    * stream. If disassembly is complete, this API will invalidate the streamId
    * and return an empty chunk. Any subsequent calls for the now invalid stream
    * will return errors.
    */
  def nextWasmDisassemblyChunk(params: NextWasmDisassemblyChunkRequest): js.Promise[NextWasmDisassemblyChunkResponse] = js.native
  
  /**
    * Fired when breakpoint is resolved to an actual script and location.
    */
  @JSName("on")
  def on_breakpointResolved(event: breakpointResolved, listener: js.Function1[/* params */ BreakpointResolvedEvent, Unit]): Unit = js.native
  /**
    * Fired when the virtual machine stopped on breakpoint or exception or any other stop criteria.
    */
  @JSName("on")
  def on_paused(event: paused, listener: js.Function1[/* params */ PausedEvent, Unit]): Unit = js.native
  /**
    * Fired when the virtual machine resumed execution.
    */
  @JSName("on")
  def on_resumed(event: resumed, listener: js.Function0[Unit]): Unit = js.native
  /**
    * Fired when virtual machine fails to parse the script.
    */
  @JSName("on")
  def on_scriptFailedToParse(event: scriptFailedToParse, listener: js.Function1[/* params */ ScriptFailedToParseEvent, Unit]): Unit = js.native
  /**
    * Fired when virtual machine parses script. This event is also fired for all known and uncollected
    * scripts upon enabling debugger.
    */
  @JSName("on")
  def on_scriptParsed(event: scriptParsed, listener: js.Function1[/* params */ ScriptParsedEvent, Unit]): Unit = js.native
  
  /**
    * Stops on the next JavaScript statement.
    */
  def pause(): js.Promise[Unit] = js.native
  
  def pauseOnAsyncCall(params: PauseOnAsyncCallRequest): js.Promise[Unit] = js.native
  
  /**
    * Removes JavaScript breakpoint.
    */
  def removeBreakpoint(params: RemoveBreakpointRequest): js.Promise[Unit] = js.native
  
  /**
    * Restarts particular call frame from the beginning. The old, deprecated
    * behavior of `restartFrame` is to stay paused and allow further CDP commands
    * after a restart was scheduled. This can cause problems with restarting, so
    * we now continue execution immediatly after it has been scheduled until we
    * reach the beginning of the restarted frame.
    * 
    * To stay back-wards compatible, `restartFrame` now expects a `mode`
    * parameter to be present. If the `mode` parameter is missing, `restartFrame`
    * errors out.
    * 
    * The various return values are deprecated and `callFrames` is always empty.
    * Use the call frames from the `Debugger#paused` events instead, that fires
    * once V8 pauses at the beginning of the restarted function.
    */
  def restartFrame(params: RestartFrameRequest): js.Promise[RestartFrameResponse] = js.native
  
  /**
    * Resumes JavaScript execution.
    */
  def resume(params: ResumeRequest): js.Promise[Unit] = js.native
  
  /**
    * Searches for given string in script content.
    */
  def searchInContent(params: SearchInContentRequest): js.Promise[SearchInContentResponse] = js.native
  
  /**
    * Enables or disables async call stacks tracking.
    */
  def setAsyncCallStackDepth(params: SetAsyncCallStackDepthRequest): js.Promise[Unit] = js.native
  
  /**
    * Replace previous blackbox patterns with passed ones. Forces backend to skip stepping/pausing in
    * scripts with url matching one of the patterns. VM will try to leave blackboxed script by
    * performing 'step in' several times, finally resorting to 'step out' if unsuccessful.
    */
  def setBlackboxPatterns(params: SetBlackboxPatternsRequest): js.Promise[Unit] = js.native
  
  /**
    * Makes backend skip steps in the script in blackboxed ranges. VM will try leave blacklisted
    * scripts by performing 'step in' several times, finally resorting to 'step out' if unsuccessful.
    * Positions array contains positions where blackbox state is changed. First interval isn't
    * blackboxed. Array should be sorted.
    */
  def setBlackboxedRanges(params: SetBlackboxedRangesRequest): js.Promise[Unit] = js.native
  
  /**
    * Sets JavaScript breakpoint at a given location.
    */
  def setBreakpoint(params: SetBreakpointRequest): js.Promise[SetBreakpointResponse] = js.native
  
  /**
    * Sets JavaScript breakpoint at given location specified either by URL or URL regex. Once this
    * command is issued, all existing parsed scripts will have breakpoints resolved and returned in
    * `locations` property. Further matching script parsing will result in subsequent
    * `breakpointResolved` events issued. This logical breakpoint will survive page reloads.
    */
  def setBreakpointByUrl(params: SetBreakpointByUrlRequest): js.Promise[SetBreakpointByUrlResponse] = js.native
  
  /**
    * Sets JavaScript breakpoint before each call to the given function.
    * If another function was created from the same source as a given one,
    * calling it will also trigger the breakpoint.
    */
  def setBreakpointOnFunctionCall(params: SetBreakpointOnFunctionCallRequest): js.Promise[SetBreakpointOnFunctionCallResponse] = js.native
  
  /**
    * Activates / deactivates all breakpoints on the page.
    */
  def setBreakpointsActive(params: SetBreakpointsActiveRequest): js.Promise[Unit] = js.native
  
  /**
    * Sets instrumentation breakpoint.
    */
  def setInstrumentationBreakpoint(params: SetInstrumentationBreakpointRequest): js.Promise[SetInstrumentationBreakpointResponse] = js.native
  
  /**
    * Defines pause on exceptions state. Can be set to stop on all exceptions, uncaught exceptions or
    * no exceptions. Initial pause on exceptions state is `none`.
    */
  def setPauseOnExceptions(params: SetPauseOnExceptionsRequest): js.Promise[Unit] = js.native
  
  /**
    * Changes return value in top frame. Available only at return break position.
    */
  def setReturnValue(params: SetReturnValueRequest): js.Promise[Unit] = js.native
  
  /**
    * Edits JavaScript source live.
    * 
    * In general, functions that are currently on the stack can not be edited with
    * a single exception: If the edited function is the top-most stack frame and
    * that is the only activation of that function on the stack. In this case
    * the live edit will be successful and a `Debugger.restartFrame` for the
    * top-most function is automatically triggered.
    */
  def setScriptSource(params: SetScriptSourceRequest): js.Promise[SetScriptSourceResponse] = js.native
  
  /**
    * Makes page not interrupt on any pauses (breakpoint, exception, dom exception etc).
    */
  def setSkipAllPauses(params: SetSkipAllPausesRequest): js.Promise[Unit] = js.native
  
  /**
    * Changes value of variable in a callframe. Object-based scopes are not supported and must be
    * mutated manually.
    */
  def setVariableValue(params: SetVariableValueRequest): js.Promise[Unit] = js.native
  
  /**
    * Steps into the function call.
    */
  def stepInto(params: StepIntoRequest): js.Promise[Unit] = js.native
  
  /**
    * Steps out of the function call.
    */
  def stepOut(): js.Promise[Unit] = js.native
  
  /**
    * Steps over the statement.
    */
  def stepOver(params: StepOverRequest): js.Promise[Unit] = js.native
}
