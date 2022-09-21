package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResourceStatus extends StObject {
  
  /**
    * [Output Only] An opaque ID of the host on which the VM is running.
    */
  var physicalHost: js.UndefOr[String | Null] = js.undefined
  
  var scheduling: js.UndefOr[SchemaResourceStatusScheduling] = js.undefined
  
  var upcomingMaintenance: js.UndefOr[SchemaResourceStatusUpcomingMaintenance] = js.undefined
}
object SchemaResourceStatus {
  
  inline def apply(): SchemaResourceStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourceStatus]
  }
  
  extension [Self <: SchemaResourceStatus](x: Self) {
    
    inline def setPhysicalHost(value: String): Self = StObject.set(x, "physicalHost", value.asInstanceOf[js.Any])
    
    inline def setPhysicalHostNull: Self = StObject.set(x, "physicalHost", null)
    
    inline def setPhysicalHostUndefined: Self = StObject.set(x, "physicalHost", js.undefined)
    
    inline def setScheduling(value: SchemaResourceStatusScheduling): Self = StObject.set(x, "scheduling", value.asInstanceOf[js.Any])
    
    inline def setSchedulingUndefined: Self = StObject.set(x, "scheduling", js.undefined)
    
    inline def setUpcomingMaintenance(value: SchemaResourceStatusUpcomingMaintenance): Self = StObject.set(x, "upcomingMaintenance", value.asInstanceOf[js.Any])
    
    inline def setUpcomingMaintenanceUndefined: Self = StObject.set(x, "upcomingMaintenance", js.undefined)
  }
}
