package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$RegionDisksAddResourcePoliciesRequest extends js.Object {
  /**
    * Resource policies to be added to this disk.
    */
  var resourcePolicies: js.UndefOr[js.Array[String]] = js.native
}

object Schema$RegionDisksAddResourcePoliciesRequest {
  @scala.inline
  def apply(resourcePolicies: js.Array[String] = null): Schema$RegionDisksAddResourcePoliciesRequest = {
    val __obj = js.Dynamic.literal()
    if (resourcePolicies != null) __obj.updateDynamic("resourcePolicies")(resourcePolicies.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RegionDisksAddResourcePoliciesRequest]
  }
}

