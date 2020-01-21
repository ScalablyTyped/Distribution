package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaDisksRemoveResourcePoliciesRequest extends js.Object {
  /**
    * Resource policies to be removed from this disk.
    */
  var resourcePolicies: js.UndefOr[js.Array[String]] = js.native
}

object SchemaDisksRemoveResourcePoliciesRequest {
  @scala.inline
  def apply(resourcePolicies: js.Array[String] = null): SchemaDisksRemoveResourcePoliciesRequest = {
    val __obj = js.Dynamic.literal()
    if (resourcePolicies != null) __obj.updateDynamic("resourcePolicies")(resourcePolicies.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDisksRemoveResourcePoliciesRequest]
  }
}

