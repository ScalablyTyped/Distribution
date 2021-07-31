package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A maintenance window for VMs. When set, we restrict our maintenance
  * operations to this window.
  */
trait SchemaResourcePolicyVmMaintenancePolicyMaintenanceWindow extends StObject {
  
  var dailyMaintenanceWindow: js.UndefOr[SchemaResourcePolicyDailyCycle] = js.undefined
}
object SchemaResourcePolicyVmMaintenancePolicyMaintenanceWindow {
  
  @scala.inline
  def apply(): SchemaResourcePolicyVmMaintenancePolicyMaintenanceWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourcePolicyVmMaintenancePolicyMaintenanceWindow]
  }
  
  @scala.inline
  implicit class SchemaResourcePolicyVmMaintenancePolicyMaintenanceWindowMutableBuilder[Self <: SchemaResourcePolicyVmMaintenancePolicyMaintenanceWindow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDailyMaintenanceWindow(value: SchemaResourcePolicyDailyCycle): Self = StObject.set(x, "dailyMaintenanceWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDailyMaintenanceWindowUndefined: Self = StObject.set(x, "dailyMaintenanceWindow", js.undefined)
  }
}
