package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappingFloatNumberProperty
  extends StObject
     with MappingNumberPropertyBase
     with MappingProperty {
  
  var null_value: js.UndefOr[float] = js.undefined
  
  var `type`: typings.elasticElasticsearch.elasticElasticsearchStrings.float
}
object MappingFloatNumberProperty {
  
  inline def apply(): MappingFloatNumberProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("float")
    __obj.asInstanceOf[MappingFloatNumberProperty]
  }
  
  extension [Self <: MappingFloatNumberProperty](x: Self) {
    
    inline def setNull_value(value: float): Self = StObject.set(x, "null_value", value.asInstanceOf[js.Any])
    
    inline def setNull_valueUndefined: Self = StObject.set(x, "null_value", js.undefined)
    
    inline def setType(value: typings.elasticElasticsearch.elasticElasticsearchStrings.float): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
