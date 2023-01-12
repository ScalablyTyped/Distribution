package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RankEvalResponse extends StObject {
  
  var details: Record[Id, RankEvalRankEvalMetricDetail]
  
  var failures: Record[String, Any]
  
  var metric_score: double
}
object RankEvalResponse {
  
  inline def apply(
    details: Record[Id, RankEvalRankEvalMetricDetail],
    failures: Record[String, Any],
    metric_score: double
  ): RankEvalResponse = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], failures = failures.asInstanceOf[js.Any], metric_score = metric_score.asInstanceOf[js.Any])
    __obj.asInstanceOf[RankEvalResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RankEvalResponse] (val x: Self) extends AnyVal {
    
    inline def setDetails(value: Record[Id, RankEvalRankEvalMetricDetail]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setFailures(value: Record[String, Any]): Self = StObject.set(x, "failures", value.asInstanceOf[js.Any])
    
    inline def setMetric_score(value: double): Self = StObject.set(x, "metric_score", value.asInstanceOf[js.Any])
  }
}
