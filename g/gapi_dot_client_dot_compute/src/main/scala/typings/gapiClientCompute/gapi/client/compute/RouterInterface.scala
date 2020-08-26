package typings.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouterInterface extends js.Object {
  /**
    * IP address and range of the interface. The IP range must be in the RFC3927 link-local IP space. The value must be a CIDR-formatted string, for example:
    * 169.254.0.1/30. NOTE: Do not truncate the address as it represents the IP address of the interface.
    */
  var ipRange: js.UndefOr[String] = js.native
  /**
    * URI of the linked VPN tunnel. It must be in the same region as the router. Each interface can have at most one linked resource and it could either be a
    * VPN Tunnel or an interconnect attachment.
    */
  var linkedVpnTunnel: js.UndefOr[String] = js.native
  /** Name of this interface entry. The name must be 1-63 characters long and comply with RFC1035. */
  var name: js.UndefOr[String] = js.native
}

object RouterInterface {
  @scala.inline
  def apply(): RouterInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouterInterface]
  }
  @scala.inline
  implicit class RouterInterfaceOps[Self <: RouterInterface] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIpRange(value: String): Self = this.set("ipRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpRange: Self = this.set("ipRange", js.undefined)
    @scala.inline
    def setLinkedVpnTunnel(value: String): Self = this.set("linkedVpnTunnel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkedVpnTunnel: Self = this.set("linkedVpnTunnel", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

