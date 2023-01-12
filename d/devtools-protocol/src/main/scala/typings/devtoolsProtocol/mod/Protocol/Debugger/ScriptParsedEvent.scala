package typings.devtoolsProtocol.mod.Protocol.Debugger

import typings.devtoolsProtocol.mod.Protocol.Runtime.ExecutionContextId
import typings.devtoolsProtocol.mod.Protocol.Runtime.ScriptId
import typings.devtoolsProtocol.mod.Protocol.Runtime.StackTrace
import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScriptParsedEvent extends StObject {
  
  /**
    * If the scriptLanguage is WebAssembly, the code section offset in the module.
    */
  var codeOffset: js.UndefOr[integer] = js.undefined
  
  /**
    * If the scriptLanguage is WebASsembly, the source of debug symbols for the module.
    */
  var debugSymbols: js.UndefOr[DebugSymbols] = js.undefined
  
  /**
    * The name the embedder supplied for this script.
    */
  var embedderName: js.UndefOr[String] = js.undefined
  
  /**
    * Length of the last line of the script.
    */
  var endColumn: integer
  
  /**
    * Last line of the script.
    */
  var endLine: integer
  
  /**
    * Embedder-specific auxiliary data.
    */
  var executionContextAuxData: js.UndefOr[Any] = js.undefined
  
  /**
    * Specifies script creation context.
    */
  var executionContextId: ExecutionContextId
  
  /**
    * True, if this script has sourceURL.
    */
  var hasSourceURL: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Content hash of the script, SHA-256.
    */
  var hash: String
  
  /**
    * True, if this script is generated as a result of the live edit operation.
    */
  var isLiveEdit: js.UndefOr[Boolean] = js.undefined
  
  /**
    * True, if this script is ES6 module.
    */
  var isModule: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This script length.
    */
  var length: js.UndefOr[integer] = js.undefined
  
  /**
    * Identifier of the script parsed.
    */
  var scriptId: ScriptId
  
  /**
    * The language of the script.
    */
  var scriptLanguage: js.UndefOr[ScriptLanguage] = js.undefined
  
  /**
    * URL of source map associated with script (if any).
    */
  var sourceMapURL: js.UndefOr[String] = js.undefined
  
  /**
    * JavaScript top stack frame of where the script parsed event was triggered if available.
    */
  var stackTrace: js.UndefOr[StackTrace] = js.undefined
  
  /**
    * Column offset of the script within the resource with given URL.
    */
  var startColumn: integer
  
  /**
    * Line offset of the script within the resource with given URL (for script tags).
    */
  var startLine: integer
  
  /**
    * URL or name of the script parsed (if any).
    */
  var url: String
}
object ScriptParsedEvent {
  
  inline def apply(
    endColumn: integer,
    endLine: integer,
    executionContextId: ExecutionContextId,
    hash: String,
    scriptId: ScriptId,
    startColumn: integer,
    startLine: integer,
    url: String
  ): ScriptParsedEvent = {
    val __obj = js.Dynamic.literal(endColumn = endColumn.asInstanceOf[js.Any], endLine = endLine.asInstanceOf[js.Any], executionContextId = executionContextId.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], scriptId = scriptId.asInstanceOf[js.Any], startColumn = startColumn.asInstanceOf[js.Any], startLine = startLine.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptParsedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScriptParsedEvent] (val x: Self) extends AnyVal {
    
    inline def setCodeOffset(value: integer): Self = StObject.set(x, "codeOffset", value.asInstanceOf[js.Any])
    
    inline def setCodeOffsetUndefined: Self = StObject.set(x, "codeOffset", js.undefined)
    
    inline def setDebugSymbols(value: DebugSymbols): Self = StObject.set(x, "debugSymbols", value.asInstanceOf[js.Any])
    
    inline def setDebugSymbolsUndefined: Self = StObject.set(x, "debugSymbols", js.undefined)
    
    inline def setEmbedderName(value: String): Self = StObject.set(x, "embedderName", value.asInstanceOf[js.Any])
    
    inline def setEmbedderNameUndefined: Self = StObject.set(x, "embedderName", js.undefined)
    
    inline def setEndColumn(value: integer): Self = StObject.set(x, "endColumn", value.asInstanceOf[js.Any])
    
    inline def setEndLine(value: integer): Self = StObject.set(x, "endLine", value.asInstanceOf[js.Any])
    
    inline def setExecutionContextAuxData(value: Any): Self = StObject.set(x, "executionContextAuxData", value.asInstanceOf[js.Any])
    
    inline def setExecutionContextAuxDataUndefined: Self = StObject.set(x, "executionContextAuxData", js.undefined)
    
    inline def setExecutionContextId(value: ExecutionContextId): Self = StObject.set(x, "executionContextId", value.asInstanceOf[js.Any])
    
    inline def setHasSourceURL(value: Boolean): Self = StObject.set(x, "hasSourceURL", value.asInstanceOf[js.Any])
    
    inline def setHasSourceURLUndefined: Self = StObject.set(x, "hasSourceURL", js.undefined)
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setIsLiveEdit(value: Boolean): Self = StObject.set(x, "isLiveEdit", value.asInstanceOf[js.Any])
    
    inline def setIsLiveEditUndefined: Self = StObject.set(x, "isLiveEdit", js.undefined)
    
    inline def setIsModule(value: Boolean): Self = StObject.set(x, "isModule", value.asInstanceOf[js.Any])
    
    inline def setIsModuleUndefined: Self = StObject.set(x, "isModule", js.undefined)
    
    inline def setLength(value: integer): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setScriptId(value: ScriptId): Self = StObject.set(x, "scriptId", value.asInstanceOf[js.Any])
    
    inline def setScriptLanguage(value: ScriptLanguage): Self = StObject.set(x, "scriptLanguage", value.asInstanceOf[js.Any])
    
    inline def setScriptLanguageUndefined: Self = StObject.set(x, "scriptLanguage", js.undefined)
    
    inline def setSourceMapURL(value: String): Self = StObject.set(x, "sourceMapURL", value.asInstanceOf[js.Any])
    
    inline def setSourceMapURLUndefined: Self = StObject.set(x, "sourceMapURL", js.undefined)
    
    inline def setStackTrace(value: StackTrace): Self = StObject.set(x, "stackTrace", value.asInstanceOf[js.Any])
    
    inline def setStackTraceUndefined: Self = StObject.set(x, "stackTrace", js.undefined)
    
    inline def setStartColumn(value: integer): Self = StObject.set(x, "startColumn", value.asInstanceOf[js.Any])
    
    inline def setStartLine(value: integer): Self = StObject.set(x, "startLine", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
