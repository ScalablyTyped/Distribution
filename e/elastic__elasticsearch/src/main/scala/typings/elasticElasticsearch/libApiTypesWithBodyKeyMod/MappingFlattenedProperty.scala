package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.flattened
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappingFlattenedProperty
  extends StObject
     with MappingPropertyBase
     with MappingProperty {
  
  var boost: js.UndefOr[double] = js.undefined
  
  var depth_limit: js.UndefOr[integer] = js.undefined
  
  var doc_values: js.UndefOr[Boolean] = js.undefined
  
  var eager_global_ordinals: js.UndefOr[Boolean] = js.undefined
  
  var index: js.UndefOr[Boolean] = js.undefined
  
  var index_options: js.UndefOr[MappingIndexOptions] = js.undefined
  
  var null_value: js.UndefOr[String] = js.undefined
  
  var similarity: js.UndefOr[String] = js.undefined
  
  var split_queries_on_whitespace: js.UndefOr[Boolean] = js.undefined
  
  var `type`: flattened
}
object MappingFlattenedProperty {
  
  inline def apply(): MappingFlattenedProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("flattened")
    __obj.asInstanceOf[MappingFlattenedProperty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MappingFlattenedProperty] (val x: Self) extends AnyVal {
    
    inline def setBoost(value: double): Self = StObject.set(x, "boost", value.asInstanceOf[js.Any])
    
    inline def setBoostUndefined: Self = StObject.set(x, "boost", js.undefined)
    
    inline def setDepth_limit(value: integer): Self = StObject.set(x, "depth_limit", value.asInstanceOf[js.Any])
    
    inline def setDepth_limitUndefined: Self = StObject.set(x, "depth_limit", js.undefined)
    
    inline def setDoc_values(value: Boolean): Self = StObject.set(x, "doc_values", value.asInstanceOf[js.Any])
    
    inline def setDoc_valuesUndefined: Self = StObject.set(x, "doc_values", js.undefined)
    
    inline def setEager_global_ordinals(value: Boolean): Self = StObject.set(x, "eager_global_ordinals", value.asInstanceOf[js.Any])
    
    inline def setEager_global_ordinalsUndefined: Self = StObject.set(x, "eager_global_ordinals", js.undefined)
    
    inline def setIndex(value: Boolean): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setIndex_options(value: MappingIndexOptions): Self = StObject.set(x, "index_options", value.asInstanceOf[js.Any])
    
    inline def setIndex_optionsUndefined: Self = StObject.set(x, "index_options", js.undefined)
    
    inline def setNull_value(value: String): Self = StObject.set(x, "null_value", value.asInstanceOf[js.Any])
    
    inline def setNull_valueUndefined: Self = StObject.set(x, "null_value", js.undefined)
    
    inline def setSimilarity(value: String): Self = StObject.set(x, "similarity", value.asInstanceOf[js.Any])
    
    inline def setSimilarityUndefined: Self = StObject.set(x, "similarity", js.undefined)
    
    inline def setSplit_queries_on_whitespace(value: Boolean): Self = StObject.set(x, "split_queries_on_whitespace", value.asInstanceOf[js.Any])
    
    inline def setSplit_queries_on_whitespaceUndefined: Self = StObject.set(x, "split_queries_on_whitespace", js.undefined)
    
    inline def setType(value: flattened): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
