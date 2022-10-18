package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchDirectGenerator extends StObject {
  
  var field: Field
  
  var max_edits: js.UndefOr[integer] = js.undefined
  
  var max_inspections: js.UndefOr[float] = js.undefined
  
  var max_term_freq: js.UndefOr[float] = js.undefined
  
  var min_doc_freq: js.UndefOr[float] = js.undefined
  
  var min_word_length: js.UndefOr[integer] = js.undefined
  
  var post_filter: js.UndefOr[String] = js.undefined
  
  var pre_filter: js.UndefOr[String] = js.undefined
  
  var prefix_length: js.UndefOr[integer] = js.undefined
  
  var size: js.UndefOr[integer] = js.undefined
  
  var suggest_mode: js.UndefOr[SuggestMode] = js.undefined
}
object SearchDirectGenerator {
  
  inline def apply(field: Field): SearchDirectGenerator = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchDirectGenerator]
  }
  
  extension [Self <: SearchDirectGenerator](x: Self) {
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setMax_edits(value: integer): Self = StObject.set(x, "max_edits", value.asInstanceOf[js.Any])
    
    inline def setMax_editsUndefined: Self = StObject.set(x, "max_edits", js.undefined)
    
    inline def setMax_inspections(value: float): Self = StObject.set(x, "max_inspections", value.asInstanceOf[js.Any])
    
    inline def setMax_inspectionsUndefined: Self = StObject.set(x, "max_inspections", js.undefined)
    
    inline def setMax_term_freq(value: float): Self = StObject.set(x, "max_term_freq", value.asInstanceOf[js.Any])
    
    inline def setMax_term_freqUndefined: Self = StObject.set(x, "max_term_freq", js.undefined)
    
    inline def setMin_doc_freq(value: float): Self = StObject.set(x, "min_doc_freq", value.asInstanceOf[js.Any])
    
    inline def setMin_doc_freqUndefined: Self = StObject.set(x, "min_doc_freq", js.undefined)
    
    inline def setMin_word_length(value: integer): Self = StObject.set(x, "min_word_length", value.asInstanceOf[js.Any])
    
    inline def setMin_word_lengthUndefined: Self = StObject.set(x, "min_word_length", js.undefined)
    
    inline def setPost_filter(value: String): Self = StObject.set(x, "post_filter", value.asInstanceOf[js.Any])
    
    inline def setPost_filterUndefined: Self = StObject.set(x, "post_filter", js.undefined)
    
    inline def setPre_filter(value: String): Self = StObject.set(x, "pre_filter", value.asInstanceOf[js.Any])
    
    inline def setPre_filterUndefined: Self = StObject.set(x, "pre_filter", js.undefined)
    
    inline def setPrefix_length(value: integer): Self = StObject.set(x, "prefix_length", value.asInstanceOf[js.Any])
    
    inline def setPrefix_lengthUndefined: Self = StObject.set(x, "prefix_length", js.undefined)
    
    inline def setSize(value: integer): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSuggest_mode(value: SuggestMode): Self = StObject.set(x, "suggest_mode", value.asInstanceOf[js.Any])
    
    inline def setSuggest_modeUndefined: Self = StObject.set(x, "suggest_mode", js.undefined)
  }
}
