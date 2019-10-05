package typings.gapiDotClientDotCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpnTunnel extends js.Object {
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[String] = js.undefined
  /** An optional description of this resource. Provide this property when you create the resource. */
  var description: js.UndefOr[String] = js.undefined
  /** [Output Only] Detailed status message for the VPN tunnel. */
  var detailedStatus: js.UndefOr[String] = js.undefined
  /** [Output Only] The unique identifier for the resource. This identifier is defined by the server. */
  var id: js.UndefOr[String] = js.undefined
  /** IKE protocol version to use when establishing the VPN tunnel with peer VPN gateway. Acceptable IKE versions are 1 or 2. Default version is 2. */
  var ikeVersion: js.UndefOr[Double] = js.undefined
  /** [Output Only] Type of resource. Always compute#vpnTunnel for VPN tunnels. */
  var kind: js.UndefOr[String] = js.undefined
  /**
    * Local traffic selector to use when establishing the VPN tunnel with peer VPN gateway. The value should be a CIDR formatted string, for example:
    * 192.168.0.0/16. The ranges should be disjoint. Only IPv4 is supported.
    */
  var localTrafficSelector: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035.
    * Specifically, the name must be 1-63 characters long and match the regular expression [a-z]([-a-z0-9]&#42;[a-z0-9])? which means the first character must be
    * a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
    */
  var name: js.UndefOr[String] = js.undefined
  /** IP address of the peer VPN gateway. Only IPv4 is supported. */
  var peerIp: js.UndefOr[String] = js.undefined
  /** [Output Only] URL of the region where the VPN tunnel resides. */
  var region: js.UndefOr[String] = js.undefined
  /**
    * Remote traffic selectors to use when establishing the VPN tunnel with peer VPN gateway. The value should be a CIDR formatted string, for example:
    * 192.168.0.0/16. The ranges should be disjoint. Only IPv4 is supported.
    */
  var remoteTrafficSelector: js.UndefOr[js.Array[String]] = js.undefined
  /** URL of router resource to be used for dynamic routing. */
  var router: js.UndefOr[String] = js.undefined
  /** [Output Only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[String] = js.undefined
  /** Shared secret used to set the secure session between the Cloud VPN gateway and the peer VPN gateway. */
  var sharedSecret: js.UndefOr[String] = js.undefined
  /** Hash of the shared secret. */
  var sharedSecretHash: js.UndefOr[String] = js.undefined
  /** [Output Only] The status of the VPN tunnel. */
  var status: js.UndefOr[String] = js.undefined
  /** URL of the VPN gateway with which this VPN tunnel is associated. Provided by the client when the VPN tunnel is created. */
  var targetVpnGateway: js.UndefOr[String] = js.undefined
}

object VpnTunnel {
  @scala.inline
  def apply(
    creationTimestamp: String = null,
    description: String = null,
    detailedStatus: String = null,
    id: String = null,
    ikeVersion: Int | Double = null,
    kind: String = null,
    localTrafficSelector: js.Array[String] = null,
    name: String = null,
    peerIp: String = null,
    region: String = null,
    remoteTrafficSelector: js.Array[String] = null,
    router: String = null,
    selfLink: String = null,
    sharedSecret: String = null,
    sharedSecretHash: String = null,
    status: String = null,
    targetVpnGateway: String = null
  ): VpnTunnel = {
    val __obj = js.Dynamic.literal()
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp)
    if (description != null) __obj.updateDynamic("description")(description)
    if (detailedStatus != null) __obj.updateDynamic("detailedStatus")(detailedStatus)
    if (id != null) __obj.updateDynamic("id")(id)
    if (ikeVersion != null) __obj.updateDynamic("ikeVersion")(ikeVersion.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (localTrafficSelector != null) __obj.updateDynamic("localTrafficSelector")(localTrafficSelector)
    if (name != null) __obj.updateDynamic("name")(name)
    if (peerIp != null) __obj.updateDynamic("peerIp")(peerIp)
    if (region != null) __obj.updateDynamic("region")(region)
    if (remoteTrafficSelector != null) __obj.updateDynamic("remoteTrafficSelector")(remoteTrafficSelector)
    if (router != null) __obj.updateDynamic("router")(router)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (sharedSecret != null) __obj.updateDynamic("sharedSecret")(sharedSecret)
    if (sharedSecretHash != null) __obj.updateDynamic("sharedSecretHash")(sharedSecretHash)
    if (status != null) __obj.updateDynamic("status")(status)
    if (targetVpnGateway != null) __obj.updateDynamic("targetVpnGateway")(targetVpnGateway)
    __obj.asInstanceOf[VpnTunnel]
  }
}

