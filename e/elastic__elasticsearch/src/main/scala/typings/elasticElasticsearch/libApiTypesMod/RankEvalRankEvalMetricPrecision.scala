package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RankEvalRankEvalMetricPrecision
  extends StObject
     with RankEvalRankEvalMetricRatingTreshold {
  
  var ignore_unlabeled: js.UndefOr[Boolean] = js.undefined
}
object RankEvalRankEvalMetricPrecision {
  
  inline def apply(): RankEvalRankEvalMetricPrecision = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RankEvalRankEvalMetricPrecision]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RankEvalRankEvalMetricPrecision] (val x: Self) extends AnyVal {
    
    inline def setIgnore_unlabeled(value: Boolean): Self = StObject.set(x, "ignore_unlabeled", value.asInstanceOf[js.Any])
    
    inline def setIgnore_unlabeledUndefined: Self = StObject.set(x, "ignore_unlabeled", js.undefined)
  }
}
