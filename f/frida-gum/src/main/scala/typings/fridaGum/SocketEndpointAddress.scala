package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.fridaGum.TcpEndpointAddress
  - typings.fridaGum.UnixEndpointAddress
*/
trait SocketEndpointAddress extends StObject
object SocketEndpointAddress {
  
  inline def TcpEndpointAddress(ip: String, port: Double): typings.fridaGum.TcpEndpointAddress = {
    val __obj = js.Dynamic.literal(ip = ip.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fridaGum.TcpEndpointAddress]
  }
  
  inline def UnixEndpointAddress(path: String): typings.fridaGum.UnixEndpointAddress = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fridaGum.UnixEndpointAddress]
  }
}
