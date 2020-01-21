package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Network resource. Read Virtual Private Cloud (VPC) Network
  * Overview for more information. (== resource_for v1.networks ==) (==
  * resource_for beta.networks ==)
  */
@js.native
trait SchemaNetwork extends js.Object {
  /**
    * Deprecated in favor of subnet mode networks. The range of internal
    * addresses that are legal on this network. This range is a CIDR
    * specification, for example: 192.168.0.0/16. Provided by the client when
    * the network is created.
    */
  var IPv4Range: js.UndefOr[String] = js.native
  /**
    * When set to true, the VPC network is created in &quot;auto&quot; mode.
    * When set to false, the VPC network is created in &quot;custom&quot; mode.
    * An auto mode VPC network starts with one subnet per region. Each subnet
    * has a predetermined range as described in Auto mode VPC network IP
    * ranges.
    */
  var autoCreateSubnetworks: js.UndefOr[Boolean] = js.native
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.native
  /**
    * [Output Only] Type of VM-to-VM traffic encryption for this network.
    */
  var crossVmEncryption: js.UndefOr[String] = js.native
  /**
    * An optional description of this resource. Provide this property when you
    * create the resource.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * [Output Only] The gateway address for default routing out of the network.
    * This value is read only and is selected by GCP.
    */
  var gatewayIPv4: js.UndefOr[String] = js.native
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * [Output Only] Type of the resource. Always compute#network for networks.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * [Output Only] Type of LB-to-VM traffic encryption for this network.
    */
  var loadBalancerVmEncryption: js.UndefOr[String] = js.native
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
    * [Output Only] A list of network peerings for the resource.
    */
  var peerings: js.UndefOr[js.Array[SchemaNetworkPeering]] = js.native
  /**
    * The network-level routing configuration for this network. Used by Cloud
    * Router to determine what type of network-wide routing behavior to
    * enforce.
    */
  var routingConfig: js.UndefOr[SchemaNetworkRoutingConfig] = js.native
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * [Output Only] Server-defined URL for this resource with the resource id.
    */
  var selfLinkWithId: js.UndefOr[String] = js.native
  /**
    * [Output Only] Server-defined fully-qualified URLs for all subnetworks in
    * this VPC network.
    */
  var subnetworks: js.UndefOr[js.Array[String]] = js.native
}

object SchemaNetwork {
  @scala.inline
  def apply(
    IPv4Range: String = null,
    autoCreateSubnetworks: js.UndefOr[Boolean] = js.undefined,
    creationTimestamp: String = null,
    crossVmEncryption: String = null,
    description: String = null,
    gatewayIPv4: String = null,
    id: String = null,
    kind: String = null,
    loadBalancerVmEncryption: String = null,
    name: String = null,
    peerings: js.Array[SchemaNetworkPeering] = null,
    routingConfig: SchemaNetworkRoutingConfig = null,
    selfLink: String = null,
    selfLinkWithId: String = null,
    subnetworks: js.Array[String] = null
  ): SchemaNetwork = {
    val __obj = js.Dynamic.literal()
    if (IPv4Range != null) __obj.updateDynamic("IPv4Range")(IPv4Range.asInstanceOf[js.Any])
    if (!js.isUndefined(autoCreateSubnetworks)) __obj.updateDynamic("autoCreateSubnetworks")(autoCreateSubnetworks.asInstanceOf[js.Any])
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp.asInstanceOf[js.Any])
    if (crossVmEncryption != null) __obj.updateDynamic("crossVmEncryption")(crossVmEncryption.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (gatewayIPv4 != null) __obj.updateDynamic("gatewayIPv4")(gatewayIPv4.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (loadBalancerVmEncryption != null) __obj.updateDynamic("loadBalancerVmEncryption")(loadBalancerVmEncryption.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (peerings != null) __obj.updateDynamic("peerings")(peerings.asInstanceOf[js.Any])
    if (routingConfig != null) __obj.updateDynamic("routingConfig")(routingConfig.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (selfLinkWithId != null) __obj.updateDynamic("selfLinkWithId")(selfLinkWithId.asInstanceOf[js.Any])
    if (subnetworks != null) __obj.updateDynamic("subnetworks")(subnetworks.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNetwork]
  }
}

