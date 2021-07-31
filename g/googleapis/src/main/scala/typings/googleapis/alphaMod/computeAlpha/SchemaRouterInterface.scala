package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRouterInterface extends StObject {
  
  /**
    * IP address and range of the interface. The IP range must be in the
    * RFC3927 link-local IP space. The value must be a CIDR-formatted string,
    * for example: 169.254.0.1/30. NOTE: Do not truncate the address as it
    * represents the IP address of the interface.
    */
  var ipRange: js.UndefOr[String] = js.undefined
  
  /**
    * URI of the linked interconnect attachment. It must be in the same region
    * as the router. Each interface can have at most one linked resource and it
    * could either be a VPN Tunnel or an interconnect attachment.
    */
  var linkedInterconnectAttachment: js.UndefOr[String] = js.undefined
  
  /**
    * URI of the linked VPN tunnel. It must be in the same region as the
    * router. Each interface can have at most one linked resource and it could
    * either be a VPN Tunnel or an interconnect attachment.
    */
  var linkedVpnTunnel: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] The resource that configures and manages this interface.
    * MANAGED_BY_USER is the default value and can be managed by you or other
    * users; MANAGED_BY_ATTACHMENT is an interface that is configured and
    * managed by Cloud Interconnect, specifically by an InterconnectAttachment
    * of type PARTNER. Google will automatically create, update, and delete
    * this type of interface when the PARTNER InterconnectAttachment is
    * created, updated, or deleted.
    */
  var managementType: js.UndefOr[String] = js.undefined
  
  /**
    * Name of this interface entry. The name must be 1-63 characters long and
    * comply with RFC1035.
    */
  var name: js.UndefOr[String] = js.undefined
}
object SchemaRouterInterface {
  
  @scala.inline
  def apply(): SchemaRouterInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRouterInterface]
  }
  
  @scala.inline
  implicit class SchemaRouterInterfaceMutableBuilder[Self <: SchemaRouterInterface] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIpRange(value: String): Self = StObject.set(x, "ipRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpRangeUndefined: Self = StObject.set(x, "ipRange", js.undefined)
    
    @scala.inline
    def setLinkedInterconnectAttachment(value: String): Self = StObject.set(x, "linkedInterconnectAttachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkedInterconnectAttachmentUndefined: Self = StObject.set(x, "linkedInterconnectAttachment", js.undefined)
    
    @scala.inline
    def setLinkedVpnTunnel(value: String): Self = StObject.set(x, "linkedVpnTunnel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkedVpnTunnelUndefined: Self = StObject.set(x, "linkedVpnTunnel", js.undefined)
    
    @scala.inline
    def setManagementType(value: String): Self = StObject.set(x, "managementType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagementTypeUndefined: Self = StObject.set(x, "managementType", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
