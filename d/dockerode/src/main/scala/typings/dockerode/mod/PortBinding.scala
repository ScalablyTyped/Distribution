package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PortBinding extends StObject {
  
  var HostIp: js.UndefOr[String] = js.undefined
  
  var HostPort: js.UndefOr[String] = js.undefined
}
object PortBinding {
  
  inline def apply(): PortBinding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortBinding]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PortBinding] (val x: Self) extends AnyVal {
    
    inline def setHostIp(value: String): Self = StObject.set(x, "HostIp", value.asInstanceOf[js.Any])
    
    inline def setHostIpUndefined: Self = StObject.set(x, "HostIp", js.undefined)
    
    inline def setHostPort(value: String): Self = StObject.set(x, "HostPort", value.asInstanceOf[js.Any])
    
    inline def setHostPortUndefined: Self = StObject.set(x, "HostPort", js.undefined)
  }
}
