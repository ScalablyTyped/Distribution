package typings.gapiClientStoragetransfer.gapi.client.storagetransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferJob extends js.Object {
  /** This field cannot be changed by user requests. */
  var creationTime: js.UndefOr[String] = js.undefined
  /** This field cannot be changed by user requests. */
  var deletionTime: js.UndefOr[String] = js.undefined
  /**
    * A description provided by the user for the job. Its max length is 1024
    * bytes when Unicode-encoded.
    */
  var description: js.UndefOr[String] = js.undefined
  /** This field cannot be changed by user requests. */
  var lastModificationTime: js.UndefOr[String] = js.undefined
  /**
    * A globally unique name assigned by Storage Transfer Service when the
    * job is created. This field should be left empty in requests to create a new
    * transfer job; otherwise, the requests result in an `INVALID_ARGUMENT`
    * error.
    */
  var name: js.UndefOr[String] = js.undefined
  /** The ID of the Google Cloud Platform Console project that owns the job. */
  var projectId: js.UndefOr[String] = js.undefined
  /** Schedule specification. */
  var schedule: js.UndefOr[Schedule] = js.undefined
  /**
    * Status of the job. This value MUST be specified for
    * `CreateTransferJobRequests`.
    *
    * NOTE: The effect of the new job status takes place during a subsequent job
    * run. For example, if you change the job status from `ENABLED` to
    * `DISABLED`, and an operation spawned by the transfer is running, the status
    * change would not affect the current operation.
    */
  var status: js.UndefOr[String] = js.undefined
  /** Transfer specification. */
  var transferSpec: js.UndefOr[TransferSpec] = js.undefined
}

object TransferJob {
  @scala.inline
  def apply(
    creationTime: String = null,
    deletionTime: String = null,
    description: String = null,
    lastModificationTime: String = null,
    name: String = null,
    projectId: String = null,
    schedule: Schedule = null,
    status: String = null,
    transferSpec: TransferSpec = null
  ): TransferJob = {
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
    __obj.asInstanceOf[TransferJob]
  }
}

