package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClientCompute.AnonCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Route extends js.Object {
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[String] = js.undefined
  /** An optional description of this resource. Provide this property when you create the resource. */
  var description: js.UndefOr[String] = js.undefined
  /** The destination range of outgoing packets that this route applies to. Only IPv4 is supported. */
  var destRange: js.UndefOr[String] = js.undefined
  /** [Output Only] The unique identifier for the resource. This identifier is defined by the server. */
  var id: js.UndefOr[String] = js.undefined
  /** [Output Only] Type of this resource. Always compute#routes for Route resources. */
  var kind: js.UndefOr[String] = js.undefined
  /**
    * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035.
    * Specifically, the name must be 1-63 characters long and match the regular expression [a-z]([-a-z0-9]&#42;[a-z0-9])? which means the first character must be
    * a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
    */
  var name: js.UndefOr[String] = js.undefined
  /** Fully-qualified URL of the network that this route applies to. */
  var network: js.UndefOr[String] = js.undefined
  /**
    * The URL to a gateway that should handle matching packets. You can only specify the internet gateway using a full or partial valid URL:
    * projects/<project-id>/global/gateways/default-internet-gateway
    */
  var nextHopGateway: js.UndefOr[String] = js.undefined
  /**
    * The URL to an instance that should handle matching packets. You can specify this as a full or partial URL. For example:
    * https://www.googleapis.com/compute/v1/projects/project/zones/zone/instances/
    */
  var nextHopInstance: js.UndefOr[String] = js.undefined
  /** The network IP address of an instance that should handle matching packets. Only IPv4 is supported. */
  var nextHopIp: js.UndefOr[String] = js.undefined
  /** The URL of the local network if it should handle matching packets. */
  var nextHopNetwork: js.UndefOr[String] = js.undefined
  /** [Output Only] The network peering name that should handle matching packets, which should conform to RFC1035. */
  var nextHopPeering: js.UndefOr[String] = js.undefined
  /** The URL to a VpnTunnel that should handle matching packets. */
  var nextHopVpnTunnel: js.UndefOr[String] = js.undefined
  /**
    * The priority of this route. Priority is used to break ties in cases where there is more than one matching route of equal prefix length. In the case of
    * two routes with equal prefix length, the one with the lowest-numbered priority value wins. Default value is 1000. Valid range is 0 through 65535.
    */
  var priority: js.UndefOr[Double] = js.undefined
  /** [Output Only] Server-defined fully-qualified URL for this resource. */
  var selfLink: js.UndefOr[String] = js.undefined
  /** A list of instance tags to which this route applies. */
  var tags: js.UndefOr[js.Array[String]] = js.undefined
  /** [Output Only] If potential misconfigurations are detected for this route, this field will be populated with warning messages. */
  var warnings: js.UndefOr[js.Array[AnonCode]] = js.undefined
}

object Route {
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
    nextHopInstance: String = null,
    nextHopIp: String = null,
    nextHopNetwork: String = null,
    nextHopPeering: String = null,
    nextHopVpnTunnel: String = null,
    priority: Int | Double = null,
    selfLink: String = null,
    tags: js.Array[String] = null,
    warnings: js.Array[AnonCode] = null
  ): Route = {
    val __obj = js.Dynamic.literal()
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (destRange != null) __obj.updateDynamic("destRange")(destRange.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (network != null) __obj.updateDynamic("network")(network.asInstanceOf[js.Any])
    if (nextHopGateway != null) __obj.updateDynamic("nextHopGateway")(nextHopGateway.asInstanceOf[js.Any])
    if (nextHopInstance != null) __obj.updateDynamic("nextHopInstance")(nextHopInstance.asInstanceOf[js.Any])
    if (nextHopIp != null) __obj.updateDynamic("nextHopIp")(nextHopIp.asInstanceOf[js.Any])
    if (nextHopNetwork != null) __obj.updateDynamic("nextHopNetwork")(nextHopNetwork.asInstanceOf[js.Any])
    if (nextHopPeering != null) __obj.updateDynamic("nextHopPeering")(nextHopPeering.asInstanceOf[js.Any])
    if (nextHopVpnTunnel != null) __obj.updateDynamic("nextHopVpnTunnel")(nextHopVpnTunnel.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (warnings != null) __obj.updateDynamic("warnings")(warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Route]
  }
}

