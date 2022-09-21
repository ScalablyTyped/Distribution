package typings.dnsPacket.mod

import typings.dnsPacket.dnsPacketStrings.CLIENT_SUBNET
import typings.dnsPacket.dnsPacketStrings.KEY_TAG
import typings.dnsPacket.dnsPacketStrings.PADDING
import typings.dnsPacket.dnsPacketStrings.TCP_KEEPALIVE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.dnsPacket.mod.ClientSubnetOpt
  - typings.dnsPacket.mod.KeepAliveOpt
  - typings.dnsPacket.mod.PaddingOpt
  - typings.dnsPacket.mod.TagOpt
*/
trait PacketOpt extends StObject
object PacketOpt {
  
  inline def ClientSubnetOpt(code: OptCode[CLIENT_SUBNET]): typings.dnsPacket.mod.ClientSubnetOpt = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.dnsPacket.mod.ClientSubnetOpt]
  }
  
  inline def KeepAliveOpt(code: OptCode[TCP_KEEPALIVE]): typings.dnsPacket.mod.KeepAliveOpt = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.dnsPacket.mod.KeepAliveOpt]
  }
  
  inline def PaddingOpt(code: OptCode[PADDING]): typings.dnsPacket.mod.PaddingOpt = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.dnsPacket.mod.PaddingOpt]
  }
  
  inline def TagOpt(code: OptCode[KEY_TAG], tags: js.Array[Double]): typings.dnsPacket.mod.TagOpt = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.dnsPacket.mod.TagOpt]
  }
}
