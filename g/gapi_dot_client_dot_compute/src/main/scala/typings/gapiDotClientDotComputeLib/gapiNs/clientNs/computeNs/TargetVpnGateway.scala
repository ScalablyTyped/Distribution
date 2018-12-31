package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetVpnGateway extends js.Object {
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[java.lang.String] = js.undefined
  /** An optional description of this resource. Provide this property when you create the resource. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * [Output Only] A list of URLs to the ForwardingRule resources. ForwardingRules are created using compute.forwardingRules.insert and associated to a VPN
    * gateway.
    */
  var forwardingRules: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** [Output Only] The unique identifier for the resource. This identifier is defined by the server. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] Type of resource. Always compute#targetVpnGateway for target VPN gateways. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035.
    * Specifically, the name must be 1-63 characters long and match the regular expression [a-z]([-a-z0-9]&#42;[a-z0-9])? which means the first character must be
    * a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** URL of the network to which this VPN gateway is attached. Provided by the client when the VPN gateway is created. */
  var network: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] URL of the region where the target VPN gateway resides. */
  var region: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] The status of the VPN gateway. */
  var status: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] A list of URLs to VpnTunnel resources. VpnTunnels are created using compute.vpntunnels.insert method and associated to a VPN gateway. */
  var tunnels: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

