package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RankEvalRankEvalMetricBase extends StObject {
  
  var k: js.UndefOr[integer] = js.undefined
}
object RankEvalRankEvalMetricBase {
  
  inline def apply(): RankEvalRankEvalMetricBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RankEvalRankEvalMetricBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RankEvalRankEvalMetricBase] (val x: Self) extends AnyVal {
    
    inline def setK(value: integer): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
    
    inline def setKUndefined: Self = StObject.set(x, "k", js.undefined)
  }
}
