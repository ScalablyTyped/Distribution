package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.boolean
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappingBooleanProperty
  extends StObject
     with MappingDocValuesPropertyBase
     with MappingProperty {
  
  var boost: js.UndefOr[double] = js.undefined
  
  var fielddata: js.UndefOr[IndicesNumericFielddata] = js.undefined
  
  var index: js.UndefOr[Boolean] = js.undefined
  
  var null_value: js.UndefOr[Boolean] = js.undefined
  
  var `type`: boolean
}
object MappingBooleanProperty {
  
  inline def apply(): MappingBooleanProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("boolean")
    __obj.asInstanceOf[MappingBooleanProperty]
  }
  
  extension [Self <: MappingBooleanProperty](x: Self) {
    
    inline def setBoost(value: double): Self = StObject.set(x, "boost", value.asInstanceOf[js.Any])
    
    inline def setBoostUndefined: Self = StObject.set(x, "boost", js.undefined)
    
    inline def setFielddata(value: IndicesNumericFielddata): Self = StObject.set(x, "fielddata", value.asInstanceOf[js.Any])
    
    inline def setFielddataUndefined: Self = StObject.set(x, "fielddata", js.undefined)
    
    inline def setIndex(value: Boolean): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setNull_value(value: Boolean): Self = StObject.set(x, "null_value", value.asInstanceOf[js.Any])
    
    inline def setNull_valueUndefined: Self = StObject.set(x, "null_value", js.undefined)
    
    inline def setType(value: boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
