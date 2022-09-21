package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResourcePolicyVmMaintenancePolicy extends StObject {
  
  var concurrencyControlGroup: js.UndefOr[SchemaResourcePolicyVmMaintenancePolicyConcurrencyControl] = js.undefined
  
  /**
    * Maintenance windows that are applied to VMs covered by this policy.
    */
  var maintenanceWindow: js.UndefOr[SchemaResourcePolicyVmMaintenancePolicyMaintenanceWindow] = js.undefined
}
object SchemaResourcePolicyVmMaintenancePolicy {
  
  inline def apply(): SchemaResourcePolicyVmMaintenancePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourcePolicyVmMaintenancePolicy]
  }
  
  extension [Self <: SchemaResourcePolicyVmMaintenancePolicy](x: Self) {
    
    inline def setConcurrencyControlGroup(value: SchemaResourcePolicyVmMaintenancePolicyConcurrencyControl): Self = StObject.set(x, "concurrencyControlGroup", value.asInstanceOf[js.Any])
    
    inline def setConcurrencyControlGroupUndefined: Self = StObject.set(x, "concurrencyControlGroup", js.undefined)
    
    inline def setMaintenanceWindow(value: SchemaResourcePolicyVmMaintenancePolicyMaintenanceWindow): Self = StObject.set(x, "maintenanceWindow", value.asInstanceOf[js.Any])
    
    inline def setMaintenanceWindowUndefined: Self = StObject.set(x, "maintenanceWindow", js.undefined)
  }
}
