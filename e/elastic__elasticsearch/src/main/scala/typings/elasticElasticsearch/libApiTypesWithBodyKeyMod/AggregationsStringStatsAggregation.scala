package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsStringStatsAggregation
  extends StObject
     with AggregationsMetricAggregationBase {
  
  var show_distribution: js.UndefOr[Boolean] = js.undefined
}
object AggregationsStringStatsAggregation {
  
  inline def apply(): AggregationsStringStatsAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationsStringStatsAggregation]
  }
  
  extension [Self <: AggregationsStringStatsAggregation](x: Self) {
    
    inline def setShow_distribution(value: Boolean): Self = StObject.set(x, "show_distribution", value.asInstanceOf[js.Any])
    
    inline def setShow_distributionUndefined: Self = StObject.set(x, "show_distribution", js.undefined)
  }
}
