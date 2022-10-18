package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.elasticElasticsearch.libApiTypesMod.SearchCompletionSuggest[TDocument]
  - typings.elasticElasticsearch.libApiTypesMod.SearchPhraseSuggest
  - typings.elasticElasticsearch.libApiTypesMod.SearchTermSuggest
*/
trait SearchSuggest[TDocument] extends StObject
object SearchSuggest {
  
  inline def SearchCompletionSuggest[TDocument](
    length: integer,
    offset: integer,
    options: SearchCompletionSuggestOption[TDocument] | js.Array[SearchCompletionSuggestOption[TDocument]],
    text: String
  ): typings.elasticElasticsearch.libApiTypesMod.SearchCompletionSuggest[TDocument] = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.SearchCompletionSuggest[TDocument]]
  }
  
  inline def SearchPhraseSuggest(
    length: integer,
    offset: integer,
    options: SearchPhraseSuggestOption | js.Array[SearchPhraseSuggestOption],
    text: String
  ): typings.elasticElasticsearch.libApiTypesMod.SearchPhraseSuggest = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.SearchPhraseSuggest]
  }
  
  inline def SearchTermSuggest(
    length: integer,
    offset: integer,
    options: SearchTermSuggestOption | js.Array[SearchTermSuggestOption],
    text: String
  ): typings.elasticElasticsearch.libApiTypesMod.SearchTermSuggest = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.SearchTermSuggest]
  }
}
