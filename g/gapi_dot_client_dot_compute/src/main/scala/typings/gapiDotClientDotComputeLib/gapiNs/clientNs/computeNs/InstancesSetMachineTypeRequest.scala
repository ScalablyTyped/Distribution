package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstancesSetMachineTypeRequest extends js.Object {
  /**
    * Full or partial URL of the machine type resource. See Machine Types for a full list of machine types. For example:
    * zones/us-central1-f/machineTypes/n1-standard-1
    */
  var machineType: js.UndefOr[java.lang.String] = js.undefined
}

object InstancesSetMachineTypeRequest {
  @scala.inline
  def apply(machineType: java.lang.String = null): InstancesSetMachineTypeRequest = {
    val __obj = js.Dynamic.literal()
    if (machineType != null) __obj.updateDynamic("machineType")(machineType)
    __obj.asInstanceOf[InstancesSetMachineTypeRequest]
  }
}

