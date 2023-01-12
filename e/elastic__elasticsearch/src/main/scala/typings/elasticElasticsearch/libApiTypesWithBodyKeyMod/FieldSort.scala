package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldSort extends StObject {
  
  var format: js.UndefOr[String] = js.undefined
  
  var missing: js.UndefOr[AggregationsMissing] = js.undefined
  
  var mode: js.UndefOr[SortMode] = js.undefined
  
  var nested: js.UndefOr[NestedSortValue] = js.undefined
  
  var numeric_type: js.UndefOr[FieldSortNumericType] = js.undefined
  
  var order: js.UndefOr[SortOrder] = js.undefined
  
  var unmapped_type: js.UndefOr[MappingFieldType] = js.undefined
}
object FieldSort {
  
  inline def apply(): FieldSort = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldSort]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FieldSort] (val x: Self) extends AnyVal {
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setMissing(value: AggregationsMissing): Self = StObject.set(x, "missing", value.asInstanceOf[js.Any])
    
    inline def setMissingUndefined: Self = StObject.set(x, "missing", js.undefined)
    
    inline def setMode(value: SortMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setNested(value: NestedSortValue): Self = StObject.set(x, "nested", value.asInstanceOf[js.Any])
    
    inline def setNestedUndefined: Self = StObject.set(x, "nested", js.undefined)
    
    inline def setNumeric_type(value: FieldSortNumericType): Self = StObject.set(x, "numeric_type", value.asInstanceOf[js.Any])
    
    inline def setNumeric_typeUndefined: Self = StObject.set(x, "numeric_type", js.undefined)
    
    inline def setOrder(value: SortOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setUnmapped_type(value: MappingFieldType): Self = StObject.set(x, "unmapped_type", value.asInstanceOf[js.Any])
    
    inline def setUnmapped_typeUndefined: Self = StObject.set(x, "unmapped_type", js.undefined)
  }
}
