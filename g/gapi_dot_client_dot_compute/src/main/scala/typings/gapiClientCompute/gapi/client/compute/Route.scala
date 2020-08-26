package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClientCompute.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Route extends js.Object {
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[String] = js.native
  /** An optional description of this resource. Provide this property when you create the resource. */
  var description: js.UndefOr[String] = js.native
  /** The destination range of outgoing packets that this route applies to. Only IPv4 is supported. */
  var destRange: js.UndefOr[String] = js.native
  /** [Output Only] The unique identifier for the resource. This identifier is defined by the server. */
  var id: js.UndefOr[String] = js.native
  /** [Output Only] Type of this resource. Always compute#routes for Route resources. */
  var kind: js.UndefOr[String] = js.native
  /**
    * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035.
    * Specifically, the name must be 1-63 characters long and match the regular expression [a-z]([-a-z0-9]&#42;[a-z0-9])? which means the first character must be
    * a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
    */
  var name: js.UndefOr[String] = js.native
  /** Fully-qualified URL of the network that this route applies to. */
  var network: js.UndefOr[String] = js.native
  /**
    * The URL to a gateway that should handle matching packets. You can only specify the internet gateway using a full or partial valid URL:
    * projects/<project-id>/global/gateways/default-internet-gateway
    */
  var nextHopGateway: js.UndefOr[String] = js.native
  /**
    * The URL to an instance that should handle matching packets. You can specify this as a full or partial URL. For example:
    * https://www.googleapis.com/compute/v1/projects/project/zones/zone/instances/
    */
  var nextHopInstance: js.UndefOr[String] = js.native
  /** The network IP address of an instance that should handle matching packets. Only IPv4 is supported. */
  var nextHopIp: js.UndefOr[String] = js.native
  /** The URL of the local network if it should handle matching packets. */
  var nextHopNetwork: js.UndefOr[String] = js.native
  /** [Output Only] The network peering name that should handle matching packets, which should conform to RFC1035. */
  var nextHopPeering: js.UndefOr[String] = js.native
  /** The URL to a VpnTunnel that should handle matching packets. */
  var nextHopVpnTunnel: js.UndefOr[String] = js.native
  /**
    * The priority of this route. Priority is used to break ties in cases where there is more than one matching route of equal prefix length. In the case of
    * two routes with equal prefix length, the one with the lowest-numbered priority value wins. Default value is 1000. Valid range is 0 through 65535.
    */
  var priority: js.UndefOr[Double] = js.native
  /** [Output Only] Server-defined fully-qualified URL for this resource. */
  var selfLink: js.UndefOr[String] = js.native
  /** A list of instance tags to which this route applies. */
  var tags: js.UndefOr[js.Array[String]] = js.native
  /** [Output Only] If potential misconfigurations are detected for this route, this field will be populated with warning messages. */
  var warnings: js.UndefOr[js.Array[Code]] = js.native
}

object Route {
  @scala.inline
  def apply(): Route = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Route]
  }
  @scala.inline
  implicit class RouteOps[Self <: Route] (val x: Self) extends AnyVal {
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
    def setDestRange(value: String): Self = this.set("destRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestRange: Self = this.set("destRange", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
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
    def setNextHopGateway(value: String): Self = this.set("nextHopGateway", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextHopGateway: Self = this.set("nextHopGateway", js.undefined)
    @scala.inline
    def setNextHopInstance(value: String): Self = this.set("nextHopInstance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextHopInstance: Self = this.set("nextHopInstance", js.undefined)
    @scala.inline
    def setNextHopIp(value: String): Self = this.set("nextHopIp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextHopIp: Self = this.set("nextHopIp", js.undefined)
    @scala.inline
    def setNextHopNetwork(value: String): Self = this.set("nextHopNetwork", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextHopNetwork: Self = this.set("nextHopNetwork", js.undefined)
    @scala.inline
    def setNextHopPeering(value: String): Self = this.set("nextHopPeering", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextHopPeering: Self = this.set("nextHopPeering", js.undefined)
    @scala.inline
    def setNextHopVpnTunnel(value: String): Self = this.set("nextHopVpnTunnel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextHopVpnTunnel: Self = this.set("nextHopVpnTunnel", js.undefined)
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setWarningsVarargs(value: Code*): Self = this.set("warnings", js.Array(value :_*))
    @scala.inline
    def setWarnings(value: js.Array[Code]): Self = this.set("warnings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarnings: Self = this.set("warnings", js.undefined)
  }
  
}

