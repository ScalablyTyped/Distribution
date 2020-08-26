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
  def apply(): SchemaAuthorizationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAuthorizationConfig]
  }
  @scala.inline
  implicit class SchemaAuthorizationConfigOps[Self <: SchemaAuthorizationConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPoliciesVarargs(value: SchemaRbacPolicy*): Self = this.set("policies", js.Array(value :_*))
    @scala.inline
    def setPolicies(value: js.Array[SchemaRbacPolicy]): Self = this.set("policies", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicies: Self = this.set("policies", js.undefined)
  }
  
}

