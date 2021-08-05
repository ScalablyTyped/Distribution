package typings.devtoolsProtocol.mod.Protocol.CSS

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceRange extends StObject {
  
  /**
    * End column of range (exclusive).
    */
  var endColumn: integer
  
  /**
    * End line of range
    */
  var endLine: integer
  
  /**
    * Start column of range (inclusive).
    */
  var startColumn: integer
  
  /**
    * Start line of range.
    */
  var startLine: integer
}
object SourceRange {
  
  inline def apply(endColumn: integer, endLine: integer, startColumn: integer, startLine: integer): SourceRange = {
    val __obj = js.Dynamic.literal(endColumn = endColumn.asInstanceOf[js.Any], endLine = endLine.asInstanceOf[js.Any], startColumn = startColumn.asInstanceOf[js.Any], startLine = startLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceRange]
  }
  
  extension [Self <: SourceRange](x: Self) {
    
    inline def setEndColumn(value: integer): Self = StObject.set(x, "endColumn", value.asInstanceOf[js.Any])
    
    inline def setEndLine(value: integer): Self = StObject.set(x, "endLine", value.asInstanceOf[js.Any])
    
    inline def setStartColumn(value: integer): Self = StObject.set(x, "startColumn", value.asInstanceOf[js.Any])
    
    inline def setStartLine(value: integer): Self = StObject.set(x, "startLine", value.asInstanceOf[js.Any])
  }
}
