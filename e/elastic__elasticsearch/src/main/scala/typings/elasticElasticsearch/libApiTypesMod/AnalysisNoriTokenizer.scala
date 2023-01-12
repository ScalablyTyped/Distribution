package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.nori_tokenizer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisNoriTokenizer
  extends StObject
     with AnalysisTokenizerBase
     with AnalysisTokenizerDefinition {
  
  var decompound_mode: js.UndefOr[AnalysisNoriDecompoundMode] = js.undefined
  
  var discard_punctuation: js.UndefOr[Boolean] = js.undefined
  
  var `type`: nori_tokenizer
  
  var user_dictionary: js.UndefOr[String] = js.undefined
  
  var user_dictionary_rules: js.UndefOr[js.Array[String]] = js.undefined
}
object AnalysisNoriTokenizer {
  
  inline def apply(): AnalysisNoriTokenizer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("nori_tokenizer")
    __obj.asInstanceOf[AnalysisNoriTokenizer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnalysisNoriTokenizer] (val x: Self) extends AnyVal {
    
    inline def setDecompound_mode(value: AnalysisNoriDecompoundMode): Self = StObject.set(x, "decompound_mode", value.asInstanceOf[js.Any])
    
    inline def setDecompound_modeUndefined: Self = StObject.set(x, "decompound_mode", js.undefined)
    
    inline def setDiscard_punctuation(value: Boolean): Self = StObject.set(x, "discard_punctuation", value.asInstanceOf[js.Any])
    
    inline def setDiscard_punctuationUndefined: Self = StObject.set(x, "discard_punctuation", js.undefined)
    
    inline def setType(value: nori_tokenizer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUser_dictionary(value: String): Self = StObject.set(x, "user_dictionary", value.asInstanceOf[js.Any])
    
    inline def setUser_dictionaryUndefined: Self = StObject.set(x, "user_dictionary", js.undefined)
    
    inline def setUser_dictionary_rules(value: js.Array[String]): Self = StObject.set(x, "user_dictionary_rules", value.asInstanceOf[js.Any])
    
    inline def setUser_dictionary_rulesUndefined: Self = StObject.set(x, "user_dictionary_rules", js.undefined)
    
    inline def setUser_dictionary_rulesVarargs(value: String*): Self = StObject.set(x, "user_dictionary_rules", js.Array(value*))
  }
}
