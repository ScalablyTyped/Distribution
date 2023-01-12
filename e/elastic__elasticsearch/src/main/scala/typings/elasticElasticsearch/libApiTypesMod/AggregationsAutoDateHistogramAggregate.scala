package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsAutoDateHistogramAggregate
  extends StObject
     with AggregationsMultiBucketAggregateBase[AggregationsDateHistogramBucket]
     with _AggregationsAggregate {
  
  var interval: DurationLarge
}
object AggregationsAutoDateHistogramAggregate {
  
  inline def apply(buckets: AggregationsBuckets[AggregationsDateHistogramBucket], interval: DurationLarge): AggregationsAutoDateHistogramAggregate = {
    val __obj = js.Dynamic.literal(buckets = buckets.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsAutoDateHistogramAggregate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsAutoDateHistogramAggregate] (val x: Self) extends AnyVal {
    
    inline def setInterval(value: DurationLarge): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
  }
}
