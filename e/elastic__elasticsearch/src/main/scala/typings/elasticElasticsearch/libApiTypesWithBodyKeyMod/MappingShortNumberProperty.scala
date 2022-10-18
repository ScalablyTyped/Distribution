package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappingShortNumberProperty
  extends StObject
     with MappingStandardNumberProperty
     with MappingProperty {
  
  var null_value: js.UndefOr[short] = js.undefined
  
  var `type`: typings.elasticElasticsearch.elasticElasticsearchStrings.short
}
object MappingShortNumberProperty {
  
  inline def apply(): MappingShortNumberProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("short")
    __obj.asInstanceOf[MappingShortNumberProperty]
  }
  
  extension [Self <: MappingShortNumberProperty](x: Self) {
    
    inline def setNull_value(value: short): Self = StObject.set(x, "null_value", value.asInstanceOf[js.Any])
    
    inline def setNull_valueUndefined: Self = StObject.set(x, "null_value", js.undefined)
    
    inline def setType(value: typings.elasticElasticsearch.elasticElasticsearchStrings.short): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
