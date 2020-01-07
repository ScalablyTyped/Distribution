package typings.googleapis.buildSrcApisStoragetransferV1Mod.storagetransfer_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This resource represents the configuration of a transfer job that runs
  * periodically.
  */
@js.native
trait Schema$TransferJob extends js.Object {
  /**
    * This field cannot be changed by user requests.
    */
  var creationTime: js.UndefOr[String] = js.native
  /**
    * This field cannot be changed by user requests.
    */
  var deletionTime: js.UndefOr[String] = js.native
  /**
    * A description provided by the user for the job. Its max length is 1024
    * bytes when Unicode-encoded.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * This field cannot be changed by user requests.
    */
  var lastModificationTime: js.UndefOr[String] = js.native
  /**
    * A globally unique name assigned by Storage Transfer Service when the job
    * is created. This field should be left empty in requests to create a new
    * transfer job; otherwise, the requests result in an `INVALID_ARGUMENT`
    * error.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The ID of the Google Cloud Platform Project that owns the job.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * Schedule specification.
    */
  var schedule: js.UndefOr[Schema$Schedule] = js.native
  /**
    * Status of the job. This value MUST be specified for
    * `CreateTransferJobRequests`.  NOTE: The effect of the new job status
    * takes place during a subsequent job run. For example, if you change the
    * job status from `ENABLED` to `DISABLED`, and an operation spawned by the
    * transfer is running, the status change would not affect the current
    * operation.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * Transfer specification.
    */
  var transferSpec: js.UndefOr[Schema$TransferSpec] = js.native
}

object Schema$TransferJob {
  @scala.inline
  def apply(
    creationTime: String = null,
    deletionTime: String = null,
    description: String = null,
    lastModificationTime: String = null,
    name: String = null,
    projectId: String = null,
    schedule: Schema$Schedule = null,
    status: String = null,
    transferSpec: Schema$TransferSpec = null
  ): Schema$TransferJob = {
    val __obj = js.Dynamic.literal()
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime.asInstanceOf[js.Any])
    if (deletionTime != null) __obj.updateDynamic("deletionTime")(deletionTime.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (lastModificationTime != null) __obj.updateDynamic("lastModificationTime")(lastModificationTime.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (schedule != null) __obj.updateDynamic("schedule")(schedule.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (transferSpec != null) __obj.updateDynamic("transferSpec")(transferSpec.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TransferJob]
  }
}

