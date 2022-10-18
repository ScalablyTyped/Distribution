package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RankEvalRankEvalRequestItem extends StObject {
  
  var id: Id
  
  var params: js.UndefOr[Record[String, Any]] = js.undefined
  
  var ratings: js.Array[RankEvalDocumentRating]
  
  var request: js.UndefOr[RankEvalRankEvalQuery] = js.undefined
  
  var template_id: js.UndefOr[Id] = js.undefined
}
object RankEvalRankEvalRequestItem {
  
  inline def apply(id: Id, ratings: js.Array[RankEvalDocumentRating]): RankEvalRankEvalRequestItem = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ratings = ratings.asInstanceOf[js.Any])
    __obj.asInstanceOf[RankEvalRankEvalRequestItem]
  }
  
  extension [Self <: RankEvalRankEvalRequestItem](x: Self) {
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setParams(value: Record[String, Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setRatings(value: js.Array[RankEvalDocumentRating]): Self = StObject.set(x, "ratings", value.asInstanceOf[js.Any])
    
    inline def setRatingsVarargs(value: RankEvalDocumentRating*): Self = StObject.set(x, "ratings", js.Array(value*))
    
    inline def setRequest(value: RankEvalRankEvalQuery): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setTemplate_id(value: Id): Self = StObject.set(x, "template_id", value.asInstanceOf[js.Any])
    
    inline def setTemplate_idUndefined: Self = StObject.set(x, "template_id", js.undefined)
  }
}
