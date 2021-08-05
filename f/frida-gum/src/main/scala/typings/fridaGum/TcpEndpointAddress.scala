package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TcpEndpointAddress
  extends StObject
     with SocketEndpointAddress {
  
  /**
    * IP address.
    */
  var ip: String
  
  /**
    * Port.
    */
  var port: Double
}
object TcpEndpointAddress {
  
  inline def apply(ip: String, port: Double): TcpEndpointAddress = {
    val __obj = js.Dynamic.literal(ip = ip.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[TcpEndpointAddress]
  }
  
  extension [Self <: TcpEndpointAddress](x: Self) {
    
    inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
  }
}
