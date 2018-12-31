package typings
package gapiDotClientDotSqladminLib.gapiNs.clientNs.sqladminNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackupRun extends js.Object {
  /** The description of this run, only applicable to on-demand backups. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** The time the backup operation completed in UTC timezone in RFC 3339 format, for example 2012-11-15T16:19:00.094Z. */
  var endTime: js.UndefOr[java.lang.String] = js.undefined
  /** The time the run was enqueued in UTC timezone in RFC 3339 format, for example 2012-11-15T16:19:00.094Z. */
  var enqueuedTime: js.UndefOr[java.lang.String] = js.undefined
  /** Information about why the backup operation failed. This is only present if the run has the FAILED status. */
  var error: js.UndefOr[OperationError] = js.undefined
  /** A unique identifier for this backup run. Note that this is unique only within the scope of a particular Cloud SQL instance. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Name of the database instance. */
  var instance: js.UndefOr[java.lang.String] = js.undefined
  /** This is always sql#backupRun. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The URI of this resource. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /** The time the backup operation actually started in UTC timezone in RFC 3339 format, for example 2012-11-15T16:19:00.094Z. */
  var startTime: js.UndefOr[java.lang.String] = js.undefined
  /** The status of this run. */
  var status: js.UndefOr[java.lang.String] = js.undefined
  /** The type of this run; can be either "AUTOMATED" or "ON_DEMAND". */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** The start time of the backup window during which this the backup was attempted in RFC 3339 format, for example 2012-11-15T16:19:00.094Z. */
  var windowStartTime: js.UndefOr[java.lang.String] = js.undefined
}

