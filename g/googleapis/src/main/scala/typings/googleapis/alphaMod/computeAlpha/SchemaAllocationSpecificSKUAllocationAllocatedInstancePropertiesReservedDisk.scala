package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk extends StObject {
  
  /**
    * Specifies the size of the disk in base-2 GB.
    */
  var diskSizeGb: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME. The default is SCSI. For performance characteristics of SCSI over NVMe, see Local SSD performance.
    */
  var interface: js.UndefOr[String | Null] = js.undefined
}
object SchemaAllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk {
  
  inline def apply(): SchemaAllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk]
  }
  
  extension [Self <: SchemaAllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk](x: Self) {
    
    inline def setDiskSizeGb(value: String): Self = StObject.set(x, "diskSizeGb", value.asInstanceOf[js.Any])
    
    inline def setDiskSizeGbNull: Self = StObject.set(x, "diskSizeGb", null)
    
    inline def setDiskSizeGbUndefined: Self = StObject.set(x, "diskSizeGb", js.undefined)
    
    inline def setInterface(value: String): Self = StObject.set(x, "interface", value.asInstanceOf[js.Any])
    
    inline def setInterfaceNull: Self = StObject.set(x, "interface", null)
    
    inline def setInterfaceUndefined: Self = StObject.set(x, "interface", js.undefined)
  }
}
