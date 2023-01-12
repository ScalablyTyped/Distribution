package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsBucketSortAggregation
  extends StObject
     with AggregationsAggregation {
  
  var from: js.UndefOr[integer] = js.undefined
  
  var gap_policy: js.UndefOr[AggregationsGapPolicy] = js.undefined
  
  var size: js.UndefOr[integer] = js.undefined
  
  var sort: js.UndefOr[Sort] = js.undefined
}
object AggregationsBucketSortAggregation {
  
  inline def apply(): AggregationsBucketSortAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationsBucketSortAggregation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsBucketSortAggregation] (val x: Self) extends AnyVal {
    
    inline def setFrom(value: integer): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setGap_policy(value: AggregationsGapPolicy): Self = StObject.set(x, "gap_policy", value.asInstanceOf[js.Any])
    
    inline def setGap_policyUndefined: Self = StObject.set(x, "gap_policy", js.undefined)
    
    inline def setSize(value: integer): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSort(value: Sort): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setSortVarargs(value: SortCombinations*): Self = StObject.set(x, "sort", js.Array(value*))
  }
}
