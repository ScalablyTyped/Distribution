package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XpackUsageBase extends StObject {
  
  var available: Boolean
  
  var enabled: Boolean
}
object XpackUsageBase {
  
  inline def apply(available: Boolean, enabled: Boolean): XpackUsageBase = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[XpackUsageBase]
  }
  
  extension [Self <: XpackUsageBase](x: Self) {
    
    inline def setAvailable(value: Boolean): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
