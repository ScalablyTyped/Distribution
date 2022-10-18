package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TermvectorsFilter extends StObject {
  
  var max_doc_freq: js.UndefOr[integer] = js.undefined
  
  var max_num_terms: js.UndefOr[integer] = js.undefined
  
  var max_term_freq: js.UndefOr[integer] = js.undefined
  
  var max_word_length: js.UndefOr[integer] = js.undefined
  
  var min_doc_freq: js.UndefOr[integer] = js.undefined
  
  var min_term_freq: js.UndefOr[integer] = js.undefined
  
  var min_word_length: js.UndefOr[integer] = js.undefined
}
object TermvectorsFilter {
  
  inline def apply(): TermvectorsFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TermvectorsFilter]
  }
  
  extension [Self <: TermvectorsFilter](x: Self) {
    
    inline def setMax_doc_freq(value: integer): Self = StObject.set(x, "max_doc_freq", value.asInstanceOf[js.Any])
    
    inline def setMax_doc_freqUndefined: Self = StObject.set(x, "max_doc_freq", js.undefined)
    
    inline def setMax_num_terms(value: integer): Self = StObject.set(x, "max_num_terms", value.asInstanceOf[js.Any])
    
    inline def setMax_num_termsUndefined: Self = StObject.set(x, "max_num_terms", js.undefined)
    
    inline def setMax_term_freq(value: integer): Self = StObject.set(x, "max_term_freq", value.asInstanceOf[js.Any])
    
    inline def setMax_term_freqUndefined: Self = StObject.set(x, "max_term_freq", js.undefined)
    
    inline def setMax_word_length(value: integer): Self = StObject.set(x, "max_word_length", value.asInstanceOf[js.Any])
    
    inline def setMax_word_lengthUndefined: Self = StObject.set(x, "max_word_length", js.undefined)
    
    inline def setMin_doc_freq(value: integer): Self = StObject.set(x, "min_doc_freq", value.asInstanceOf[js.Any])
    
    inline def setMin_doc_freqUndefined: Self = StObject.set(x, "min_doc_freq", js.undefined)
    
    inline def setMin_term_freq(value: integer): Self = StObject.set(x, "min_term_freq", value.asInstanceOf[js.Any])
    
    inline def setMin_term_freqUndefined: Self = StObject.set(x, "min_term_freq", js.undefined)
    
    inline def setMin_word_length(value: integer): Self = StObject.set(x, "min_word_length", value.asInstanceOf[js.Any])
    
    inline def setMin_word_lengthUndefined: Self = StObject.set(x, "min_word_length", js.undefined)
  }
}
