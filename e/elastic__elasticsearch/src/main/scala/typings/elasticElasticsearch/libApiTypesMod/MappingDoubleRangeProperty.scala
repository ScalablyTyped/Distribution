package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.double_range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappingDoubleRangeProperty
  extends StObject
     with MappingRangePropertyBase
     with MappingProperty {
  
  var `type`: double_range
}
object MappingDoubleRangeProperty {
  
  inline def apply(): MappingDoubleRangeProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("double_range")
    __obj.asInstanceOf[MappingDoubleRangeProperty]
  }
  
  extension [Self <: MappingDoubleRangeProperty](x: Self) {
    
    inline def setType(value: double_range): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
