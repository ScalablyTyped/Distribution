package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisCustomAnalyzer
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisFingerprintAnalyzer
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisKeywordAnalyzer
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisLanguageAnalyzer
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisNoriAnalyzer
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisPatternAnalyzer
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisSimpleAnalyzer
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisStandardAnalyzer
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisStopAnalyzer
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisWhitespaceAnalyzer
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisIcuAnalyzer
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisKuromojiAnalyzer
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisSnowballAnalyzer
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisDutchAnalyzer
*/
trait AnalysisAnalyzer extends StObject
object AnalysisAnalyzer {
  
  inline def AnalysisCustomAnalyzer(tokenizer: String): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisCustomAnalyzer = {
    val __obj = js.Dynamic.literal(tokenizer = tokenizer.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("custom")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisCustomAnalyzer]
  }
  
  inline def AnalysisDutchAnalyzer(): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisDutchAnalyzer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("dutch")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisDutchAnalyzer]
  }
  
  inline def AnalysisFingerprintAnalyzer(max_output_size: integer, preserve_original: Boolean, separator: String): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisFingerprintAnalyzer = {
    val __obj = js.Dynamic.literal(max_output_size = max_output_size.asInstanceOf[js.Any], preserve_original = preserve_original.asInstanceOf[js.Any], separator = separator.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("fingerprint")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisFingerprintAnalyzer]
  }
  
  inline def AnalysisIcuAnalyzer(method: AnalysisIcuNormalizationType, mode: AnalysisIcuNormalizationMode): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisIcuAnalyzer = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("icu_analyzer")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisIcuAnalyzer]
  }
  
  inline def AnalysisKeywordAnalyzer(): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisKeywordAnalyzer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("keyword")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisKeywordAnalyzer]
  }
  
  inline def AnalysisKuromojiAnalyzer(mode: AnalysisKuromojiTokenizationMode): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisKuromojiAnalyzer = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("kuromoji")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisKuromojiAnalyzer]
  }
  
  inline def AnalysisLanguageAnalyzer(language: AnalysisLanguage, stem_exclusion: js.Array[String]): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisLanguageAnalyzer = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], stem_exclusion = stem_exclusion.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("language")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisLanguageAnalyzer]
  }
  
  inline def AnalysisNoriAnalyzer(): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisNoriAnalyzer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("nori")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisNoriAnalyzer]
  }
  
  inline def AnalysisPatternAnalyzer(pattern: String): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisPatternAnalyzer = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("pattern")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisPatternAnalyzer]
  }
  
  inline def AnalysisSimpleAnalyzer(): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisSimpleAnalyzer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("simple")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisSimpleAnalyzer]
  }
  
  inline def AnalysisSnowballAnalyzer(language: AnalysisSnowballLanguage): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisSnowballAnalyzer = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("snowball")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisSnowballAnalyzer]
  }
  
  inline def AnalysisStandardAnalyzer(): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisStandardAnalyzer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("standard")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisStandardAnalyzer]
  }
  
  inline def AnalysisStopAnalyzer(): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisStopAnalyzer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("stop")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisStopAnalyzer]
  }
  
  inline def AnalysisWhitespaceAnalyzer(): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisWhitespaceAnalyzer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("whitespace")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisWhitespaceAnalyzer]
  }
}
