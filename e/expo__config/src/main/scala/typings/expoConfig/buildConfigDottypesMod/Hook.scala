package typings.expoConfig.buildConfigDottypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hook extends StObject {
  
  var config: Any
  
  var file: String
}
object Hook {
  
  inline def apply(config: Any, file: String): Hook = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hook]
  }
  
  extension [Self <: Hook](x: Self) {
    
    inline def setConfig(value: Any): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
  }
}
