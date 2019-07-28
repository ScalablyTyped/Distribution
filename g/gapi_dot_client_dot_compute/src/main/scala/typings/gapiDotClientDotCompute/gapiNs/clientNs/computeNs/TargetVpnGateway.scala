package typings.gapiDotClientDotCompute.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetVpnGateway extends js.Object {
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[String] = js.undefined
  /** An optional description of this resource. Provide this property when you create the resource. */
  var description: js.UndefOr[String] = js.undefined
  /**
    * [Output Only] A list of URLs to the ForwardingRule resources. ForwardingRules are created using compute.forwardingRules.insert and associated to a VPN
    * gateway.
    */
  var forwardingRules: js.UndefOr[js.Array[String]] = js.undefined
  /** [Output Only] The unique identifier for the resource. This identifier is defined by the server. */
  var id: js.UndefOr[String] = js.undefined
  /** [Output Only] Type of resource. Always compute#targetVpnGateway for target VPN gateways. */
  var kind: js.UndefOr[String] = js.undefined
  /**
    * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035.
    * Specifically, the name must be 1-63 characters long and match the regular expression [a-z]([-a-z0-9]&#42;[a-z0-9])? which means the first character must be
    * a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
    */
  var name: js.UndefOr[String] = js.undefined
  /** URL of the network to which this VPN gateway is attached. Provided by the client when the VPN gateway is created. */
  var network: js.UndefOr[String] = js.undefined
  /** [Output Only] URL of the region where the target VPN gateway resides. */
  var region: js.UndefOr[String] = js.undefined
  /** [Output Only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[String] = js.undefined
  /** [Output Only] The status of the VPN gateway. */
  var status: js.UndefOr[String] = js.undefined
  /** [Output Only] A list of URLs to VpnTunnel resources. VpnTunnels are created using compute.vpntunnels.insert method and associated to a VPN gateway. */
  var tunnels: js.UndefOr[js.Array[String]] = js.undefined
}

object TargetVpnGateway {
  @scala.inline
  def apply(
    creationTimestamp: String = null,
    description: String = null,
    forwardingRules: js.Array[String] = null,
    id: String = null,
    kind: String = null,
    name: String = null,
    network: String = null,
    region: String = null,
    selfLink: String = null,
    status: String = null,
    tunnels: js.Array[String] = null
  ): TargetVpnGateway = {
    val __obj = js.Dynamic.literal()
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp)
    if (description != null) __obj.updateDynamic("description")(description)
    if (forwardingRules != null) __obj.updateDynamic("forwardingRules")(forwardingRules)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (network != null) __obj.updateDynamic("network")(network)
    if (region != null) __obj.updateDynamic("region")(region)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (status != null) __obj.updateDynamic("status")(status)
    if (tunnels != null) __obj.updateDynamic("tunnels")(tunnels)
    __obj.asInstanceOf[TargetVpnGateway]
  }
}

