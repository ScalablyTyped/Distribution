package typings.googleapis.buildSrcApisComputeBetaMod.compute_beta

import typings.googleapis.Anon_Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Route resource. A route specifies how certain packets should
  * be handled by the network. Routes are associated with instances by tags and
  * the set of routes for a particular instance is called its routing table.
  * For each packet leaving an instance, the system searches that
  * instance&#39;s routing table for a single best matching route. Routes match
  * packets by destination IP address, preferring smaller or more specific
  * ranges over larger ones. If there is a tie, the system selects the route
  * with the smallest priority value. If there is still a tie, it uses the
  * layer three and four packet headers to select just one of the remaining
  * matching routes. The packet is then forwarded as specified by the nextHop
  * field of the winning route - either to another instance destination, an
  * instance gateway, or a Google Compute Engine-operated gateway.  Packets
  * that do not match any route in the sending instance&#39;s routing table are
  * dropped. (== resource_for beta.routes ==) (== resource_for v1.routes ==)
  */
@js.native
trait Schema$Route extends js.Object {
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.native
  /**
    * An optional description of this resource. Provide this property when you
    * create the resource.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The destination range of outgoing packets that this route applies to.
    * Only IPv4 is supported.
    */
  var destRange: js.UndefOr[String] = js.native
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * [Output Only] Type of this resource. Always compute#routes for Route
    * resources.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Name of the resource. Provided by the client when the resource is
    * created. The name must be 1-63 characters long, and comply with RFC1035.
    * Specifically, the name must be 1-63 characters long and match the regular
    * expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character
    * must be a lowercase letter, and all following characters must be a dash,
    * lowercase letter, or digit, except the last character, which cannot be a
    * dash.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Fully-qualified URL of the network that this route applies to.
    */
  var network: js.UndefOr[String] = js.native
  /**
    * The URL to a gateway that should handle matching packets. You can only
    * specify the internet gateway using a full or partial valid URL:
    * projects/&lt;project-id&gt;/global/gateways/default-internet-gateway
    */
  var nextHopGateway: js.UndefOr[String] = js.native
  /**
    * The URL to a forwarding rule of type loadBalancingScheme=INTERNAL that
    * should handle matching packets. You can only specify the forwarding rule
    * as a partial or full URL. For example, the following are all valid URLs:
    * -
    * https://www.googleapis.com/compute/v1/projects/project/regions/region/forwardingRules/forwardingRule
    * - regions/region/forwardingRules/forwardingRule  Note that this can only
    * be used when the destination_range is a public (non-RFC 1918) IP CIDR
    * range.
    */
  var nextHopIlb: js.UndefOr[String] = js.native
  /**
    * The URL to an instance that should handle matching packets. You can
    * specify this as a full or partial URL. For example:
    * https://www.googleapis.com/compute/v1/projects/project/zones/zone/instances/
    */
  var nextHopInstance: js.UndefOr[String] = js.native
  /**
    * The network IP address of an instance that should handle matching
    * packets. Only IPv4 is supported.
    */
  var nextHopIp: js.UndefOr[String] = js.native
  /**
    * The URL of the local network if it should handle matching packets.
    */
  var nextHopNetwork: js.UndefOr[String] = js.native
  /**
    * [Output Only] The network peering name that should handle matching
    * packets, which should conform to RFC1035.
    */
  var nextHopPeering: js.UndefOr[String] = js.native
  /**
    * The URL to a VpnTunnel that should handle matching packets.
    */
  var nextHopVpnTunnel: js.UndefOr[String] = js.native
  /**
    * The priority of this route. Priority is used to break ties in cases where
    * there is more than one matching route of equal prefix length. In the case
    * of two routes with equal prefix length, the one with the lowest-numbered
    * priority value wins. Default value is 1000. Valid range is 0 through
    * 65535.
    */
  var priority: js.UndefOr[Double] = js.native
  /**
    * [Output Only] Server-defined fully-qualified URL for this resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * A list of instance tags to which this route applies.
    */
  var tags: js.UndefOr[js.Array[String]] = js.native
  /**
    * [Output Only] If potential misconfigurations are detected for this route,
    * this field will be populated with warning messages.
    */
  var warnings: js.UndefOr[js.Array[Anon_Code]] = js.native
}

object Schema$Route {
  @scala.inline
  def apply(
    creationTimestamp: String = null,
    description: String = null,
    destRange: String = null,
    id: String = null,
    kind: String = null,
    name: String = null,
    network: String = null,
    nextHopGateway: String = null,
    nextHopIlb: String = null,
    nextHopInstance: String = null,
    nextHopIp: String = null,
    nextHopNetwork: String = null,
    nextHopPeering: String = null,
    nextHopVpnTunnel: String = null,
    priority: Int | Double = null,
    selfLink: String = null,
    tags: js.Array[String] = null,
    warnings: js.Array[Anon_Code] = null
  ): Schema$Route = {
    val __obj = js.Dynamic.literal()
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (destRange != null) __obj.updateDynamic("destRange")(destRange.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (network != null) __obj.updateDynamic("network")(network.asInstanceOf[js.Any])
    if (nextHopGateway != null) __obj.updateDynamic("nextHopGateway")(nextHopGateway.asInstanceOf[js.Any])
    if (nextHopIlb != null) __obj.updateDynamic("nextHopIlb")(nextHopIlb.asInstanceOf[js.Any])
    if (nextHopInstance != null) __obj.updateDynamic("nextHopInstance")(nextHopInstance.asInstanceOf[js.Any])
    if (nextHopIp != null) __obj.updateDynamic("nextHopIp")(nextHopIp.asInstanceOf[js.Any])
    if (nextHopNetwork != null) __obj.updateDynamic("nextHopNetwork")(nextHopNetwork.asInstanceOf[js.Any])
    if (nextHopPeering != null) __obj.updateDynamic("nextHopPeering")(nextHopPeering.asInstanceOf[js.Any])
    if (nextHopVpnTunnel != null) __obj.updateDynamic("nextHopVpnTunnel")(nextHopVpnTunnel.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (warnings != null) __obj.updateDynamic("warnings")(warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Route]
  }
}

