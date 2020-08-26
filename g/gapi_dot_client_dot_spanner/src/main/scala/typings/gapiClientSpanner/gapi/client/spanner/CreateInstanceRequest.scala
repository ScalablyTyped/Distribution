package typings.gapiClientSpanner.gapi.client.spanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateInstanceRequest extends js.Object {
  /**
    * Required. The instance to create.  The name may be omitted, but if
    * specified must be `<parent>/instances/<instance_id>`.
    */
  var instance: js.UndefOr[Instance] = js.native
  /**
    * Required. The ID of the instance to create.  Valid identifiers are of the
    * form `a-z&#42;[a-z0-9]` and must be between 6 and 30 characters in
    * length.
    */
  var instanceId: js.UndefOr[String] = js.native
}

object CreateInstanceRequest {
  @scala.inline
  def apply(): CreateInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateInstanceRequest]
  }
  @scala.inline
  implicit class CreateInstanceRequestOps[Self <: CreateInstanceRequest] (val x: Self) extends AnyVal {
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
    def setInstance(value: Instance): Self = this.set("instance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstance: Self = this.set("instance", js.undefined)
    @scala.inline
    def setInstanceId(value: String): Self = this.set("instanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceId: Self = this.set("instanceId", js.undefined)
  }
  
}

