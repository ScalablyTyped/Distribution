package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaResourcePolicyVmMaintenancePolicy extends StObject {
  
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
  implicit class SchemaResourcePolicyVmMaintenancePolicyMutableBuilder[Self <: SchemaResourcePolicyVmMaintenancePolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaintenanceWindow(value: SchemaResourcePolicyVmMaintenancePolicyMaintenanceWindow): Self = StObject.set(x, "maintenanceWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaintenanceWindowUndefined: Self = StObject.set(x, "maintenanceWindow", js.undefined)
  }
}
