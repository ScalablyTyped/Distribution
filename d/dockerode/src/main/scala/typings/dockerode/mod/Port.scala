package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Port extends StObject {
  
  var IP: String = js.native
  
  var PrivatePort: Double = js.native
  
  var PublicPort: Double = js.native
  
  var Type: String = js.native
}
object Port {
  
  @scala.inline
  def apply(IP: String, PrivatePort: Double, PublicPort: Double, Type: String): Port = {
    val __obj = js.Dynamic.literal(IP = IP.asInstanceOf[js.Any], PrivatePort = PrivatePort.asInstanceOf[js.Any], PublicPort = PublicPort.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Port]
  }
  
  @scala.inline
  implicit class PortMutableBuilder[Self <: Port] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIP(value: String): Self = StObject.set(x, "IP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivatePort(value: Double): Self = StObject.set(x, "PrivatePort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicPort(value: Double): Self = StObject.set(x, "PublicPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
