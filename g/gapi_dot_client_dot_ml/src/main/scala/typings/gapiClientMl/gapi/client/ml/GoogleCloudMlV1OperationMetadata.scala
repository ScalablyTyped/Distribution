package typings.gapiClientMl.gapi.client.ml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleCloudMlV1OperationMetadata extends js.Object {
  /** The time the operation was submitted. */
  var createTime: js.UndefOr[String] = js.native
  /** The time operation processing completed. */
  var endTime: js.UndefOr[String] = js.native
  /** Indicates whether a request to cancel this operation has been made. */
  var isCancellationRequested: js.UndefOr[Boolean] = js.native
  /** Contains the name of the model associated with the operation. */
  var modelName: js.UndefOr[String] = js.native
  /** The operation type. */
  var operationType: js.UndefOr[String] = js.native
  /** The time operation processing started. */
  var startTime: js.UndefOr[String] = js.native
  /** Contains the version associated with the operation. */
  var version: js.UndefOr[GoogleCloudMlV1Version] = js.native
}

object GoogleCloudMlV1OperationMetadata {
  @scala.inline
  def apply(): GoogleCloudMlV1OperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1OperationMetadata]
  }
  @scala.inline
  implicit class GoogleCloudMlV1OperationMetadataOps[Self <: GoogleCloudMlV1OperationMetadata] (val x: Self) extends AnyVal {
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
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    @scala.inline
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    @scala.inline
    def setIsCancellationRequested(value: Boolean): Self = this.set("isCancellationRequested", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsCancellationRequested: Self = this.set("isCancellationRequested", js.undefined)
    @scala.inline
    def setModelName(value: String): Self = this.set("modelName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModelName: Self = this.set("modelName", js.undefined)
    @scala.inline
    def setOperationType(value: String): Self = this.set("operationType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperationType: Self = this.set("operationType", js.undefined)
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    @scala.inline
    def setVersion(value: GoogleCloudMlV1Version): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

