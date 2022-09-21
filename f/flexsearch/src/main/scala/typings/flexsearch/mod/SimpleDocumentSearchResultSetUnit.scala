package typings.flexsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimpleDocumentSearchResultSetUnit extends StObject {
  
  var field: String
  
  var result: js.Array[Id]
}
object SimpleDocumentSearchResultSetUnit {
  
  inline def apply(field: String, result: js.Array[Id]): SimpleDocumentSearchResultSetUnit = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleDocumentSearchResultSetUnit]
  }
  
  extension [Self <: SimpleDocumentSearchResultSetUnit](x: Self) {
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setResult(value: js.Array[Id]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultVarargs(value: Id*): Self = StObject.set(x, "result", js.Array(value*))
  }
}
