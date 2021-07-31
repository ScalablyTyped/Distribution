package typings.devtoolsProtocol.mod.Protocol.Runtime

import typings.devtoolsProtocol.devtoolsProtocolStrings.assert
import typings.devtoolsProtocol.devtoolsProtocolStrings.clear
import typings.devtoolsProtocol.devtoolsProtocolStrings.count
import typings.devtoolsProtocol.devtoolsProtocolStrings.debug
import typings.devtoolsProtocol.devtoolsProtocolStrings.dir
import typings.devtoolsProtocol.devtoolsProtocolStrings.dirxml
import typings.devtoolsProtocol.devtoolsProtocolStrings.endGroup
import typings.devtoolsProtocol.devtoolsProtocolStrings.error
import typings.devtoolsProtocol.devtoolsProtocolStrings.info
import typings.devtoolsProtocol.devtoolsProtocolStrings.log
import typings.devtoolsProtocol.devtoolsProtocolStrings.profile
import typings.devtoolsProtocol.devtoolsProtocolStrings.profileEnd
import typings.devtoolsProtocol.devtoolsProtocolStrings.startGroup
import typings.devtoolsProtocol.devtoolsProtocolStrings.startGroupCollapsed
import typings.devtoolsProtocol.devtoolsProtocolStrings.table
import typings.devtoolsProtocol.devtoolsProtocolStrings.timeEnd
import typings.devtoolsProtocol.devtoolsProtocolStrings.trace
import typings.devtoolsProtocol.devtoolsProtocolStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsoleAPICalledEvent extends StObject {
  
  /**
    * Call arguments.
    */
  var args: js.Array[RemoteObject]
  
  /**
    * Console context descriptor for calls on non-default console context (not console.*):
    * 'anonymous#unique-logger-id' for call on unnamed context, 'name#unique-logger-id' for call
    * on named context.
    */
  var context: js.UndefOr[String] = js.undefined
  
  /**
    * Identifier of the context where the call was made.
    */
  var executionContextId: ExecutionContextId
  
  /**
    * Stack trace captured when the call was made. The async stack chain is automatically reported for
    * the following call types: `assert`, `error`, `trace`, `warning`. For other types the async call
    * chain can be retrieved using `Debugger.getStackTrace` and `stackTrace.parentId` field.
    */
  var stackTrace: js.UndefOr[StackTrace] = js.undefined
  
  /**
    * Call timestamp.
    */
  var timestamp: Timestamp
  
  /**
    * Type of the call. (ConsoleAPICalledEventType enum)
    */
  var `type`: log | debug | info | error | warning | dir | dirxml | table | trace | clear | startGroup | startGroupCollapsed | endGroup | assert | profile | profileEnd | count | timeEnd
}
object ConsoleAPICalledEvent {
  
  @scala.inline
  def apply(
    args: js.Array[RemoteObject],
    executionContextId: ExecutionContextId,
    timestamp: Timestamp,
    `type`: log | debug | info | error | warning | dir | dirxml | table | trace | clear | startGroup | startGroupCollapsed | endGroup | assert | profile | profileEnd | count | timeEnd
  ): ConsoleAPICalledEvent = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], executionContextId = executionContextId.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsoleAPICalledEvent]
  }
  
  @scala.inline
  implicit class ConsoleAPICalledEventMutableBuilder[Self <: ConsoleAPICalledEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: js.Array[RemoteObject]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsVarargs(value: RemoteObject*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    @scala.inline
    def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setExecutionContextId(value: ExecutionContextId): Self = StObject.set(x, "executionContextId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackTrace(value: StackTrace): Self = StObject.set(x, "stackTrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackTraceUndefined: Self = StObject.set(x, "stackTrace", js.undefined)
    
    @scala.inline
    def setTimestamp(value: Timestamp): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(
      value: log | debug | info | error | warning | dir | dirxml | table | trace | clear | startGroup | startGroupCollapsed | endGroup | assert | profile | profileEnd | count | timeEnd
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
