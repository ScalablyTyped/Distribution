package typings.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Subnetwork extends js.Object {
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[String] = js.native
  /** An optional description of this resource. Provide this property when you create the resource. This field can be set only at resource creation time. */
  var description: js.UndefOr[String] = js.native
  /**
    * [Output Only] The gateway address for default routes to reach destination addresses outside this subnetwork. This field can be set only at resource
    * creation time.
    */
  var gatewayAddress: js.UndefOr[String] = js.native
  /** [Output Only] The unique identifier for the resource. This identifier is defined by the server. */
  var id: js.UndefOr[String] = js.native
  /**
    * The range of internal addresses that are owned by this subnetwork. Provide this property when you create the subnetwork. For example, 10.0.0.0/8 or
    * 192.168.0.0/16. Ranges must be unique and non-overlapping within a network. Only IPv4 is supported. This field can be set only at resource creation
    * time.
    */
  var ipCidrRange: js.UndefOr[String] = js.native
  /** [Output Only] Type of the resource. Always compute#subnetwork for Subnetwork resources. */
  var kind: js.UndefOr[String] = js.native
  /**
    * The name of the resource, provided by the client when initially creating the resource. The name must be 1-63 characters long, and comply with RFC1035.
    * Specifically, the name must be 1-63 characters long and match the regular expression [a-z]([-a-z0-9]&#42;[a-z0-9])? which means the first character must be
    * a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The URL of the network to which this subnetwork belongs, provided by the client when initially creating the subnetwork. Only networks that are in the
    * distributed mode can have subnetworks. This field can be set only at resource creation time.
    */
  var network: js.UndefOr[String] = js.native
  /**
    * Whether the VMs in this subnet can access Google services without assigned external IP addresses. This field can be both set at resource creation time
    * and updated using setPrivateIpGoogleAccess.
    */
  var privateIpGoogleAccess: js.UndefOr[Boolean] = js.native
  /** URL of the region where the Subnetwork resides. This field can be set only at resource creation time. */
  var region: js.UndefOr[String] = js.native
  /**
    * An array of configurations for secondary IP ranges for VM instances contained in this subnetwork. The primary IP of such VM must belong to the primary
    * ipCidrRange of the subnetwork. The alias IPs may belong to either primary or secondary ranges.
    */
  var secondaryIpRanges: js.UndefOr[js.Array[SubnetworkSecondaryRange]] = js.native
  /** [Output Only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[String] = js.native
}

object Subnetwork {
  @scala.inline
  def apply(): Subnetwork = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Subnetwork]
  }
  @scala.inline
  implicit class SubnetworkOps[Self <: Subnetwork] (val x: Self) extends AnyVal {
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
    def setCreationTimestamp(value: String): Self = this.set("creationTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTimestamp: Self = this.set("creationTimestamp", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setGatewayAddress(value: String): Self = this.set("gatewayAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGatewayAddress: Self = this.set("gatewayAddress", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setIpCidrRange(value: String): Self = this.set("ipCidrRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpCidrRange: Self = this.set("ipCidrRange", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNetwork(value: String): Self = this.set("network", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetwork: Self = this.set("network", js.undefined)
    @scala.inline
    def setPrivateIpGoogleAccess(value: Boolean): Self = this.set("privateIpGoogleAccess", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivateIpGoogleAccess: Self = this.set("privateIpGoogleAccess", js.undefined)
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    @scala.inline
    def setSecondaryIpRangesVarargs(value: SubnetworkSecondaryRange*): Self = this.set("secondaryIpRanges", js.Array(value :_*))
    @scala.inline
    def setSecondaryIpRanges(value: js.Array[SubnetworkSecondaryRange]): Self = this.set("secondaryIpRanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondaryIpRanges: Self = this.set("secondaryIpRanges", js.undefined)
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
  }
  
}

