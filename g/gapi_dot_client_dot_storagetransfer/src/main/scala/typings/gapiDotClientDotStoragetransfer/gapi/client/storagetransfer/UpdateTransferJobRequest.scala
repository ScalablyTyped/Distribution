package typings.gapiDotClientDotStoragetransfer.gapi.client.storagetransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateTransferJobRequest extends js.Object {
  /**
    * The ID of the Google Cloud Platform Console project that owns the job.
    * Required.
    */
  var projectId: js.UndefOr[String] = js.undefined
  /**
    * The job to update. `transferJob` is expected to specify only three fields:
    * `description`, `transferSpec`, and `status`.  An UpdateTransferJobRequest
    * that specifies other fields will be rejected with an error
    * `INVALID_ARGUMENT`.
    * Required.
    */
  var transferJob: js.UndefOr[TransferJob] = js.undefined
  /**
    * The field mask of the fields in `transferJob` that are to be updated in
    * this request.  Fields in `transferJob` that can be updated are:
    * `description`, `transferSpec`, and `status`.  To update the `transferSpec`
    * of the job, a complete transfer specification has to be provided. An
    * incomplete specification which misses any required fields will be rejected
    * with the error `INVALID_ARGUMENT`.
    */
  var updateTransferJobFieldMask: js.UndefOr[String] = js.undefined
}

object UpdateTransferJobRequest {
  @scala.inline
  def apply(
    projectId: String = null,
    transferJob: TransferJob = null,
    updateTransferJobFieldMask: String = null
  ): UpdateTransferJobRequest = {
    val __obj = js.Dynamic.literal()
    if (projectId != null) __obj.updateDynamic("projectId")(projectId)
    if (transferJob != null) __obj.updateDynamic("transferJob")(transferJob)
    if (updateTransferJobFieldMask != null) __obj.updateDynamic("updateTransferJobFieldMask")(updateTransferJobFieldMask)
    __obj.asInstanceOf[UpdateTransferJobRequest]
  }
}

