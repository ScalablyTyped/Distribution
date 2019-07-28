package typings.gapiDotClientDotBigquery.gapiNs.clientNs.bigqueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobStatistics extends js.Object {
  /** [Output-only] Creation time of this job, in milliseconds since the epoch. This field will be present on all jobs. */
  var creationTime: js.UndefOr[String] = js.undefined
  /** [Output-only] End time of this job, in milliseconds since the epoch. This field will be present whenever a job is in the DONE state. */
  var endTime: js.UndefOr[String] = js.undefined
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
  var startTime: js.UndefOr[String] = js.undefined
  /** [Output-only] [Deprecated] Use the bytes processed in the query statistics instead. */
  var totalBytesProcessed: js.UndefOr[String] = js.undefined
}

object JobStatistics {
  @scala.inline
  def apply(
    creationTime: String = null,
    endTime: String = null,
    extract: JobStatistics4 = null,
    load: JobStatistics3 = null,
    query: JobStatistics2 = null,
    startTime: String = null,
    totalBytesProcessed: String = null
  ): JobStatistics = {
    val __obj = js.Dynamic.literal()
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime)
    if (endTime != null) __obj.updateDynamic("endTime")(endTime)
    if (extract != null) __obj.updateDynamic("extract")(extract)
    if (load != null) __obj.updateDynamic("load")(load)
    if (query != null) __obj.updateDynamic("query")(query)
    if (startTime != null) __obj.updateDynamic("startTime")(startTime)
    if (totalBytesProcessed != null) __obj.updateDynamic("totalBytesProcessed")(totalBytesProcessed)
    __obj.asInstanceOf[JobStatistics]
  }
}

