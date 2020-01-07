package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Authorization configuration provides service-level and method-level access
  * control for a service.
  */
@js.native
trait Schema$AuthorizationConfig extends js.Object {
  /**
    * List of RbacPolicies.
    */
  var policies: js.UndefOr[js.Array[Schema$RbacPolicy]] = js.native
}

object Schema$AuthorizationConfig {
  @scala.inline
  def apply(policies: js.Array[Schema$RbacPolicy] = null): Schema$AuthorizationConfig = {
    val __obj = js.Dynamic.literal()
    if (policies != null) __obj.updateDynamic("policies")(policies.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AuthorizationConfig]
  }
}

