package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.fridaGum.TcpEndpointAddress
  - typings.fridaGum.UnixEndpointAddress
*/
trait SocketEndpointAddress extends js.Object
object SocketEndpointAddress {
  
  @scala.inline
  def TcpEndpointAddress(ip: String, port: Double): SocketEndpointAddress = {
    val __obj = js.Dynamic.literal(ip = ip.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketEndpointAddress]
  }
  
  @scala.inline
  def UnixEndpointAddress(path: String): SocketEndpointAddress = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketEndpointAddress]
  }
}
