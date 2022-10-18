package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchFieldSuggester extends StObject {
  
  var completion: js.UndefOr[SearchCompletionSuggester] = js.undefined
  
  var phrase: js.UndefOr[SearchPhraseSuggester] = js.undefined
  
  var prefix: js.UndefOr[String] = js.undefined
  
  var regex: js.UndefOr[String] = js.undefined
  
  var term: js.UndefOr[SearchTermSuggester] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
}
object SearchFieldSuggester {
  
  inline def apply(): SearchFieldSuggester = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchFieldSuggester]
  }
  
  extension [Self <: SearchFieldSuggester](x: Self) {
    
    inline def setCompletion(value: SearchCompletionSuggester): Self = StObject.set(x, "completion", value.asInstanceOf[js.Any])
    
    inline def setCompletionUndefined: Self = StObject.set(x, "completion", js.undefined)
    
    inline def setPhrase(value: SearchPhraseSuggester): Self = StObject.set(x, "phrase", value.asInstanceOf[js.Any])
    
    inline def setPhraseUndefined: Self = StObject.set(x, "phrase", js.undefined)
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setRegex(value: String): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
    
    inline def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
    
    inline def setTerm(value: SearchTermSuggester): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
    
    inline def setTermUndefined: Self = StObject.set(x, "term", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
