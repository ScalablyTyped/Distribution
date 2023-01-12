package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsGeoLineAggregation extends StObject {
  
  var include_sort: js.UndefOr[Boolean] = js.undefined
  
  var point: AggregationsGeoLinePoint
  
  var size: js.UndefOr[integer] = js.undefined
  
  var sort: AggregationsGeoLineSort
  
  var sort_order: js.UndefOr[SortOrder] = js.undefined
}
object AggregationsGeoLineAggregation {
  
  inline def apply(point: AggregationsGeoLinePoint, sort: AggregationsGeoLineSort): AggregationsGeoLineAggregation = {
    val __obj = js.Dynamic.literal(point = point.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsGeoLineAggregation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsGeoLineAggregation] (val x: Self) extends AnyVal {
    
    inline def setInclude_sort(value: Boolean): Self = StObject.set(x, "include_sort", value.asInstanceOf[js.Any])
    
    inline def setInclude_sortUndefined: Self = StObject.set(x, "include_sort", js.undefined)
    
    inline def setPoint(value: AggregationsGeoLinePoint): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    inline def setSize(value: integer): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSort(value: AggregationsGeoLineSort): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSort_order(value: SortOrder): Self = StObject.set(x, "sort_order", value.asInstanceOf[js.Any])
    
    inline def setSort_orderUndefined: Self = StObject.set(x, "sort_order", js.undefined)
  }
}
