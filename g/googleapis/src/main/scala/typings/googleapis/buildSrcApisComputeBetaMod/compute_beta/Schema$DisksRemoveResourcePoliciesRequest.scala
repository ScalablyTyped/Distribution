package typings.googleapis.buildSrcApisComputeBetaMod.compute_beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$DisksRemoveResourcePoliciesRequest extends js.Object {
  /**
    * Resource policies to be removed from this disk.
    */
  var resourcePolicies: js.UndefOr[js.Array[String]] = js.native
}

object Schema$DisksRemoveResourcePoliciesRequest {
  @scala.inline
  def apply(resourcePolicies: js.Array[String] = null): Schema$DisksRemoveResourcePoliciesRequest = {
    val __obj = js.Dynamic.literal()
    if (resourcePolicies != null) __obj.updateDynamic("resourcePolicies")(resourcePolicies.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DisksRemoveResourcePoliciesRequest]
  }
}

