package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsSignificantTermsAggregateBase[T]
  extends StObject
     with AggregationsMultiBucketAggregateBase[T] {
  
  var bg_count: js.UndefOr[long] = js.undefined
  
  var doc_count: js.UndefOr[long] = js.undefined
}
object AggregationsSignificantTermsAggregateBase {
  
  inline def apply[T](buckets: AggregationsBuckets[T]): AggregationsSignificantTermsAggregateBase[T] = {
    val __obj = js.Dynamic.literal(buckets = buckets.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsSignificantTermsAggregateBase[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsSignificantTermsAggregateBase[?], T] (val x: Self & AggregationsSignificantTermsAggregateBase[T]) extends AnyVal {
    
    inline def setBg_count(value: long): Self = StObject.set(x, "bg_count", value.asInstanceOf[js.Any])
    
    inline def setBg_countUndefined: Self = StObject.set(x, "bg_count", js.undefined)
    
    inline def setDoc_count(value: long): Self = StObject.set(x, "doc_count", value.asInstanceOf[js.Any])
    
    inline def setDoc_countUndefined: Self = StObject.set(x, "doc_count", js.undefined)
  }
}
