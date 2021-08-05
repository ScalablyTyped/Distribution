package typings.dockerode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Architecture extends StObject {
  
  var Architecture: String
  
  var OS: String
}
object Architecture {
  
  inline def apply(Architecture: String, OS: String): Architecture = {
    val __obj = js.Dynamic.literal(Architecture = Architecture.asInstanceOf[js.Any], OS = OS.asInstanceOf[js.Any])
    __obj.asInstanceOf[Architecture]
  }
  
  extension [Self <: Architecture](x: Self) {
    
    inline def setArchitecture(value: String): Self = StObject.set(x, "Architecture", value.asInstanceOf[js.Any])
    
    inline def setOS(value: String): Self = StObject.set(x, "OS", value.asInstanceOf[js.Any])
  }
}
