package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.binary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappingBinaryProperty
  extends StObject
     with MappingDocValuesPropertyBase
     with MappingProperty {
  
  var `type`: binary
}
object MappingBinaryProperty {
  
  inline def apply(): MappingBinaryProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("binary")
    __obj.asInstanceOf[MappingBinaryProperty]
  }
  
  extension [Self <: MappingBinaryProperty](x: Self) {
    
    inline def setType(value: binary): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
