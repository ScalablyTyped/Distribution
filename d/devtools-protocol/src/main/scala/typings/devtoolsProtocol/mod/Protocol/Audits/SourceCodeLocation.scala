package typings.devtoolsProtocol.mod.Protocol.Audits

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceCodeLocation extends StObject {
  
  var columnNumber: integer
  
  var lineNumber: integer
  
  var url: String
}
object SourceCodeLocation {
  
  inline def apply(columnNumber: integer, lineNumber: integer, url: String): SourceCodeLocation = {
    val __obj = js.Dynamic.literal(columnNumber = columnNumber.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceCodeLocation]
  }
  
  extension [Self <: SourceCodeLocation](x: Self) {
    
    inline def setColumnNumber(value: integer): Self = StObject.set(x, "columnNumber", value.asInstanceOf[js.Any])
    
    inline def setLineNumber(value: integer): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
