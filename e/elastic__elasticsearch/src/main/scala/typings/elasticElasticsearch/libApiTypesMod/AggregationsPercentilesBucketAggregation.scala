package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsPercentilesBucketAggregation
  extends StObject
     with AggregationsPipelineAggregationBase {
  
  var percents: js.UndefOr[js.Array[double]] = js.undefined
}
object AggregationsPercentilesBucketAggregation {
  
  inline def apply(): AggregationsPercentilesBucketAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationsPercentilesBucketAggregation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsPercentilesBucketAggregation] (val x: Self) extends AnyVal {
    
    inline def setPercents(value: js.Array[double]): Self = StObject.set(x, "percents", value.asInstanceOf[js.Any])
    
    inline def setPercentsUndefined: Self = StObject.set(x, "percents", js.undefined)
    
    inline def setPercentsVarargs(value: double*): Self = StObject.set(x, "percents", js.Array(value*))
  }
}
