package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaInstancesSetMachineTypeRequest extends js.Object {
  /**
    * Full or partial URL of the machine type resource. See Machine Types for a
    * full list of machine types. For example:
    * zones/us-central1-f/machineTypes/n1-standard-1
    */
  var machineType: js.UndefOr[String] = js.native
}

object SchemaInstancesSetMachineTypeRequest {
  @scala.inline
  def apply(machineType: String = null): SchemaInstancesSetMachineTypeRequest = {
    val __obj = js.Dynamic.literal()
    if (machineType != null) __obj.updateDynamic("machineType")(machineType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInstancesSetMachineTypeRequest]
  }
}

