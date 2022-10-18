package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.keyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappingKeywordProperty
  extends StObject
     with MappingDocValuesPropertyBase
     with MappingProperty {
  
  var boost: js.UndefOr[double] = js.undefined
  
  var eager_global_ordinals: js.UndefOr[Boolean] = js.undefined
  
  var index: js.UndefOr[Boolean] = js.undefined
  
  var index_options: js.UndefOr[MappingIndexOptions] = js.undefined
  
  var normalizer: js.UndefOr[String] = js.undefined
  
  var norms: js.UndefOr[Boolean] = js.undefined
  
  var null_value: js.UndefOr[String] = js.undefined
  
  var split_queries_on_whitespace: js.UndefOr[Boolean] = js.undefined
  
  var time_series_dimension: js.UndefOr[Boolean] = js.undefined
  
  var `type`: keyword
}
object MappingKeywordProperty {
  
  inline def apply(): MappingKeywordProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("keyword")
    __obj.asInstanceOf[MappingKeywordProperty]
  }
  
  extension [Self <: MappingKeywordProperty](x: Self) {
    
    inline def setBoost(value: double): Self = StObject.set(x, "boost", value.asInstanceOf[js.Any])
    
    inline def setBoostUndefined: Self = StObject.set(x, "boost", js.undefined)
    
    inline def setEager_global_ordinals(value: Boolean): Self = StObject.set(x, "eager_global_ordinals", value.asInstanceOf[js.Any])
    
    inline def setEager_global_ordinalsUndefined: Self = StObject.set(x, "eager_global_ordinals", js.undefined)
    
    inline def setIndex(value: Boolean): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setIndex_options(value: MappingIndexOptions): Self = StObject.set(x, "index_options", value.asInstanceOf[js.Any])
    
    inline def setIndex_optionsUndefined: Self = StObject.set(x, "index_options", js.undefined)
    
    inline def setNormalizer(value: String): Self = StObject.set(x, "normalizer", value.asInstanceOf[js.Any])
    
    inline def setNormalizerUndefined: Self = StObject.set(x, "normalizer", js.undefined)
    
    inline def setNorms(value: Boolean): Self = StObject.set(x, "norms", value.asInstanceOf[js.Any])
    
    inline def setNormsUndefined: Self = StObject.set(x, "norms", js.undefined)
    
    inline def setNull_value(value: String): Self = StObject.set(x, "null_value", value.asInstanceOf[js.Any])
    
    inline def setNull_valueUndefined: Self = StObject.set(x, "null_value", js.undefined)
    
    inline def setSplit_queries_on_whitespace(value: Boolean): Self = StObject.set(x, "split_queries_on_whitespace", value.asInstanceOf[js.Any])
    
    inline def setSplit_queries_on_whitespaceUndefined: Self = StObject.set(x, "split_queries_on_whitespace", js.undefined)
    
    inline def setTime_series_dimension(value: Boolean): Self = StObject.set(x, "time_series_dimension", value.asInstanceOf[js.Any])
    
    inline def setTime_series_dimensionUndefined: Self = StObject.set(x, "time_series_dimension", js.undefined)
    
    inline def setType(value: keyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
