package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaRouterStatus extends js.Object {
  /**
    * Best routes for this router&#39;s network.
    */
  var bestRoutes: js.UndefOr[js.Array[SchemaRoute]] = js.native
  /**
    * Best routes learned by this router.
    */
  var bestRoutesForRouter: js.UndefOr[js.Array[SchemaRoute]] = js.native
  var bgpPeerStatus: js.UndefOr[js.Array[SchemaRouterStatusBgpPeerStatus]] = js.native
  var natStatus: js.UndefOr[js.Array[SchemaRouterStatusNatStatus]] = js.native
  /**
    * URI of the network to which this router belongs.
    */
  var network: js.UndefOr[String] = js.native
}

object SchemaRouterStatus {
  @scala.inline
  def apply(
    bestRoutes: js.Array[SchemaRoute] = null,
    bestRoutesForRouter: js.Array[SchemaRoute] = null,
    bgpPeerStatus: js.Array[SchemaRouterStatusBgpPeerStatus] = null,
    natStatus: js.Array[SchemaRouterStatusNatStatus] = null,
    network: String = null
  ): SchemaRouterStatus = {
    val __obj = js.Dynamic.literal()
    if (bestRoutes != null) __obj.updateDynamic("bestRoutes")(bestRoutes.asInstanceOf[js.Any])
    if (bestRoutesForRouter != null) __obj.updateDynamic("bestRoutesForRouter")(bestRoutesForRouter.asInstanceOf[js.Any])
    if (bgpPeerStatus != null) __obj.updateDynamic("bgpPeerStatus")(bgpPeerStatus.asInstanceOf[js.Any])
    if (natStatus != null) __obj.updateDynamic("natStatus")(natStatus.asInstanceOf[js.Any])
    if (network != null) __obj.updateDynamic("network")(network.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRouterStatus]
  }
}

