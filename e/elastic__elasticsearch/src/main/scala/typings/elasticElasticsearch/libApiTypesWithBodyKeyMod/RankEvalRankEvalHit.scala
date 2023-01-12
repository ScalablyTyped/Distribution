package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RankEvalRankEvalHit extends StObject {
  
  var _id: Id
  
  var _index: IndexName
  
  var _score: double
}
object RankEvalRankEvalHit {
  
  inline def apply(_id: Id, _index: IndexName, _score: double): RankEvalRankEvalHit = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _index = _index.asInstanceOf[js.Any], _score = _score.asInstanceOf[js.Any])
    __obj.asInstanceOf[RankEvalRankEvalHit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RankEvalRankEvalHit] (val x: Self) extends AnyVal {
    
    inline def set_id(value: Id): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    
    inline def set_index(value: IndexName): Self = StObject.set(x, "_index", value.asInstanceOf[js.Any])
    
    inline def set_score(value: double): Self = StObject.set(x, "_score", value.asInstanceOf[js.Any])
  }
}
