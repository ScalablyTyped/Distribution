package typings.firebaseFirestore.internalMod.firestoreV1ApiClientInterfaces

import typings.firebaseFirestore.internalMod.CompositeFilterOp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompositeFilter extends StObject {
  
  var filters: js.UndefOr[js.Array[Filter]] = js.undefined
  
  var op: js.UndefOr[CompositeFilterOp] = js.undefined
}
object CompositeFilter {
  
  inline def apply(): CompositeFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompositeFilter]
  }
  
  extension [Self <: CompositeFilter](x: Self) {
    
    inline def setFilters(value: js.Array[Filter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setOp(value: CompositeFilterOp): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    
    inline def setOpUndefined: Self = StObject.set(x, "op", js.undefined)
  }
}
