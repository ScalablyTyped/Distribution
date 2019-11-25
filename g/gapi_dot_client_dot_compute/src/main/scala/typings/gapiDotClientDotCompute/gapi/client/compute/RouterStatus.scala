package typings.gapiDotClientDotCompute.gapi.client.compute

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
  var network: js.UndefOr[String] = js.undefined
}

object RouterStatus {
  @scala.inline
  def apply(
    bestRoutes: js.Array[Route] = null,
    bestRoutesForRouter: js.Array[Route] = null,
    bgpPeerStatus: js.Array[RouterStatusBgpPeerStatus] = null,
    network: String = null
  ): RouterStatus = {
    val __obj = js.Dynamic.literal()
    if (bestRoutes != null) __obj.updateDynamic("bestRoutes")(bestRoutes.asInstanceOf[js.Any])
    if (bestRoutesForRouter != null) __obj.updateDynamic("bestRoutesForRouter")(bestRoutesForRouter.asInstanceOf[js.Any])
    if (bgpPeerStatus != null) __obj.updateDynamic("bgpPeerStatus")(bgpPeerStatus.asInstanceOf[js.Any])
    if (network != null) __obj.updateDynamic("network")(network.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterStatus]
  }
}

