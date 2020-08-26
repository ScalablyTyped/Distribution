package typings.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouterBgpPeer extends js.Object {
  /**
    * The priority of routes advertised to this BGP peer. In the case where there is more than one matching route of maximum length, the routes with lowest
    * priority value win.
    */
  var advertisedRoutePriority: js.UndefOr[Double] = js.native
  /** Name of the interface the BGP peer is associated with. */
  var interfaceName: js.UndefOr[String] = js.native
  /** IP address of the interface inside Google Cloud Platform. Only IPv4 is supported. */
  var ipAddress: js.UndefOr[String] = js.native
  /** Name of this BGP peer. The name must be 1-63 characters long and comply with RFC1035. */
  var name: js.UndefOr[String] = js.native
  /** Peer BGP Autonomous System Number (ASN). For VPN use case, this value can be different for every tunnel. */
  var peerAsn: js.UndefOr[Double] = js.native
  /** IP address of the BGP interface outside Google cloud. Only IPv4 is supported. */
  var peerIpAddress: js.UndefOr[String] = js.native
}

object RouterBgpPeer {
  @scala.inline
  def apply(): RouterBgpPeer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouterBgpPeer]
  }
  @scala.inline
  implicit class RouterBgpPeerOps[Self <: RouterBgpPeer] (val x: Self) extends AnyVal {
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
    def setAdvertisedRoutePriority(value: Double): Self = this.set("advertisedRoutePriority", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdvertisedRoutePriority: Self = this.set("advertisedRoutePriority", js.undefined)
    @scala.inline
    def setInterfaceName(value: String): Self = this.set("interfaceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterfaceName: Self = this.set("interfaceName", js.undefined)
    @scala.inline
    def setIpAddress(value: String): Self = this.set("ipAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpAddress: Self = this.set("ipAddress", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPeerAsn(value: Double): Self = this.set("peerAsn", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeerAsn: Self = this.set("peerAsn", js.undefined)
    @scala.inline
    def setPeerIpAddress(value: String): Self = this.set("peerIpAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeerIpAddress: Self = this.set("peerIpAddress", js.undefined)
  }
  
}

