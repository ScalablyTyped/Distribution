package typings.googleapis.buildSrcApisComputeBetaMod.compute_beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$RouterStatus extends js.Object {
  /**
    * Best routes for this router&#39;s network.
    */
  var bestRoutes: js.UndefOr[js.Array[Schema$Route]] = js.native
  /**
    * Best routes learned by this router.
    */
  var bestRoutesForRouter: js.UndefOr[js.Array[Schema$Route]] = js.native
  var bgpPeerStatus: js.UndefOr[js.Array[Schema$RouterStatusBgpPeerStatus]] = js.native
  var natStatus: js.UndefOr[js.Array[Schema$RouterStatusNatStatus]] = js.native
  /**
    * URI of the network to which this router belongs.
    */
  var network: js.UndefOr[String] = js.native
}

object Schema$RouterStatus {
  @scala.inline
  def apply(
    bestRoutes: js.Array[Schema$Route] = null,
    bestRoutesForRouter: js.Array[Schema$Route] = null,
    bgpPeerStatus: js.Array[Schema$RouterStatusBgpPeerStatus] = null,
    natStatus: js.Array[Schema$RouterStatusNatStatus] = null,
    network: String = null
  ): Schema$RouterStatus = {
    val __obj = js.Dynamic.literal()
    if (bestRoutes != null) __obj.updateDynamic("bestRoutes")(bestRoutes.asInstanceOf[js.Any])
    if (bestRoutesForRouter != null) __obj.updateDynamic("bestRoutesForRouter")(bestRoutesForRouter.asInstanceOf[js.Any])
    if (bgpPeerStatus != null) __obj.updateDynamic("bgpPeerStatus")(bgpPeerStatus.asInstanceOf[js.Any])
    if (natStatus != null) __obj.updateDynamic("natStatus")(natStatus.asInstanceOf[js.Any])
    if (network != null) __obj.updateDynamic("network")(network.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RouterStatus]
  }
}

