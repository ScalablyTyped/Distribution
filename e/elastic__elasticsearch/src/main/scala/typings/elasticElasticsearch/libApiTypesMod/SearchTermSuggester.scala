package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchTermSuggester
  extends StObject
     with SearchSuggesterBase {
  
  var lowercase_terms: js.UndefOr[Boolean] = js.undefined
  
  var max_edits: js.UndefOr[integer] = js.undefined
  
  var max_inspections: js.UndefOr[integer] = js.undefined
  
  var max_term_freq: js.UndefOr[float] = js.undefined
  
  var min_doc_freq: js.UndefOr[float] = js.undefined
  
  var min_word_length: js.UndefOr[integer] = js.undefined
  
  var prefix_length: js.UndefOr[integer] = js.undefined
  
  var shard_size: js.UndefOr[integer] = js.undefined
  
  var sort: js.UndefOr[SearchSuggestSort] = js.undefined
  
  var string_distance: js.UndefOr[SearchStringDistance] = js.undefined
  
  var suggest_mode: js.UndefOr[SuggestMode] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
}
object SearchTermSuggester {
  
  inline def apply(field: Field): SearchTermSuggester = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchTermSuggester]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchTermSuggester] (val x: Self) extends AnyVal {
    
    inline def setLowercase_terms(value: Boolean): Self = StObject.set(x, "lowercase_terms", value.asInstanceOf[js.Any])
    
    inline def setLowercase_termsUndefined: Self = StObject.set(x, "lowercase_terms", js.undefined)
    
    inline def setMax_edits(value: integer): Self = StObject.set(x, "max_edits", value.asInstanceOf[js.Any])
    
    inline def setMax_editsUndefined: Self = StObject.set(x, "max_edits", js.undefined)
    
    inline def setMax_inspections(value: integer): Self = StObject.set(x, "max_inspections", value.asInstanceOf[js.Any])
    
    inline def setMax_inspectionsUndefined: Self = StObject.set(x, "max_inspections", js.undefined)
    
    inline def setMax_term_freq(value: float): Self = StObject.set(x, "max_term_freq", value.asInstanceOf[js.Any])
    
    inline def setMax_term_freqUndefined: Self = StObject.set(x, "max_term_freq", js.undefined)
    
    inline def setMin_doc_freq(value: float): Self = StObject.set(x, "min_doc_freq", value.asInstanceOf[js.Any])
    
    inline def setMin_doc_freqUndefined: Self = StObject.set(x, "min_doc_freq", js.undefined)
    
    inline def setMin_word_length(value: integer): Self = StObject.set(x, "min_word_length", value.asInstanceOf[js.Any])
    
    inline def setMin_word_lengthUndefined: Self = StObject.set(x, "min_word_length", js.undefined)
    
    inline def setPrefix_length(value: integer): Self = StObject.set(x, "prefix_length", value.asInstanceOf[js.Any])
    
    inline def setPrefix_lengthUndefined: Self = StObject.set(x, "prefix_length", js.undefined)
    
    inline def setShard_size(value: integer): Self = StObject.set(x, "shard_size", value.asInstanceOf[js.Any])
    
    inline def setShard_sizeUndefined: Self = StObject.set(x, "shard_size", js.undefined)
    
    inline def setSort(value: SearchSuggestSort): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setString_distance(value: SearchStringDistance): Self = StObject.set(x, "string_distance", value.asInstanceOf[js.Any])
    
    inline def setString_distanceUndefined: Self = StObject.set(x, "string_distance", js.undefined)
    
    inline def setSuggest_mode(value: SuggestMode): Self = StObject.set(x, "suggest_mode", value.asInstanceOf[js.Any])
    
    inline def setSuggest_modeUndefined: Self = StObject.set(x, "suggest_mode", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
