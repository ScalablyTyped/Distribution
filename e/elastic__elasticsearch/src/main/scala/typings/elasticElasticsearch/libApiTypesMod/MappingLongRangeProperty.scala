package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.long_range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappingLongRangeProperty
  extends StObject
     with MappingRangePropertyBase
     with MappingProperty {
  
  var `type`: long_range
}
object MappingLongRangeProperty {
  
  inline def apply(): MappingLongRangeProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("long_range")
    __obj.asInstanceOf[MappingLongRangeProperty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MappingLongRangeProperty] (val x: Self) extends AnyVal {
    
    inline def setType(value: long_range): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
