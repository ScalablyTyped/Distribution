package typings.devtoolsProtocol.mod.Protocol.Debugger

import typings.devtoolsProtocol.mod.Protocol.Runtime.ExecutionContextId
import typings.devtoolsProtocol.mod.Protocol.Runtime.ScriptId
import typings.devtoolsProtocol.mod.Protocol.Runtime.StackTrace
import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScriptFailedToParseEvent extends StObject {
  
  /**
    * If the scriptLanguage is WebAssembly, the code section offset in the module.
    */
  var codeOffset: js.UndefOr[integer] = js.undefined
  
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
  var executionContextAuxData: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Specifies script creation context.
    */
  var executionContextId: ExecutionContextId
  
  /**
    * True, if this script has sourceURL.
    */
  var hasSourceURL: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Content hash of the script.
    */
  var hash: String
  
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
object ScriptFailedToParseEvent {
  
  @scala.inline
  def apply(
    endColumn: integer,
    endLine: integer,
    executionContextId: ExecutionContextId,
    hash: String,
    scriptId: ScriptId,
    startColumn: integer,
    startLine: integer,
    url: String
  ): ScriptFailedToParseEvent = {
    val __obj = js.Dynamic.literal(endColumn = endColumn.asInstanceOf[js.Any], endLine = endLine.asInstanceOf[js.Any], executionContextId = executionContextId.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], scriptId = scriptId.asInstanceOf[js.Any], startColumn = startColumn.asInstanceOf[js.Any], startLine = startLine.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptFailedToParseEvent]
  }
  
  @scala.inline
  implicit class ScriptFailedToParseEventMutableBuilder[Self <: ScriptFailedToParseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCodeOffset(value: integer): Self = StObject.set(x, "codeOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeOffsetUndefined: Self = StObject.set(x, "codeOffset", js.undefined)
    
    @scala.inline
    def setEmbedderName(value: String): Self = StObject.set(x, "embedderName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbedderNameUndefined: Self = StObject.set(x, "embedderName", js.undefined)
    
    @scala.inline
    def setEndColumn(value: integer): Self = StObject.set(x, "endColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndLine(value: integer): Self = StObject.set(x, "endLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionContextAuxData(value: js.Any): Self = StObject.set(x, "executionContextAuxData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionContextAuxDataUndefined: Self = StObject.set(x, "executionContextAuxData", js.undefined)
    
    @scala.inline
    def setExecutionContextId(value: ExecutionContextId): Self = StObject.set(x, "executionContextId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasSourceURL(value: Boolean): Self = StObject.set(x, "hasSourceURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasSourceURLUndefined: Self = StObject.set(x, "hasSourceURL", js.undefined)
    
    @scala.inline
    def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsModule(value: Boolean): Self = StObject.set(x, "isModule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsModuleUndefined: Self = StObject.set(x, "isModule", js.undefined)
    
    @scala.inline
    def setLength(value: integer): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setScriptId(value: ScriptId): Self = StObject.set(x, "scriptId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptLanguage(value: ScriptLanguage): Self = StObject.set(x, "scriptLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptLanguageUndefined: Self = StObject.set(x, "scriptLanguage", js.undefined)
    
    @scala.inline
    def setSourceMapURL(value: String): Self = StObject.set(x, "sourceMapURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceMapURLUndefined: Self = StObject.set(x, "sourceMapURL", js.undefined)
    
    @scala.inline
    def setStackTrace(value: StackTrace): Self = StObject.set(x, "stackTrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackTraceUndefined: Self = StObject.set(x, "stackTrace", js.undefined)
    
    @scala.inline
    def setStartColumn(value: integer): Self = StObject.set(x, "startColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartLine(value: integer): Self = StObject.set(x, "startLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
