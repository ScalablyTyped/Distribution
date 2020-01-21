package typings.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterStatusBgpPeerStatus extends js.Object {
  /** Routes that were advertised to the remote BGP peer */
  var advertisedRoutes: js.UndefOr[js.Array[Route]] = js.undefined
  /** IP address of the local BGP interface. */
  var ipAddress: js.UndefOr[String] = js.undefined
  /** URL of the VPN tunnel that this BGP peer controls. */
  var linkedVpnTunnel: js.UndefOr[String] = js.undefined
  /** Name of this BGP peer. Unique within the Routers resource. */
  var name: js.UndefOr[String] = js.undefined
  /** Number of routes learned from the remote BGP Peer. */
  var numLearnedRoutes: js.UndefOr[Double] = js.undefined
  /** IP address of the remote BGP interface. */
  var peerIpAddress: js.UndefOr[String] = js.undefined
  /** BGP state as specified in RFC1771. */
  var state: js.UndefOr[String] = js.undefined
  /** Status of the BGP peer: {UP, DOWN} */
  var status: js.UndefOr[String] = js.undefined
  /** Time this session has been up. Format: 14 years, 51 weeks, 6 days, 23 hours, 59 minutes, 59 seconds */
  var uptime: js.UndefOr[String] = js.undefined
  /** Time this session has been up, in seconds. Format: 145 */
  var uptimeSeconds: js.UndefOr[String] = js.undefined
}

object RouterStatusBgpPeerStatus {
  @scala.inline
  def apply(
    advertisedRoutes: js.Array[Route] = null,
    ipAddress: String = null,
    linkedVpnTunnel: String = null,
    name: String = null,
    numLearnedRoutes: Int | Double = null,
    peerIpAddress: String = null,
    state: String = null,
    status: String = null,
    uptime: String = null,
    uptimeSeconds: String = null
  ): RouterStatusBgpPeerStatus = {
    val __obj = js.Dynamic.literal()
    if (advertisedRoutes != null) __obj.updateDynamic("advertisedRoutes")(advertisedRoutes.asInstanceOf[js.Any])
    if (ipAddress != null) __obj.updateDynamic("ipAddress")(ipAddress.asInstanceOf[js.Any])
    if (linkedVpnTunnel != null) __obj.updateDynamic("linkedVpnTunnel")(linkedVpnTunnel.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (numLearnedRoutes != null) __obj.updateDynamic("numLearnedRoutes")(numLearnedRoutes.asInstanceOf[js.Any])
    if (peerIpAddress != null) __obj.updateDynamic("peerIpAddress")(peerIpAddress.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (uptime != null) __obj.updateDynamic("uptime")(uptime.asInstanceOf[js.Any])
    if (uptimeSeconds != null) __obj.updateDynamic("uptimeSeconds")(uptimeSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterStatusBgpPeerStatus]
  }
}

