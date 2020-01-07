package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$InstancesSetMachineResourcesRequest extends js.Object {
  /**
    * A list of the type and count of accelerator cards attached to the
    * instance.
    */
  var guestAccelerators: js.UndefOr[js.Array[Schema$AcceleratorConfig]] = js.native
}

object Schema$InstancesSetMachineResourcesRequest {
  @scala.inline
  def apply(guestAccelerators: js.Array[Schema$AcceleratorConfig] = null): Schema$InstancesSetMachineResourcesRequest = {
    val __obj = js.Dynamic.literal()
    if (guestAccelerators != null) __obj.updateDynamic("guestAccelerators")(guestAccelerators.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InstancesSetMachineResourcesRequest]
  }
}

