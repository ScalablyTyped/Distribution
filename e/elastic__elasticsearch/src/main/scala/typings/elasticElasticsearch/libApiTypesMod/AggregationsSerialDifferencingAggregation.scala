package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsSerialDifferencingAggregation
  extends StObject
     with AggregationsPipelineAggregationBase {
  
  var lag: js.UndefOr[integer] = js.undefined
}
object AggregationsSerialDifferencingAggregation {
  
  inline def apply(): AggregationsSerialDifferencingAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationsSerialDifferencingAggregation]
  }
  
  extension [Self <: AggregationsSerialDifferencingAggregation](x: Self) {
    
    inline def setLag(value: integer): Self = StObject.set(x, "lag", value.asInstanceOf[js.Any])
    
    inline def setLagUndefined: Self = StObject.set(x, "lag", js.undefined)
  }
}
