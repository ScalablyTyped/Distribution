package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlGetBucketsResponse extends StObject {
  
  var buckets: js.Array[MlBucketSummary]
  
  var count: long
}
object MlGetBucketsResponse {
  
  inline def apply(buckets: js.Array[MlBucketSummary], count: long): MlGetBucketsResponse = {
    val __obj = js.Dynamic.literal(buckets = buckets.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlGetBucketsResponse]
  }
  
  extension [Self <: MlGetBucketsResponse](x: Self) {
    
    inline def setBuckets(value: js.Array[MlBucketSummary]): Self = StObject.set(x, "buckets", value.asInstanceOf[js.Any])
    
    inline def setBucketsVarargs(value: MlBucketSummary*): Self = StObject.set(x, "buckets", js.Array(value*))
    
    inline def setCount(value: long): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
  }
}
