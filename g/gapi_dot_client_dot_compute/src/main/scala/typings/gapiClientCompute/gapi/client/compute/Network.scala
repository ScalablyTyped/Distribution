package typings.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Network extends js.Object {
  /**
    * The range of internal addresses that are legal on this network. This range is a CIDR specification, for example: 192.168.0.0/16. Provided by the client
    * when the network is created.
    */
  var IPv4Range: js.UndefOr[String] = js.undefined
  /**
    * When set to true, the network is created in "auto subnet mode". When set to false, the network is in "custom subnet mode".
    *
    * In "auto subnet mode", a newly created network is assigned the default CIDR of 10.128.0.0/9 and it automatically creates one subnetwork per region.
    */
  var autoCreateSubnetworks: js.UndefOr[Boolean] = js.undefined
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[String] = js.undefined
  /** An optional description of this resource. Provide this property when you create the resource. */
  var description: js.UndefOr[String] = js.undefined
  /**
    * A gateway address for default routing to other networks. This value is read only and is selected by the Google Compute Engine, typically as the first
    * usable address in the IPv4Range.
    */
  var gatewayIPv4: js.UndefOr[String] = js.undefined
  /** [Output Only] The unique identifier for the resource. This identifier is defined by the server. */
  var id: js.UndefOr[String] = js.undefined
  /** [Output Only] Type of the resource. Always compute#network for networks. */
  var kind: js.UndefOr[String] = js.undefined
  /**
    * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035.
    * Specifically, the name must be 1-63 characters long and match the regular expression [a-z]([-a-z0-9]&#42;[a-z0-9])? which means the first character must be
    * a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
    */
  var name: js.UndefOr[String] = js.undefined
  /** [Output Only] List of network peerings for the resource. */
  var peerings: js.UndefOr[js.Array[NetworkPeering]] = js.undefined
  /** The network-level routing configuration for this network. Used by Cloud Router to determine what type of network-wide routing behavior to enforce. */
  var routingConfig: js.UndefOr[NetworkRoutingConfig] = js.undefined
  /** [Output Only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[String] = js.undefined
  /** [Output Only] Server-defined fully-qualified URLs for all subnetworks in this network. */
  var subnetworks: js.UndefOr[js.Array[String]] = js.undefined
}

object Network {
  @scala.inline
  def apply(
    IPv4Range: String = null,
    autoCreateSubnetworks: js.UndefOr[Boolean] = js.undefined,
    creationTimestamp: String = null,
    description: String = null,
    gatewayIPv4: String = null,
    id: String = null,
    kind: String = null,
    name: String = null,
    peerings: js.Array[NetworkPeering] = null,
    routingConfig: NetworkRoutingConfig = null,
    selfLink: String = null,
    subnetworks: js.Array[String] = null
  ): Network = {
    val __obj = js.Dynamic.literal()
    if (IPv4Range != null) __obj.updateDynamic("IPv4Range")(IPv4Range.asInstanceOf[js.Any])
    if (!js.isUndefined(autoCreateSubnetworks)) __obj.updateDynamic("autoCreateSubnetworks")(autoCreateSubnetworks.asInstanceOf[js.Any])
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (gatewayIPv4 != null) __obj.updateDynamic("gatewayIPv4")(gatewayIPv4.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (peerings != null) __obj.updateDynamic("peerings")(peerings.asInstanceOf[js.Any])
    if (routingConfig != null) __obj.updateDynamic("routingConfig")(routingConfig.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (subnetworks != null) __obj.updateDynamic("subnetworks")(subnetworks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Network]
  }
}

