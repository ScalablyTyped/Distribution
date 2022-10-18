package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsSingleBucketAggregateBase
  extends StObject
     with AggregationsAggregateBase {
  
  var doc_count: long
}
object AggregationsSingleBucketAggregateBase {
  
  inline def apply(doc_count: long): AggregationsSingleBucketAggregateBase = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsSingleBucketAggregateBase]
  }
  
  extension [Self <: AggregationsSingleBucketAggregateBase](x: Self) {
    
    inline def setDoc_count(value: long): Self = StObject.set(x, "doc_count", value.asInstanceOf[js.Any])
  }
}
