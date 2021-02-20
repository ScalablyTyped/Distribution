package typings.devtoolsProtocol.mod.Protocol.Debugger

import typings.devtoolsProtocol.devtoolsProtocolStrings.`return`
import typings.devtoolsProtocol.devtoolsProtocolStrings.call
import typings.devtoolsProtocol.devtoolsProtocolStrings.debuggerStatement
import typings.devtoolsProtocol.mod.Protocol.Runtime.ScriptId
import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BreakLocation extends StObject {
  
  /**
    * Column number in the script (0-based).
    */
  var columnNumber: js.UndefOr[integer] = js.native
  
  /**
    * Line number in the script (0-based).
    */
  var lineNumber: integer = js.native
  
  /**
    * Script identifier as reported in the `Debugger.scriptParsed`.
    */
  var scriptId: ScriptId = js.native
  
  /**
    *  (BreakLocationType enum)
    */
  var `type`: js.UndefOr[debuggerStatement | call | `return`] = js.native
}
object BreakLocation {
  
  @scala.inline
  def apply(lineNumber: integer, scriptId: ScriptId): BreakLocation = {
    val __obj = js.Dynamic.literal(lineNumber = lineNumber.asInstanceOf[js.Any], scriptId = scriptId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreakLocation]
  }
  
  @scala.inline
  implicit class BreakLocationMutableBuilder[Self <: BreakLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnNumber(value: integer): Self = StObject.set(x, "columnNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnNumberUndefined: Self = StObject.set(x, "columnNumber", js.undefined)
    
    @scala.inline
    def setLineNumber(value: integer): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptId(value: ScriptId): Self = StObject.set(x, "scriptId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: debuggerStatement | call | `return`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
