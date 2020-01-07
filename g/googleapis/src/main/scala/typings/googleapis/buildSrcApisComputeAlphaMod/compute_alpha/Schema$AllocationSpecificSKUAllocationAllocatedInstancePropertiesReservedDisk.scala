package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk extends js.Object {
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

object Schema$AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk {
  @scala.inline
  def apply(diskSizeGb: String = null, interface: String = null): Schema$AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk = {
    val __obj = js.Dynamic.literal()
    if (diskSizeGb != null) __obj.updateDynamic("diskSizeGb")(diskSizeGb.asInstanceOf[js.Any])
    if (interface != null) __obj.updateDynamic("interface")(interface.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk]
  }
}

