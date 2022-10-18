package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchPhraseSuggest
  extends StObject
     with SearchSuggestBase
     with SearchSuggest[Any] {
  
  var options: SearchPhraseSuggestOption | js.Array[SearchPhraseSuggestOption]
}
object SearchPhraseSuggest {
  
  inline def apply(
    length: integer,
    offset: integer,
    options: SearchPhraseSuggestOption | js.Array[SearchPhraseSuggestOption],
    text: String
  ): SearchPhraseSuggest = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchPhraseSuggest]
  }
  
  extension [Self <: SearchPhraseSuggest](x: Self) {
    
    inline def setOptions(value: SearchPhraseSuggestOption | js.Array[SearchPhraseSuggestOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsVarargs(value: SearchPhraseSuggestOption*): Self = StObject.set(x, "options", js.Array(value*))
  }
}
