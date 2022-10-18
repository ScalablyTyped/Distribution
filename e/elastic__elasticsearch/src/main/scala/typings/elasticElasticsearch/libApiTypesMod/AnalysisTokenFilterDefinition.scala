package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisAsciiFoldingTokenFilter
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisCommonGramsTokenFilter
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisConditionTokenFilter
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisDelimitedPayloadTokenFilter
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisEdgeNGramTokenFilter
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisElisionTokenFilter
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisFingerprintTokenFilter
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisHunspellTokenFilter
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisHyphenationDecompounderTokenFilter
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisKeepTypesTokenFilter
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisKeepWordsTokenFilter
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisKeywordMarkerTokenFilter
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisKStemTokenFilter
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisLengthTokenFilter
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisLimitTokenCountTokenFilter
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisLowercaseTokenFilter
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisMultiplexerTokenFilter
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisNGramTokenFilter
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisNoriPartOfSpeechTokenFilter
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisPatternCaptureTokenFilter
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisPatternReplaceTokenFilter
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisPorterStemTokenFilter
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisPredicateTokenFilter
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisRemoveDuplicatesTokenFilter
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisReverseTokenFilter
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisShingleTokenFilter
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisSnowballTokenFilter
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisStemmerOverrideTokenFilter
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisStemmerTokenFilter
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisStopTokenFilter
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisSynonymGraphTokenFilter
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisSynonymTokenFilter
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisTrimTokenFilter
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisTruncateTokenFilter
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisUniqueTokenFilter
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisUppercaseTokenFilter
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisWordDelimiterGraphTokenFilter
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisWordDelimiterTokenFilter
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisKuromojiStemmerTokenFilter
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisKuromojiReadingFormTokenFilter
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisKuromojiPartOfSpeechTokenFilter
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisIcuTokenizer
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisIcuCollationTokenFilter
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisIcuFoldingTokenFilter
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisIcuNormalizationTokenFilter
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisIcuTransformTokenFilter
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisPhoneticTokenFilter
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisDictionaryDecompounderTokenFilter
*/
trait AnalysisTokenFilterDefinition extends StObject
object AnalysisTokenFilterDefinition {
  
