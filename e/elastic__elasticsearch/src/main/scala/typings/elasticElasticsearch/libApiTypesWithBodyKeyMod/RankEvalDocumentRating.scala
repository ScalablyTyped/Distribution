package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RankEvalDocumentRating extends StObject {
  
  var _id: Id
  
  var _index: IndexName
  
  var rating: integer
}
object RankEvalDocumentRating {
  
  inline def apply(_id: Id, _index: IndexName, rating: integer): RankEvalDocumentRating = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _index = _index.asInstanceOf[js.Any], rating = rating.asInstanceOf[js.Any])
    __obj.asInstanceOf[RankEvalDocumentRating]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RankEvalDocumentRating] (val x: Self) extends AnyVal {
    
    inline def setRating(value: integer): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
    
    inline def set_id(value: Id): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    
    inline def set_index(value: IndexName): Self = StObject.set(x, "_index", value.asInstanceOf[js.Any])
  }
}
