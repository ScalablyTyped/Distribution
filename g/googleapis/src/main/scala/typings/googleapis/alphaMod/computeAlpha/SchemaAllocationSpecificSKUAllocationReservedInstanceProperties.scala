package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Properties of the SKU instances being reserved.
  */
@js.native
trait SchemaAllocationSpecificSKUAllocationReservedInstanceProperties extends js.Object {
  /**
    * Specifies accelerator type and count.
    */
  var guestAccelerators: js.UndefOr[js.Array[SchemaAcceleratorConfig]] = js.native
  /**
    * Specifies amount of local ssd to reserve with each instance. The type of
    * disk is local-ssd.
    */
  var localSsds: js.UndefOr[
    js.Array[SchemaAllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk]
  ] = js.native
  /**
    * Specifies type of machine (name only) which has fixed number of vCPUs and
    * fixed amount of memory. This also includes specifying custom machine type
    * following custom-NUMBER_OF_CPUS-AMOUNT_OF_MEMORY pattern.
    */
  var machineType: js.UndefOr[String] = js.native
  /**
    * Minimum cpu platform the reservation.
    */
  var minCpuPlatform: js.UndefOr[String] = js.native
}

object SchemaAllocationSpecificSKUAllocationReservedInstanceProperties {
  @scala.inline
  def apply(): SchemaAllocationSpecificSKUAllocationReservedInstanceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAllocationSpecificSKUAllocationReservedInstanceProperties]
  }
  @scala.inline
  implicit class SchemaAllocationSpecificSKUAllocationReservedInstancePropertiesOps[Self <: SchemaAllocationSpecificSKUAllocationReservedInstanceProperties] (val x: Self) extends AnyVal {
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
    def setGuestAcceleratorsVarargs(value: SchemaAcceleratorConfig*): Self = this.set("guestAccelerators", js.Array(value :_*))
    @scala.inline
    def setGuestAccelerators(value: js.Array[SchemaAcceleratorConfig]): Self = this.set("guestAccelerators", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGuestAccelerators: Self = this.set("guestAccelerators", js.undefined)
    @scala.inline
    def setLocalSsdsVarargs(value: SchemaAllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk*): Self = this.set("localSsds", js.Array(value :_*))
    @scala.inline
    def setLocalSsds(value: js.Array[SchemaAllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk]): Self = this.set("localSsds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalSsds: Self = this.set("localSsds", js.undefined)
    @scala.inline
    def setMachineType(value: String): Self = this.set("machineType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMachineType: Self = this.set("machineType", js.undefined)
    @scala.inline
    def setMinCpuPlatform(value: String): Self = this.set("minCpuPlatform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinCpuPlatform: Self = this.set("minCpuPlatform", js.undefined)
  }
  
}

