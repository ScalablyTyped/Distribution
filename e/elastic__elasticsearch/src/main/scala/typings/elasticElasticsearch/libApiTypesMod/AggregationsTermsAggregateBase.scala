package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsTermsAggregateBase[TBucket]
  extends StObject
     with AggregationsMultiBucketAggregateBase[TBucket] {
  
  var doc_count_error_upper_bound: js.UndefOr[long] = js.undefined
  
  var sum_other_doc_count: long
}
object AggregationsTermsAggregateBase {
  
  inline def apply[TBucket](buckets: AggregationsBuckets[TBucket], sum_other_doc_count: long): AggregationsTermsAggregateBase[TBucket] = {
    val __obj = js.Dynamic.literal(buckets = buckets.asInstanceOf[js.Any], sum_other_doc_count = sum_other_doc_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsTermsAggregateBase[TBucket]]
  }
  
  extension [Self <: AggregationsTermsAggregateBase[?], TBucket](x: Self & AggregationsTermsAggregateBase[TBucket]) {
    
    inline def setDoc_count_error_upper_bound(value: long): Self = StObject.set(x, "doc_count_error_upper_bound", value.asInstanceOf[js.Any])
    
    inline def setDoc_count_error_upper_boundUndefined: Self = StObject.set(x, "doc_count_error_upper_bound", js.undefined)
    
    inline def setSum_other_doc_count(value: long): Self = StObject.set(x, "sum_other_doc_count", value.asInstanceOf[js.Any])
  }
}
