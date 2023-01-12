package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RankEvalRankEvalMetricDiscountedCumulativeGain
  extends StObject
     with RankEvalRankEvalMetricBase {
  
  var normalize: js.UndefOr[Boolean] = js.undefined
}
object RankEvalRankEvalMetricDiscountedCumulativeGain {
  
  inline def apply(): RankEvalRankEvalMetricDiscountedCumulativeGain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RankEvalRankEvalMetricDiscountedCumulativeGain]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RankEvalRankEvalMetricDiscountedCumulativeGain] (val x: Self) extends AnyVal {
    
    inline def setNormalize(value: Boolean): Self = StObject.set(x, "normalize", value.asInstanceOf[js.Any])
    
    inline def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
  }
}
