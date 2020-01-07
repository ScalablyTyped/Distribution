package typings.googleapis.buildSrcApisComputeBetaMod.compute_beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Properties of the SKU instances being reserved.
  */
@js.native
trait Schema$AllocationSpecificSKUAllocationReservedInstanceProperties extends js.Object {
  /**
    * Specifies accelerator type and count.
    */
  var guestAccelerators: js.UndefOr[js.Array[Schema$AcceleratorConfig]] = js.native
  /**
    * Specifies amount of local ssd to reserve with each instance. The type of
    * disk is local-ssd.
    */
  var localSsds: js.UndefOr[
    js.Array[Schema$AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk]
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

object Schema$AllocationSpecificSKUAllocationReservedInstanceProperties {
  @scala.inline
  def apply(
    guestAccelerators: js.Array[Schema$AcceleratorConfig] = null,
    localSsds: js.Array[Schema$AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk] = null,
    machineType: String = null,
    minCpuPlatform: String = null
  ): Schema$AllocationSpecificSKUAllocationReservedInstanceProperties = {
    val __obj = js.Dynamic.literal()
    if (guestAccelerators != null) __obj.updateDynamic("guestAccelerators")(guestAccelerators.asInstanceOf[js.Any])
    if (localSsds != null) __obj.updateDynamic("localSsds")(localSsds.asInstanceOf[js.Any])
    if (machineType != null) __obj.updateDynamic("machineType")(machineType.asInstanceOf[js.Any])
    if (minCpuPlatform != null) __obj.updateDynamic("minCpuPlatform")(minCpuPlatform.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AllocationSpecificSKUAllocationReservedInstanceProperties]
  }
}

