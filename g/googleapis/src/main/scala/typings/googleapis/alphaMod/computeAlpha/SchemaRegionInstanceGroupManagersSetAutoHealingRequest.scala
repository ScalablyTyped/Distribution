package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaRegionInstanceGroupManagersSetAutoHealingRequest extends js.Object {
  
  var autoHealingPolicies: js.UndefOr[js.Array[SchemaInstanceGroupManagerAutoHealingPolicy]] = js.native
}
object SchemaRegionInstanceGroupManagersSetAutoHealingRequest {
  
  @scala.inline
  def apply(): SchemaRegionInstanceGroupManagersSetAutoHealingRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegionInstanceGroupManagersSetAutoHealingRequest]
  }
  
  @scala.inline
  implicit class SchemaRegionInstanceGroupManagersSetAutoHealingRequestOps[Self <: SchemaRegionInstanceGroupManagersSetAutoHealingRequest] (val x: Self) extends AnyVal {
    
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
