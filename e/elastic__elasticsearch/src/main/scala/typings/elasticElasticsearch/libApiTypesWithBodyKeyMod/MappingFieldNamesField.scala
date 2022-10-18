package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappingFieldNamesField extends StObject {
  
  var enabled: Boolean
}
object MappingFieldNamesField {
  
  inline def apply(enabled: Boolean): MappingFieldNamesField = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[MappingFieldNamesField]
  }
  
  extension [Self <: MappingFieldNamesField](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
