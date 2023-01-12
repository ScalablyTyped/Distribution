package typings.dockerode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HostIp extends StObject {
  
  var HostIp: String
  
  var HostPort: String
}
object HostIp {
  
  inline def apply(HostIp: String, HostPort: String): HostIp = {
    val __obj = js.Dynamic.literal(HostIp = HostIp.asInstanceOf[js.Any], HostPort = HostPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostIp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HostIp] (val x: Self) extends AnyVal {
    
    inline def setHostIp(value: String): Self = StObject.set(x, "HostIp", value.asInstanceOf[js.Any])
    
    inline def setHostPort(value: String): Self = StObject.set(x, "HostPort", value.asInstanceOf[js.Any])
  }
}
