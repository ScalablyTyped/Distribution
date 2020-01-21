package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaInstancesAddResourcePoliciesRequest extends js.Object {
  /**
    * Resource policies to be added to this instance.
    */
  var resourcePolicies: js.UndefOr[js.Array[String]] = js.native
}

object SchemaInstancesAddResourcePoliciesRequest {
  @scala.inline
  def apply(resourcePolicies: js.Array[String] = null): SchemaInstancesAddResourcePoliciesRequest = {
    val __obj = js.Dynamic.literal()
    if (resourcePolicies != null) __obj.updateDynamic("resourcePolicies")(resourcePolicies.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInstancesAddResourcePoliciesRequest]
  }
}

