package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAllocationSpecificSKUAllocationReservedInstanceProperties extends StObject {
  
  /**
    * Specifies accelerator type and count.
    */
  var guestAccelerators: js.UndefOr[js.Array[SchemaAcceleratorConfig]] = js.undefined
  
  /**
    * Specifies amount of local ssd to reserve with each instance. The type of disk is local-ssd.
    */
  var localSsds: js.UndefOr[
    js.Array[SchemaAllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk]
  ] = js.undefined
  
  /**
    * An opaque location hint used to place the allocation close to other resources. This field is for use by internal tools that use the public API.
    */
  var locationHint: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specifies type of machine (name only) which has fixed number of vCPUs and fixed amount of memory. This also includes specifying custom machine type following custom-NUMBER_OF_CPUS-AMOUNT_OF_MEMORY pattern.
    */
  var machineType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specifies the number of hours after reservation creation where instances using the reservation won't be scheduled for maintenance.
    */
  var maintenanceFreezeDurationHours: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * For more information about maintenance intervals, see Setting maintenance intervals.
    */
  var maintenanceInterval: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Minimum cpu platform the reservation.
    */
  var minCpuPlatform: js.UndefOr[String | Null] = js.undefined
}
object SchemaAllocationSpecificSKUAllocationReservedInstanceProperties {
  
  inline def apply(): SchemaAllocationSpecificSKUAllocationReservedInstanceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAllocationSpecificSKUAllocationReservedInstanceProperties]
  }
  
  extension [Self <: SchemaAllocationSpecificSKUAllocationReservedInstanceProperties](x: Self) {
    
    inline def setGuestAccelerators(value: js.Array[SchemaAcceleratorConfig]): Self = StObject.set(x, "guestAccelerators", value.asInstanceOf[js.Any])
    
    inline def setGuestAcceleratorsUndefined: Self = StObject.set(x, "guestAccelerators", js.undefined)
    
    inline def setGuestAcceleratorsVarargs(value: SchemaAcceleratorConfig*): Self = StObject.set(x, "guestAccelerators", js.Array(value*))
    
    inline def setLocalSsds(value: js.Array[SchemaAllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk]): Self = StObject.set(x, "localSsds", value.asInstanceOf[js.Any])
    
    inline def setLocalSsdsUndefined: Self = StObject.set(x, "localSsds", js.undefined)
    
    inline def setLocalSsdsVarargs(value: SchemaAllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk*): Self = StObject.set(x, "localSsds", js.Array(value*))
    
    inline def setLocationHint(value: String): Self = StObject.set(x, "locationHint", value.asInstanceOf[js.Any])
    
    inline def setLocationHintNull: Self = StObject.set(x, "locationHint", null)
    
    inline def setLocationHintUndefined: Self = StObject.set(x, "locationHint", js.undefined)
    
    inline def setMachineType(value: String): Self = StObject.set(x, "machineType", value.asInstanceOf[js.Any])
    
    inline def setMachineTypeNull: Self = StObject.set(x, "machineType", null)
    
    inline def setMachineTypeUndefined: Self = StObject.set(x, "machineType", js.undefined)
    
    inline def setMaintenanceFreezeDurationHours(value: Double): Self = StObject.set(x, "maintenanceFreezeDurationHours", value.asInstanceOf[js.Any])
    
    inline def setMaintenanceFreezeDurationHoursNull: Self = StObject.set(x, "maintenanceFreezeDurationHours", null)
    
    inline def setMaintenanceFreezeDurationHoursUndefined: Self = StObject.set(x, "maintenanceFreezeDurationHours", js.undefined)
    
    inline def setMaintenanceInterval(value: String): Self = StObject.set(x, "maintenanceInterval", value.asInstanceOf[js.Any])
    
    inline def setMaintenanceIntervalNull: Self = StObject.set(x, "maintenanceInterval", null)
    
    inline def setMaintenanceIntervalUndefined: Self = StObject.set(x, "maintenanceInterval", js.undefined)
    
    inline def setMinCpuPlatform(value: String): Self = StObject.set(x, "minCpuPlatform", value.asInstanceOf[js.Any])
    
    inline def setMinCpuPlatformNull: Self = StObject.set(x, "minCpuPlatform", null)
    
    inline def setMinCpuPlatformUndefined: Self = StObject.set(x, "minCpuPlatform", js.undefined)
  }
}
