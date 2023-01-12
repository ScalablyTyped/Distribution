package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RankEvalRankEvalHitItem extends StObject {
  
  var hit: RankEvalRankEvalHit
  
  var rating: js.UndefOr[double | Null] = js.undefined
}
object RankEvalRankEvalHitItem {
  
  inline def apply(hit: RankEvalRankEvalHit): RankEvalRankEvalHitItem = {
    val __obj = js.Dynamic.literal(hit = hit.asInstanceOf[js.Any])
    __obj.asInstanceOf[RankEvalRankEvalHitItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RankEvalRankEvalHitItem] (val x: Self) extends AnyVal {
    
    inline def setHit(value: RankEvalRankEvalHit): Self = StObject.set(x, "hit", value.asInstanceOf[js.Any])
    
    inline def setRating(value: double): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
    
    inline def setRatingNull: Self = StObject.set(x, "rating", null)
    
    inline def setRatingUndefined: Self = StObject.set(x, "rating", js.undefined)
  }
}
