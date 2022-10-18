package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RankEvalRankEvalMetric extends StObject {
  
  var dcg: js.UndefOr[RankEvalRankEvalMetricDiscountedCumulativeGain] = js.undefined
  
  var expected_reciprocal_rank: js.UndefOr[RankEvalRankEvalMetricExpectedReciprocalRank] = js.undefined
  
  var mean_reciprocal_rank: js.UndefOr[RankEvalRankEvalMetricMeanReciprocalRank] = js.undefined
  
  var precision: js.UndefOr[RankEvalRankEvalMetricPrecision] = js.undefined
  
  var recall: js.UndefOr[RankEvalRankEvalMetricRecall] = js.undefined
}
object RankEvalRankEvalMetric {
  
  inline def apply(): RankEvalRankEvalMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RankEvalRankEvalMetric]
  }
  
  extension [Self <: RankEvalRankEvalMetric](x: Self) {
    
    inline def setDcg(value: RankEvalRankEvalMetricDiscountedCumulativeGain): Self = StObject.set(x, "dcg", value.asInstanceOf[js.Any])
    
    inline def setDcgUndefined: Self = StObject.set(x, "dcg", js.undefined)
    
    inline def setExpected_reciprocal_rank(value: RankEvalRankEvalMetricExpectedReciprocalRank): Self = StObject.set(x, "expected_reciprocal_rank", value.asInstanceOf[js.Any])
    
    inline def setExpected_reciprocal_rankUndefined: Self = StObject.set(x, "expected_reciprocal_rank", js.undefined)
    
    inline def setMean_reciprocal_rank(value: RankEvalRankEvalMetricMeanReciprocalRank): Self = StObject.set(x, "mean_reciprocal_rank", value.asInstanceOf[js.Any])
    
    inline def setMean_reciprocal_rankUndefined: Self = StObject.set(x, "mean_reciprocal_rank", js.undefined)
    
    inline def setPrecision(value: RankEvalRankEvalMetricPrecision): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    inline def setRecall(value: RankEvalRankEvalMetricRecall): Self = StObject.set(x, "recall", value.asInstanceOf[js.Any])
    
    inline def setRecallUndefined: Self = StObject.set(x, "recall", js.undefined)
  }
}
