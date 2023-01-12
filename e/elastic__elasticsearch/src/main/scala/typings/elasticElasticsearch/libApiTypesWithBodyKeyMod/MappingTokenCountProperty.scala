package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.token_count
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappingTokenCountProperty
  extends StObject
     with MappingDocValuesPropertyBase
     with MappingProperty {
  
  var analyzer: js.UndefOr[String] = js.undefined
  
  var boost: js.UndefOr[double] = js.undefined
  
  var enable_position_increments: js.UndefOr[Boolean] = js.undefined
  
  var index: js.UndefOr[Boolean] = js.undefined
  
  var null_value: js.UndefOr[double] = js.undefined
  
  var `type`: token_count
}
object MappingTokenCountProperty {
  
  inline def apply(): MappingTokenCountProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("token_count")
    __obj.asInstanceOf[MappingTokenCountProperty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MappingTokenCountProperty] (val x: Self) extends AnyVal {
    
    inline def setAnalyzer(value: String): Self = StObject.set(x, "analyzer", value.asInstanceOf[js.Any])
    
    inline def setAnalyzerUndefined: Self = StObject.set(x, "analyzer", js.undefined)
    
    inline def setBoost(value: double): Self = StObject.set(x, "boost", value.asInstanceOf[js.Any])
    
    inline def setBoostUndefined: Self = StObject.set(x, "boost", js.undefined)
    
    inline def setEnable_position_increments(value: Boolean): Self = StObject.set(x, "enable_position_increments", value.asInstanceOf[js.Any])
    
    inline def setEnable_position_incrementsUndefined: Self = StObject.set(x, "enable_position_increments", js.undefined)
    
    inline def setIndex(value: Boolean): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setNull_value(value: double): Self = StObject.set(x, "null_value", value.asInstanceOf[js.Any])
    
    inline def setNull_valueUndefined: Self = StObject.set(x, "null_value", js.undefined)
    
    inline def setType(value: token_count): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
