package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsBucketCorrelationFunction extends StObject {
  
  var count_correlation: AggregationsBucketCorrelationFunctionCountCorrelation
}
object AggregationsBucketCorrelationFunction {
  
  inline def apply(count_correlation: AggregationsBucketCorrelationFunctionCountCorrelation): AggregationsBucketCorrelationFunction = {
    val __obj = js.Dynamic.literal(count_correlation = count_correlation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsBucketCorrelationFunction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsBucketCorrelationFunction] (val x: Self) extends AnyVal {
    
    inline def setCount_correlation(value: AggregationsBucketCorrelationFunctionCountCorrelation): Self = StObject.set(x, "count_correlation", value.asInstanceOf[js.Any])
  }
}
