package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RankEvalUnratedDocument extends StObject {
  
  var _id: Id
  
  var _index: IndexName
}
object RankEvalUnratedDocument {
  
  inline def apply(_id: Id, _index: IndexName): RankEvalUnratedDocument = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _index = _index.asInstanceOf[js.Any])
    __obj.asInstanceOf[RankEvalUnratedDocument]
  }
  
  extension [Self <: RankEvalUnratedDocument](x: Self) {
    
    inline def set_id(value: Id): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    
    inline def set_index(value: IndexName): Self = StObject.set(x, "_index", value.asInstanceOf[js.Any])
  }
}
