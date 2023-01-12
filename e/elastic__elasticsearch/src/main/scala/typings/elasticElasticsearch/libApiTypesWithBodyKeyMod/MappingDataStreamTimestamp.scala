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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MappingDataStreamTimestamp] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
