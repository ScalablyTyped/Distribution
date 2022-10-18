package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchCompletionSuggestOption[TDocument] extends StObject {
  
  var _id: js.UndefOr[String] = js.undefined
  
  var _index: js.UndefOr[IndexName] = js.undefined
  
  var _routing: js.UndefOr[Routing] = js.undefined
  
  var _score: js.UndefOr[double] = js.undefined
  
  var _source: js.UndefOr[TDocument] = js.undefined
  
  var collate_match: js.UndefOr[Boolean] = js.undefined
  
  var contexts: js.UndefOr[Record[String, js.Array[SearchContext]]] = js.undefined
  
  var fields: js.UndefOr[Record[String, Any]] = js.undefined
  
  var score: js.UndefOr[double] = js.undefined
  
  var text: String
}
object SearchCompletionSuggestOption {
  
  inline def apply[TDocument](text: String): SearchCompletionSuggestOption[TDocument] = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchCompletionSuggestOption[TDocument]]
  }
  
  extension [Self <: SearchCompletionSuggestOption[?], TDocument](x: Self & SearchCompletionSuggestOption[TDocument]) {
    
    inline def setCollate_match(value: Boolean): Self = StObject.set(x, "collate_match", value.asInstanceOf[js.Any])
    
    inline def setCollate_matchUndefined: Self = StObject.set(x, "collate_match", js.undefined)
    
    inline def setContexts(value: Record[String, js.Array[SearchContext]]): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
    
    inline def setContextsUndefined: Self = StObject.set(x, "contexts", js.undefined)
    
    inline def setFields(value: Record[String, Any]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setScore(value: double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def set_id(value: String): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    
    inline def set_idUndefined: Self = StObject.set(x, "_id", js.undefined)
    
    inline def set_index(value: IndexName): Self = StObject.set(x, "_index", value.asInstanceOf[js.Any])
    
    inline def set_indexUndefined: Self = StObject.set(x, "_index", js.undefined)
    
    inline def set_routing(value: Routing): Self = StObject.set(x, "_routing", value.asInstanceOf[js.Any])
    
    inline def set_routingUndefined: Self = StObject.set(x, "_routing", js.undefined)
    
    inline def set_score(value: double): Self = StObject.set(x, "_score", value.asInstanceOf[js.Any])
    
    inline def set_scoreUndefined: Self = StObject.set(x, "_score", js.undefined)
    
    inline def set_source(value: TDocument): Self = StObject.set(x, "_source", value.asInstanceOf[js.Any])
    
    inline def set_sourceUndefined: Self = StObject.set(x, "_source", js.undefined)
  }
}
