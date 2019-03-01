package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterStatus extends js.Object {
  /** Best routes for this router's network. */
  var bestRoutes: js.UndefOr[js.Array[Route]] = js.undefined
  /** Best routes learned by this router. */
  var bestRoutesForRouter: js.UndefOr[js.Array[Route]] = js.undefined
  var bgpPeerStatus: js.UndefOr[js.Array[RouterStatusBgpPeerStatus]] = js.undefined
  /** URI of the network to which this router belongs. */
  var network: js.UndefOr[java.lang.String] = js.undefined
}

object RouterStatus {
  @scala.inline
  def apply(
    bestRoutes: js.Array[Route] = null,
    bestRoutesForRouter: js.Array[Route] = null,
    bgpPeerStatus: js.Array[RouterStatusBgpPeerStatus] = null,
    network: java.lang.String = null
  ): RouterStatus = {
    val __obj = js.Dynamic.literal()
    if (bestRoutes != null) __obj.updateDynamic("bestRoutes")(bestRoutes)
    if (bestRoutesForRouter != null) __obj.updateDynamic("bestRoutesForRouter")(bestRoutesForRouter)
    if (bgpPeerStatus != null) __obj.updateDynamic("bgpPeerStatus")(bgpPeerStatus)
    if (network != null) __obj.updateDynamic("network")(network)
    __obj.asInstanceOf[RouterStatus]
  }
}

