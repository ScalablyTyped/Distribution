package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVpnGatewayVpnGatewayInterface extends StObject {
  
  /**
    * [Output Only] Numeric identifier for this VPN interface associated with the VPN gateway.
    */
  var id: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * URL of the VLAN attachment (interconnectAttachment) resource for this VPN gateway interface. When the value of this field is present, the VPN gateway is used for IPsec-encrypted Cloud Interconnect; all egress or ingress traffic for this VPN gateway interface goes through the specified VLAN attachment resource. Not currently available publicly.
    */
  var interconnectAttachment: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] IP address for this VPN interface associated with the VPN gateway. The IP address could be either a regional external IP address or a regional internal IP address. The two IP addresses for a VPN gateway must be all regional external or regional internal IP addresses. There cannot be a mix of regional external IP addresses and regional internal IP addresses. For IPsec-encrypted Cloud Interconnect, the IP addresses for both interfaces could either be regional internal IP addresses or regional external IP addresses. For regular (non IPsec-encrypted Cloud Interconnect) HA VPN tunnels, the IP address must be a regional external IP address.
    */
  var ipAddress: js.UndefOr[String | Null] = js.undefined
}
object SchemaVpnGatewayVpnGatewayInterface {
  
  inline def apply(): SchemaVpnGatewayVpnGatewayInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVpnGatewayVpnGatewayInterface]
  }
  
  extension [Self <: SchemaVpnGatewayVpnGatewayInterface](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInterconnectAttachment(value: String): Self = StObject.set(x, "interconnectAttachment", value.asInstanceOf[js.Any])
    
    inline def setInterconnectAttachmentNull: Self = StObject.set(x, "interconnectAttachment", null)
    
    inline def setInterconnectAttachmentUndefined: Self = StObject.set(x, "interconnectAttachment", js.undefined)
    
    inline def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    inline def setIpAddressNull: Self = StObject.set(x, "ipAddress", null)
    
    inline def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
  }
}
