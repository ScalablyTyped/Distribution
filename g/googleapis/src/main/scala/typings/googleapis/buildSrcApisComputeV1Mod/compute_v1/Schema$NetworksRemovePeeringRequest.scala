package typings.googleapis.buildSrcApisComputeV1Mod.compute_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$NetworksRemovePeeringRequest extends js.Object {
  /**
    * Name of the peering, which should conform to RFC1035.
    */
  var name: js.UndefOr[String] = js.native
}

object Schema$NetworksRemovePeeringRequest {
  @scala.inline
  def apply(name: String = null): Schema$NetworksRemovePeeringRequest = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$NetworksRemovePeeringRequest]
  }
}

