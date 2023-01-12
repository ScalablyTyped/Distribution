package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsBucketCorrelationAggregation
  extends StObject
     with AggregationsBucketPathAggregation {
  
  var function: AggregationsBucketCorrelationFunction
}
object AggregationsBucketCorrelationAggregation {
  
  inline def apply(function: AggregationsBucketCorrelationFunction): AggregationsBucketCorrelationAggregation = {
    val __obj = js.Dynamic.literal(function = function.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsBucketCorrelationAggregation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsBucketCorrelationAggregation] (val x: Self) extends AnyVal {
    
    inline def setFunction(value: AggregationsBucketCorrelationFunction): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
  }
}
