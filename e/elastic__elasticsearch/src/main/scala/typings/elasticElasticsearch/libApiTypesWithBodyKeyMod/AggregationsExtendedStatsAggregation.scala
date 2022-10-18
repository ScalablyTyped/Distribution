package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsExtendedStatsAggregation
  extends StObject
     with AggregationsFormatMetricAggregationBase {
  
  var sigma: js.UndefOr[double] = js.undefined
}
object AggregationsExtendedStatsAggregation {
  
  inline def apply(): AggregationsExtendedStatsAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationsExtendedStatsAggregation]
  }
  
  extension [Self <: AggregationsExtendedStatsAggregation](x: Self) {
    
    inline def setSigma(value: double): Self = StObject.set(x, "sigma", value.asInstanceOf[js.Any])
    
    inline def setSigmaUndefined: Self = StObject.set(x, "sigma", js.undefined)
  }
}
