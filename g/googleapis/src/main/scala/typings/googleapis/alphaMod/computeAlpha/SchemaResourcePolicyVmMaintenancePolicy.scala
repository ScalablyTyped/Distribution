package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaResourcePolicyVmMaintenancePolicy extends js.Object {
  
  /**
    * Maintenance windows that are applied to VMs covered by this policy.
    */
  var maintenanceWindow: js.UndefOr[SchemaResourcePolicyVmMaintenancePolicyMaintenanceWindow] = js.native
}
object SchemaResourcePolicyVmMaintenancePolicy {
  
  @scala.inline
  def apply(): SchemaResourcePolicyVmMaintenancePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourcePolicyVmMaintenancePolicy]
  }
  
  @scala.inline
  implicit class SchemaResourcePolicyVmMaintenancePolicyOps[Self <: SchemaResourcePolicyVmMaintenancePolicy] (val x: Self) extends AnyVal {
    
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
    def setMaintenanceWindow(value: SchemaResourcePolicyVmMaintenancePolicyMaintenanceWindow): Self = this.set("maintenanceWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaintenanceWindow: Self = this.set("maintenanceWindow", js.undefined)
  }
}
