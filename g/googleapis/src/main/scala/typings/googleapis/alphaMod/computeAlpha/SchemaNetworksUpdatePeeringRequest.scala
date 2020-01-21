package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaNetworksUpdatePeeringRequest extends js.Object {
  var networkPeering: js.UndefOr[SchemaNetworkPeering] = js.native
}

object SchemaNetworksUpdatePeeringRequest {
  @scala.inline
  def apply(networkPeering: SchemaNetworkPeering = null): SchemaNetworksUpdatePeeringRequest = {
    val __obj = js.Dynamic.literal()
    if (networkPeering != null) __obj.updateDynamic("networkPeering")(networkPeering.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNetworksUpdatePeeringRequest]
  }
}

