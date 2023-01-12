package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlGetOverallBucketsResponse extends StObject {
  
  var count: long
  
  var overall_buckets: js.Array[MlOverallBucket]
}
object MlGetOverallBucketsResponse {
  
  inline def apply(count: long, overall_buckets: js.Array[MlOverallBucket]): MlGetOverallBucketsResponse = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], overall_buckets = overall_buckets.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlGetOverallBucketsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlGetOverallBucketsResponse] (val x: Self) extends AnyVal {
    
    inline def setCount(value: long): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setOverall_buckets(value: js.Array[MlOverallBucket]): Self = StObject.set(x, "overall_buckets", value.asInstanceOf[js.Any])
    
    inline def setOverall_bucketsVarargs(value: MlOverallBucket*): Self = StObject.set(x, "overall_buckets", js.Array(value*))
  }
}
