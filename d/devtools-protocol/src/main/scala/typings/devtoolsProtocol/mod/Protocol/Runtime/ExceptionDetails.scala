package typings.devtoolsProtocol.mod.Protocol.Runtime

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExceptionDetails extends StObject {
  
  /**
    * Column number of the exception location (0-based).
    */
  var columnNumber: integer
  
  /**
    * Exception object if available.
    */
  var exception: js.UndefOr[RemoteObject] = js.undefined
  
  /**
    * Exception id.
    */
  var exceptionId: integer
  
  /**
    * Identifier of the context where exception happened.
    */
  var executionContextId: js.UndefOr[ExecutionContextId] = js.undefined
  
  /**
    * Line number of the exception location (0-based).
    */
  var lineNumber: integer
  
  /**
    * Script ID of the exception location.
    */
  var scriptId: js.UndefOr[ScriptId] = js.undefined
  
  /**
    * JavaScript stack trace if available.
    */
  var stackTrace: js.UndefOr[StackTrace] = js.undefined
  
  /**
    * Exception text, which should be used together with exception object when available.
    */
  var text: String
  
  /**
    * URL of the exception location, to be used when the script was not reported.
    */
  var url: js.UndefOr[String] = js.undefined
}
object ExceptionDetails {
  
  inline def apply(columnNumber: integer, exceptionId: integer, lineNumber: integer, text: String): ExceptionDetails = {
    val __obj = js.Dynamic.literal(columnNumber = columnNumber.asInstanceOf[js.Any], exceptionId = exceptionId.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExceptionDetails]
  }
  
  extension [Self <: ExceptionDetails](x: Self) {
    
    inline def setColumnNumber(value: integer): Self = StObject.set(x, "columnNumber", value.asInstanceOf[js.Any])
    
    inline def setException(value: RemoteObject): Self = StObject.set(x, "exception", value.asInstanceOf[js.Any])
    
    inline def setExceptionId(value: integer): Self = StObject.set(x, "exceptionId", value.asInstanceOf[js.Any])
    
    inline def setExceptionUndefined: Self = StObject.set(x, "exception", js.undefined)
    
    inline def setExecutionContextId(value: ExecutionContextId): Self = StObject.set(x, "executionContextId", value.asInstanceOf[js.Any])
    
    inline def setExecutionContextIdUndefined: Self = StObject.set(x, "executionContextId", js.undefined)
    
    inline def setLineNumber(value: integer): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
    
    inline def setScriptId(value: ScriptId): Self = StObject.set(x, "scriptId", value.asInstanceOf[js.Any])
    
    inline def setScriptIdUndefined: Self = StObject.set(x, "scriptId", js.undefined)
    
    inline def setStackTrace(value: StackTrace): Self = StObject.set(x, "stackTrace", value.asInstanceOf[js.Any])
    
    inline def setStackTraceUndefined: Self = StObject.set(x, "stackTrace", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
