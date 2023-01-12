package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.char_group
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisCharGroupTokenizer
  extends StObject
     with AnalysisTokenizerBase
     with AnalysisTokenizerDefinition {
  
  var max_token_length: js.UndefOr[integer] = js.undefined
  
  var tokenize_on_chars: js.Array[String]
  
  var `type`: char_group
}
object AnalysisCharGroupTokenizer {
  
  inline def apply(tokenize_on_chars: js.Array[String]): AnalysisCharGroupTokenizer = {
    val __obj = js.Dynamic.literal(tokenize_on_chars = tokenize_on_chars.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("char_group")
    __obj.asInstanceOf[AnalysisCharGroupTokenizer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnalysisCharGroupTokenizer] (val x: Self) extends AnyVal {
    
    inline def setMax_token_length(value: integer): Self = StObject.set(x, "max_token_length", value.asInstanceOf[js.Any])
    
    inline def setMax_token_lengthUndefined: Self = StObject.set(x, "max_token_length", js.undefined)
    
    inline def setTokenize_on_chars(value: js.Array[String]): Self = StObject.set(x, "tokenize_on_chars", value.asInstanceOf[js.Any])
    
    inline def setTokenize_on_charsVarargs(value: String*): Self = StObject.set(x, "tokenize_on_chars", js.Array(value*))
    
    inline def setType(value: char_group): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
