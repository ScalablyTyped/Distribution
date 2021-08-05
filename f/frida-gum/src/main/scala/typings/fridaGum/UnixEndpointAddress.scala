package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnixEndpointAddress
  extends StObject
     with SocketEndpointAddress {
  
  /**
    * UNIX socket path.
    */
  var path: String
}
object UnixEndpointAddress {
  
  inline def apply(path: String): UnixEndpointAddress = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnixEndpointAddress]
  }
  
  extension [Self <: UnixEndpointAddress](x: Self) {
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
