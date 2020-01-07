package typings.googleapis.buildSrcApisComputeV1Mod.compute_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * VPN tunnel resource. (== resource_for beta.vpnTunnels ==) (== resource_for
  * v1.vpnTunnels ==)
  */
@js.native
trait Schema$VpnTunnel extends js.Object {
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
    * [Output Only] Detailed status message for the VPN tunnel.
    */
  var detailedStatus: js.UndefOr[String] = js.native
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * IKE protocol version to use when establishing the VPN tunnel with the
    * peer VPN gateway. Acceptable IKE versions are 1 or 2. The default version
    * is 2.
    */
  var ikeVersion: js.UndefOr[Double] = js.native
  /**
    * [Output Only] Type of resource. Always compute#vpnTunnel for VPN tunnels.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Local traffic selector to use when establishing the VPN tunnel with the
    * peer VPN gateway. The value should be a CIDR formatted string, for
    * example: 192.168.0.0/16. The ranges must be disjoint. Only IPv4 is
    * supported.
    */
  var localTrafficSelector: js.UndefOr[js.Array[String]] = js.native
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
    * IP address of the peer VPN gateway. Only IPv4 is supported.
    */
  var peerIp: js.UndefOr[String] = js.native
  /**
    * [Output Only] URL of the region where the VPN tunnel resides. You must
    * specify this field as part of the HTTP request URL. It is not settable as
    * a field in the request body.
    */
  var region: js.UndefOr[String] = js.native
  /**
    * Remote traffic selectors to use when establishing the VPN tunnel with the
    * peer VPN gateway. The value should be a CIDR formatted string, for
    * example: 192.168.0.0/16. The ranges should be disjoint. Only IPv4 is
    * supported.
    */
  var remoteTrafficSelector: js.UndefOr[js.Array[String]] = js.native
  /**
    * URL of the router resource to be used for dynamic routing.
    */
  var router: js.UndefOr[String] = js.native
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * Shared secret used to set the secure session between the Cloud VPN
    * gateway and the peer VPN gateway.
    */
  var sharedSecret: js.UndefOr[String] = js.native
  /**
    * Hash of the shared secret.
    */
  var sharedSecretHash: js.UndefOr[String] = js.native
  /**
    * [Output Only] The status of the VPN tunnel, which can be one of the
    * following:  - PROVISIONING: Resource is being allocated for the VPN
    * tunnel.  - WAITING_FOR_FULL_CONFIG: Waiting to receive all VPN-related
    * configs from the user. Network, TargetVpnGateway, VpnTunnel,
    * ForwardingRule, and Route resources are needed to setup the VPN tunnel.
    * - FIRST_HANDSHAKE: Successful first handshake with the peer VPN.  -
    * ESTABLISHED: Secure session is successfully established with the peer
    * VPN.  - NETWORK_ERROR: Deprecated, replaced by NO_INCOMING_PACKETS  -
    * AUTHORIZATION_ERROR: Auth error (for example, bad shared secret).  -
    * NEGOTIATION_FAILURE: Handshake failed.  - DEPROVISIONING: Resources are
    * being deallocated for the VPN tunnel.  - FAILED: Tunnel creation has
    * failed and the tunnel is not ready to be used.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * URL of the Target VPN gateway with which this VPN tunnel is associated.
    * Provided by the client when the VPN tunnel is created.
    */
  var targetVpnGateway: js.UndefOr[String] = js.native
}

object Schema$VpnTunnel {
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
  ): Schema$VpnTunnel = {
    val __obj = js.Dynamic.literal()
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (detailedStatus != null) __obj.updateDynamic("detailedStatus")(detailedStatus.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (ikeVersion != null) __obj.updateDynamic("ikeVersion")(ikeVersion.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (localTrafficSelector != null) __obj.updateDynamic("localTrafficSelector")(localTrafficSelector.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (peerIp != null) __obj.updateDynamic("peerIp")(peerIp.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (remoteTrafficSelector != null) __obj.updateDynamic("remoteTrafficSelector")(remoteTrafficSelector.asInstanceOf[js.Any])
    if (router != null) __obj.updateDynamic("router")(router.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (sharedSecret != null) __obj.updateDynamic("sharedSecret")(sharedSecret.asInstanceOf[js.Any])
    if (sharedSecretHash != null) __obj.updateDynamic("sharedSecretHash")(sharedSecretHash.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (targetVpnGateway != null) __obj.updateDynamic("targetVpnGateway")(targetVpnGateway.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$VpnTunnel]
  }
}

