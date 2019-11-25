package typings.gapiDotClientDotSqladmin.gapi.client.sqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackupRun extends js.Object {
  /** The description of this run, only applicable to on-demand backups. */
  var description: js.UndefOr[String] = js.undefined
  /** The time the backup operation completed in UTC timezone in RFC 3339 format, for example 2012-11-15T16:19:00.094Z. */
  var endTime: js.UndefOr[String] = js.undefined
  /** The time the run was enqueued in UTC timezone in RFC 3339 format, for example 2012-11-15T16:19:00.094Z. */
  var enqueuedTime: js.UndefOr[String] = js.undefined
  /** Information about why the backup operation failed. This is only present if the run has the FAILED status. */
  var error: js.UndefOr[OperationError] = js.undefined
  /** A unique identifier for this backup run. Note that this is unique only within the scope of a particular Cloud SQL instance. */
  var id: js.UndefOr[String] = js.undefined
  /** Name of the database instance. */
  var instance: js.UndefOr[String] = js.undefined
  /** This is always sql#backupRun. */
  var kind: js.UndefOr[String] = js.undefined
  /** The URI of this resource. */
  var selfLink: js.UndefOr[String] = js.undefined
  /** The time the backup operation actually started in UTC timezone in RFC 3339 format, for example 2012-11-15T16:19:00.094Z. */
  var startTime: js.UndefOr[String] = js.undefined
  /** The status of this run. */
  var status: js.UndefOr[String] = js.undefined
  /** The type of this run; can be either "AUTOMATED" or "ON_DEMAND". */
  var `type`: js.UndefOr[String] = js.undefined
  /** The start time of the backup window during which this the backup was attempted in RFC 3339 format, for example 2012-11-15T16:19:00.094Z. */
  var windowStartTime: js.UndefOr[String] = js.undefined
}

object BackupRun {
  @scala.inline
  def apply(
    description: String = null,
    endTime: String = null,
    enqueuedTime: String = null,
    error: OperationError = null,
    id: String = null,
    instance: String = null,
    kind: String = null,
    selfLink: String = null,
    startTime: String = null,
    status: String = null,
    `type`: String = null,
    windowStartTime: String = null
  ): BackupRun = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (enqueuedTime != null) __obj.updateDynamic("enqueuedTime")(enqueuedTime.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (instance != null) __obj.updateDynamic("instance")(instance.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (windowStartTime != null) __obj.updateDynamic("windowStartTime")(windowStartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackupRun]
  }
}

