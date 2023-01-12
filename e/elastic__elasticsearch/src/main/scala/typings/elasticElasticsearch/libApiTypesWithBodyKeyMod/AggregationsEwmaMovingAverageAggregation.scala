package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.ewma
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsEwmaMovingAverageAggregation
  extends StObject
     with AggregationsMovingAverageAggregationBase
     with AggregationsMovingAverageAggregation {
  
  var model: ewma
  
  var settings: AggregationsEwmaModelSettings
}
object AggregationsEwmaMovingAverageAggregation {
  
  inline def apply(settings: AggregationsEwmaModelSettings): AggregationsEwmaMovingAverageAggregation = {
    val __obj = js.Dynamic.literal(model = "ewma", settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsEwmaMovingAverageAggregation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsEwmaMovingAverageAggregation] (val x: Self) extends AnyVal {
    
    inline def setModel(value: ewma): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setSettings(value: AggregationsEwmaModelSettings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
  }
}
