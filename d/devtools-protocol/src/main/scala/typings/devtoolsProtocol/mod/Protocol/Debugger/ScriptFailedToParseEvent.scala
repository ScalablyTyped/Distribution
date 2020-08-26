package typings.devtoolsProtocol.mod.Protocol.Debugger

import typings.devtoolsProtocol.mod.Protocol.Runtime.ExecutionContextId
import typings.devtoolsProtocol.mod.Protocol.Runtime.ScriptId
import typings.devtoolsProtocol.mod.Protocol.Runtime.StackTrace
import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScriptFailedToParseEvent extends js.Object {
  /**
    * If the scriptLanguage is WebAssembly, the code section offset in the module.
    */
  var codeOffset: js.UndefOr[integer] = js.native
  /**
    * Length of the last line of the script.
    */
  var endColumn: integer = js.native
  /**
    * Last line of the script.
    */
  var endLine: integer = js.native
  /**
    * Embedder-specific auxiliary data.
    */
  var executionContextAuxData: js.UndefOr[js.Any] = js.native
  /**
    * Specifies script creation context.
    */
  var executionContextId: ExecutionContextId = js.native
  /**
    * True, if this script has sourceURL.
    */
  var hasSourceURL: js.UndefOr[Boolean] = js.native
  /**
    * Content hash of the script.
    */
  var hash: String = js.native
  /**
    * True, if this script is ES6 module.
    */
  var isModule: js.UndefOr[Boolean] = js.native
  /**
    * This script length.
    */
  var length: js.UndefOr[integer] = js.native
  /**
    * Identifier of the script parsed.
    */
  var scriptId: ScriptId = js.native
  /**
    * The language of the script.
    */
  var scriptLanguage: js.UndefOr[ScriptLanguage] = js.native
  /**
    * URL of source map associated with script (if any).
    */
  var sourceMapURL: js.UndefOr[String] = js.native
  /**
    * JavaScript top stack frame of where the script parsed event was triggered if available.
    */
  var stackTrace: js.UndefOr[StackTrace] = js.native
  /**
    * Column offset of the script within the resource with given URL.
    */
  var startColumn: integer = js.native
  /**
    * Line offset of the script within the resource with given URL (for script tags).
    */
  var startLine: integer = js.native
  /**
    * URL or name of the script parsed (if any).
    */
  var url: String = js.native
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
  implicit class ScriptFailedToParseEventOps[Self <: ScriptFailedToParseEvent] (val x: Self) extends AnyVal {
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
    def setEndColumn(value: integer): Self = this.set("endColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndLine(value: integer): Self = this.set("endLine", value.asInstanceOf[js.Any])
    @scala.inline
    def setExecutionContextId(value: ExecutionContextId): Self = this.set("executionContextId", value.asInstanceOf[js.Any])
    @scala.inline
    def setHash(value: String): Self = this.set("hash", value.asInstanceOf[js.Any])
    @scala.inline
    def setScriptId(value: ScriptId): Self = this.set("scriptId", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartColumn(value: integer): Self = this.set("startColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartLine(value: integer): Self = this.set("startLine", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setCodeOffset(value: integer): Self = this.set("codeOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCodeOffset: Self = this.set("codeOffset", js.undefined)
    @scala.inline
    def setExecutionContextAuxData(value: js.Any): Self = this.set("executionContextAuxData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecutionContextAuxData: Self = this.set("executionContextAuxData", js.undefined)
    @scala.inline
    def setHasSourceURL(value: Boolean): Self = this.set("hasSourceURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasSourceURL: Self = this.set("hasSourceURL", js.undefined)
    @scala.inline
    def setIsModule(value: Boolean): Self = this.set("isModule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsModule: Self = this.set("isModule", js.undefined)
    @scala.inline
    def setLength(value: integer): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    @scala.inline
    def setScriptLanguage(value: ScriptLanguage): Self = this.set("scriptLanguage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScriptLanguage: Self = this.set("scriptLanguage", js.undefined)
    @scala.inline
    def setSourceMapURL(value: String): Self = this.set("sourceMapURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceMapURL: Self = this.set("sourceMapURL", js.undefined)
    @scala.inline
    def setStackTrace(value: StackTrace): Self = this.set("stackTrace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStackTrace: Self = this.set("stackTrace", js.undefined)
  }
  
}

