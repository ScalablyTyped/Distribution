package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.linear
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsLinearMovingAverageAggregation
  extends StObject
     with AggregationsMovingAverageAggregationBase
     with AggregationsMovingAverageAggregation {
  
  var model: linear
  
  var settings: EmptyObject
}
object AggregationsLinearMovingAverageAggregation {
  
  inline def apply(settings: EmptyObject): AggregationsLinearMovingAverageAggregation = {
    val __obj = js.Dynamic.literal(model = "linear", settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsLinearMovingAverageAggregation]
  }
  
  extension [Self <: AggregationsLinearMovingAverageAggregation](x: Self) {
    
    inline def setModel(value: linear): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setSettings(value: EmptyObject): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
  }
}
