package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$RegionDisksRemoveResourcePoliciesRequest extends js.Object {
  /**
    * Resource policies to be removed from this disk.
    */
  var resourcePolicies: js.UndefOr[js.Array[String]] = js.native
}

object Schema$RegionDisksRemoveResourcePoliciesRequest {
  @scala.inline
  def apply(resourcePolicies: js.Array[String] = null): Schema$RegionDisksRemoveResourcePoliciesRequest = {
    val __obj = js.Dynamic.literal()
    if (resourcePolicies != null) __obj.updateDynamic("resourcePolicies")(resourcePolicies.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RegionDisksRemoveResourcePoliciesRequest]
  }
}

