package typings.googleapis.betaMod.computeBeta

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
  def apply(
    guestAccelerators: js.Array[SchemaAcceleratorConfig] = null,
    localSsds: js.Array[SchemaAllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk] = null,
    machineType: String = null,
    minCpuPlatform: String = null
  ): SchemaAllocationSpecificSKUAllocationReservedInstanceProperties = {
    val __obj = js.Dynamic.literal()
    if (guestAccelerators != null) __obj.updateDynamic("guestAccelerators")(guestAccelerators.asInstanceOf[js.Any])
    if (localSsds != null) __obj.updateDynamic("localSsds")(localSsds.asInstanceOf[js.Any])
    if (machineType != null) __obj.updateDynamic("machineType")(machineType.asInstanceOf[js.Any])
    if (minCpuPlatform != null) __obj.updateDynamic("minCpuPlatform")(minCpuPlatform.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAllocationSpecificSKUAllocationReservedInstanceProperties]
  }
}

