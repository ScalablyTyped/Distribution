package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PortBinding extends StObject {
  
  var HostIp: js.UndefOr[String] = js.native
  
  var HostPort: js.UndefOr[String] = js.native
}
object PortBinding {
  
  @scala.inline
  def apply(): PortBinding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortBinding]
  }
  
  @scala.inline
  implicit class PortBindingMutableBuilder[Self <: PortBinding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHostIp(value: String): Self = StObject.set(x, "HostIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostIpUndefined: Self = StObject.set(x, "HostIp", js.undefined)
    
    @scala.inline
    def setHostPort(value: String): Self = StObject.set(x, "HostPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostPortUndefined: Self = StObject.set(x, "HostPort", js.undefined)
  }
}
