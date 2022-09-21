package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResourcePolicyVmMaintenancePolicyMaintenanceWindow extends StObject {
  
  var dailyMaintenanceWindow: js.UndefOr[SchemaResourcePolicyDailyCycle] = js.undefined
}
object SchemaResourcePolicyVmMaintenancePolicyMaintenanceWindow {
  
  inline def apply(): SchemaResourcePolicyVmMaintenancePolicyMaintenanceWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourcePolicyVmMaintenancePolicyMaintenanceWindow]
  }
  
  extension [Self <: SchemaResourcePolicyVmMaintenancePolicyMaintenanceWindow](x: Self) {
    
    inline def setDailyMaintenanceWindow(value: SchemaResourcePolicyDailyCycle): Self = StObject.set(x, "dailyMaintenanceWindow", value.asInstanceOf[js.Any])
    
    inline def setDailyMaintenanceWindowUndefined: Self = StObject.set(x, "dailyMaintenanceWindow", js.undefined)
  }
}
