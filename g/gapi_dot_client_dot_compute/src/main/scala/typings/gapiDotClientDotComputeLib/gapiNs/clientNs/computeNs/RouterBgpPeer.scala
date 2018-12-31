package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterBgpPeer extends js.Object {
  /**
    * The priority of routes advertised to this BGP peer. In the case where there is more than one matching route of maximum length, the routes with lowest
    * priority value win.
    */
  var advertisedRoutePriority: js.UndefOr[scala.Double] = js.undefined
  /** Name of the interface the BGP peer is associated with. */
  var interfaceName: js.UndefOr[java.lang.String] = js.undefined
  /** IP address of the interface inside Google Cloud Platform. Only IPv4 is supported. */
  var ipAddress: js.UndefOr[java.lang.String] = js.undefined
  /** Name of this BGP peer. The name must be 1-63 characters long and comply with RFC1035. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Peer BGP Autonomous System Number (ASN). For VPN use case, this value can be different for every tunnel. */
  var peerAsn: js.UndefOr[scala.Double] = js.undefined
  /** IP address of the BGP interface outside Google cloud. Only IPv4 is supported. */
  var peerIpAddress: js.UndefOr[java.lang.String] = js.undefined
}

