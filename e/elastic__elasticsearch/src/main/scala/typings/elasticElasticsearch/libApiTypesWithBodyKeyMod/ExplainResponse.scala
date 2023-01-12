package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExplainResponse[TDocument] extends StObject {
  
  var _id: Id
  
  var _index: IndexName
  
  var explanation: js.UndefOr[ExplainExplanationDetail] = js.undefined
  
  var get: js.UndefOr[InlineGet[TDocument]] = js.undefined
  
  var matched: Boolean
}
object ExplainResponse {
  
  inline def apply[TDocument](_id: Id, _index: IndexName, matched: Boolean): ExplainResponse[TDocument] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _index = _index.asInstanceOf[js.Any], matched = matched.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExplainResponse[TDocument]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExplainResponse[?], TDocument] (val x: Self & ExplainResponse[TDocument]) extends AnyVal {
    
    inline def setExplanation(value: ExplainExplanationDetail): Self = StObject.set(x, "explanation", value.asInstanceOf[js.Any])
    
    inline def setExplanationUndefined: Self = StObject.set(x, "explanation", js.undefined)
    
    inline def setGet(value: InlineGet[TDocument]): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
    
    inline def setMatched(value: Boolean): Self = StObject.set(x, "matched", value.asInstanceOf[js.Any])
    
    inline def set_id(value: Id): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    
    inline def set_index(value: IndexName): Self = StObject.set(x, "_index", value.asInstanceOf[js.Any])
  }
}
