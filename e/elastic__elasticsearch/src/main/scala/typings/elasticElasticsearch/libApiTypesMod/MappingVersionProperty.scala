package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappingVersionProperty
  extends StObject
     with MappingDocValuesPropertyBase
     with MappingProperty {
  
  var `type`: version
}
object MappingVersionProperty {
  
  inline def apply(): MappingVersionProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("version")
    __obj.asInstanceOf[MappingVersionProperty]
  }
  
  extension [Self <: MappingVersionProperty](x: Self) {
    
    inline def setType(value: version): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
