package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsMultiBucketAggregateBase[TBucket]
  extends StObject
     with AggregationsAggregateBase {
  
  var buckets: AggregationsBuckets[TBucket]
}
object AggregationsMultiBucketAggregateBase {
  
  inline def apply[TBucket](buckets: AggregationsBuckets[TBucket]): AggregationsMultiBucketAggregateBase[TBucket] = {
    val __obj = js.Dynamic.literal(buckets = buckets.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsMultiBucketAggregateBase[TBucket]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsMultiBucketAggregateBase[?], TBucket] (val x: Self & AggregationsMultiBucketAggregateBase[TBucket]) extends AnyVal {
    
    inline def setBuckets(value: AggregationsBuckets[TBucket]): Self = StObject.set(x, "buckets", value.asInstanceOf[js.Any])
    
    inline def setBucketsVarargs(value: TBucket*): Self = StObject.set(x, "buckets", js.Array(value*))
  }
}
