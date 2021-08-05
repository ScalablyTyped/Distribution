package typings.devtoolsProtocol.mod.Protocol.Debugger

import typings.devtoolsProtocol.mod.Protocol.Runtime.ScriptId
import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Location extends StObject {
  
  /**
    * Column number in the script (0-based).
    */
  var columnNumber: js.UndefOr[integer] = js.undefined
  
  /**
    * Line number in the script (0-based).
    */
  var lineNumber: integer
  
  /**
    * Script identifier as reported in the `Debugger.scriptParsed`.
    */
  var scriptId: ScriptId
}
object Location {
  
  inline def apply(lineNumber: integer, scriptId: ScriptId): Location = {
    val __obj = js.Dynamic.literal(lineNumber = lineNumber.asInstanceOf[js.Any], scriptId = scriptId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location]
  }
  
  extension [Self <: Location](x: Self) {
    
    inline def setColumnNumber(value: integer): Self = StObject.set(x, "columnNumber", value.asInstanceOf[js.Any])
    
    inline def setColumnNumberUndefined: Self = StObject.set(x, "columnNumber", js.undefined)
    
    inline def setLineNumber(value: integer): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
    
    inline def setScriptId(value: ScriptId): Self = StObject.set(x, "scriptId", value.asInstanceOf[js.Any])
  }
}
