package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.murmur3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappingMurmur3HashProperty
  extends StObject
     with MappingDocValuesPropertyBase
     with MappingProperty {
  
  var `type`: murmur3
}
object MappingMurmur3HashProperty {
  
  inline def apply(): MappingMurmur3HashProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("murmur3")
    __obj.asInstanceOf[MappingMurmur3HashProperty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MappingMurmur3HashProperty] (val x: Self) extends AnyVal {
    
    inline def setType(value: murmur3): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
