package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.simple
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsSimpleMovingAverageAggregation
  extends StObject
     with AggregationsMovingAverageAggregationBase
     with AggregationsMovingAverageAggregation {
  
  var model: simple
  
  var settings: EmptyObject
}
object AggregationsSimpleMovingAverageAggregation {
  
  inline def apply(settings: EmptyObject): AggregationsSimpleMovingAverageAggregation = {
    val __obj = js.Dynamic.literal(model = "simple", settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsSimpleMovingAverageAggregation]
  }
  
  extension [Self <: AggregationsSimpleMovingAverageAggregation](x: Self) {
    
    inline def setModel(value: simple): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setSettings(value: EmptyObject): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
  }
}
