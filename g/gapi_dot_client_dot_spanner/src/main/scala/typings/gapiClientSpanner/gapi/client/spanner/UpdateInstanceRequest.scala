package typings.gapiClientSpanner.gapi.client.spanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateInstanceRequest extends js.Object {
  /**
    * Required. A mask specifying which fields in [][google.spanner.admin.instance.v1.UpdateInstanceRequest.instance] should be updated.
    * The field mask must always be specified; this prevents any future fields in
    * [][google.spanner.admin.instance.v1.Instance] from being erased accidentally by clients that do not know
    * about them.
    */
  var fieldMask: js.UndefOr[String] = js.native
  /**
    * Required. The instance to update, which must always include the instance
    * name.  Otherwise, only fields mentioned in [][google.spanner.admin.instance.v1.UpdateInstanceRequest.field_mask] need be included.
    */
  var instance: js.UndefOr[Instance] = js.native
}

object UpdateInstanceRequest {
  @scala.inline
  def apply(): UpdateInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateInstanceRequest]
  }
  @scala.inline
  implicit class UpdateInstanceRequestOps[Self <: UpdateInstanceRequest] (val x: Self) extends AnyVal {
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
    def setFieldMask(value: String): Self = this.set("fieldMask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldMask: Self = this.set("fieldMask", js.undefined)
    @scala.inline
    def setInstance(value: Instance): Self = this.set("instance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstance: Self = this.set("instance", js.undefined)
  }
  
}

