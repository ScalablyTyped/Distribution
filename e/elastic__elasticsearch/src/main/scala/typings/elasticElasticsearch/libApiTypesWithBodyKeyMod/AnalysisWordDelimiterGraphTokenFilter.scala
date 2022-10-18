package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.word_delimiter_graph
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisWordDelimiterGraphTokenFilter
  extends StObject
     with AnalysisTokenFilterBase
     with AnalysisTokenFilterDefinition {
  
  var adjust_offsets: js.UndefOr[Boolean] = js.undefined
  
  var catenate_all: js.UndefOr[Boolean] = js.undefined
  
  var catenate_numbers: js.UndefOr[Boolean] = js.undefined
  
  var catenate_words: js.UndefOr[Boolean] = js.undefined
  
  var generate_number_parts: js.UndefOr[Boolean] = js.undefined
  
  var generate_word_parts: js.UndefOr[Boolean] = js.undefined
  
  var ignore_keywords: js.UndefOr[Boolean] = js.undefined
  
  var preserve_original: js.UndefOr[Boolean] = js.undefined
  
  var protected_words: js.UndefOr[js.Array[String]] = js.undefined
  
  var protected_words_path: js.UndefOr[String] = js.undefined
  
  var split_on_case_change: js.UndefOr[Boolean] = js.undefined
  
  var split_on_numerics: js.UndefOr[Boolean] = js.undefined
  
  var stem_english_possessive: js.UndefOr[Boolean] = js.undefined
  
  var `type`: word_delimiter_graph
  
  var type_table: js.UndefOr[js.Array[String]] = js.undefined
  
  var type_table_path: js.UndefOr[String] = js.undefined
}
object AnalysisWordDelimiterGraphTokenFilter {
  
  inline def apply(): AnalysisWordDelimiterGraphTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("word_delimiter_graph")
    __obj.asInstanceOf[AnalysisWordDelimiterGraphTokenFilter]
  }
  
  extension [Self <: AnalysisWordDelimiterGraphTokenFilter](x: Self) {
    
    inline def setAdjust_offsets(value: Boolean): Self = StObject.set(x, "adjust_offsets", value.asInstanceOf[js.Any])
    
    inline def setAdjust_offsetsUndefined: Self = StObject.set(x, "adjust_offsets", js.undefined)
    
    inline def setCatenate_all(value: Boolean): Self = StObject.set(x, "catenate_all", value.asInstanceOf[js.Any])
    
    inline def setCatenate_allUndefined: Self = StObject.set(x, "catenate_all", js.undefined)
    
    inline def setCatenate_numbers(value: Boolean): Self = StObject.set(x, "catenate_numbers", value.asInstanceOf[js.Any])
    
    inline def setCatenate_numbersUndefined: Self = StObject.set(x, "catenate_numbers", js.undefined)
    
    inline def setCatenate_words(value: Boolean): Self = StObject.set(x, "catenate_words", value.asInstanceOf[js.Any])
    
    inline def setCatenate_wordsUndefined: Self = StObject.set(x, "catenate_words", js.undefined)
    
    inline def setGenerate_number_parts(value: Boolean): Self = StObject.set(x, "generate_number_parts", value.asInstanceOf[js.Any])
    
    inline def setGenerate_number_partsUndefined: Self = StObject.set(x, "generate_number_parts", js.undefined)
    
    inline def setGenerate_word_parts(value: Boolean): Self = StObject.set(x, "generate_word_parts", value.asInstanceOf[js.Any])
    
    inline def setGenerate_word_partsUndefined: Self = StObject.set(x, "generate_word_parts", js.undefined)
    
    inline def setIgnore_keywords(value: Boolean): Self = StObject.set(x, "ignore_keywords", value.asInstanceOf[js.Any])
    
    inline def setIgnore_keywordsUndefined: Self = StObject.set(x, "ignore_keywords", js.undefined)
    
    inline def setPreserve_original(value: Boolean): Self = StObject.set(x, "preserve_original", value.asInstanceOf[js.Any])
    
    inline def setPreserve_originalUndefined: Self = StObject.set(x, "preserve_original", js.undefined)
    
    inline def setProtected_words(value: js.Array[String]): Self = StObject.set(x, "protected_words", value.asInstanceOf[js.Any])
    
    inline def setProtected_wordsUndefined: Self = StObject.set(x, "protected_words", js.undefined)
    
    inline def setProtected_wordsVarargs(value: String*): Self = StObject.set(x, "protected_words", js.Array(value*))
    
    inline def setProtected_words_path(value: String): Self = StObject.set(x, "protected_words_path", value.asInstanceOf[js.Any])
    
    inline def setProtected_words_pathUndefined: Self = StObject.set(x, "protected_words_path", js.undefined)
    
    inline def setSplit_on_case_change(value: Boolean): Self = StObject.set(x, "split_on_case_change", value.asInstanceOf[js.Any])
    
    inline def setSplit_on_case_changeUndefined: Self = StObject.set(x, "split_on_case_change", js.undefined)
    
    inline def setSplit_on_numerics(value: Boolean): Self = StObject.set(x, "split_on_numerics", value.asInstanceOf[js.Any])
    
    inline def setSplit_on_numericsUndefined: Self = StObject.set(x, "split_on_numerics", js.undefined)
    
    inline def setStem_english_possessive(value: Boolean): Self = StObject.set(x, "stem_english_possessive", value.asInstanceOf[js.Any])
    
    inline def setStem_english_possessiveUndefined: Self = StObject.set(x, "stem_english_possessive", js.undefined)
    
    inline def setType(value: word_delimiter_graph): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setType_table(value: js.Array[String]): Self = StObject.set(x, "type_table", value.asInstanceOf[js.Any])
    
    inline def setType_tableUndefined: Self = StObject.set(x, "type_table", js.undefined)
    
    inline def setType_tableVarargs(value: String*): Self = StObject.set(x, "type_table", js.Array(value*))
    
    inline def setType_table_path(value: String): Self = StObject.set(x, "type_table_path", value.asInstanceOf[js.Any])
    
    inline def setType_table_pathUndefined: Self = StObject.set(x, "type_table_path", js.undefined)
  }
}
