package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRouterInterface extends StObject {
  
  /**
    * IP address and range of the interface. The IP range must be in the RFC3927 link-local IP address space. The value must be a CIDR-formatted string, for example: 169.254.0.1/30. NOTE: Do not truncate the address as it represents the IP address of the interface.
    */
  var ipRange: js.UndefOr[String | Null] = js.undefined
  
  /**
    * URI of the linked Interconnect attachment. It must be in the same region as the router. Each interface can have one linked resource, which can be a VPN tunnel, an Interconnect attachment, or a virtual machine instance.
    */
  var linkedInterconnectAttachment: js.UndefOr[String | Null] = js.undefined
  
  /**
    * URI of the linked VPN tunnel, which must be in the same region as the router. Each interface can have one linked resource, which can be a VPN tunnel, an Interconnect attachment, or a virtual machine instance.
    */
  var linkedVpnTunnel: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] The resource that configures and manages this interface. - MANAGED_BY_USER is the default value and can be managed directly by users. - MANAGED_BY_ATTACHMENT is an interface that is configured and managed by Cloud Interconnect, specifically, by an InterconnectAttachment of type PARTNER. Google automatically creates, updates, and deletes this type of interface when the PARTNER InterconnectAttachment is created, updated, or deleted.
    */
  var managementType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of this interface entry. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The regional private internal IP address that is used to establish BGP sessions to a VM instance acting as a third-party Router Appliance, such as a Next Gen Firewall, a Virtual Router, or an SD-WAN VM.
    */
  var privateIpAddress: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of the interface that will be redundant with the current interface you are creating. The redundantInterface must belong to the same Cloud Router as the interface here. To establish the BGP session to a Router Appliance VM, you must create two BGP peers. The two BGP peers must be attached to two separate interfaces that are redundant with each other. The redundant_interface must be 1-63 characters long, and comply with RFC1035. Specifically, the redundant_interface must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
    */
  var redundantInterface: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The URI of the subnetwork resource that this interface belongs to, which must be in the same region as the Cloud Router. When you establish a BGP session to a VM instance using this interface, the VM instance must belong to the same subnetwork as the subnetwork specified here.
    */
  var subnetwork: js.UndefOr[String | Null] = js.undefined
}
object SchemaRouterInterface {
  
  inline def apply(): SchemaRouterInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRouterInterface]
  }
  
  extension [Self <: SchemaRouterInterface](x: Self) {
    
    inline def setIpRange(value: String): Self = StObject.set(x, "ipRange", value.asInstanceOf[js.Any])
    
    inline def setIpRangeNull: Self = StObject.set(x, "ipRange", null)
    
    inline def setIpRangeUndefined: Self = StObject.set(x, "ipRange", js.undefined)
    
    inline def setLinkedInterconnectAttachment(value: String): Self = StObject.set(x, "linkedInterconnectAttachment", value.asInstanceOf[js.Any])
    
    inline def setLinkedInterconnectAttachmentNull: Self = StObject.set(x, "linkedInterconnectAttachment", null)
    
    inline def setLinkedInterconnectAttachmentUndefined: Self = StObject.set(x, "linkedInterconnectAttachment", js.undefined)
    
    inline def setLinkedVpnTunnel(value: String): Self = StObject.set(x, "linkedVpnTunnel", value.asInstanceOf[js.Any])
    
    inline def setLinkedVpnTunnelNull: Self = StObject.set(x, "linkedVpnTunnel", null)
    
    inline def setLinkedVpnTunnelUndefined: Self = StObject.set(x, "linkedVpnTunnel", js.undefined)
    
    inline def setManagementType(value: String): Self = StObject.set(x, "managementType", value.asInstanceOf[js.Any])
    
    inline def setManagementTypeNull: Self = StObject.set(x, "managementType", null)
    
    inline def setManagementTypeUndefined: Self = StObject.set(x, "managementType", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPrivateIpAddress(value: String): Self = StObject.set(x, "privateIpAddress", value.asInstanceOf[js.Any])
    
    inline def setPrivateIpAddressNull: Self = StObject.set(x, "privateIpAddress", null)
    
    inline def setPrivateIpAddressUndefined: Self = StObject.set(x, "privateIpAddress", js.undefined)
    
    inline def setRedundantInterface(value: String): Self = StObject.set(x, "redundantInterface", value.asInstanceOf[js.Any])
    
    inline def setRedundantInterfaceNull: Self = StObject.set(x, "redundantInterface", null)
    
    inline def setRedundantInterfaceUndefined: Self = StObject.set(x, "redundantInterface", js.undefined)
    
    inline def setSubnetwork(value: String): Self = StObject.set(x, "subnetwork", value.asInstanceOf[js.Any])
    
    inline def setSubnetworkNull: Self = StObject.set(x, "subnetwork", null)
    
    inline def setSubnetworkUndefined: Self = StObject.set(x, "subnetwork", js.undefined)
  }
}
