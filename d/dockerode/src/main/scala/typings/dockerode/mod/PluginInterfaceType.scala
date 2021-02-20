package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginInterfaceType extends StObject {
  
  var Capability: String = js.native
  
  var Prefix: String = js.native
  
  var Version: String = js.native
}
object PluginInterfaceType {
  
  @scala.inline
  def apply(Capability: String, Prefix: String, Version: String): PluginInterfaceType = {
    val __obj = js.Dynamic.literal(Capability = Capability.asInstanceOf[js.Any], Prefix = Prefix.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginInterfaceType]
  }
  
  @scala.inline
  implicit class PluginInterfaceTypeMutableBuilder[Self <: PluginInterfaceType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapability(value: String): Self = StObject.set(x, "Capability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefix(value: String): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
  }
}
