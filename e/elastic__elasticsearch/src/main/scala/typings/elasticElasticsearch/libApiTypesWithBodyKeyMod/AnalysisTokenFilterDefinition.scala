package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisAsciiFoldingTokenFilter
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisCommonGramsTokenFilter
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisConditionTokenFilter
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisDelimitedPayloadTokenFilter
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisEdgeNGramTokenFilter
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisElisionTokenFilter
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisFingerprintTokenFilter
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisHunspellTokenFilter
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisHyphenationDecompounderTokenFilter
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisKeepTypesTokenFilter
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisKeepWordsTokenFilter
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisKeywordMarkerTokenFilter
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisKStemTokenFilter
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisLengthTokenFilter
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisLimitTokenCountTokenFilter
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisLowercaseTokenFilter
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisMultiplexerTokenFilter
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisNGramTokenFilter
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisNoriPartOfSpeechTokenFilter
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisPatternCaptureTokenFilter
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisPatternReplaceTokenFilter
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisPorterStemTokenFilter
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisPredicateTokenFilter
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisRemoveDuplicatesTokenFilter
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisReverseTokenFilter
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisShingleTokenFilter
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisSnowballTokenFilter
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisStemmerOverrideTokenFilter
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisStemmerTokenFilter
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisStopTokenFilter
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisSynonymGraphTokenFilter
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisSynonymTokenFilter
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisTrimTokenFilter
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisTruncateTokenFilter
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisUniqueTokenFilter
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisUppercaseTokenFilter
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisWordDelimiterGraphTokenFilter
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisWordDelimiterTokenFilter
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisKuromojiStemmerTokenFilter
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisKuromojiReadingFormTokenFilter
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisKuromojiPartOfSpeechTokenFilter
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisIcuTokenizer
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisIcuCollationTokenFilter
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisIcuFoldingTokenFilter
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisIcuNormalizationTokenFilter
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisIcuTransformTokenFilter
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisPhoneticTokenFilter
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisDictionaryDecompounderTokenFilter
*/
trait AnalysisTokenFilterDefinition extends StObject
object AnalysisTokenFilterDefinition {
  
