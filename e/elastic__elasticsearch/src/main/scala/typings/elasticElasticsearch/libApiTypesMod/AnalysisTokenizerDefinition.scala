package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisCharGroupTokenizer
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisEdgeNGramTokenizer
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisKeywordTokenizer
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisLetterTokenizer
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisLowercaseTokenizer
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisNGramTokenizer
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisNoriTokenizer
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisPathHierarchyTokenizer
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisStandardTokenizer
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisUaxEmailUrlTokenizer
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisWhitespaceTokenizer
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisKuromojiTokenizer
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisPatternTokenizer
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisIcuTokenizer
*/
trait AnalysisTokenizerDefinition extends StObject
object AnalysisTokenizerDefinition {
  
  inline def AnalysisCharGroupTokenizer(tokenize_on_chars: js.Array[String]): typings.elasticElasticsearch.libApiTypesMod.AnalysisCharGroupTokenizer = {
    val __obj = js.Dynamic.literal(tokenize_on_chars = tokenize_on_chars.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("char_group")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisCharGroupTokenizer]
  }
  
  inline def AnalysisEdgeNGramTokenizer(max_gram: integer, min_gram: integer, token_chars: js.Array[AnalysisTokenChar]): typings.elasticElasticsearch.libApiTypesMod.AnalysisEdgeNGramTokenizer = {
    val __obj = js.Dynamic.literal(max_gram = max_gram.asInstanceOf[js.Any], min_gram = min_gram.asInstanceOf[js.Any], token_chars = token_chars.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("edge_ngram")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisEdgeNGramTokenizer]
  }
  
  inline def AnalysisIcuTokenizer(rule_files: String): typings.elasticElasticsearch.libApiTypesMod.AnalysisIcuTokenizer = {
    val __obj = js.Dynamic.literal(rule_files = rule_files.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("icu_tokenizer")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisIcuTokenizer]
  }
  
  inline def AnalysisKeywordTokenizer(buffer_size: integer): typings.elasticElasticsearch.libApiTypesMod.AnalysisKeywordTokenizer = {
    val __obj = js.Dynamic.literal(buffer_size = buffer_size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("keyword")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisKeywordTokenizer]
  }
  
  inline def AnalysisKuromojiTokenizer(mode: AnalysisKuromojiTokenizationMode): typings.elasticElasticsearch.libApiTypesMod.AnalysisKuromojiTokenizer = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("kuromoji_tokenizer")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisKuromojiTokenizer]
  }
  
  inline def AnalysisLetterTokenizer(): typings.elasticElasticsearch.libApiTypesMod.AnalysisLetterTokenizer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("letter")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisLetterTokenizer]
  }
  
  inline def AnalysisLowercaseTokenizer(): typings.elasticElasticsearch.libApiTypesMod.AnalysisLowercaseTokenizer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("lowercase")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisLowercaseTokenizer]
  }
  
  inline def AnalysisNGramTokenizer(max_gram: integer, min_gram: integer, token_chars: js.Array[AnalysisTokenChar]): typings.elasticElasticsearch.libApiTypesMod.AnalysisNGramTokenizer = {
    val __obj = js.Dynamic.literal(max_gram = max_gram.asInstanceOf[js.Any], min_gram = min_gram.asInstanceOf[js.Any], token_chars = token_chars.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ngram")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisNGramTokenizer]
  }
  
  inline def AnalysisNoriTokenizer(): typings.elasticElasticsearch.libApiTypesMod.AnalysisNoriTokenizer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("nori_tokenizer")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisNoriTokenizer]
  }
  
  inline def AnalysisPathHierarchyTokenizer(buffer_size: integer, delimiter: String, replacement: String, reverse: Boolean, skip: integer): typings.elasticElasticsearch.libApiTypesMod.AnalysisPathHierarchyTokenizer = {
    val __obj = js.Dynamic.literal(buffer_size = buffer_size.asInstanceOf[js.Any], delimiter = delimiter.asInstanceOf[js.Any], replacement = replacement.asInstanceOf[js.Any], reverse = reverse.asInstanceOf[js.Any], skip = skip.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("path_hierarchy")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisPathHierarchyTokenizer]
  }
  
  inline def AnalysisPatternTokenizer(flags: String, group: integer, pattern: String): typings.elasticElasticsearch.libApiTypesMod.AnalysisPatternTokenizer = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("pattern")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisPatternTokenizer]
  }
  
  inline def AnalysisStandardTokenizer(): typings.elasticElasticsearch.libApiTypesMod.AnalysisStandardTokenizer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("standard")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisStandardTokenizer]
  }
  
  inline def AnalysisUaxEmailUrlTokenizer(): typings.elasticElasticsearch.libApiTypesMod.AnalysisUaxEmailUrlTokenizer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("uax_url_email")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisUaxEmailUrlTokenizer]
  }
  
  inline def AnalysisWhitespaceTokenizer(): typings.elasticElasticsearch.libApiTypesMod.AnalysisWhitespaceTokenizer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("whitespace")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisWhitespaceTokenizer]
  }
}
