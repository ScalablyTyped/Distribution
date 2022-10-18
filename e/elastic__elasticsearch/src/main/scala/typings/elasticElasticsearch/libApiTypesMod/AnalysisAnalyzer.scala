package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisCustomAnalyzer
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisFingerprintAnalyzer
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisKeywordAnalyzer
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisLanguageAnalyzer
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisNoriAnalyzer
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisPatternAnalyzer
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisSimpleAnalyzer
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisStandardAnalyzer
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisStopAnalyzer
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisWhitespaceAnalyzer
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisIcuAnalyzer
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisKuromojiAnalyzer
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisSnowballAnalyzer
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisDutchAnalyzer
*/
trait AnalysisAnalyzer extends StObject
object AnalysisAnalyzer {
  
  inline def AnalysisCustomAnalyzer(tokenizer: String): typings.elasticElasticsearch.libApiTypesMod.AnalysisCustomAnalyzer = {
    val __obj = js.Dynamic.literal(tokenizer = tokenizer.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("custom")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisCustomAnalyzer]
  }
  
  inline def AnalysisDutchAnalyzer(): typings.elasticElasticsearch.libApiTypesMod.AnalysisDutchAnalyzer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("dutch")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisDutchAnalyzer]
  }
  
  inline def AnalysisFingerprintAnalyzer(max_output_size: integer, preserve_original: Boolean, separator: String): typings.elasticElasticsearch.libApiTypesMod.AnalysisFingerprintAnalyzer = {
    val __obj = js.Dynamic.literal(max_output_size = max_output_size.asInstanceOf[js.Any], preserve_original = preserve_original.asInstanceOf[js.Any], separator = separator.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("fingerprint")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisFingerprintAnalyzer]
  }
  
  inline def AnalysisIcuAnalyzer(method: AnalysisIcuNormalizationType, mode: AnalysisIcuNormalizationMode): typings.elasticElasticsearch.libApiTypesMod.AnalysisIcuAnalyzer = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("icu_analyzer")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisIcuAnalyzer]
  }
  
  inline def AnalysisKeywordAnalyzer(): typings.elasticElasticsearch.libApiTypesMod.AnalysisKeywordAnalyzer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("keyword")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisKeywordAnalyzer]
  }
  
  inline def AnalysisKuromojiAnalyzer(mode: AnalysisKuromojiTokenizationMode): typings.elasticElasticsearch.libApiTypesMod.AnalysisKuromojiAnalyzer = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("kuromoji")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisKuromojiAnalyzer]
  }
  
  inline def AnalysisLanguageAnalyzer(language: AnalysisLanguage, stem_exclusion: js.Array[String]): typings.elasticElasticsearch.libApiTypesMod.AnalysisLanguageAnalyzer = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], stem_exclusion = stem_exclusion.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("language")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisLanguageAnalyzer]
  }
  
  inline def AnalysisNoriAnalyzer(): typings.elasticElasticsearch.libApiTypesMod.AnalysisNoriAnalyzer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("nori")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisNoriAnalyzer]
  }
  
  inline def AnalysisPatternAnalyzer(pattern: String): typings.elasticElasticsearch.libApiTypesMod.AnalysisPatternAnalyzer = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("pattern")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisPatternAnalyzer]
  }
  
  inline def AnalysisSimpleAnalyzer(): typings.elasticElasticsearch.libApiTypesMod.AnalysisSimpleAnalyzer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("simple")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisSimpleAnalyzer]
  }
  
  inline def AnalysisSnowballAnalyzer(language: AnalysisSnowballLanguage): typings.elasticElasticsearch.libApiTypesMod.AnalysisSnowballAnalyzer = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("snowball")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisSnowballAnalyzer]
  }
  
  inline def AnalysisStandardAnalyzer(): typings.elasticElasticsearch.libApiTypesMod.AnalysisStandardAnalyzer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("standard")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisStandardAnalyzer]
  }
  
  inline def AnalysisStopAnalyzer(): typings.elasticElasticsearch.libApiTypesMod.AnalysisStopAnalyzer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("stop")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisStopAnalyzer]
  }
  
  inline def AnalysisWhitespaceAnalyzer(): typings.elasticElasticsearch.libApiTypesMod.AnalysisWhitespaceAnalyzer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("whitespace")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisWhitespaceAnalyzer]
  }
}
