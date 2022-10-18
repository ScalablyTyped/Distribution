package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RankEvalRankEvalMetricRatingTreshold
  extends StObject
     with RankEvalRankEvalMetricBase {
  
  var relevant_rating_threshold: js.UndefOr[integer] = js.undefined
}
object RankEvalRankEvalMetricRatingTreshold {
  
  inline def apply(): RankEvalRankEvalMetricRatingTreshold = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RankEvalRankEvalMetricRatingTreshold]
  }
  
  extension [Self <: RankEvalRankEvalMetricRatingTreshold](x: Self) {
    
    inline def setRelevant_rating_threshold(value: integer): Self = StObject.set(x, "relevant_rating_threshold", value.asInstanceOf[js.Any])
    
    inline def setRelevant_rating_thresholdUndefined: Self = StObject.set(x, "relevant_rating_threshold", js.undefined)
  }
}
