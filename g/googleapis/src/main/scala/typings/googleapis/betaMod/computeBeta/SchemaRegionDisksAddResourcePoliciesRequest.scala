package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaRegionDisksAddResourcePoliciesRequest extends js.Object {
  /**
    * Resource policies to be added to this disk.
    */
  var resourcePolicies: js.UndefOr[js.Array[String]] = js.native
}

object SchemaRegionDisksAddResourcePoliciesRequest {
  @scala.inline
  def apply(resourcePolicies: js.Array[String] = null): SchemaRegionDisksAddResourcePoliciesRequest = {
    val __obj = js.Dynamic.literal()
    if (resourcePolicies != null) __obj.updateDynamic("resourcePolicies")(resourcePolicies.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRegionDisksAddResourcePoliciesRequest]
  }
}

