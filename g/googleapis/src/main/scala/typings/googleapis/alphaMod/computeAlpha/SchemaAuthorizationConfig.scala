package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Authorization configuration provides service-level and method-level access
  * control for a service.
  */
@js.native
trait SchemaAuthorizationConfig extends js.Object {
  /**
    * List of RbacPolicies.
    */
  var policies: js.UndefOr[js.Array[SchemaRbacPolicy]] = js.native
}

object SchemaAuthorizationConfig {
  @scala.inline
  def apply(policies: js.Array[SchemaRbacPolicy] = null): SchemaAuthorizationConfig = {
    val __obj = js.Dynamic.literal()
    if (policies != null) __obj.updateDynamic("policies")(policies.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAuthorizationConfig]
  }
}

