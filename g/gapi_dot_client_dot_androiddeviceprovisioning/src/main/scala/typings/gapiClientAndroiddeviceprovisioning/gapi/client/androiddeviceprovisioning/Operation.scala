package typings.gapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Operation extends js.Object {
  /**
    * If the value is `false`, it means the operation is still in progress.
    * If `true`, the operation is completed, and either `error` or `response` is
    * available.
    */
  var done: js.UndefOr[Boolean] = js.native
  /**
    * This field will always be not set if the operation is created by `claimAsync`, `unclaimAsync`, or `updateMetadataAsync`. In this case, error
    * information for each device is set in `response.perDeviceStatus.result.status`.
    */
  var error: js.UndefOr[Status] = js.native
  /**
    * This field will contain a `DevicesLongRunningOperationMetadata` object if the operation is created by `claimAsync`, `unclaimAsync`, or
    * `updateMetadataAsync`.
    */
  var metadata: js.UndefOr[Record[String, _]] = js.native
  /**
    * The server-assigned name, which is only unique within the same service that
    * originally returns it. If you use the default HTTP mapping, the
    * `name` should have the format of `operations/some/unique/name`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * This field will contain a `DevicesLongRunningOperationResponse` object if the operation is created by `claimAsync`, `unclaimAsync`, or
    * `updateMetadataAsync`.
    */
  var response: js.UndefOr[Record[String, _]] = js.native
}

object Operation {
  @scala.inline
  def apply(): Operation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Operation]
  }
  @scala.inline
  implicit class OperationOps[Self <: Operation] (val x: Self) extends AnyVal {
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
    def setDone(value: Boolean): Self = this.set("done", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDone: Self = this.set("done", js.undefined)
    @scala.inline
    def setError(value: Status): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setMetadata(value: Record[String, _]): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setResponse(value: Record[String, _]): Self = this.set("response", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponse: Self = this.set("response", js.undefined)
  }
  
}

