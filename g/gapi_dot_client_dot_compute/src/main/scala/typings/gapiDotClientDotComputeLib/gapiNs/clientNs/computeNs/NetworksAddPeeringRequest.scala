package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait NetworksAddPeeringRequest extends js.Object {
  /** Whether Google Compute Engine manages the routes automatically. */
  var autoCreateRoutes: js.UndefOr[scala.Boolean] = js.undefined
  /** Name of the peering, which should conform to RFC1035. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
               * URL of the peer network. It can be either full URL or partial URL. The peer network may belong to a different project. If the partial URL does not
               * contain project, it is assumed that the peer network is in the same project as the current network.
               */
  var peerNetwork: js.UndefOr[java.lang.String] = js.undefined
}

