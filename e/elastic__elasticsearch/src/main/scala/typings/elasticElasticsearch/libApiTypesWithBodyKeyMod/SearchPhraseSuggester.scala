package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchPhraseSuggester
  extends StObject
     with SearchSuggesterBase {
  
  var collate: js.UndefOr[SearchPhraseSuggestCollate] = js.undefined
  
  var confidence: js.UndefOr[double] = js.undefined
  
  var direct_generator: js.UndefOr[js.Array[SearchDirectGenerator]] = js.undefined
  
  var force_unigrams: js.UndefOr[Boolean] = js.undefined
  
  var gram_size: js.UndefOr[integer] = js.undefined
  
  var highlight: js.UndefOr[SearchPhraseSuggestHighlight] = js.undefined
  
  var max_errors: js.UndefOr[double] = js.undefined
  
  var real_word_error_likelihood: js.UndefOr[double] = js.undefined
  
  var separator: js.UndefOr[String] = js.undefined
  
  var shard_size: js.UndefOr[integer] = js.undefined
  
  var smoothing: js.UndefOr[SearchSmoothingModelContainer] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
  
  var token_limit: js.UndefOr[integer] = js.undefined
}
object SearchPhraseSuggester {
  
  inline def apply(field: Field): SearchPhraseSuggester = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchPhraseSuggester]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchPhraseSuggester] (val x: Self) extends AnyVal {
    
    inline def setCollate(value: SearchPhraseSuggestCollate): Self = StObject.set(x, "collate", value.asInstanceOf[js.Any])
    
    inline def setCollateUndefined: Self = StObject.set(x, "collate", js.undefined)
    
    inline def setConfidence(value: double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    inline def setDirect_generator(value: js.Array[SearchDirectGenerator]): Self = StObject.set(x, "direct_generator", value.asInstanceOf[js.Any])
    
    inline def setDirect_generatorUndefined: Self = StObject.set(x, "direct_generator", js.undefined)
    
    inline def setDirect_generatorVarargs(value: SearchDirectGenerator*): Self = StObject.set(x, "direct_generator", js.Array(value*))
    
    inline def setForce_unigrams(value: Boolean): Self = StObject.set(x, "force_unigrams", value.asInstanceOf[js.Any])
    
    inline def setForce_unigramsUndefined: Self = StObject.set(x, "force_unigrams", js.undefined)
    
    inline def setGram_size(value: integer): Self = StObject.set(x, "gram_size", value.asInstanceOf[js.Any])
    
    inline def setGram_sizeUndefined: Self = StObject.set(x, "gram_size", js.undefined)
    
    inline def setHighlight(value: SearchPhraseSuggestHighlight): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
    
    inline def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
    
    inline def setMax_errors(value: double): Self = StObject.set(x, "max_errors", value.asInstanceOf[js.Any])
    
    inline def setMax_errorsUndefined: Self = StObject.set(x, "max_errors", js.undefined)
    
    inline def setReal_word_error_likelihood(value: double): Self = StObject.set(x, "real_word_error_likelihood", value.asInstanceOf[js.Any])
    
    inline def setReal_word_error_likelihoodUndefined: Self = StObject.set(x, "real_word_error_likelihood", js.undefined)
    
    inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    
    inline def setShard_size(value: integer): Self = StObject.set(x, "shard_size", value.asInstanceOf[js.Any])
    
    inline def setShard_sizeUndefined: Self = StObject.set(x, "shard_size", js.undefined)
    
    inline def setSmoothing(value: SearchSmoothingModelContainer): Self = StObject.set(x, "smoothing", value.asInstanceOf[js.Any])
    
    inline def setSmoothingUndefined: Self = StObject.set(x, "smoothing", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setToken_limit(value: integer): Self = StObject.set(x, "token_limit", value.asInstanceOf[js.Any])
    
    inline def setToken_limitUndefined: Self = StObject.set(x, "token_limit", js.undefined)
  }
}