  inline def AnalysisAsciiFoldingTokenFilter(): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisAsciiFoldingTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("asciifolding")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisAsciiFoldingTokenFilter]
  }
  
  inline def AnalysisCommonGramsTokenFilter(): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisCommonGramsTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("common_grams")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisCommonGramsTokenFilter]
  }
  
  inline def AnalysisConditionTokenFilter(filter: js.Array[String], script: Script): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisConditionTokenFilter = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("condition")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisConditionTokenFilter]
  }
  
  inline def AnalysisDelimitedPayloadTokenFilter(): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisDelimitedPayloadTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("delimited_payload")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisDelimitedPayloadTokenFilter]
  }
  
  inline def AnalysisDictionaryDecompounderTokenFilter(): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisDictionaryDecompounderTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("dictionary_decompounder")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisDictionaryDecompounderTokenFilter]
  }
  
  inline def AnalysisEdgeNGramTokenFilter(): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisEdgeNGramTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("edge_ngram")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisEdgeNGramTokenFilter]
  }
  
  inline def AnalysisElisionTokenFilter(): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisElisionTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("elision")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisElisionTokenFilter]
  }
  
  inline def AnalysisFingerprintTokenFilter(): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisFingerprintTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("fingerprint")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisFingerprintTokenFilter]
  }
  
  inline def AnalysisHunspellTokenFilter(locale: String): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisHunspellTokenFilter = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("hunspell")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisHunspellTokenFilter]
  }
  
  inline def AnalysisHyphenationDecompounderTokenFilter(): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisHyphenationDecompounderTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("hyphenation_decompounder")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisHyphenationDecompounderTokenFilter]
  }
  
  inline def AnalysisIcuCollationTokenFilter(): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisIcuCollationTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("icu_collation")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisIcuCollationTokenFilter]
  }
  
  inline def AnalysisIcuFoldingTokenFilter(unicode_set_filter: String): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisIcuFoldingTokenFilter = {
    val __obj = js.Dynamic.literal(unicode_set_filter = unicode_set_filter.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("icu_folding")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisIcuFoldingTokenFilter]
  }
  
  inline def AnalysisIcuNormalizationTokenFilter(name: AnalysisIcuNormalizationType): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisIcuNormalizationTokenFilter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("icu_normalizer")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisIcuNormalizationTokenFilter]
  }
  
  inline def AnalysisIcuTokenizer(rule_files: String): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisIcuTokenizer = {
    val __obj = js.Dynamic.literal(rule_files = rule_files.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("icu_tokenizer")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisIcuTokenizer]
  }
  
  inline def AnalysisIcuTransformTokenFilter(dir: AnalysisIcuTransformDirection, id: String): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisIcuTransformTokenFilter = {
    val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("icu_transform")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisIcuTransformTokenFilter]
  }
  
  inline def AnalysisKStemTokenFilter(): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisKStemTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("kstem")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisKStemTokenFilter]
  }
  
  inline def AnalysisKeepTypesTokenFilter(): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisKeepTypesTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("keep_types")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisKeepTypesTokenFilter]
  }
  
  inline def AnalysisKeepWordsTokenFilter(): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisKeepWordsTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("keep")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisKeepWordsTokenFilter]
  }
  
  inline def AnalysisKeywordMarkerTokenFilter(): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisKeywordMarkerTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("keyword_marker")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisKeywordMarkerTokenFilter]
  }
  
  inline def AnalysisKuromojiPartOfSpeechTokenFilter(stoptags: js.Array[String]): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisKuromojiPartOfSpeechTokenFilter = {
    val __obj = js.Dynamic.literal(stoptags = stoptags.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("kuromoji_part_of_speech")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisKuromojiPartOfSpeechTokenFilter]
  }
  
  inline def AnalysisKuromojiReadingFormTokenFilter(use_romaji: Boolean): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisKuromojiReadingFormTokenFilter = {
    val __obj = js.Dynamic.literal(use_romaji = use_romaji.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("kuromoji_readingform")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisKuromojiReadingFormTokenFilter]
  }
  
  inline def AnalysisKuromojiStemmerTokenFilter(minimum_length: integer): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisKuromojiStemmerTokenFilter = {
    val __obj = js.Dynamic.literal(minimum_length = minimum_length.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("kuromoji_stemmer")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisKuromojiStemmerTokenFilter]
  }
  
  inline def AnalysisLengthTokenFilter(): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisLengthTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("length")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisLengthTokenFilter]
  }
  
  inline def AnalysisLimitTokenCountTokenFilter(): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisLimitTokenCountTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("limit")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisLimitTokenCountTokenFilter]
  }
  
  inline def AnalysisLowercaseTokenFilter(): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisLowercaseTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("lowercase")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisLowercaseTokenFilter]
  }
  
  inline def AnalysisMultiplexerTokenFilter(filters: js.Array[String]): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisMultiplexerTokenFilter = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("multiplexer")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisMultiplexerTokenFilter]
  }
  
  inline def AnalysisNGramTokenFilter(): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisNGramTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ngram")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisNGramTokenFilter]
  }
  
  inline def AnalysisNoriPartOfSpeechTokenFilter(): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisNoriPartOfSpeechTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("nori_part_of_speech")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisNoriPartOfSpeechTokenFilter]
  }
  
  inline def AnalysisPatternCaptureTokenFilter(patterns: js.Array[String]): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisPatternCaptureTokenFilter = {
    val __obj = js.Dynamic.literal(patterns = patterns.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("pattern_capture")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisPatternCaptureTokenFilter]
  }
  
  inline def AnalysisPatternReplaceTokenFilter(pattern: String): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisPatternReplaceTokenFilter = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("pattern_replace")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisPatternReplaceTokenFilter]
  }
  
  inline def AnalysisPhoneticTokenFilter(
    encoder: AnalysisPhoneticEncoder,
    languageset: js.Array[AnalysisPhoneticLanguage],
    name_type: AnalysisPhoneticNameType,
    rule_type: AnalysisPhoneticRuleType
  ): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisPhoneticTokenFilter = {
    val __obj = js.Dynamic.literal(encoder = encoder.asInstanceOf[js.Any], languageset = languageset.asInstanceOf[js.Any], name_type = name_type.asInstanceOf[js.Any], rule_type = rule_type.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("phonetic")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisPhoneticTokenFilter]
  }
  
  inline def AnalysisPorterStemTokenFilter(): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisPorterStemTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("porter_stem")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisPorterStemTokenFilter]
  }
  
  inline def AnalysisPredicateTokenFilter(script: Script): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisPredicateTokenFilter = {
    val __obj = js.Dynamic.literal(script = script.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("predicate_token_filter")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisPredicateTokenFilter]
  }
  
  inline def AnalysisRemoveDuplicatesTokenFilter(): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisRemoveDuplicatesTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("remove_duplicates")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisRemoveDuplicatesTokenFilter]
  }
  
  inline def AnalysisReverseTokenFilter(): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisReverseTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("reverse")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisReverseTokenFilter]
  }
  
  inline def AnalysisShingleTokenFilter(): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisShingleTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("shingle")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisShingleTokenFilter]
  }
  
  inline def AnalysisSnowballTokenFilter(language: AnalysisSnowballLanguage): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisSnowballTokenFilter = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("snowball")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisSnowballTokenFilter]
  }
  
  inline def AnalysisStemmerOverrideTokenFilter(): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisStemmerOverrideTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("stemmer_override")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisStemmerOverrideTokenFilter]
  }
  
  inline def AnalysisStemmerTokenFilter(language: String): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisStemmerTokenFilter = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("stemmer")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisStemmerTokenFilter]
  }
  
  inline def AnalysisStopTokenFilter(): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisStopTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("stop")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisStopTokenFilter]
  }
  
  inline def AnalysisSynonymGraphTokenFilter(): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisSynonymGraphTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("synonym_graph")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisSynonymGraphTokenFilter]
  }
  
  inline def AnalysisSynonymTokenFilter(): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisSynonymTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("synonym")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisSynonymTokenFilter]
  }
  
  inline def AnalysisTrimTokenFilter(): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisTrimTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("trim")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisTrimTokenFilter]
  }
  
  inline def AnalysisTruncateTokenFilter(): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisTruncateTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("truncate")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisTruncateTokenFilter]
  }
  
  inline def AnalysisUniqueTokenFilter(): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisUniqueTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("unique")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisUniqueTokenFilter]
  }
  
  inline def AnalysisUppercaseTokenFilter(): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisUppercaseTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("uppercase")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisUppercaseTokenFilter]
  }
  
  inline def AnalysisWordDelimiterGraphTokenFilter(): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisWordDelimiterGraphTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("word_delimiter_graph")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisWordDelimiterGraphTokenFilter]
  }
  
  inline def AnalysisWordDelimiterTokenFilter(): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisWordDelimiterTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("word_delimiter")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisWordDelimiterTokenFilter]
  }
}
