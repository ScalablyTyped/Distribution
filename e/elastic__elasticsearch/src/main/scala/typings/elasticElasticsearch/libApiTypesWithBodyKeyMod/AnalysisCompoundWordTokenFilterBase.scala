package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisCompoundWordTokenFilterBase
  extends StObject
     with AnalysisTokenFilterBase {
  
  var hyphenation_patterns_path: js.UndefOr[String] = js.undefined
  
  var max_subword_size: js.UndefOr[integer] = js.undefined
  
  var min_subword_size: js.UndefOr[integer] = js.undefined
  
  var min_word_size: js.UndefOr[integer] = js.undefined
  
  var only_longest_match: js.UndefOr[Boolean] = js.undefined
  
  var word_list: js.UndefOr[js.Array[String]] = js.undefined
  
  var word_list_path: js.UndefOr[String] = js.undefined
}
object AnalysisCompoundWordTokenFilterBase {
  
  inline def apply(): AnalysisCompoundWordTokenFilterBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalysisCompoundWordTokenFilterBase]
  }
  
  extension [Self <: AnalysisCompoundWordTokenFilterBase](x: Self) {
    
    inline def setHyphenation_patterns_path(value: String): Self = StObject.set(x, "hyphenation_patterns_path", value.asInstanceOf[js.Any])
    
    inline def setHyphenation_patterns_pathUndefined: Self = StObject.set(x, "hyphenation_patterns_path", js.undefined)
    
    inline def setMax_subword_size(value: integer): Self = StObject.set(x, "max_subword_size", value.asInstanceOf[js.Any])
    
    inline def setMax_subword_sizeUndefined: Self = StObject.set(x, "max_subword_size", js.undefined)
    
    inline def setMin_subword_size(value: integer): Self = StObject.set(x, "min_subword_size", value.asInstanceOf[js.Any])
    
    inline def setMin_subword_sizeUndefined: Self = StObject.set(x, "min_subword_size", js.undefined)
    
    inline def setMin_word_size(value: integer): Self = StObject.set(x, "min_word_size", value.asInstanceOf[js.Any])
    
    inline def setMin_word_sizeUndefined: Self = StObject.set(x, "min_word_size", js.undefined)
    
    inline def setOnly_longest_match(value: Boolean): Self = StObject.set(x, "only_longest_match", value.asInstanceOf[js.Any])
    
    inline def setOnly_longest_matchUndefined: Self = StObject.set(x, "only_longest_match", js.undefined)
    
    inline def setWord_list(value: js.Array[String]): Self = StObject.set(x, "word_list", value.asInstanceOf[js.Any])
    
    inline def setWord_listUndefined: Self = StObject.set(x, "word_list", js.undefined)
    
    inline def setWord_listVarargs(value: String*): Self = StObject.set(x, "word_list", js.Array(value*))
    
    inline def setWord_list_path(value: String): Self = StObject.set(x, "word_list_path", value.asInstanceOf[js.Any])
    
    inline def setWord_list_pathUndefined: Self = StObject.set(x, "word_list_path", js.undefined)
  }
}
