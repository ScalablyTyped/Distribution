package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait browserInfoOptions extends StObject {
  
  var culture: Any
  
  var isMSPointerEnabled: Boolean
  
  var name: String
  
  var version: String
}
object browserInfoOptions {
  
  inline def apply(culture: Any, isMSPointerEnabled: Boolean, name: String, version: String): browserInfoOptions = {
    val __obj = js.Dynamic.literal(culture = culture.asInstanceOf[js.Any], isMSPointerEnabled = isMSPointerEnabled.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[browserInfoOptions]
  }
  
  extension [Self <: browserInfoOptions](x: Self) {
    
    inline def setCulture(value: Any): Self = StObject.set(x, "culture", value.asInstanceOf[js.Any])
    
    inline def setIsMSPointerEnabled(value: Boolean): Self = StObject.set(x, "isMSPointerEnabled", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
