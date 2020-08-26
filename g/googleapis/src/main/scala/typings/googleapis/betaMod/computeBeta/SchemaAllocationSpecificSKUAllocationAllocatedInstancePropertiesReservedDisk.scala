package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk extends js.Object {
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
  implicit class SchemaAllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskOps[Self <: SchemaAllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk] (val x: Self) extends AnyVal {
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
    def setDiskSizeGb(value: String): Self = this.set("diskSizeGb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiskSizeGb: Self = this.set("diskSizeGb", js.undefined)
    @scala.inline
    def setInterface(value: String): Self = this.set("interface", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterface: Self = this.set("interface", js.undefined)
  }
  
}

