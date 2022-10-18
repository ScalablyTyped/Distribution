package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappingDataStreamTimestamp extends StObject {
  
  var enabled: Boolean
}
object MappingDataStreamTimestamp {
  
  inline def apply(enabled: Boolean): MappingDataStreamTimestamp = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[MappingDataStreamTimestamp]
  }
  
  extension [Self <: MappingDataStreamTimestamp](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
