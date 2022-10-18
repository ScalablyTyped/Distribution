package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsBucketCorrelationFunctionCountCorrelation extends StObject {
  
  var indicator: AggregationsBucketCorrelationFunctionCountCorrelationIndicator
}
object AggregationsBucketCorrelationFunctionCountCorrelation {
  
  inline def apply(indicator: AggregationsBucketCorrelationFunctionCountCorrelationIndicator): AggregationsBucketCorrelationFunctionCountCorrelation = {
    val __obj = js.Dynamic.literal(indicator = indicator.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsBucketCorrelationFunctionCountCorrelation]
  }
  
  extension [Self <: AggregationsBucketCorrelationFunctionCountCorrelation](x: Self) {
    
    inline def setIndicator(value: AggregationsBucketCorrelationFunctionCountCorrelationIndicator): Self = StObject.set(x, "indicator", value.asInstanceOf[js.Any])
  }
}
