package typings.devtoolsProtocol.mod.Protocol.Debugger

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetBreakpointByUrlRequest extends StObject {
  
  /**
    * Offset in the line to set breakpoint at.
    */
  var columnNumber: js.UndefOr[integer] = js.native
  
  /**
    * Expression to use as a breakpoint condition. When specified, debugger will only stop on the
    * breakpoint if this expression evaluates to true.
    */
  var condition: js.UndefOr[String] = js.native
  
  /**
    * Line number to set breakpoint at.
    */
  var lineNumber: integer = js.native
  
  /**
    * Script hash of the resources to set breakpoint on.
    */
  var scriptHash: js.UndefOr[String] = js.native
  
  /**
    * URL of the resources to set breakpoint on.
    */
  var url: js.UndefOr[String] = js.native
  
  /**
    * Regex pattern for the URLs of the resources to set breakpoints on. Either `url` or
    * `urlRegex` must be specified.
    */
  var urlRegex: js.UndefOr[String] = js.native
}
object SetBreakpointByUrlRequest {
  
  @scala.inline
  def apply(lineNumber: integer): SetBreakpointByUrlRequest = {
    val __obj = js.Dynamic.literal(lineNumber = lineNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetBreakpointByUrlRequest]
  }
  
  @scala.inline
  implicit class SetBreakpointByUrlRequestMutableBuilder[Self <: SetBreakpointByUrlRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnNumber(value: integer): Self = StObject.set(x, "columnNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnNumberUndefined: Self = StObject.set(x, "columnNumber", js.undefined)
    
    @scala.inline
    def setCondition(value: String): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    @scala.inline
    def setLineNumber(value: integer): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptHash(value: String): Self = StObject.set(x, "scriptHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptHashUndefined: Self = StObject.set(x, "scriptHash", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlRegex(value: String): Self = StObject.set(x, "urlRegex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlRegexUndefined: Self = StObject.set(x, "urlRegex", js.undefined)
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
