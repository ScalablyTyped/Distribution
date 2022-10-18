package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisHtmlStripCharFilter
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisMappingCharFilter
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisPatternReplaceCharFilter
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisIcuNormalizationCharFilter
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisKuromojiIterationMarkCharFilter
*/
trait AnalysisCharFilterDefinition extends StObject
object AnalysisCharFilterDefinition {
  
  inline def AnalysisHtmlStripCharFilter(): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisHtmlStripCharFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("html_strip")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisHtmlStripCharFilter]
  }
  
  inline def AnalysisIcuNormalizationCharFilter(): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisIcuNormalizationCharFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("icu_normalizer")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisIcuNormalizationCharFilter]
  }
  
  inline def AnalysisKuromojiIterationMarkCharFilter(normalize_kana: Boolean, normalize_kanji: Boolean): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisKuromojiIterationMarkCharFilter = {
    val __obj = js.Dynamic.literal(normalize_kana = normalize_kana.asInstanceOf[js.Any], normalize_kanji = normalize_kanji.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("kuromoji_iteration_mark")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisKuromojiIterationMarkCharFilter]
  }
  
  inline def AnalysisMappingCharFilter(): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisMappingCharFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("mapping")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisMappingCharFilter]
  }
  
  inline def AnalysisPatternReplaceCharFilter(pattern: String): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisPatternReplaceCharFilter = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("pattern_replace")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisPatternReplaceCharFilter]
  }
}
