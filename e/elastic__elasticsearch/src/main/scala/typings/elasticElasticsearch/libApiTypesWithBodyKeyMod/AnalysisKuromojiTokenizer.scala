package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.kuromoji_tokenizer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisKuromojiTokenizer
  extends StObject
     with AnalysisTokenizerBase
     with AnalysisTokenizerDefinition {
  
  var discard_compound_token: js.UndefOr[Boolean] = js.undefined
  
  var discard_punctuation: js.UndefOr[Boolean] = js.undefined
  
  var mode: AnalysisKuromojiTokenizationMode
  
  var nbest_cost: js.UndefOr[integer] = js.undefined
  
  var nbest_examples: js.UndefOr[String] = js.undefined
  
  var `type`: kuromoji_tokenizer
  
  var user_dictionary: js.UndefOr[String] = js.undefined
  
  var user_dictionary_rules: js.UndefOr[js.Array[String]] = js.undefined
}
object AnalysisKuromojiTokenizer {
  
  inline def apply(mode: AnalysisKuromojiTokenizationMode): AnalysisKuromojiTokenizer = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("kuromoji_tokenizer")
    __obj.asInstanceOf[AnalysisKuromojiTokenizer]
  }
  
  extension [Self <: AnalysisKuromojiTokenizer](x: Self) {
    
    inline def setDiscard_compound_token(value: Boolean): Self = StObject.set(x, "discard_compound_token", value.asInstanceOf[js.Any])
    
    inline def setDiscard_compound_tokenUndefined: Self = StObject.set(x, "discard_compound_token", js.undefined)
    
    inline def setDiscard_punctuation(value: Boolean): Self = StObject.set(x, "discard_punctuation", value.asInstanceOf[js.Any])
    
    inline def setDiscard_punctuationUndefined: Self = StObject.set(x, "discard_punctuation", js.undefined)
    
    inline def setMode(value: AnalysisKuromojiTokenizationMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setNbest_cost(value: integer): Self = StObject.set(x, "nbest_cost", value.asInstanceOf[js.Any])
    
    inline def setNbest_costUndefined: Self = StObject.set(x, "nbest_cost", js.undefined)
    
    inline def setNbest_examples(value: String): Self = StObject.set(x, "nbest_examples", value.asInstanceOf[js.Any])
    
    inline def setNbest_examplesUndefined: Self = StObject.set(x, "nbest_examples", js.undefined)
    
    inline def setType(value: kuromoji_tokenizer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUser_dictionary(value: String): Self = StObject.set(x, "user_dictionary", value.asInstanceOf[js.Any])
    
    inline def setUser_dictionaryUndefined: Self = StObject.set(x, "user_dictionary", js.undefined)
    
    inline def setUser_dictionary_rules(value: js.Array[String]): Self = StObject.set(x, "user_dictionary_rules", value.asInstanceOf[js.Any])
    
    inline def setUser_dictionary_rulesUndefined: Self = StObject.set(x, "user_dictionary_rules", js.undefined)
    
    inline def setUser_dictionary_rulesVarargs(value: String*): Self = StObject.set(x, "user_dictionary_rules", js.Array(value*))
  }
}
