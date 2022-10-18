package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsBucketPathAggregation
  extends StObject
     with AggregationsAggregation {
  
  var buckets_path: js.UndefOr[AggregationsBucketsPath] = js.undefined
}
object AggregationsBucketPathAggregation {
  
  inline def apply(): AggregationsBucketPathAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationsBucketPathAggregation]
  }
  
  extension [Self <: AggregationsBucketPathAggregation](x: Self) {
    
    inline def setBuckets_path(value: AggregationsBucketsPath): Self = StObject.set(x, "buckets_path", value.asInstanceOf[js.Any])
    
    inline def setBuckets_pathUndefined: Self = StObject.set(x, "buckets_path", js.undefined)
    
    inline def setBuckets_pathVarargs(value: String*): Self = StObject.set(x, "buckets_path", js.Array(value*))
  }
}
