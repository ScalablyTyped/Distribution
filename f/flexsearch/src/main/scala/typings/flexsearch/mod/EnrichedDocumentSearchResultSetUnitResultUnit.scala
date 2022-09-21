package typings.flexsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnrichedDocumentSearchResultSetUnitResultUnit[T] extends StObject {
  
  var doc: T
  
  var id: js.Array[Id]
}
object EnrichedDocumentSearchResultSetUnitResultUnit {
  
  inline def apply[T](doc: T, id: js.Array[Id]): EnrichedDocumentSearchResultSetUnitResultUnit[T] = {
    val __obj = js.Dynamic.literal(doc = doc.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnrichedDocumentSearchResultSetUnitResultUnit[T]]
  }
  
  extension [Self <: EnrichedDocumentSearchResultSetUnitResultUnit[?], T](x: Self & EnrichedDocumentSearchResultSetUnitResultUnit[T]) {
    
    inline def setDoc(value: T): Self = StObject.set(x, "doc", value.asInstanceOf[js.Any])
    
    inline def setId(value: js.Array[Id]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdVarargs(value: Id*): Self = StObject.set(x, "id", js.Array(value*))
  }
}
