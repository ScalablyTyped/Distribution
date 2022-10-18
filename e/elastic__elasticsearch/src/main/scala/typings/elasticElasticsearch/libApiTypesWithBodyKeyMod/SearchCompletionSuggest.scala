package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchCompletionSuggest[TDocument]
  extends StObject
     with SearchSuggestBase
     with SearchSuggest[TDocument] {
  
  var options: SearchCompletionSuggestOption[TDocument] | js.Array[SearchCompletionSuggestOption[TDocument]]
}
object SearchCompletionSuggest {
  
  inline def apply[TDocument](
    length: integer,
    offset: integer,
    options: SearchCompletionSuggestOption[TDocument] | js.Array[SearchCompletionSuggestOption[TDocument]],
    text: String
  ): SearchCompletionSuggest[TDocument] = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchCompletionSuggest[TDocument]]
  }
  
  extension [Self <: SearchCompletionSuggest[?], TDocument](x: Self & SearchCompletionSuggest[TDocument]) {
    
    inline def setOptions(
      value: SearchCompletionSuggestOption[TDocument] | js.Array[SearchCompletionSuggestOption[TDocument]]
    ): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsVarargs(value: SearchCompletionSuggestOption[TDocument]*): Self = StObject.set(x, "options", js.Array(value*))
  }
}