  inline def AnalysisAsciiFoldingTokenFilter(): typings.elasticElasticsearch.libApiTypesMod.AnalysisAsciiFoldingTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("asciifolding")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisAsciiFoldingTokenFilter]
  }
  
  inline def AnalysisCommonGramsTokenFilter(): typings.elasticElasticsearch.libApiTypesMod.AnalysisCommonGramsTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("common_grams")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisCommonGramsTokenFilter]
  }
  
  inline def AnalysisConditionTokenFilter(filter: js.Array[String], script: Script): typings.elasticElasticsearch.libApiTypesMod.AnalysisConditionTokenFilter = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("condition")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisConditionTokenFilter]
  }
  
  inline def AnalysisDelimitedPayloadTokenFilter(): typings.elasticElasticsearch.libApiTypesMod.AnalysisDelimitedPayloadTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("delimited_payload")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisDelimitedPayloadTokenFilter]
  }
  
  inline def AnalysisDictionaryDecompounderTokenFilter(): typings.elasticElasticsearch.libApiTypesMod.AnalysisDictionaryDecompounderTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("dictionary_decompounder")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisDictionaryDecompounderTokenFilter]
  }
  
  inline def AnalysisEdgeNGramTokenFilter(): typings.elasticElasticsearch.libApiTypesMod.AnalysisEdgeNGramTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("edge_ngram")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisEdgeNGramTokenFilter]
  }
  
  inline def AnalysisElisionTokenFilter(): typings.elasticElasticsearch.libApiTypesMod.AnalysisElisionTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("elision")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisElisionTokenFilter]
  }
  
  inline def AnalysisFingerprintTokenFilter(): typings.elasticElasticsearch.libApiTypesMod.AnalysisFingerprintTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("fingerprint")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisFingerprintTokenFilter]
  }
  
  inline def AnalysisHunspellTokenFilter(locale: String): typings.elasticElasticsearch.libApiTypesMod.AnalysisHunspellTokenFilter = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("hunspell")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisHunspellTokenFilter]
  }
  
  inline def AnalysisHyphenationDecompounderTokenFilter(): typings.elasticElasticsearch.libApiTypesMod.AnalysisHyphenationDecompounderTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("hyphenation_decompounder")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisHyphenationDecompounderTokenFilter]
  }
  
  inline def AnalysisIcuCollationTokenFilter(): typings.elasticElasticsearch.libApiTypesMod.AnalysisIcuCollationTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("icu_collation")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisIcuCollationTokenFilter]
  }
  
  inline def AnalysisIcuFoldingTokenFilter(unicode_set_filter: String): typings.elasticElasticsearch.libApiTypesMod.AnalysisIcuFoldingTokenFilter = {
    val __obj = js.Dynamic.literal(unicode_set_filter = unicode_set_filter.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("icu_folding")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisIcuFoldingTokenFilter]
  }
  
  inline def AnalysisIcuNormalizationTokenFilter(name: AnalysisIcuNormalizationType): typings.elasticElasticsearch.libApiTypesMod.AnalysisIcuNormalizationTokenFilter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("icu_normalizer")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisIcuNormalizationTokenFilter]
  }
  
  inline def AnalysisIcuTokenizer(rule_files: String): typings.elasticElasticsearch.libApiTypesMod.AnalysisIcuTokenizer = {
    val __obj = js.Dynamic.literal(rule_files = rule_files.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("icu_tokenizer")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisIcuTokenizer]
  }
  
  inline def AnalysisIcuTransformTokenFilter(dir: AnalysisIcuTransformDirection, id: String): typings.elasticElasticsearch.libApiTypesMod.AnalysisIcuTransformTokenFilter = {
    val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("icu_transform")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisIcuTransformTokenFilter]
  }
  
  inline def AnalysisKStemTokenFilter(): typings.elasticElasticsearch.libApiTypesMod.AnalysisKStemTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("kstem")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisKStemTokenFilter]
  }
  
  inline def AnalysisKeepTypesTokenFilter(): typings.elasticElasticsearch.libApiTypesMod.AnalysisKeepTypesTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("keep_types")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisKeepTypesTokenFilter]
  }
  
  inline def AnalysisKeepWordsTokenFilter(): typings.elasticElasticsearch.libApiTypesMod.AnalysisKeepWordsTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("keep")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisKeepWordsTokenFilter]
  }
  
  inline def AnalysisKeywordMarkerTokenFilter(): typings.elasticElasticsearch.libApiTypesMod.AnalysisKeywordMarkerTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("keyword_marker")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisKeywordMarkerTokenFilter]
  }
  
  inline def AnalysisKuromojiPartOfSpeechTokenFilter(stoptags: js.Array[String]): typings.elasticElasticsearch.libApiTypesMod.AnalysisKuromojiPartOfSpeechTokenFilter = {
    val __obj = js.Dynamic.literal(stoptags = stoptags.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("kuromoji_part_of_speech")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisKuromojiPartOfSpeechTokenFilter]
  }
  
  inline def AnalysisKuromojiReadingFormTokenFilter(use_romaji: Boolean): typings.elasticElasticsearch.libApiTypesMod.AnalysisKuromojiReadingFormTokenFilter = {
    val __obj = js.Dynamic.literal(use_romaji = use_romaji.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("kuromoji_readingform")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisKuromojiReadingFormTokenFilter]
  }
  
  inline def AnalysisKuromojiStemmerTokenFilter(minimum_length: integer): typings.elasticElasticsearch.libApiTypesMod.AnalysisKuromojiStemmerTokenFilter = {
    val __obj = js.Dynamic.literal(minimum_length = minimum_length.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("kuromoji_stemmer")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisKuromojiStemmerTokenFilter]
  }
  
  inline def AnalysisLengthTokenFilter(): typings.elasticElasticsearch.libApiTypesMod.AnalysisLengthTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("length")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisLengthTokenFilter]
  }
  
  inline def AnalysisLimitTokenCountTokenFilter(): typings.elasticElasticsearch.libApiTypesMod.AnalysisLimitTokenCountTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("limit")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisLimitTokenCountTokenFilter]
  }
  
  inline def AnalysisLowercaseTokenFilter(): typings.elasticElasticsearch.libApiTypesMod.AnalysisLowercaseTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("lowercase")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisLowercaseTokenFilter]
  }
  
  inline def AnalysisMultiplexerTokenFilter(filters: js.Array[String]): typings.elasticElasticsearch.libApiTypesMod.AnalysisMultiplexerTokenFilter = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("multiplexer")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisMultiplexerTokenFilter]
  }
  
  inline def AnalysisNGramTokenFilter(): typings.elasticElasticsearch.libApiTypesMod.AnalysisNGramTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ngram")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisNGramTokenFilter]
  }
  
  inline def AnalysisNoriPartOfSpeechTokenFilter(): typings.elasticElasticsearch.libApiTypesMod.AnalysisNoriPartOfSpeechTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("nori_part_of_speech")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisNoriPartOfSpeechTokenFilter]
  }
  
  inline def AnalysisPatternCaptureTokenFilter(patterns: js.Array[String]): typings.elasticElasticsearch.libApiTypesMod.AnalysisPatternCaptureTokenFilter = {
    val __obj = js.Dynamic.literal(patterns = patterns.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("pattern_capture")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisPatternCaptureTokenFilter]
  }
  
  inline def AnalysisPatternReplaceTokenFilter(pattern: String): typings.elasticElasticsearch.libApiTypesMod.AnalysisPatternReplaceTokenFilter = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("pattern_replace")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisPatternReplaceTokenFilter]
  }
  
  inline def AnalysisPhoneticTokenFilter(
    encoder: AnalysisPhoneticEncoder,
    languageset: js.Array[AnalysisPhoneticLanguage],
    name_type: AnalysisPhoneticNameType,
    rule_type: AnalysisPhoneticRuleType
  ): typings.elasticElasticsearch.libApiTypesMod.AnalysisPhoneticTokenFilter = {
    val __obj = js.Dynamic.literal(encoder = encoder.asInstanceOf[js.Any], languageset = languageset.asInstanceOf[js.Any], name_type = name_type.asInstanceOf[js.Any], rule_type = rule_type.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("phonetic")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisPhoneticTokenFilter]
  }
  
  inline def AnalysisPorterStemTokenFilter(): typings.elasticElasticsearch.libApiTypesMod.AnalysisPorterStemTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("porter_stem")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisPorterStemTokenFilter]
  }
  
  inline def AnalysisPredicateTokenFilter(script: Script): typings.elasticElasticsearch.libApiTypesMod.AnalysisPredicateTokenFilter = {
    val __obj = js.Dynamic.literal(script = script.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("predicate_token_filter")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisPredicateTokenFilter]
  }
  
  inline def AnalysisRemoveDuplicatesTokenFilter(): typings.elasticElasticsearch.libApiTypesMod.AnalysisRemoveDuplicatesTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("remove_duplicates")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisRemoveDuplicatesTokenFilter]
  }
  
  inline def AnalysisReverseTokenFilter(): typings.elasticElasticsearch.libApiTypesMod.AnalysisReverseTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("reverse")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisReverseTokenFilter]
  }
  
  inline def AnalysisShingleTokenFilter(): typings.elasticElasticsearch.libApiTypesMod.AnalysisShingleTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("shingle")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisShingleTokenFilter]
  }
  
  inline def AnalysisSnowballTokenFilter(language: AnalysisSnowballLanguage): typings.elasticElasticsearch.libApiTypesMod.AnalysisSnowballTokenFilter = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("snowball")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisSnowballTokenFilter]
  }
  
  inline def AnalysisStemmerOverrideTokenFilter(): typings.elasticElasticsearch.libApiTypesMod.AnalysisStemmerOverrideTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("stemmer_override")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisStemmerOverrideTokenFilter]
  }
  
  inline def AnalysisStemmerTokenFilter(language: String): typings.elasticElasticsearch.libApiTypesMod.AnalysisStemmerTokenFilter = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("stemmer")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisStemmerTokenFilter]
  }
  
  inline def AnalysisStopTokenFilter(): typings.elasticElasticsearch.libApiTypesMod.AnalysisStopTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("stop")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisStopTokenFilter]
  }
  
  inline def AnalysisSynonymGraphTokenFilter(): typings.elasticElasticsearch.libApiTypesMod.AnalysisSynonymGraphTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("synonym_graph")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisSynonymGraphTokenFilter]
  }
  
  inline def AnalysisSynonymTokenFilter(): typings.elasticElasticsearch.libApiTypesMod.AnalysisSynonymTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("synonym")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisSynonymTokenFilter]
  }
  
  inline def AnalysisTrimTokenFilter(): typings.elasticElasticsearch.libApiTypesMod.AnalysisTrimTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("trim")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisTrimTokenFilter]
  }
  
  inline def AnalysisTruncateTokenFilter(): typings.elasticElasticsearch.libApiTypesMod.AnalysisTruncateTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("truncate")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisTruncateTokenFilter]
  }
  
  inline def AnalysisUniqueTokenFilter(): typings.elasticElasticsearch.libApiTypesMod.AnalysisUniqueTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("unique")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisUniqueTokenFilter]
  }
  
  inline def AnalysisUppercaseTokenFilter(): typings.elasticElasticsearch.libApiTypesMod.AnalysisUppercaseTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("uppercase")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisUppercaseTokenFilter]
  }
  
  inline def AnalysisWordDelimiterGraphTokenFilter(): typings.elasticElasticsearch.libApiTypesMod.AnalysisWordDelimiterGraphTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("word_delimiter_graph")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisWordDelimiterGraphTokenFilter]
  }
  
  inline def AnalysisWordDelimiterTokenFilter(): typings.elasticElasticsearch.libApiTypesMod.AnalysisWordDelimiterTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("word_delimiter")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisWordDelimiterTokenFilter]
  }
}
