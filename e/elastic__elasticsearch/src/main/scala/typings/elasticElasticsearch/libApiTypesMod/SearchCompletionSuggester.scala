package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchCompletionSuggester
  extends StObject
     with SearchSuggesterBase {
  
  var contexts: js.UndefOr[
    Record[
      Field, 
      SearchCompletionContext | SearchContext | (js.Array[SearchCompletionContext | SearchContext])
    ]
  ] = js.undefined
  
  var fuzzy: js.UndefOr[SearchSuggestFuzziness] = js.undefined
  
  var prefix: js.UndefOr[String] = js.undefined
  
  var regex: js.UndefOr[String] = js.undefined
  
  var skip_duplicates: js.UndefOr[Boolean] = js.undefined
}
object SearchCompletionSuggester {
  
  inline def apply(field: Field): SearchCompletionSuggester = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchCompletionSuggester]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchCompletionSuggester] (val x: Self) extends AnyVal {
    
    inline def setContexts(
      value: Record[
          Field, 
          SearchCompletionContext | SearchContext | (js.Array[SearchCompletionContext | SearchContext])
        ]
    ): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
    
    inline def setContextsUndefined: Self = StObject.set(x, "contexts", js.undefined)
    
    inline def setFuzzy(value: SearchSuggestFuzziness): Self = StObject.set(x, "fuzzy", value.asInstanceOf[js.Any])
    
    inline def setFuzzyUndefined: Self = StObject.set(x, "fuzzy", js.undefined)
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setRegex(value: String): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
    
    inline def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
    
    inline def setSkip_duplicates(value: Boolean): Self = StObject.set(x, "skip_duplicates", value.asInstanceOf[js.Any])
    
    inline def setSkip_duplicatesUndefined: Self = StObject.set(x, "skip_duplicates", js.undefined)
  }
}
