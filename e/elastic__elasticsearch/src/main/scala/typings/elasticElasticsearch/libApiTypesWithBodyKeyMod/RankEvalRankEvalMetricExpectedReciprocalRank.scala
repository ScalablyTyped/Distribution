package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RankEvalRankEvalMetricExpectedReciprocalRank
  extends StObject
     with RankEvalRankEvalMetricBase {
  
  var maximum_relevance: integer
}
object RankEvalRankEvalMetricExpectedReciprocalRank {
  
  inline def apply(maximum_relevance: integer): RankEvalRankEvalMetricExpectedReciprocalRank = {
    val __obj = js.Dynamic.literal(maximum_relevance = maximum_relevance.asInstanceOf[js.Any])
    __obj.asInstanceOf[RankEvalRankEvalMetricExpectedReciprocalRank]
  }
  
  extension [Self <: RankEvalRankEvalMetricExpectedReciprocalRank](x: Self) {
    
    inline def setMaximum_relevance(value: integer): Self = StObject.set(x, "maximum_relevance", value.asInstanceOf[js.Any])
  }
}
