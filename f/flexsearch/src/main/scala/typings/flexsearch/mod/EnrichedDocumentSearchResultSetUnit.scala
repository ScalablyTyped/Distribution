package typings.flexsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnrichedDocumentSearchResultSetUnit[T] extends StObject {
  
  var field: String
  
  var result: js.Array[EnrichedDocumentSearchResultSetUnitResultUnit[T]]
}
object EnrichedDocumentSearchResultSetUnit {
  
  inline def apply[T](field: String, result: js.Array[EnrichedDocumentSearchResultSetUnitResultUnit[T]]): EnrichedDocumentSearchResultSetUnit[T] = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnrichedDocumentSearchResultSetUnit[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnrichedDocumentSearchResultSetUnit[?], T] (val x: Self & EnrichedDocumentSearchResultSetUnit[T]) extends AnyVal {
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setResult(value: js.Array[EnrichedDocumentSearchResultSetUnitResultUnit[T]]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultVarargs(value: EnrichedDocumentSearchResultSetUnitResultUnit[T]*): Self = StObject.set(x, "result", js.Array(value*))
  }
}
