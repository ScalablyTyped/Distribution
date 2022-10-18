package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.float_range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappingFloatRangeProperty
  extends StObject
     with MappingRangePropertyBase
     with MappingProperty {
  
  var `type`: float_range
}
object MappingFloatRangeProperty {
  
  inline def apply(): MappingFloatRangeProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("float_range")
    __obj.asInstanceOf[MappingFloatRangeProperty]
  }
  
  extension [Self <: MappingFloatRangeProperty](x: Self) {
    
    inline def setType(value: float_range): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
