package typings.devtoolsProtocol.mod.Protocol.Debugger

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScriptPosition extends StObject {
  
  var columnNumber: integer
  
  var lineNumber: integer
}
object ScriptPosition {
  
  inline def apply(columnNumber: integer, lineNumber: integer): ScriptPosition = {
    val __obj = js.Dynamic.literal(columnNumber = columnNumber.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptPosition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScriptPosition] (val x: Self) extends AnyVal {
    
    inline def setColumnNumber(value: integer): Self = StObject.set(x, "columnNumber", value.asInstanceOf[js.Any])
    
    inline def setLineNumber(value: integer): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
  }
}
