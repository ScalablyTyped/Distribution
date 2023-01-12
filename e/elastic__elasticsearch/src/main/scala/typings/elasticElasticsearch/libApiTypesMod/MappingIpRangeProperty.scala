package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.ip_range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappingIpRangeProperty
  extends StObject
     with MappingRangePropertyBase
     with MappingProperty {
  
  var `type`: ip_range
}
object MappingIpRangeProperty {
  
  inline def apply(): MappingIpRangeProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ip_range")
    __obj.asInstanceOf[MappingIpRangeProperty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MappingIpRangeProperty] (val x: Self) extends AnyVal {
    
    inline def setType(value: ip_range): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
