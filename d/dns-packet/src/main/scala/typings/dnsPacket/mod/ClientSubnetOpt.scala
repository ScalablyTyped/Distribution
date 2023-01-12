package typings.dnsPacket.mod

import typings.dnsPacket.dnsPacketStrings.CLIENT_SUBNET
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientSubnetOpt
  extends StObject
     with GenericOpt[CLIENT_SUBNET]
     with PacketOpt {
  
  var family: js.UndefOr[Double] = js.undefined
  
  var ip: js.UndefOr[String] = js.undefined
  
  var scopePrefixLength: js.UndefOr[Double] = js.undefined
  
  var sourcePrefixLength: js.UndefOr[Double] = js.undefined
}
object ClientSubnetOpt {
  
  inline def apply(code: OptCode[CLIENT_SUBNET]): ClientSubnetOpt = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientSubnetOpt]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClientSubnetOpt] (val x: Self) extends AnyVal {
    
    inline def setFamily(value: Double): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
    
    inline def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
    
    inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
    
    inline def setIpUndefined: Self = StObject.set(x, "ip", js.undefined)
    
    inline def setScopePrefixLength(value: Double): Self = StObject.set(x, "scopePrefixLength", value.asInstanceOf[js.Any])
    
    inline def setScopePrefixLengthUndefined: Self = StObject.set(x, "scopePrefixLength", js.undefined)
    
    inline def setSourcePrefixLength(value: Double): Self = StObject.set(x, "sourcePrefixLength", value.asInstanceOf[js.Any])
    
    inline def setSourcePrefixLengthUndefined: Self = StObject.set(x, "sourcePrefixLength", js.undefined)
  }
}
