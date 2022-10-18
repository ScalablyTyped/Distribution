package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesIndexSegmentSort extends StObject {
  
  var field: js.UndefOr[Fields] = js.undefined
  
  var missing: js.UndefOr[IndicesSegmentSortMissing | js.Array[IndicesSegmentSortMissing]] = js.undefined
  
  var mode: js.UndefOr[IndicesSegmentSortMode | js.Array[IndicesSegmentSortMode]] = js.undefined
  
  var order: js.UndefOr[IndicesSegmentSortOrder | js.Array[IndicesSegmentSortOrder]] = js.undefined
}
object IndicesIndexSegmentSort {
  
  inline def apply(): IndicesIndexSegmentSort = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesIndexSegmentSort]
  }
  
  extension [Self <: IndicesIndexSegmentSort](x: Self) {
    
    inline def setField(value: Fields): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setFieldVarargs(value: Field*): Self = StObject.set(x, "field", js.Array(value*))
    
    inline def setMissing(value: IndicesSegmentSortMissing | js.Array[IndicesSegmentSortMissing]): Self = StObject.set(x, "missing", value.asInstanceOf[js.Any])
    
    inline def setMissingUndefined: Self = StObject.set(x, "missing", js.undefined)
    
    inline def setMissingVarargs(value: IndicesSegmentSortMissing*): Self = StObject.set(x, "missing", js.Array(value*))
    
    inline def setMode(value: IndicesSegmentSortMode | js.Array[IndicesSegmentSortMode]): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setModeVarargs(value: IndicesSegmentSortMode*): Self = StObject.set(x, "mode", js.Array(value*))
    
    inline def setOrder(value: IndicesSegmentSortOrder | js.Array[IndicesSegmentSortOrder]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setOrderVarargs(value: IndicesSegmentSortOrder*): Self = StObject.set(x, "order", js.Array(value*))
  }
}
