package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Interface extends StObject {
  
  var Socket: String = js.native
  
  var Types: js.Array[PluginInterfaceType] = js.native
}
object Interface {
  
  @scala.inline
  def apply(Socket: String, Types: js.Array[PluginInterfaceType]): Interface = {
    val __obj = js.Dynamic.literal(Socket = Socket.asInstanceOf[js.Any], Types = Types.asInstanceOf[js.Any])
    __obj.asInstanceOf[Interface]
  }
  
  @scala.inline
  implicit class InterfaceMutableBuilder[Self <: Interface] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSocket(value: String): Self = StObject.set(x, "Socket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypes(value: js.Array[PluginInterfaceType]): Self = StObject.set(x, "Types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesVarargs(value: PluginInterfaceType*): Self = StObject.set(x, "Types", js.Array(value :_*))
  }
}
