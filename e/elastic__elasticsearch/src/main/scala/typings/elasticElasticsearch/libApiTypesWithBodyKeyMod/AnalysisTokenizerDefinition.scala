package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisCharGroupTokenizer
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisEdgeNGramTokenizer
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisKeywordTokenizer
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisLetterTokenizer
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisLowercaseTokenizer
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisNGramTokenizer
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisNoriTokenizer
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisPathHierarchyTokenizer
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisStandardTokenizer
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisUaxEmailUrlTokenizer
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisWhitespaceTokenizer
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisKuromojiTokenizer
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisPatternTokenizer
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisIcuTokenizer
*/
trait AnalysisTokenizerDefinition extends StObject
object AnalysisTokenizerDefinition {
  
  inline def AnalysisCharGroupTokenizer(tokenize_on_chars: js.Array[String]): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisCharGroupTokenizer = {
    val __obj = js.Dynamic.literal(tokenize_on_chars = tokenize_on_chars.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("char_group")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisCharGroupTokenizer]
  }
  
  inline def AnalysisEdgeNGramTokenizer(max_gram: integer, min_gram: integer, token_chars: js.Array[AnalysisTokenChar]): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisEdgeNGramTokenizer = {
    val __obj = js.Dynamic.literal(max_gram = max_gram.asInstanceOf[js.Any], min_gram = min_gram.asInstanceOf[js.Any], token_chars = token_chars.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("edge_ngram")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisEdgeNGramTokenizer]
  }
  
  inline def AnalysisIcuTokenizer(rule_files: String): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisIcuTokenizer = {
    val __obj = js.Dynamic.literal(rule_files = rule_files.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("icu_tokenizer")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisIcuTokenizer]
  }
  
  inline def AnalysisKeywordTokenizer(buffer_size: integer): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisKeywordTokenizer = {
    val __obj = js.Dynamic.literal(buffer_size = buffer_size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("keyword")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisKeywordTokenizer]
  }
  
  inline def AnalysisKuromojiTokenizer(mode: AnalysisKuromojiTokenizationMode): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisKuromojiTokenizer = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("kuromoji_tokenizer")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisKuromojiTokenizer]
  }
  
  inline def AnalysisLetterTokenizer(): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisLetterTokenizer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("letter")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisLetterTokenizer]
  }
  
  inline def AnalysisLowercaseTokenizer(): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisLowercaseTokenizer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("lowercase")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisLowercaseTokenizer]
  }
  
  inline def AnalysisNGramTokenizer(max_gram: integer, min_gram: integer, token_chars: js.Array[AnalysisTokenChar]): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisNGramTokenizer = {
    val __obj = js.Dynamic.literal(max_gram = max_gram.asInstanceOf[js.Any], min_gram = min_gram.asInstanceOf[js.Any], token_chars = token_chars.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ngram")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisNGramTokenizer]
  }
  
  inline def AnalysisNoriTokenizer(): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisNoriTokenizer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("nori_tokenizer")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisNoriTokenizer]
  }
  
  inline def AnalysisPathHierarchyTokenizer(buffer_size: integer, delimiter: String, replacement: String, reverse: Boolean, skip: integer): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisPathHierarchyTokenizer = {
    val __obj = js.Dynamic.literal(buffer_size = buffer_size.asInstanceOf[js.Any], delimiter = delimiter.asInstanceOf[js.Any], replacement = replacement.asInstanceOf[js.Any], reverse = reverse.asInstanceOf[js.Any], skip = skip.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("path_hierarchy")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisPathHierarchyTokenizer]
  }
  
  inline def AnalysisPatternTokenizer(flags: String, group: integer, pattern: String): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisPatternTokenizer = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("pattern")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisPatternTokenizer]
  }
  
  inline def AnalysisStandardTokenizer(): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisStandardTokenizer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("standard")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisStandardTokenizer]
  }
  
  inline def AnalysisUaxEmailUrlTokenizer(): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisUaxEmailUrlTokenizer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("uax_url_email")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisUaxEmailUrlTokenizer]
  }
  
  inline def AnalysisWhitespaceTokenizer(): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisWhitespaceTokenizer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("whitespace")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisWhitespaceTokenizer]
  }
}
