package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnixEndpointAddress extends SocketEndpointAddress {
  
  /**
    * UNIX socket path.
    */
  var path: String = js.native
}
object UnixEndpointAddress {
  
  @scala.inline
  def apply(path: String): UnixEndpointAddress = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnixEndpointAddress]
  }
  
  @scala.inline
  implicit class UnixEndpointAddressMutableBuilder[Self <: UnixEndpointAddress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
