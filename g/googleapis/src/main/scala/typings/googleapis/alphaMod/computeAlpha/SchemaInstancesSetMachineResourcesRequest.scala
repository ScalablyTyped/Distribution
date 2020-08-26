package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaInstancesSetMachineResourcesRequest extends js.Object {
  /**
    * A list of the type and count of accelerator cards attached to the
    * instance.
    */
  var guestAccelerators: js.UndefOr[js.Array[SchemaAcceleratorConfig]] = js.native
}

object SchemaInstancesSetMachineResourcesRequest {
  @scala.inline
  def apply(): SchemaInstancesSetMachineResourcesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstancesSetMachineResourcesRequest]
  }
  @scala.inline
  implicit class SchemaInstancesSetMachineResourcesRequestOps[Self <: SchemaInstancesSetMachineResourcesRequest] (val x: Self) extends AnyVal {
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
  }
  
}

