package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappingRoutingField extends StObject {
  
  var required: Boolean
}
object MappingRoutingField {
  
  inline def apply(required: Boolean): MappingRoutingField = {
    val __obj = js.Dynamic.literal(required = required.asInstanceOf[js.Any])
    __obj.asInstanceOf[MappingRoutingField]
  }
  
  extension [Self <: MappingRoutingField](x: Self) {
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
  }
}
