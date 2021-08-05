package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginInterfaceType extends StObject {
  
  var Capability: String
  
  var Prefix: String
  
  var Version: String
}
object PluginInterfaceType {
  
  inline def apply(Capability: String, Prefix: String, Version: String): PluginInterfaceType = {
    val __obj = js.Dynamic.literal(Capability = Capability.asInstanceOf[js.Any], Prefix = Prefix.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginInterfaceType]
  }
  
  extension [Self <: PluginInterfaceType](x: Self) {
    
    inline def setCapability(value: String): Self = StObject.set(x, "Capability", value.asInstanceOf[js.Any])
    
    inline def setPrefix(value: String): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
  }
}
