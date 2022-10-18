package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.holt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsHoltMovingAverageAggregation
  extends StObject
     with AggregationsMovingAverageAggregationBase
     with AggregationsMovingAverageAggregation {
  
  var model: holt
  
  var settings: AggregationsHoltLinearModelSettings
}
object AggregationsHoltMovingAverageAggregation {
  
  inline def apply(settings: AggregationsHoltLinearModelSettings): AggregationsHoltMovingAverageAggregation = {
    val __obj = js.Dynamic.literal(model = "holt", settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsHoltMovingAverageAggregation]
  }
  
  extension [Self <: AggregationsHoltMovingAverageAggregation](x: Self) {
    
    inline def setModel(value: holt): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setSettings(value: AggregationsHoltLinearModelSettings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
  }
}
