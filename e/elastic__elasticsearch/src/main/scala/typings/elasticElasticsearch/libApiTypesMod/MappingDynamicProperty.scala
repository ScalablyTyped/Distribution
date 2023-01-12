package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.Leftcurlybracketdynamic_propertyRightcurlybracket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappingDynamicProperty
  extends StObject
     with MappingDocValuesPropertyBase
     with MappingProperty {
  
  var analyzer: js.UndefOr[String] = js.undefined
  
  var boost: js.UndefOr[double] = js.undefined
  
  var coerce: js.UndefOr[Boolean] = js.undefined
  
  var eager_global_ordinals: js.UndefOr[Boolean] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var format: js.UndefOr[String] = js.undefined
  
  var ignore_malformed: js.UndefOr[Boolean] = js.undefined
  
  var index: js.UndefOr[Boolean] = js.undefined
  
  var index_options: js.UndefOr[MappingIndexOptions] = js.undefined
  
  var index_phrases: js.UndefOr[Boolean] = js.undefined
  
  var index_prefixes: js.UndefOr[MappingTextIndexPrefixes] = js.undefined
  
  var locale: js.UndefOr[String] = js.undefined
  
  var norms: js.UndefOr[Boolean] = js.undefined
  
  var null_value: js.UndefOr[FieldValue] = js.undefined
  
  var on_script_error: js.UndefOr[MappingOnScriptError] = js.undefined
  
  var position_increment_gap: js.UndefOr[integer] = js.undefined
  
  var precision_step: js.UndefOr[integer] = js.undefined
  
  var script: js.UndefOr[Script] = js.undefined
  
  var search_analyzer: js.UndefOr[String] = js.undefined
  
  var search_quote_analyzer: js.UndefOr[String] = js.undefined
  
  var term_vector: js.UndefOr[MappingTermVectorOption] = js.undefined
  
  var time_series_metric: js.UndefOr[MappingTimeSeriesMetricType] = js.undefined
  
  var `type`: Leftcurlybracketdynamic_propertyRightcurlybracket
}
object MappingDynamicProperty {
  
  inline def apply(): MappingDynamicProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("{dynamic_property}")
    __obj.asInstanceOf[MappingDynamicProperty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MappingDynamicProperty] (val x: Self) extends AnyVal {
    
    inline def setAnalyzer(value: String): Self = StObject.set(x, "analyzer", value.asInstanceOf[js.Any])
    
    inline def setAnalyzerUndefined: Self = StObject.set(x, "analyzer", js.undefined)
    
    inline def setBoost(value: double): Self = StObject.set(x, "boost", value.asInstanceOf[js.Any])
    
    inline def setBoostUndefined: Self = StObject.set(x, "boost", js.undefined)
    
    inline def setCoerce(value: Boolean): Self = StObject.set(x, "coerce", value.asInstanceOf[js.Any])
    
    inline def setCoerceUndefined: Self = StObject.set(x, "coerce", js.undefined)
    
    inline def setEager_global_ordinals(value: Boolean): Self = StObject.set(x, "eager_global_ordinals", value.asInstanceOf[js.Any])
    
    inline def setEager_global_ordinalsUndefined: Self = StObject.set(x, "eager_global_ordinals", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setIgnore_malformed(value: Boolean): Self = StObject.set(x, "ignore_malformed", value.asInstanceOf[js.Any])
    
    inline def setIgnore_malformedUndefined: Self = StObject.set(x, "ignore_malformed", js.undefined)
    
    inline def setIndex(value: Boolean): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setIndex_options(value: MappingIndexOptions): Self = StObject.set(x, "index_options", value.asInstanceOf[js.Any])
    
    inline def setIndex_optionsUndefined: Self = StObject.set(x, "index_options", js.undefined)
    
    inline def setIndex_phrases(value: Boolean): Self = StObject.set(x, "index_phrases", value.asInstanceOf[js.Any])
    
    inline def setIndex_phrasesUndefined: Self = StObject.set(x, "index_phrases", js.undefined)
    
    inline def setIndex_prefixes(value: MappingTextIndexPrefixes): Self = StObject.set(x, "index_prefixes", value.asInstanceOf[js.Any])
    
    inline def setIndex_prefixesUndefined: Self = StObject.set(x, "index_prefixes", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setNorms(value: Boolean): Self = StObject.set(x, "norms", value.asInstanceOf[js.Any])
    
    inline def setNormsUndefined: Self = StObject.set(x, "norms", js.undefined)
    
    inline def setNull_value(value: FieldValue): Self = StObject.set(x, "null_value", value.asInstanceOf[js.Any])
    
    inline def setNull_valueNull: Self = StObject.set(x, "null_value", null)
    
    inline def setNull_valueUndefined: Self = StObject.set(x, "null_value", js.undefined)
    
    inline def setOn_script_error(value: MappingOnScriptError): Self = StObject.set(x, "on_script_error", value.asInstanceOf[js.Any])
    
    inline def setOn_script_errorUndefined: Self = StObject.set(x, "on_script_error", js.undefined)
    
    inline def setPosition_increment_gap(value: integer): Self = StObject.set(x, "position_increment_gap", value.asInstanceOf[js.Any])
    
    inline def setPosition_increment_gapUndefined: Self = StObject.set(x, "position_increment_gap", js.undefined)
    
    inline def setPrecision_step(value: integer): Self = StObject.set(x, "precision_step", value.asInstanceOf[js.Any])
    
    inline def setPrecision_stepUndefined: Self = StObject.set(x, "precision_step", js.undefined)
    
    inline def setScript(value: Script): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    inline def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
    
    inline def setSearch_analyzer(value: String): Self = StObject.set(x, "search_analyzer", value.asInstanceOf[js.Any])
    
    inline def setSearch_analyzerUndefined: Self = StObject.set(x, "search_analyzer", js.undefined)
    
    inline def setSearch_quote_analyzer(value: String): Self = StObject.set(x, "search_quote_analyzer", value.asInstanceOf[js.Any])
    
    inline def setSearch_quote_analyzerUndefined: Self = StObject.set(x, "search_quote_analyzer", js.undefined)
    
    inline def setTerm_vector(value: MappingTermVectorOption): Self = StObject.set(x, "term_vector", value.asInstanceOf[js.Any])
    
    inline def setTerm_vectorUndefined: Self = StObject.set(x, "term_vector", js.undefined)
    
    inline def setTime_series_metric(value: MappingTimeSeriesMetricType): Self = StObject.set(x, "time_series_metric", value.asInstanceOf[js.Any])
    
    inline def setTime_series_metricUndefined: Self = StObject.set(x, "time_series_metric", js.undefined)
    
    inline def setType(value: Leftcurlybracketdynamic_propertyRightcurlybracket): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
