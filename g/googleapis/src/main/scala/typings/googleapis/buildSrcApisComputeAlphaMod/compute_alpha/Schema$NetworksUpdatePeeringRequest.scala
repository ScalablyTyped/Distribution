package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$NetworksUpdatePeeringRequest extends js.Object {
  var networkPeering: js.UndefOr[Schema$NetworkPeering] = js.native
}

object Schema$NetworksUpdatePeeringRequest {
  @scala.inline
  def apply(networkPeering: Schema$NetworkPeering = null): Schema$NetworksUpdatePeeringRequest = {
    val __obj = js.Dynamic.literal()
    if (networkPeering != null) __obj.updateDynamic("networkPeering")(networkPeering.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$NetworksUpdatePeeringRequest]
  }
}

