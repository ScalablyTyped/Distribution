package typings.dnsPacket.mod

import typings.dnsPacket.dnsPacketStrings.OPT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptAnswer
  extends StObject
     with GenericAnswer[OPT] {
  
  var ednsVersion: Double
  
  var extendedRcode: Double
  
  /**
    * Whether or not the DNS DO bit is set
    */
  var flag_do: Boolean
  
  var flags: Double
  
  var options: js.Array[PacketOpt]
  
  var udpPayloadSize: Double
}
object OptAnswer {
  
  inline def apply(
    ednsVersion: Double,
    extendedRcode: Double,
    flag_do: Boolean,
    flags: Double,
    name: String,
    options: js.Array[PacketOpt],
    udpPayloadSize: Double
  ): OptAnswer = {
    val __obj = js.Dynamic.literal(ednsVersion = ednsVersion.asInstanceOf[js.Any], extendedRcode = extendedRcode.asInstanceOf[js.Any], flag_do = flag_do.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], udpPayloadSize = udpPayloadSize.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("OPT")
    __obj.asInstanceOf[OptAnswer]
  }
  
  extension [Self <: OptAnswer](x: Self) {
    
    inline def setEdnsVersion(value: Double): Self = StObject.set(x, "ednsVersion", value.asInstanceOf[js.Any])
    
    inline def setExtendedRcode(value: Double): Self = StObject.set(x, "extendedRcode", value.asInstanceOf[js.Any])
    
    inline def setFlag_do(value: Boolean): Self = StObject.set(x, "flag_do", value.asInstanceOf[js.Any])
    
    inline def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: js.Array[PacketOpt]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsVarargs(value: PacketOpt*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setUdpPayloadSize(value: Double): Self = StObject.set(x, "udpPayloadSize", value.asInstanceOf[js.Any])
  }
}
