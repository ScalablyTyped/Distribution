package typings.dockerode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type extends StObject {
  
  var Config: Any
  
  var Type: String
}
object Type {
  
  inline def apply(Config: Any, Type: String): Type = {
    val __obj = js.Dynamic.literal(Config = Config.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  
  extension [Self <: Type](x: Self) {
    
    inline def setConfig(value: Any): Self = StObject.set(x, "Config", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
