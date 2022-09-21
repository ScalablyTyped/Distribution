package typings.dnsPacket.mod

import typings.dnsPacket.dnsPacketNumbers.`0`
import typings.dnsPacket.dnsPacketNumbers.`10`
import typings.dnsPacket.dnsPacketNumbers.`11`
import typings.dnsPacket.dnsPacketNumbers.`12`
import typings.dnsPacket.dnsPacketNumbers.`13`
import typings.dnsPacket.dnsPacketNumbers.`14`
import typings.dnsPacket.dnsPacketNumbers.`1`
import typings.dnsPacket.dnsPacketNumbers.`26946`
import typings.dnsPacket.dnsPacketNumbers.`2`
import typings.dnsPacket.dnsPacketNumbers.`3`
import typings.dnsPacket.dnsPacketNumbers.`4`
import typings.dnsPacket.dnsPacketNumbers.`5`
import typings.dnsPacket.dnsPacketNumbers.`65535`
import typings.dnsPacket.dnsPacketNumbers.`6`
import typings.dnsPacket.dnsPacketNumbers.`7`
import typings.dnsPacket.dnsPacketNumbers.`8`
import typings.dnsPacket.dnsPacketNumbers.`9`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptCodes extends StObject {
  
  var CHAIN: `13`
  
  var CLIENT_SUBNET: `8`
  
  var COOKIE: `10`
  
  var DAU: `5`
  
  var DEVICEID: `26946`
  
  var DHU: `6`
  
  var EXPIRE: `9`
  
  var KEY_TAG: `14`
  
  var LLQ: `1`
  
  var N3U: `7`
  
  var NSID: `3`
  
  var OPTION_0: `0`
  
  var OPTION_4: `4`
  
  var OPTION_65535: `65535`
  
  var PADDING: `12`
  
  var TCP_KEEPALIVE: `11`
  
  var UL: `2`
}
object OptCodes {
  
  inline def apply(): OptCodes = {
    val __obj = js.Dynamic.literal(CHAIN = 13, CLIENT_SUBNET = 8, COOKIE = 10, DAU = 5, DEVICEID = 26946, DHU = 6, EXPIRE = 9, KEY_TAG = 14, LLQ = 1, N3U = 7, NSID = 3, OPTION_0 = 0, OPTION_4 = 4, OPTION_65535 = 65535, PADDING = 12, TCP_KEEPALIVE = 11, UL = 2)
    __obj.asInstanceOf[OptCodes]
  }
  
  extension [Self <: OptCodes](x: Self) {
    
    inline def setCHAIN(value: `13`): Self = StObject.set(x, "CHAIN", value.asInstanceOf[js.Any])
    
    inline def setCLIENT_SUBNET(value: `8`): Self = StObject.set(x, "CLIENT_SUBNET", value.asInstanceOf[js.Any])
    
    inline def setCOOKIE(value: `10`): Self = StObject.set(x, "COOKIE", value.asInstanceOf[js.Any])
    
    inline def setDAU(value: `5`): Self = StObject.set(x, "DAU", value.asInstanceOf[js.Any])
    
    inline def setDEVICEID(value: `26946`): Self = StObject.set(x, "DEVICEID", value.asInstanceOf[js.Any])
    
    inline def setDHU(value: `6`): Self = StObject.set(x, "DHU", value.asInstanceOf[js.Any])
    
    inline def setEXPIRE(value: `9`): Self = StObject.set(x, "EXPIRE", value.asInstanceOf[js.Any])
    
    inline def setKEY_TAG(value: `14`): Self = StObject.set(x, "KEY_TAG", value.asInstanceOf[js.Any])
    
    inline def setLLQ(value: `1`): Self = StObject.set(x, "LLQ", value.asInstanceOf[js.Any])
    
    inline def setN3U(value: `7`): Self = StObject.set(x, "N3U", value.asInstanceOf[js.Any])
    
    inline def setNSID(value: `3`): Self = StObject.set(x, "NSID", value.asInstanceOf[js.Any])
    
    inline def setOPTION_0(value: `0`): Self = StObject.set(x, "OPTION_0", value.asInstanceOf[js.Any])
    
    inline def setOPTION_4(value: `4`): Self = StObject.set(x, "OPTION_4", value.asInstanceOf[js.Any])
    
    inline def setOPTION_65535(value: `65535`): Self = StObject.set(x, "OPTION_65535", value.asInstanceOf[js.Any])
    
    inline def setPADDING(value: `12`): Self = StObject.set(x, "PADDING", value.asInstanceOf[js.Any])
    
    inline def setTCP_KEEPALIVE(value: `11`): Self = StObject.set(x, "TCP_KEEPALIVE", value.asInstanceOf[js.Any])
    
    inline def setUL(value: `2`): Self = StObject.set(x, "UL", value.asInstanceOf[js.Any])
  }
}
