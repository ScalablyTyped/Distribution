package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.scaled_float
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappingScaledFloatNumberProperty
  extends StObject
     with MappingNumberPropertyBase
     with MappingProperty {
  
  var null_value: js.UndefOr[double] = js.undefined
  
  var scaling_factor: js.UndefOr[double] = js.undefined
  
  var `type`: scaled_float
}
object MappingScaledFloatNumberProperty {
  
  inline def apply(): MappingScaledFloatNumberProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("scaled_float")
    __obj.asInstanceOf[MappingScaledFloatNumberProperty]
  }
  
  extension [Self <: MappingScaledFloatNumberProperty](x: Self) {
    
    inline def setNull_value(value: double): Self = StObject.set(x, "null_value", value.asInstanceOf[js.Any])
    
    inline def setNull_valueUndefined: Self = StObject.set(x, "null_value", js.undefined)
    
    inline def setScaling_factor(value: double): Self = StObject.set(x, "scaling_factor", value.asInstanceOf[js.Any])
    
    inline def setScaling_factorUndefined: Self = StObject.set(x, "scaling_factor", js.undefined)
    
    inline def setType(value: scaled_float): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
