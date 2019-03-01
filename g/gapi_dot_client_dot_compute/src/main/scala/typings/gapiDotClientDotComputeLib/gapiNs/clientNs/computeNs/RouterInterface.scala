package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterInterface extends js.Object {
  /**
    * IP address and range of the interface. The IP range must be in the RFC3927 link-local IP space. The value must be a CIDR-formatted string, for example:
    * 169.254.0.1/30. NOTE: Do not truncate the address as it represents the IP address of the interface.
    */
  var ipRange: js.UndefOr[java.lang.String] = js.undefined
  /**
    * URI of the linked VPN tunnel. It must be in the same region as the router. Each interface can have at most one linked resource and it could either be a
    * VPN Tunnel or an interconnect attachment.
    */
  var linkedVpnTunnel: js.UndefOr[java.lang.String] = js.undefined
  /** Name of this interface entry. The name must be 1-63 characters long and comply with RFC1035. */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object RouterInterface {
  @scala.inline
  def apply(
    ipRange: java.lang.String = null,
    linkedVpnTunnel: java.lang.String = null,
    name: java.lang.String = null
  ): RouterInterface = {
    val __obj = js.Dynamic.literal()
    if (ipRange != null) __obj.updateDynamic("ipRange")(ipRange)
    if (linkedVpnTunnel != null) __obj.updateDynamic("linkedVpnTunnel")(linkedVpnTunnel)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[RouterInterface]
  }
}

