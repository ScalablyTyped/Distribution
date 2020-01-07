package typings.googleapis.buildSrcApisBigqueryV2Mod.bigquery_v2

import typings.googleapis.Anon_NameSlotMs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$JobStatistics extends js.Object {
  /**
    * [TrustedTester] [Output-only] Job progress (0.0 -&gt; 1.0) for LOAD and
    * EXTRACT jobs.
    */
  var completionRatio: js.UndefOr[Double] = js.native
  /**
    * [Output-only] Creation time of this job, in milliseconds since the epoch.
    * This field will be present on all jobs.
    */
  var creationTime: js.UndefOr[String] = js.native
  /**
    * [Output-only] End time of this job, in milliseconds since the epoch. This
    * field will be present whenever a job is in the DONE state.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * [Output-only] Statistics for an extract job.
    */
  var extract: js.UndefOr[Schema$JobStatistics4] = js.native
  /**
    * [Output-only] Statistics for a load job.
    */
  var load: js.UndefOr[Schema$JobStatistics3] = js.native
  /**
    * [Output-only] Number of child jobs executed.
    */
  var numChildJobs: js.UndefOr[String] = js.native
  /**
    * [Output-only] If this is a child job, the id of the parent.
    */
  var parentJobId: js.UndefOr[String] = js.native
  /**
    * [Output-only] Statistics for a query job.
    */
  var query: js.UndefOr[Schema$JobStatistics2] = js.native
  /**
    * [Output-only] Quotas which delayed this job&#39;s start time.
    */
  var quotaDeferments: js.UndefOr[js.Array[String]] = js.native
  /**
    * [Output-only] Job resource usage breakdown by reservation.
    */
  var reservationUsage: js.UndefOr[js.Array[Anon_NameSlotMs]] = js.native
  /**
    * [Output-only] Start time of this job, in milliseconds since the epoch.
    * This field will be present when the job transitions from the PENDING
    * state to either RUNNING or DONE.
    */
  var startTime: js.UndefOr[String] = js.native
  /**
    * [Output-only] [Deprecated] Use the bytes processed in the query
    * statistics instead.
    */
  var totalBytesProcessed: js.UndefOr[String] = js.native
  /**
    * [Output-only] Slot-milliseconds for the job.
    */
  var totalSlotMs: js.UndefOr[String] = js.native
}

object Schema$JobStatistics {
  @scala.inline
  def apply(
    completionRatio: Int | Double = null,
    creationTime: String = null,
    endTime: String = null,
    extract: Schema$JobStatistics4 = null,
    load: Schema$JobStatistics3 = null,
    numChildJobs: String = null,
    parentJobId: String = null,
    query: Schema$JobStatistics2 = null,
    quotaDeferments: js.Array[String] = null,
    reservationUsage: js.Array[Anon_NameSlotMs] = null,
    startTime: String = null,
    totalBytesProcessed: String = null,
    totalSlotMs: String = null
  ): Schema$JobStatistics = {
    val __obj = js.Dynamic.literal()
    if (completionRatio != null) __obj.updateDynamic("completionRatio")(completionRatio.asInstanceOf[js.Any])
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (extract != null) __obj.updateDynamic("extract")(extract.asInstanceOf[js.Any])
    if (load != null) __obj.updateDynamic("load")(load.asInstanceOf[js.Any])
    if (numChildJobs != null) __obj.updateDynamic("numChildJobs")(numChildJobs.asInstanceOf[js.Any])
    if (parentJobId != null) __obj.updateDynamic("parentJobId")(parentJobId.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (quotaDeferments != null) __obj.updateDynamic("quotaDeferments")(quotaDeferments.asInstanceOf[js.Any])
    if (reservationUsage != null) __obj.updateDynamic("reservationUsage")(reservationUsage.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (totalBytesProcessed != null) __obj.updateDynamic("totalBytesProcessed")(totalBytesProcessed.asInstanceOf[js.Any])
    if (totalSlotMs != null) __obj.updateDynamic("totalSlotMs")(totalSlotMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$JobStatistics]
  }
}

