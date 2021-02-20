package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaAllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk extends StObject {
  
  /**
    * Specifies the size of the disk in base-2 GB.
    */
  var diskSizeGb: js.UndefOr[String] = js.native
  
  /**
    * Specifies the disk interface to use for attaching this disk, which is
    * either SCSI or NVME. The default is SCSI. For performance characteristics
    * of SCSI over NVMe, see Local SSD performance.
    */
  var interface: js.UndefOr[String] = js.native
}
object SchemaAllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk {
  
  @scala.inline
  def apply(): SchemaAllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk]
  }
  
  @scala.inline
  implicit class SchemaAllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskMutableBuilder[Self <: SchemaAllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDiskSizeGb(value: String): Self = StObject.set(x, "diskSizeGb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiskSizeGbUndefined: Self = StObject.set(x, "diskSizeGb", js.undefined)
    
    @scala.inline
    def setInterface(value: String): Self = StObject.set(x, "interface", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterfaceUndefined: Self = StObject.set(x, "interface", js.undefined)
  }
}
