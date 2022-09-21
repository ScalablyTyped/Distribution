package typings.dnsPacket.mod

import typings.dnsPacket.dnsPacketStrings.TCP_KEEPALIVE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeepAliveOpt
  extends StObject
     with GenericOpt[TCP_KEEPALIVE]
     with PacketOpt {
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object KeepAliveOpt {
  
  inline def apply(code: OptCode[TCP_KEEPALIVE]): KeepAliveOpt = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeepAliveOpt]
  }
  
  extension [Self <: KeepAliveOpt](x: Self) {
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
