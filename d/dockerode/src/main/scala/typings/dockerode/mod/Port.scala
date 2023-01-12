package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Port extends StObject {
  
  var IP: String
  
  var PrivatePort: Double
  
  var PublicPort: Double
  
  var Type: String
}
object Port {
  
  inline def apply(IP: String, PrivatePort: Double, PublicPort: Double, Type: String): Port = {
    val __obj = js.Dynamic.literal(IP = IP.asInstanceOf[js.Any], PrivatePort = PrivatePort.asInstanceOf[js.Any], PublicPort = PublicPort.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Port]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Port] (val x: Self) extends AnyVal {
    
    inline def setIP(value: String): Self = StObject.set(x, "IP", value.asInstanceOf[js.Any])
    
    inline def setPrivatePort(value: Double): Self = StObject.set(x, "PrivatePort", value.asInstanceOf[js.Any])
    
    inline def setPublicPort(value: Double): Self = StObject.set(x, "PublicPort", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
