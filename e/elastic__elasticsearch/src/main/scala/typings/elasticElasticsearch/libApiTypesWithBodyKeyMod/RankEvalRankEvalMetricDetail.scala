package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RankEvalRankEvalMetricDetail extends StObject {
  
  var hits: js.Array[RankEvalRankEvalHitItem]
  
  var metric_details: Record[String, Record[String, Any]]
  
  var metric_score: double
  
  var unrated_docs: js.Array[RankEvalUnratedDocument]
}
object RankEvalRankEvalMetricDetail {
  
  inline def apply(
    hits: js.Array[RankEvalRankEvalHitItem],
    metric_details: Record[String, Record[String, Any]],
    metric_score: double,
    unrated_docs: js.Array[RankEvalUnratedDocument]
  ): RankEvalRankEvalMetricDetail = {
    val __obj = js.Dynamic.literal(hits = hits.asInstanceOf[js.Any], metric_details = metric_details.asInstanceOf[js.Any], metric_score = metric_score.asInstanceOf[js.Any], unrated_docs = unrated_docs.asInstanceOf[js.Any])
    __obj.asInstanceOf[RankEvalRankEvalMetricDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RankEvalRankEvalMetricDetail] (val x: Self) extends AnyVal {
    
    inline def setHits(value: js.Array[RankEvalRankEvalHitItem]): Self = StObject.set(x, "hits", value.asInstanceOf[js.Any])
    
    inline def setHitsVarargs(value: RankEvalRankEvalHitItem*): Self = StObject.set(x, "hits", js.Array(value*))
    
    inline def setMetric_details(value: Record[String, Record[String, Any]]): Self = StObject.set(x, "metric_details", value.asInstanceOf[js.Any])
    
    inline def setMetric_score(value: double): Self = StObject.set(x, "metric_score", value.asInstanceOf[js.Any])
    
    inline def setUnrated_docs(value: js.Array[RankEvalUnratedDocument]): Self = StObject.set(x, "unrated_docs", value.asInstanceOf[js.Any])
    
    inline def setUnrated_docsVarargs(value: RankEvalUnratedDocument*): Self = StObject.set(x, "unrated_docs", js.Array(value*))
  }
}
