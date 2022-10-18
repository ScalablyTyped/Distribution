package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsLinearMovingAverageAggregation
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsSimpleMovingAverageAggregation
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsEwmaMovingAverageAggregation
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsHoltMovingAverageAggregation
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsHoltWintersMovingAverageAggregation
*/
trait AggregationsMovingAverageAggregation extends StObject
object AggregationsMovingAverageAggregation {
  
  inline def AggregationsEwmaMovingAverageAggregation(settings: AggregationsEwmaModelSettings): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsEwmaMovingAverageAggregation = {
    val __obj = js.Dynamic.literal(model = "ewma", settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsEwmaMovingAverageAggregation]
  }
  
  inline def AggregationsHoltMovingAverageAggregation(settings: AggregationsHoltLinearModelSettings): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsHoltMovingAverageAggregation = {
    val __obj = js.Dynamic.literal(model = "holt", settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsHoltMovingAverageAggregation]
  }
  
  inline def AggregationsHoltWintersMovingAverageAggregation(settings: AggregationsHoltWintersModelSettings): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsHoltWintersMovingAverageAggregation = {
    val __obj = js.Dynamic.literal(model = "holt_winters", settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsHoltWintersMovingAverageAggregation]
  }
  
  inline def AggregationsLinearMovingAverageAggregation(settings: EmptyObject): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsLinearMovingAverageAggregation = {
    val __obj = js.Dynamic.literal(model = "linear", settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsLinearMovingAverageAggregation]
  }
  
  inline def AggregationsSimpleMovingAverageAggregation(settings: EmptyObject): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsSimpleMovingAverageAggregation = {
    val __obj = js.Dynamic.literal(model = "simple", settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsSimpleMovingAverageAggregation]
  }
}
