package typings.firebaseFirestore.distLitePrivateMod.firestoreV1ApiClientInterfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryTarget extends StObject {
  
  var parent: js.UndefOr[String] = js.undefined
  
  var structuredQuery: js.UndefOr[StructuredQuery] = js.undefined
}
object QueryTarget {
  
  inline def apply(): QueryTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryTarget]
  }
  
  extension [Self <: QueryTarget](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setStructuredQuery(value: StructuredQuery): Self = StObject.set(x, "structuredQuery", value.asInstanceOf[js.Any])
    
    inline def setStructuredQueryUndefined: Self = StObject.set(x, "structuredQuery", js.undefined)
  }
}
