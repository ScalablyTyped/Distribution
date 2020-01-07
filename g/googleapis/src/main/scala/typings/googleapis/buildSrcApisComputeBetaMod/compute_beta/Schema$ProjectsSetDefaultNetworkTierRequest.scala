package typings.googleapis.buildSrcApisComputeBetaMod.compute_beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ProjectsSetDefaultNetworkTierRequest extends js.Object {
  /**
    * Default network tier to be set.
    */
  var networkTier: js.UndefOr[String] = js.native
}

object Schema$ProjectsSetDefaultNetworkTierRequest {
  @scala.inline
  def apply(networkTier: String = null): Schema$ProjectsSetDefaultNetworkTierRequest = {
    val __obj = js.Dynamic.literal()
    if (networkTier != null) __obj.updateDynamic("networkTier")(networkTier.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ProjectsSetDefaultNetworkTierRequest]
  }
}

