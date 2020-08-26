package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaInstanceGroupManagersSetAutoHealingRequest extends js.Object {
  var autoHealingPolicies: js.UndefOr[js.Array[SchemaInstanceGroupManagerAutoHealingPolicy]] = js.native
}

object SchemaInstanceGroupManagersSetAutoHealingRequest {
  @scala.inline
  def apply(): SchemaInstanceGroupManagersSetAutoHealingRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceGroupManagersSetAutoHealingRequest]
  }
  @scala.inline
  implicit class SchemaInstanceGroupManagersSetAutoHealingRequestOps[Self <: SchemaInstanceGroupManagersSetAutoHealingRequest] (val x: Self) extends AnyVal {
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
    def setAutoHealingPoliciesVarargs(value: SchemaInstanceGroupManagerAutoHealingPolicy*): Self = this.set("autoHealingPolicies", js.Array(value :_*))
    @scala.inline
    def setAutoHealingPolicies(value: js.Array[SchemaInstanceGroupManagerAutoHealingPolicy]): Self = this.set("autoHealingPolicies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoHealingPolicies: Self = this.set("autoHealingPolicies", js.undefined)
  }
  
}

