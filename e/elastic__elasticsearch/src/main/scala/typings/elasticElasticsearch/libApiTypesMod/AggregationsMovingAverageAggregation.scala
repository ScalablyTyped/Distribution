package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.elasticElasticsearch.libApiTypesMod.AggregationsLinearMovingAverageAggregation
  - typings.elasticElasticsearch.libApiTypesMod.AggregationsSimpleMovingAverageAggregation
  - typings.elasticElasticsearch.libApiTypesMod.AggregationsEwmaMovingAverageAggregation
  - typings.elasticElasticsearch.libApiTypesMod.AggregationsHoltMovingAverageAggregation
  - typings.elasticElasticsearch.libApiTypesMod.AggregationsHoltWintersMovingAverageAggregation
*/
trait AggregationsMovingAverageAggregation extends StObject
object AggregationsMovingAverageAggregation {
  
  inline def AggregationsEwmaMovingAverageAggregation(settings: AggregationsEwmaModelSettings): typings.elasticElasticsearch.libApiTypesMod.AggregationsEwmaMovingAverageAggregation = {
    val __obj = js.Dynamic.literal(model = "ewma", settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AggregationsEwmaMovingAverageAggregation]
  }
  
  inline def AggregationsHoltMovingAverageAggregation(settings: AggregationsHoltLinearModelSettings): typings.elasticElasticsearch.libApiTypesMod.AggregationsHoltMovingAverageAggregation = {
    val __obj = js.Dynamic.literal(model = "holt", settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AggregationsHoltMovingAverageAggregation]
  }
  
  inline def AggregationsHoltWintersMovingAverageAggregation(settings: AggregationsHoltWintersModelSettings): typings.elasticElasticsearch.libApiTypesMod.AggregationsHoltWintersMovingAverageAggregation = {
    val __obj = js.Dynamic.literal(model = "holt_winters", settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AggregationsHoltWintersMovingAverageAggregation]
  }
  
  inline def AggregationsLinearMovingAverageAggregation(settings: EmptyObject): typings.elasticElasticsearch.libApiTypesMod.AggregationsLinearMovingAverageAggregation = {
    val __obj = js.Dynamic.literal(model = "linear", settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AggregationsLinearMovingAverageAggregation]
  }
  
  inline def AggregationsSimpleMovingAverageAggregation(settings: EmptyObject): typings.elasticElasticsearch.libApiTypesMod.AggregationsSimpleMovingAverageAggregation = {
    val __obj = js.Dynamic.literal(model = "simple", settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AggregationsSimpleMovingAverageAggregation]
  }
}
