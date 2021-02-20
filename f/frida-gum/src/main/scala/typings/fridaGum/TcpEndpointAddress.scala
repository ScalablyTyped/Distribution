package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TcpEndpointAddress extends SocketEndpointAddress {
  
  /**
    * IP address.
    */
  var ip: String = js.native
  
  /**
    * Port.
    */
  var port: Double = js.native
}
object TcpEndpointAddress {
  
  @scala.inline
  def apply(ip: String, port: Double): TcpEndpointAddress = {
    val __obj = js.Dynamic.literal(ip = ip.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[TcpEndpointAddress]
  }
  
  @scala.inline
  implicit class TcpEndpointAddressMutableBuilder[Self <: TcpEndpointAddress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
  }
}
