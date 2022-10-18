package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.ngram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisNGramTokenizer
  extends StObject
     with AnalysisTokenizerBase
     with AnalysisTokenizerDefinition {
  
  var custom_token_chars: js.UndefOr[String] = js.undefined
  
  var max_gram: integer
  
  var min_gram: integer
  
  var token_chars: js.Array[AnalysisTokenChar]
  
  var `type`: ngram
}
object AnalysisNGramTokenizer {
  
  inline def apply(max_gram: integer, min_gram: integer, token_chars: js.Array[AnalysisTokenChar]): AnalysisNGramTokenizer = {
    val __obj = js.Dynamic.literal(max_gram = max_gram.asInstanceOf[js.Any], min_gram = min_gram.asInstanceOf[js.Any], token_chars = token_chars.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ngram")
    __obj.asInstanceOf[AnalysisNGramTokenizer]
  }
  
  extension [Self <: AnalysisNGramTokenizer](x: Self) {
    
    inline def setCustom_token_chars(value: String): Self = StObject.set(x, "custom_token_chars", value.asInstanceOf[js.Any])
    
    inline def setCustom_token_charsUndefined: Self = StObject.set(x, "custom_token_chars", js.undefined)
    
    inline def setMax_gram(value: integer): Self = StObject.set(x, "max_gram", value.asInstanceOf[js.Any])
    
    inline def setMin_gram(value: integer): Self = StObject.set(x, "min_gram", value.asInstanceOf[js.Any])
    
    inline def setToken_chars(value: js.Array[AnalysisTokenChar]): Self = StObject.set(x, "token_chars", value.asInstanceOf[js.Any])
    
    inline def setToken_charsVarargs(value: AnalysisTokenChar*): Self = StObject.set(x, "token_chars", js.Array(value*))
    
    inline def setType(value: ngram): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
