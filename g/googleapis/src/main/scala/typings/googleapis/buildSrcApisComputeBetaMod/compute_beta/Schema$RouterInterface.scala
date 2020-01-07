package typings.googleapis.buildSrcApisComputeBetaMod.compute_beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$RouterInterface extends js.Object {
  /**
    * IP address and range of the interface. The IP range must be in the
    * RFC3927 link-local IP space. The value must be a CIDR-formatted string,
    * for example: 169.254.0.1/30. NOTE: Do not truncate the address as it
    * represents the IP address of the interface.
    */
  var ipRange: js.UndefOr[String] = js.native
  /**
    * URI of the linked interconnect attachment. It must be in the same region
    * as the router. Each interface can have at most one linked resource and it
    * could either be a VPN Tunnel or an interconnect attachment.
    */
  var linkedInterconnectAttachment: js.UndefOr[String] = js.native
  /**
    * URI of the linked VPN tunnel. It must be in the same region as the
    * router. Each interface can have at most one linked resource and it could
    * either be a VPN Tunnel or an interconnect attachment.
    */
  var linkedVpnTunnel: js.UndefOr[String] = js.native
  /**
    * [Output Only] The resource that configures and manages this interface.
    * MANAGED_BY_USER is the default value and can be managed by you or other
    * users; MANAGED_BY_ATTACHMENT is an interface that is configured and
    * managed by Cloud Interconnect, specifically by an InterconnectAttachment
    * of type PARTNER. Google will automatically create, update, and delete
    * this type of interface when the PARTNER InterconnectAttachment is
    * created, updated, or deleted.
    */
  var managementType: js.UndefOr[String] = js.native
  /**
    * Name of this interface entry. The name must be 1-63 characters long and
    * comply with RFC1035.
    */
  var name: js.UndefOr[String] = js.native
}

object Schema$RouterInterface {
  @scala.inline
  def apply(
    ipRange: String = null,
    linkedInterconnectAttachment: String = null,
    linkedVpnTunnel: String = null,
    managementType: String = null,
    name: String = null
  ): Schema$RouterInterface = {
    val __obj = js.Dynamic.literal()
    if (ipRange != null) __obj.updateDynamic("ipRange")(ipRange.asInstanceOf[js.Any])
    if (linkedInterconnectAttachment != null) __obj.updateDynamic("linkedInterconnectAttachment")(linkedInterconnectAttachment.asInstanceOf[js.Any])
    if (linkedVpnTunnel != null) __obj.updateDynamic("linkedVpnTunnel")(linkedVpnTunnel.asInstanceOf[js.Any])
    if (managementType != null) __obj.updateDynamic("managementType")(managementType.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RouterInterface]
  }
}

