package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappingIntegerNumberProperty
  extends StObject
     with MappingStandardNumberProperty
     with MappingProperty {
  
  var null_value: js.UndefOr[integer] = js.undefined
  
  var `type`: typings.elasticElasticsearch.elasticElasticsearchStrings.integer
}
object MappingIntegerNumberProperty {
  
  inline def apply(): MappingIntegerNumberProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("integer")
    __obj.asInstanceOf[MappingIntegerNumberProperty]
  }
  
  extension [Self <: MappingIntegerNumberProperty](x: Self) {
    
    inline def setNull_value(value: integer): Self = StObject.set(x, "null_value", value.asInstanceOf[js.Any])
    
    inline def setNull_valueUndefined: Self = StObject.set(x, "null_value", js.undefined)
    
    inline def setType(value: typings.elasticElasticsearch.elasticElasticsearchStrings.integer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
