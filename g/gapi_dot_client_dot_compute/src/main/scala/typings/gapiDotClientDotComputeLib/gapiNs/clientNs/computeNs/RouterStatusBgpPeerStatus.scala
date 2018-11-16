package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RouterStatusBgpPeerStatus extends js.Object {
  /** Routes that were advertised to the remote BGP peer */
  var advertisedRoutes: js.UndefOr[js.Array[Route]] = js.undefined
  /** IP address of the local BGP interface. */
  var ipAddress: js.UndefOr[java.lang.String] = js.undefined
  /** URL of the VPN tunnel that this BGP peer controls. */
  var linkedVpnTunnel: js.UndefOr[java.lang.String] = js.undefined
  /** Name of this BGP peer. Unique within the Routers resource. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Number of routes learned from the remote BGP Peer. */
  var numLearnedRoutes: js.UndefOr[scala.Double] = js.undefined
  /** IP address of the remote BGP interface. */
  var peerIpAddress: js.UndefOr[java.lang.String] = js.undefined
  /** BGP state as specified in RFC1771. */
  var state: js.UndefOr[java.lang.String] = js.undefined
  /** Status of the BGP peer: {UP, DOWN} */
  var status: js.UndefOr[java.lang.String] = js.undefined
  /** Time this session has been up. Format: 14 years, 51 weeks, 6 days, 23 hours, 59 minutes, 59 seconds */
  var uptime: js.UndefOr[java.lang.String] = js.undefined
  /** Time this session has been up, in seconds. Format: 145 */
  var uptimeSeconds: js.UndefOr[java.lang.String] = js.undefined
}

