package typings.firebaseFirestore.privateMod.firestoreV1ApiClientInterfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filter extends StObject {
  
  var compositeFilter: js.UndefOr[CompositeFilter] = js.undefined
  
  var fieldFilter: js.UndefOr[FieldFilter] = js.undefined
  
  var unaryFilter: js.UndefOr[UnaryFilter] = js.undefined
}
object Filter {
  
  inline def apply(): Filter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Filter]
  }
  
  extension [Self <: Filter](x: Self) {
    
    inline def setCompositeFilter(value: CompositeFilter): Self = StObject.set(x, "compositeFilter", value.asInstanceOf[js.Any])
    
    inline def setCompositeFilterUndefined: Self = StObject.set(x, "compositeFilter", js.undefined)
    
    inline def setFieldFilter(value: FieldFilter): Self = StObject.set(x, "fieldFilter", value.asInstanceOf[js.Any])
    
    inline def setFieldFilterUndefined: Self = StObject.set(x, "fieldFilter", js.undefined)
    
    inline def setUnaryFilter(value: UnaryFilter): Self = StObject.set(x, "unaryFilter", value.asInstanceOf[js.Any])
    
    inline def setUnaryFilterUndefined: Self = StObject.set(x, "unaryFilter", js.undefined)
  }
}
