package typings
package gapiDotClientDotBigqueryLib.gapiNs.clientNs.bigqueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobStatistics extends js.Object {
  /** [Output-only] Creation time of this job, in milliseconds since the epoch. This field will be present on all jobs. */
  var creationTime: js.UndefOr[java.lang.String] = js.undefined
  /** [Output-only] End time of this job, in milliseconds since the epoch. This field will be present whenever a job is in the DONE state. */
  var endTime: js.UndefOr[java.lang.String] = js.undefined
  /** [Output-only] Statistics for an extract job. */
  var extract: js.UndefOr[JobStatistics4] = js.undefined
  /** [Output-only] Statistics for a load job. */
  var load: js.UndefOr[JobStatistics3] = js.undefined
  /** [Output-only] Statistics for a query job. */
  var query: js.UndefOr[JobStatistics2] = js.undefined
  /**
    * [Output-only] Start time of this job, in milliseconds since the epoch. This field will be present when the job transitions from the PENDING state to
    * either RUNNING or DONE.
    */
  var startTime: js.UndefOr[java.lang.String] = js.undefined
  /** [Output-only] [Deprecated] Use the bytes processed in the query statistics instead. */
  var totalBytesProcessed: js.UndefOr[java.lang.String] = js.undefined
}

