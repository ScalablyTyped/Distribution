package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.integer_range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappingIntegerRangeProperty
  extends StObject
     with MappingRangePropertyBase
     with MappingProperty {
  
  var `type`: integer_range
}
object MappingIntegerRangeProperty {
  
  inline def apply(): MappingIntegerRangeProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("integer_range")
    __obj.asInstanceOf[MappingIntegerRangeProperty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MappingIntegerRangeProperty] (val x: Self) extends AnyVal {
    
    inline def setType(value: integer_range): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
