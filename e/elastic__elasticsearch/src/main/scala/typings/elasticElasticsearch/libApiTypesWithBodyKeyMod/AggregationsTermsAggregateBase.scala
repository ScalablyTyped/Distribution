package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsTermsAggregateBase[TBucket]
  extends StObject
     with AggregationsMultiBucketAggregateBase[TBucket] {
  
  var doc_count_error_upper_bound: js.UndefOr[long] = js.undefined
  
  var sum_other_doc_count: js.UndefOr[long] = js.undefined
}
object AggregationsTermsAggregateBase {
  
  inline def apply[TBucket](buckets: AggregationsBuckets[TBucket]): AggregationsTermsAggregateBase[TBucket] = {
    val __obj = js.Dynamic.literal(buckets = buckets.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsTermsAggregateBase[TBucket]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsTermsAggregateBase[?], TBucket] (val x: Self & AggregationsTermsAggregateBase[TBucket]) extends AnyVal {
    
    inline def setDoc_count_error_upper_bound(value: long): Self = StObject.set(x, "doc_count_error_upper_bound", value.asInstanceOf[js.Any])
    
    inline def setDoc_count_error_upper_boundUndefined: Self = StObject.set(x, "doc_count_error_upper_bound", js.undefined)
    
    inline def setSum_other_doc_count(value: long): Self = StObject.set(x, "sum_other_doc_count", value.asInstanceOf[js.Any])
    
    inline def setSum_other_doc_countUndefined: Self = StObject.set(x, "sum_other_doc_count", js.undefined)
  }
}
