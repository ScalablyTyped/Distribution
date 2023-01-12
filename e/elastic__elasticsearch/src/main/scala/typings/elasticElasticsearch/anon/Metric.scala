package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.RankEvalRankEvalMetric
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.RankEvalRankEvalRequestItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Metric extends StObject {
  
  var metric: js.UndefOr[RankEvalRankEvalMetric] = js.undefined
  
  var requests: js.Array[RankEvalRankEvalRequestItem]
}
object Metric {
  
  inline def apply(requests: js.Array[RankEvalRankEvalRequestItem]): Metric = {
    val __obj = js.Dynamic.literal(requests = requests.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metric]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Metric] (val x: Self) extends AnyVal {
    
    inline def setMetric(value: RankEvalRankEvalMetric): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    inline def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
    
    inline def setRequests(value: js.Array[RankEvalRankEvalRequestItem]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    inline def setRequestsVarargs(value: RankEvalRankEvalRequestItem*): Self = StObject.set(x, "requests", js.Array(value*))
  }
}
